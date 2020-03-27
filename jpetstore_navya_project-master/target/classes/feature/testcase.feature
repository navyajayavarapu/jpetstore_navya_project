@Jpetstore_Feature
Feature: Jpetstore website

@tc01_register
Scenario: Registration to the application
Given Enter user ID and password
When Add the account information
Then Save the account inforamtion
And Complete the registration

@tc02_Login
Scenario: Login to the Jpet store application

Given the user launches the website in chrome browser
When opens the login page
Then enter username and password
And click on login button

@tc03_Search
Scenario: Search for the animal in the application

Given the search bar in the login page
When search for the animal you are looking for
Then enter the product id and name in the search bar
And click on the search button

@tc04_addtocart
Scenario: Add the animals or bird to the cart

Given the details of the required animal or bird
When the product id and name of the animal is added to the cart
Then check the shopping cart
And contains the wish list 

@tc05_printtable
Scenario: Prints the details in a table
 
 Given the details of an animal in the homepage
 When the details are matched
 Then the selected animals details are printed
 And details are printed in a table