Feature: Uber Booking Feature

Scenario: Booking cab
Given User wants to select a care type "sedan" from uber app
When User select car "sedan" pick up point"usa"and Drop location "Vriandavan"
Then Driver start the journey
And Driver ends the journey
Then user pays 1000 USD