/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package documentindexsearch;

/**
 *
 * @author james
 */
public class NewClass {
    http://www.openlogic.com/wazi/bid/314389/Content-mining-with-Apache-Tika
     public static void main(String[] args) throws FileNotFoundException, 
      IOException, org.xml.sax.SAXException, TikaException {

    File file = new File("testing.rtf");
    InputStream is = new FileInputStream(file);
    Metadata metadata = new Metadata();
    BodyContentHandler ch = new BodyContentHandler();
    AutoDetectParser parser = new AutoDetectParser();

    String mimeType = new Tika().detect(file);
    metadata.set(Metadata.CONTENT_TYPE, mimeType);

    parser.parse(is, ch, metadata, new ParseContext());
    is.close();

    foreach (int i = 0; i < metadata.names().length; i++) {
        String item = metadata.names()[i];
        System.out.println(item + " -- " + metadata.get(item));
    }

    System.out.println(ch.toString());
  }
}
