package xml.domXmlDemo;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Foreverؼŵ on 2017-11-20.
 */
public class DomXmlDemo {

    /**
     * �õ�Document����
     *
     * @param classPath
     * @return
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     */
    public Document getDocument(String classPath) throws IOException, SAXException, ParserConfigurationException {
        //�õ�����DocumentBuilderFactory����
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        //�õ�DocumentBuilder����
        DocumentBuilder documentBuilder = dbFactory.newDocumentBuilder();
        //�õ�Document����
        return documentBuilder.parse(ClassLoader.getSystemResourceAsStream(classPath));
    }

    @Test
    public void testGetDocument() throws ParserConfigurationException, SAXException, IOException {
        Document document = getDocument("girls.xml");

        Element girlElement = (Element)document.getElementsByTagName("girl").item(0);
        String nameValue = girlElement.getElementsByTagName("name").item(0).getTextContent();
        System.out.println(nameValue);
/*        String nameValue = document.getElementById("2").getElementsByTagName("name").item(0).getTextContent();
        System.out.println( nameValue);*/
    }

}
