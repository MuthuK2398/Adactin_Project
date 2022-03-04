$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/K MUTHU KUMAR/eclipse-workspace/febMavenn/features/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"MuthuKumar123\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Q6J1JO\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click the Login button and It Navigates To Search Hotel Screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-application;login;;1"
    },
    {
      "cells": [
        "MuthuKumar123",
        "Q6J1JO"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;login;;2"
    },
    {
      "cells": [
        "KumarMuthu451",
        "qwerty4343"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"MuthuKumar123\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Q6J1JO\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click the Login button and It Navigates To Search Hotel Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 8206319500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MuthuKumar123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 697678899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Q6J1JO",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 155475901,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_the_Login_button_and_It_Navigates_To_Search_Hotel_Screen()"
});
formatter.result({
  "duration": 1018682800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"MuthuKumar123\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Q6J1JO\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click the Login button and It Navigates To Search Hotel Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 511260500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MuthuKumar123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 92650000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Q6J1JO",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 100425799,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_the_Login_button_and_It_Navigates_To_Search_Hotel_Screen()"
});
formatter.result({
  "duration": 375038399,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user Select The \"Brisbane\" From The Location Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user Select The \"Hotel Cornice\" From The Hotels Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select The \"Super Deluxe\" From The Room Type Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The \"4 - Four\" From Number Of Rooms Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Enter The \"\u003ccheckindate\u003e\" In The Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter The \"\u003ccheckoutdate\u003e\" In The Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select \"2 - Two\" From Adult Per Room Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Click The Search button and It Navigates To Search Hotel Screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Brisbane",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Location_From_The_Location_Dropdown(String)"
});
formatter.result({
  "duration": 768906600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Cornice",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Hotel_From_The_Hotels_Dropdown(String)"
});
formatter.result({
  "duration": 222382201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Super Deluxe",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Room_Type_From_The_Room_Type_Dropdown(String)"
});
formatter.result({
  "duration": 213912801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4 - Four",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_From_Number_Of_Rooms_Dropdown(String)"
});
formatter.result({
  "duration": 216014000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccheckindate\u003e",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Check_In_Date(String)"
});
formatter.result({
  "duration": 128065799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccheckoutdate\u003e",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Check_Out_Date(String)"
});
formatter.result({
  "duration": 104009200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Select_Adults_Per_Room_From_Adult_Per_Room_Dropdown(String)"
});
formatter.result({
  "duration": 247262100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_button_and_It_Navigates_To_Search_Hotel_Screen()"
});
formatter.result({
  "duration": 489020900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user Click On The Select Radio button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Click On The Continue button and It Navigate To Book A Hotel Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Select_Radio_button()"
});
formatter.result({
  "duration": 639849100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_button_and_It_Navigate_To_Book_A_Hotel_Screen()"
});
formatter.result({
  "duration": 453280301,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Book A Hotel Screen",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "user Enter The \"\u003cfirstname\u003e\" In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Enter The \"\u003clastname\u003e\" In The Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter The \"\u003caddress\u003e\" In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter \"\u003ccreditcardnum\u003e\" In The Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enter \"Master Card\" In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select \"June\" In The Expiry Date Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The \"2022\" In The Expiry Date Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter \"\u003ccreditcvv\u003e\" In The CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Click On The Book Now button and It Navigate To The Booking Confirmation Screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cfirstname\u003e",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_First_Name_In_The_First_Name_Field(String)"
});
formatter.result({
  "duration": 683503401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003clastname\u003e",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Last_Name_In_The_Last_Name_Field(String)"
});
formatter.result({
  "duration": 122180000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003caddress\u003e",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_The_Billing_Address_Field(String)"
});
formatter.result({
  "duration": 107981900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccreditcardnum\u003e",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_Credit_Card_Number_In_The_Credit_Card_Number_Field(String)"
});
formatter.result({
  "duration": 265669399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Master Card",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_Credit_Card_Type_In_The_Credit_Card_Type_Field(String)"
});
formatter.result({
  "duration": 245862901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "June",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Select_Month_In_The_Expiry_Date_Dropdown(String)"
});
formatter.result({
  "duration": 228272800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Year_In_The_Expiry_Date_Dropdown(String)"
});
formatter.result({
  "duration": 218647400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccreditcvv\u003e",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_CVV_Number_In_The_CVV_Number_Field(String)"
});
formatter.result({
  "duration": 86190900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_button_and_It_Navigate_To_The_Booking_Confirmation_Screen()"
});
formatter.result({
  "duration": 350157700,
  "status": "passed"
});
});