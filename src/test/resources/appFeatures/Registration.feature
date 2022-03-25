Feature: Registration feature


Scenario: Login with different users
Given User is on registration page 
When User trying to login with below credentials
			
			|niladri|acharya|12345|Odisha|
			|naveen|automation|123456|bangalore|
			|tejas|rath|1234567|kolkata|
			
		


Scenario: Login with different users with columns
Given User is on registration page 
When User trying to login with below credentials with columns
			
			|First Name|Last Name|Phone|Place|
			|niladri|acharya|12345|Odisha|
			|naveen|automation|123456|bangalore|
			|tejas|rath|1234567|kolkata|