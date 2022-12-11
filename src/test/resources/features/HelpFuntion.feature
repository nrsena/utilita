Feature: Help functinality test and verification

  Scenario:
Given the utilita website has loaded
When user clicks on Help
Then Help screen will load
When user clicks Your Customer Reference Number
Given no details are filled out
When user clicks on Find button
Then error message -Please provide your email-phone number and postcode- will show
