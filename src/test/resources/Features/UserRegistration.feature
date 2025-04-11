Feature: User Registeration

@Register
Scenario Outline: Register on the website with valid and invalid fields
  Given I want to be in the demowebshop "url"
  When I click on register
  And I choose gender
  And I enter "<First name>","<Second name>","<Email>","<Password>","<Confirm password>" in the corresponding field
  And I click on the register button
  Then the registration result should be "<Result>"

Examples:
|First name|Second name|Email            |Password|Confirm password|Result                      |
|Yuvaraj   |R          |yuv@gmail.com    |123456  |123456          |Your registration completed |
|Yuvaraj   |R          |ghana@           |123456  |123456          |Wrong email                 |
|          |R          |yuv@gmail.com    |123456  |123456          |First name is required      |
|Yuvaraj   |           |yuv@gmail.com    |123456  |123456          |Second name is required     |
|Yuvaraj   |R          |                 |123456  |123456          |Email is required           |
|Yuvaraj   |R          |yuv@gmail.com    |        |123456          |Password is required        |
|Yuvaraj   |R          |yuv@gmail.com    |123456  |                |Confirm password is required|