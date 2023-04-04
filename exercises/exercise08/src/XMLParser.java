import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class XMLParser {
    private Document document;

    public XMLParser(Document document) {
        this.document = document;
    }

    public void printBooks() {
        NodeList bookList = this.document.getElementsByTagName("Book");
        System.out.println("Number of books: " + bookList.getLength());
        for (int i = 0; i < bookList.getLength(); i++) {
            Node bookNode = bookList.item(i);
            if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                Element bookElement = (Element) bookNode;
                String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
                int publishedYear = Integer.parseInt(bookElement.getElementsByTagName("publishedYear").item(0).getTextContent());
                int numberOfPages = Integer.parseInt(bookElement.getElementsByTagName("numberOfPages").item(0).getTextContent());
                ArrayList<String> authors = new ArrayList<String>();
                NodeList authorList = bookElement.getElementsByTagName("author");
                for (int j = 0; j < authorList.getLength(); j++) {
                    Node authorNode = authorList.item(j);
                    if (authorNode.getNodeType() == Node.ELEMENT_NODE) {
                        authors.add(authorNode.getTextContent());
                    }
                }
                Book book = new Book(title, publishedYear, numberOfPages, authors);
                System.out.println(book.toString());
            }
        }
    }

    public void addBook(Book book) {
        Element bookShelfElement = (Element) this.document.getElementsByTagName("BookShelf").item(0);
        Element newBookElement = this.document.createElement("Book");

        Element titleElement = this.document.createElement("title");
        titleElement.setTextContent(book.getTitle());
        newBookElement.appendChild(titleElement);

        Element publishedYearElement = this.document.createElement("publishedYear");
        publishedYearElement.setTextContent(Integer.toString(book.getPublishedYear()));
        newBookElement.appendChild(publishedYearElement);

        Element numberOfPagesElement = this.document.createElement("numberOfPages");
        numberOfPagesElement.setTextContent(Integer.toString(book.getNumberOfPages()));
        newBookElement.appendChild(numberOfPagesElement);

        Element authorsElement = this.document.createElement("authors");
        ArrayList<String> authors = book.getAuthors();
        for (String author : authors) {
            Element authorElement = this.document.createElement("author");
            authorElement.setTextContent(author);
            authorsElement.appendChild(authorElement);
        }
        newBookElement.appendChild(authorsElement);

        bookShelfElement.appendChild(newBookElement);
    }

    public void saveChangesToNewFile(String filePath) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(this.document);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
