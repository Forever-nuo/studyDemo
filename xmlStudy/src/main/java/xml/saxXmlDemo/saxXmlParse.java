package xml.saxXmlDemo;

import org.xml.sax.SAXException;
import xml.XmlParse;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;


/**
 * Created by Forever丶诺 on 2017-11-19.
 */
public class saxXmlParse implements XmlParse {
    public void parse() {
        // 获取解析工厂
        SAXParserFactory spFactory = SAXParserFactory.newInstance();
        //得到解析对象
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
