package api._postMethod;

public class Post01 {

    /**

     Given
     https://restful-booker.herokuapp.com/booking
             {
                 "firstname": "Emrah",
                 "lastname": "Selek",
                 "totalprice": 1000,
                 "depositpaid": true,
                 "bookingdates": {
                         "checkin": "2021-10-01",
                         "checkout": "2021-10-05"
                         }
                 "additionalneeds": "Dinner, smoothie, openbar"
             }
     When
        I send POST Request to the Url
     Then
         Status code is 200
     And
        response body should be like;
             {
                 "firstname": "Emrah",
                 "lastname": "Selek",
                 "totalprice": 1000,
                 "depositpaid": true,
                 "bookingdates": {
                         "checkin": "2021-10-01",
                         "checkout": "2021-10-05"
                         }
                "additionalneeds": "Dinner, smoothie, openbar"
             }
     */



}
