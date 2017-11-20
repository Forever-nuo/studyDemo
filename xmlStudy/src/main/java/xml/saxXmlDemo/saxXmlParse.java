package xml.saxXmlDemo;

import org.xml.sax.SAXException;
import xml.XmlParse;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;


/**
 * Created by Foreverؼŵ on 2017-11-19.
 */
public class saxXmlParse implements XmlParse {
    public void parse() {
        // ��ȡ��������
        SAXParserFactory spFactory = SAXParserFactory.newInstance();
        //�õ���������
        try {
            SAXParser saxParser = spFactory.newSAXParser();
            GirlHandler girlHandler = new GirlHandler();
            saxParser.parse(ClassLoader.getSystemResourceAsStream("girls.xml"), girlHandler);
            List<Girl> girlList = girlHandler.getGirlList();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
