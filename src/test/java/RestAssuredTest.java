
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

import static org.hamcrest.Matchers.equalTo;


public class RestAssuredTest {
    @DataProvider(name="country")
    public Object[][] createTestDataRecords() {
        return new Object[][] {
                {"USA"},
                {"Hungary"},

        };
    @Test(dataProvider = "country")
    public void test02(String country){
        String two_person;
        two_person = given().
                param("count")
                .when().get("http://ergast.com/api/f1/2017/circuits.json")
                .then().contentType(JSON).body("MRData.CircuitTable.Circuits.circuitId[1]", equalTo("americas")).
                and().assertThat().body("MRData.CircuitTable.Circuits.circuitId[5]", equalTo("hungaroring")).
        and().assertThat().body("MRData.CircuitTable.Circuits.Location.{count}", equalTo("USA")).
        and().assertThat().body("MRData.CircuitTable.Circuits.Location.{count}", equalTo("Hungary")).toString().toLowerCase();

        System.out.println(two_person);

    }

    @DataProvider(name="dataforTest")
    public Object[][] createTestDataRecords() {
        return new Object[][] {
                {"americas"},
                {"hungaroring"},

        };
    }


    @Test(dataProvider="dataforTest")
    public void createTestDataRecord(String circuitId) {
        given().
                pathParam("circuitId",circuitId).
                when().
                get("http://ergast.com/api/f1/circuits/{circuitId}.json").
                then().
                log().body();
    }


    }




}
