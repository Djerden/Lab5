import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlReader {
    File file = new File("file.xml");
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    Document doc = null;
}
