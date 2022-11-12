<p align="center">
 <img src=" https://qph.cf2.quoracdn.net/main-qimg-62be9fb6e1d7166e9cbeeed913096752" height="250" width="250">  </p>
 <h1 align="center">Pyyne Bank Challenge</h1>
<p align="center">
</p>
Backend bank aggregation application using Java language and Junit framework for unit tests.


### Description 
---
 The idea is to create a simple bank aggregation application that pulls information from multiple different banks and displays it. At the link, you can download some skeleton code in Java, that we put together to base the solution on.
there are two packages, "com.bank1" and "com.bank2" which represent proprietary API integration points towards these two hypothetical banks. They only return hardcoded dummy values and ignore input parameters, but I want you to imagine that they represent wrappers for external API calls. They both expose functionality to fetch account balances and transactions, but in slightly different ways. Your solution may not alter these classes.
You will also see that there is a class com.pyyne.challenge.bank.BankController which is the entry-point for you to start.
The challenge here is that we don’t want the BankController to ever directly use any classes in the com.bank1 and com.bank2 packages. Instead, you need to create an abstraction layer (using, for instance, an Adaptor pattern) that isolates and “hides” the bank1 and bank2 classes behind a common interface and data structures. Your solution should demonstrate appropriate separation of responsibilities and code isolation. A small hint, as there are different versions of the Adaptor pattern - the point is to create an abstraction that makes bank1 and bank2 look the same, not to create an adaptor that makes, for instance, bank1 look like bank2.



---

### Starting
```bash
# Clone this project
$ git clone https://github.com/JenniferFariasRodrigues/pyyne-challenge-bank.git

# Access on Eclipse IDE
On the IDE Eclipse choose the option "Import projects". On the folder "General" choose "Existing Projects into workspace" and choose  pyyne-challenge-bank folder.

# Choose folder in IDE and run the project
Click on  "main_application" folder and choose "Main.java" class.
Click on "Run" in the Window.

# Run unit tests on Eclipse IDE
On a project folder(pyyne_bank_challenge) Click on "Run" and " Run as". 
Select the option "JUnit Test".

```

---
### Output
The expected test coverage is 98.4% and the expected project output is:
```bash
========BANK BALANCES========

Currency: USD
Balance: 215.5
-------------------------------
Currency: USD
Balance: 512.5
-------------------------------

=======BANK TRANSACTIONS=======

Bank type: DEBIT
Transaction description: Check deposit
Bank amount: 100.0
-------------------------------
Bank type: CREDIT
Transaction description: Debit card purchase
Bank amount: 25.5
-------------------------------
Bank type: CREDIT
Transaction description: Rent payment
Bank amount: 225.0
-------------------------------
Bank type: CREDIT
Transaction description: Amazon.com
Bank amount: 125.0
-------------------------------
Bank type: CREDIT
Transaction description: Car insurance
Bank amount: 500.0
-------------------------------
Bank type: DEBIT
Transaction description: Salary
Bank amount: 800.0
-------------------------------

```


