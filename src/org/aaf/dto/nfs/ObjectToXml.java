package org.aaf.dto.nfs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;

public class ObjectToXml implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		JAXBContext contextObj = JAXBContext.newInstance(NFSeDTO.class);

		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		NF nf = new NF();
		nf.setValor_total("290,00");
		PrestadorNFS prestador = new PrestadorNFS();
		
		
		TomadorNFS tomador = new TomadorNFS();
		tomador.setCpfcnpj("06660604952");
		
		tomador.setBairro("Bela Vista");
		tomador.setCep("88104200");
		tomador.setCidade("Palhoca");
		tomador.setEmail("a131mael@gmail.com");
		tomador.setNome_razao_social("Abimael Aldevino Fidencio");
		tomador.setLogradouro("Rua assis brasil , 6714");
		
		
		ListaItensNFS listaItem = new ListaItensNFS();
		listaItem.setValor_tributavel("290,00");
		listaItem.setUnidade_valor_unitario("290,00");
		ItemNFS item = new ItemNFS();
		item.setLista(listaItem);
		NFSeDTO nfs = new NFSeDTO();
		
		nfs.setPrestador(prestador);
		nfs.setTomador(tomador);
		nfs.setNf(nf);
		nfs.setItens(item);
		
		nfs.setTeste("1");

		marshallerObj.marshal(nfs, new FileOutputStream("C:\\Sicoobnet\\RetornoCNAB\\question.xml"));
		
		ObjectToXml ob = new ObjectToXml();
		ob.testMultiPartIndividualFileToLarge();

	}
	
	public void testMultiPartIndividualFileToLarge() throws IOException {
	    try {
	    	  DefaultHttpClient httpclient = new DefaultHttpClient();
	          HttpPost httppost = new HttpPost("http://sync.nfs-e.net/datacenter/include/nfw/importa_nfw/nfw_import_upload.php");
	          File file = new File("C:\\Sicoobnet\\RetornoCNAB\\question.xml");
	          MultipartEntity mpEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
	          ContentBody cbFile = new FileBody(file);
	          mpEntity.addPart("f1", cbFile);
	          mpEntity.addPart("login", new StringBody("03660921000179"));
	          mpEntity.addPart("senha", new StringBody("stratus01"));
	          mpEntity.addPart("cidade", new StringBody("8223"));
	          httppost.setEntity(mpEntity);
	          System.out.println("executing request " + httppost.getRequestLine());
	          System.out.println("Now uploading your file into uploadbox.com");
	          HttpResponse response = httpclient.execute(httppost);
	          System.out.println(response.getStatusLine());
	    } finally {
	    }
	}
}