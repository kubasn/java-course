package org.example;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLFileParsingExample  {
    public static void main(String [] args) throws Exception{
        File file = new File("example.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = (Document) db.parse(file);
        doc.getDocumentELement().normalize();

    }
}
