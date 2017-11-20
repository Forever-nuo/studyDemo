package xml.saxXmlDemo;

import lombok.Data;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Foreverؼŵ on 2017-11-19.
 */
@Data
public class GirlHandler extends DefaultHandler {

    private List<Girl> girlList;

    private Girl girl;

    private String tagName;


    /**
     * �÷���ֻ����һ��
     *
     * @throws SAXException
     */
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        girlList = new ArrayList<Girl>();
    }

    /**
     * �÷������ö��
     *
     * @param uri
     * @param localName
     * @param qName
     * @param attributes
     * @throws SAXException
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tagName = qName;
        if (qName.equals("girl")) {
            girl = new Girl();
            girl.setId(Integer.valueOf(attributes.getValue("id")));
        }

    }


    /**
     * @param ch:
     * @param start:
     * @param length:
     * @Description: �÷������ö��
     * @Author: Foreverؼŵ
     * @Date: 19:09 2017-11-19
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (tagName.equals("name")) {
            girl.setName(new String(ch, start, length));
        } else if (tagName.equals("age")) {
            girl.setAge(Integer.valueOf(new String(ch, start, length)));
        }

    }

    /**
     * �÷������ö��
     *
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        tagName = "";
        if (qName.equals("girl")) {
            girlList.add(girl);
        }
    }

    /**
     * �÷���ֻ����һ��
     *
     * @throws SAXException
     */
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }


}
