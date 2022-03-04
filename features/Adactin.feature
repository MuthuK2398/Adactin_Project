Feature: Hotel Booking In Adactin Application
Scenario Outline: Login
Given user Must Launch The Url 
When user Enter The "MuthuKumar123" In The Username Field
And user Enter The "Q6J1JO" In The Password Field
Then user Click the Login button and It Navigates To Search Hotel Screen

Examples:
|username|password|
|MuthuKumar123|Q6J1JO|
|KumarMuthu451|qwerty4343|

Scenario: Search Hotel 
When user Select The "Brisbane" From The Location Dropdown
And user Select The "Hotel Cornice" From The Hotels Dropdown
And user Select The "Super Deluxe" From The Room Type Dropdown
And user Select The "4 - Four" From Number Of Rooms Dropdown
And user Enter The "<checkindate>" In The Check In Date Field
And user Enter The "<checkoutdate>" In The Check Out Date Field
And user Select "2 - Two" From Adult Per Room Dropdown
Then user Click The Search button and It Navigates To Search Hotel Screen


Scenario: Select Hotel 
When user Click On The Select Radio button
Then user Click On The Continue button and It Navigate To Book A Hotel Screen

Scenario: Book A Hotel Screen 
When user Enter The "<firstname>" In The First Name Field 
And user Enter The "<lastname>" In The Last Name Field
And user Enter The "<address>" In The Billing Address Field
And user Enter "<creditcardnum>" In The Credit Card Number Field
And user Enter "Master Card" In The Credit Card Type Field
And user Select "June" In The Expiry Date Dropdown
And user Select The "2022" In The Expiry Date Dropdown
And user Enter "<creditcvv>" In The CVV Number Field 
Then user Click On The Book Now button and It Navigate To The Booking Confirmation Screen  