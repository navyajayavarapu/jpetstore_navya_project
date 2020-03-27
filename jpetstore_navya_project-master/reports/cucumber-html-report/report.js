$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Jpetstore website",
  "description": "",
  "id": "jpetstore-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Jpetstore_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Registration to the application",
  "description": "",
  "id": "jpetstore-website;registration-to-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Enter user ID and password",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Add the account information",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Save the account inforamtion",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Complete the registration",
  "keyword": "And "
});
formatter.match({
  "location": "Registration_steps.enter_user_ID_and_password()"
});
formatter.result({
  "duration": 11702009637,
  "status": "passed"
});
formatter.match({
  "location": "Registration_steps.add_the_account_information()"
});
formatter.result({
  "duration": 2703848457,
  "status": "passed"
});
formatter.match({
  "location": "Registration_steps.save_the_account_inforamtion()"
});
formatter.result({
  "duration": 1340613221,
  "status": "passed"
});
formatter.match({
  "location": "Registration_steps.complete_the_registration()"
});
formatter.result({
  "duration": 2408060147,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login to the Jpet store application",
  "description": "",
  "id": "jpetstore-website;login-to-the-jpet-store-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tc02_Login"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "the user launches the website in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "opens the login page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.the_user_launches_the_website_in_chrome_browser()"
});
formatter.result({
  "duration": 12922456180,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.opens_the_login_page()"
});
formatter.result({
  "duration": 883285544,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.enter_username_and_password()"
});
formatter.result({
  "duration": 26997450572,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.click_on_login_button()"
});
formatter.result({
  "duration": 148011394,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search for the animal in the application",
  "description": "",
  "id": "jpetstore-website;search-for-the-animal-in-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tc03_Search"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "the search bar in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "search for the animal you are looking for",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "enter the product id and name in the search bar",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "click on the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Search_steps.the_search_bar_in_the_login_page()"
});
formatter.result({
  "duration": 19183511942,
  "status": "passed"
});
formatter.match({
  "location": "Search_steps.search_for_the_animal_you_are_looking_for()"
});
formatter.result({
  "duration": 129418170,
  "status": "passed"
});
formatter.match({
  "location": "Search_steps.enter_the_product_id_and_name_in_the_search_bar()"
});
formatter.result({
  "duration": 14949003148,
  "status": "passed"
});
formatter.match({
  "location": "Search_steps.click_on_the_search_button()"
});
formatter.result({
  "duration": 61471705,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Add the animals or bird to the cart",
  "description": "",
  "id": "jpetstore-website;add-the-animals-or-bird-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@tc04_addtocart"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "the details of the required animal or bird",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "the product id and name of the animal is added to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "check the shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "contains the wish list",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart_steps.the_details_of_the_required_animal_or_bird()"
});
formatter.result({
  "duration": 5954122392,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_steps.the_product_id_and_name_of_the_animal_is_added_to_the_cart()"
});
formatter.result({
  "duration": 3548021891,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_steps.check_the_shopping_cart()"
});
formatter.result({
  "duration": 3676575778,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_steps.contains_the_wish_list()"
});
formatter.result({
  "duration": 582888857,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Prints the details in a table",
  "description": "",
  "id": "jpetstore-website;prints-the-details-in-a-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@tc05_printtable"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "the details of an animal in the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "the details are matched",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "the selected animals details are printed",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "details are printed in a table",
  "keyword": "And "
});
formatter.match({
  "location": "Printtable_steps.the_details_of_an_animal_in_the_homepage()"
});
formatter.result({
  "duration": 11782589587,
  "status": "passed"
});
formatter.match({
  "location": "Printtable_steps.the_details_are_matched()"
});
formatter.result({
  "duration": 61169,
  "status": "passed"
});
formatter.match({
  "location": "Printtable_steps.the_selected_animals_details_are_printed()"
});
formatter.result({
  "duration": 1817977238,
  "status": "passed"
});
formatter.match({
  "location": "Printtable_steps.details_are_printed_in_a_table()"
});
formatter.result({
  "duration": 290180854,
  "status": "passed"
});
});