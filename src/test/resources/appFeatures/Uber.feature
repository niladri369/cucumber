
Feature: Uber booking feature

@Smoke
Scenario: Booking cab Sedan
Given user is trying to book a "sedan" cab with uber
When user select cartype as "sedan" pick up location as "odisha" and drop location is "kolkata"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 rs

@Regression
Scenario: Booking cab Minicar
Given user is trying to book a "Minicar" cab with uber
When user select cartype as "Minicar" pick up location as "Hyderabad" and drop location is "Bangalore"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 rs

@Production
Scenario: Booking cab SUV
Given user is trying to book a "SUV" cab with uber
When user select cartype as "SUV" pick up location as "Mumbai" and drop location is "Pune"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 rs

