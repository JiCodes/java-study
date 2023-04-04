import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // test XML Parser
        try {
            File inputFile = new File("./src/books.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(inputFile);
            document.getDocumentElement().normalize();
            XMLParser parser = new XMLParser(document);

            // Print initial book list
            System.out.println("Initial XML book list:");
            parser.printBooks();

            // Add new book
            Book newBook = new Book(
                    "How to master Java",
                    2023,
                    888,
                    new ArrayList<String>(){{addAll(Arrays.asList("Taral Oza", "Ayush Joshi"));}});

            parser.addBook(newBook);

            // Print updated book list
            System.out.println("\nXML book list after adding new book:");
            parser.printBooks();

            // Save changes to xml file
            parser.saveChangesToNewFile("./src/updated_XML_books.xml");
        } catch (IOException | ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }

        // test JSON Parser
        try {
            JavaJsonParser jsonParser = new JavaJsonParser("./src/books.json");
            System.out.println("Initial Json book list:");
            jsonParser.printBooks();

            // Add a new book
            ArrayList<String> newBookAuthors = new ArrayList<>(Arrays.asList("Ayush Joshi", "Taral Oza"));
            jsonParser.addBook("How to master Data Structure", 2023, 888, newBookAuthors);
            System.out.println("\nJson book list after adding new book:");
            jsonParser.printBooks();

            // Save changes to a new file
            jsonParser.saveChangesToNewFile("./src/updated_json_book.json");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}