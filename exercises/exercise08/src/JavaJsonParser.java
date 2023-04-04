import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JavaJsonParser {

    private JsonObject jsonObject;

    public JavaJsonParser(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        JsonElement jsonElement = JsonParser.parseReader(bufferedReader);
        this.jsonObject = jsonElement.getAsJsonObject();
    }

    public void printBooks() {
        JsonArray books = jsonObject.getAsJsonObject("BookShelf").getAsJsonArray("Book");
        for (JsonElement jsonElement : books) {
            JsonObject book = jsonElement.getAsJsonObject();
            String title = book.get("title").getAsString();
            int publishedYear = book.get("publishedYear").getAsInt();
            int numberOfPages = book.get("numberOfPages").getAsInt();
            ArrayList<String> authors = new ArrayList<>();
            for (JsonElement authorElement : book.getAsJsonArray("authors")) {
                authors.add(authorElement.getAsString());
            }
            Book currentBook = new Book(title, publishedYear, numberOfPages, authors);
            System.out.println(currentBook);
        }
    }

    public void addBook(String title, int publishedYear, int numberOfPages, ArrayList<String> authors) {
        JsonObject newBook = new JsonObject();
        newBook.addProperty("title", title);
        newBook.addProperty("publishedYear", publishedYear);
        newBook.addProperty("numberOfPages", numberOfPages);
        JsonArray authorsArray = new JsonArray();
        for (String author : authors) {
            authorsArray.add(author);
        }
        newBook.add("authors", authorsArray);
        jsonObject.getAsJsonObject("BookShelf").getAsJsonArray("Book").add(newBook);
    }

    public void saveChangesToNewFile(String filePath) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(filePath);
        gson.toJson(jsonObject, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }
}
