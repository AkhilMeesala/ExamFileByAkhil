Feature: Login
Scenario Outline: Login Data Driven
Given User Launch Chrome browser
When User opens URL "https://products.pisystindia.com/Ecommerce/admin"
And User  enters Emails as "admin@gmail.com" and password as "123456"
And click on Login
And click on Locations
And click on City
And click on AddCity
And User enters City as "Visakhapatnam"
And click on Add
And Click on MainAdmin
And Click on Logout