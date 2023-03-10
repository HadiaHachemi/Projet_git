import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // parsing file "JSONExample.json"
        Object ob = new JSONParser().parse(new FileReader("person.json"));

        // typecasting ob to JSONObject
        JSONObject js = (JSONObject) ob;

        String firstName = (String) js.get("name");
        String lastName = (String) js.get("age");

        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " +lastName);
    }
}