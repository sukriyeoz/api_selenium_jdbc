package api._getMethod;

public class Get02_pojo {

      /* Test Case:

        Given
            https://restful-booker.herokuapp.com/booking/100001
        When
 		    I send GET Request to the URL
 	    Then
 		    Status code is 200
 		And
 		    Response body is like
              {
                    "firstname": "Emrah",
                    "lastname": "Selek",
                    "totalprice": 1000,
                    "depositpaid": true,
                    "bookingdates": {
                                "checkin": "2021-09-21",
                                "checkout": "2021-09-25"
                               },
                    "additionalneeds": "Dinner, smoothie, openbar"
                }
     */



}
