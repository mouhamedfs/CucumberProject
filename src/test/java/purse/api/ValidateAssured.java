package purse.api;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ValidateAssured {

    private static String prenom;
    private static String lastName;
    private static String text;
    public static void main(String[] args) {
        // Set the base URI for the API
        RestAssured.baseURI = "https://dummyapi.io/data/v1";


        Response response = RestAssured.given()
                .header("app-id", "61f4248c9d9bb038eaf0c6c0")
                .when()
                .get("/post/60d21bad67d0d8992e610daf");


        if (response.getStatusCode() == 200) {

            JsonPath jsonPath = response.jsonPath();
            setPrenom(jsonPath.getString("owner.firstName"));
            setText(jsonPath.getString("text"));
            setLastName(jsonPath.getString("owner.lastName"));
        }
    }
    public  String getPrenom() {
        return prenom;
    }

    public static void setPrenom(String prenom) {
        ValidateAssured.prenom = prenom;
    }
    public  String getLastName() {
        return lastName;
    }
    public static void setLastName(String lastName) {
        ValidateAssured.lastName = lastName;
    }
    public  String getText() {
        return text;
    }
    public static void setText(String text) {
        ValidateAssured.text = text;
    }

}
