Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login to application with username "jin" and password "1236hn7"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login to application with username "kal" and password "samanig123"
Then Home page is populated
And Cards displayed are "false"


