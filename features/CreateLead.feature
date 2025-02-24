Feature: Login fuctionality of leaftab application
Scenario Outline: Login with valid credentials


And click on createlead link
And enter the company name as <c_name>
And enter the firstname as <f_name>
And enter the lastname as <l_name>
And click on create lead button
Then lead should be created

Examples:
|c_name|f_name|l_name|
|'testleaf'|'vineeth'|'r'|
|'Qeagle'|'hari'|'k'|