package xml.saxXmlDemo;

import org.junit.Test;
import xml.XmlParse;

/**
 * Created by Foreverؼŵ on 2017-11-19.
 */
public class saxXmlDemo {

    @Test
    public void test() {
        XmlParse xmlParse = new saxXmlParse();
        xmlParse.parse();
    }
}
