Feature: Login
Scenario Outline: Login data driven
Given User Launchs Chrome browser
When User open URL "https://xlogist.pisystindia.com/admin/login"
And User  enter emails as "admin@gmail.com" and password as "Charlie123"
And click on the Login
And click on the Locations
And click on Country
And click on AddCountry
And User enter Country as "India"
And click on AddButton
And Click on the  MainAdmin
And Click on the Logout