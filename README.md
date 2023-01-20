# Online-Banking-System
Description :
The objective of this project is to maintain the accounts like saving account, withdrawing, depositing money and applying loan to the user. Bank provides account number to the customer for dealing transactions in the bank. At first a user registers himself/herself as customer. After that account can be opened. A customer can open more than one account.

Users of this project are :
1. Accountant
2. Customer

Roles of Accountant are:
1.  Login using his/her username and password.
2.  Adding new account for customer.
3.  Editing already available account.
4.  Removing the account by using account number.
5.  Viewing particular account details by giving account number.
6.  Viewing all the account details.
7.  Taking care of deposit and withdrawal operations.

Roles of Customer are
1. Login using his/her username and password
2. Transfer the money from his account to other account
3. Checking the transaction history

# Flow Chart
![flowchart](https://user-images.githubusercontent.com/70317048/213243285-5ea83874-038e-41e9-9124-b010f83e84d4.png)

# Database
1.  create table accountants(username varchar(20), password varchar(10));

 desc accountants;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| username | varchar(20) | YES  |     | NULL    |       |
| password | varchar(10) | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+

2. create table customers(accno varchar(12) primary key  Not Null,username varchar(20), password varchar(10), mobile varchar(10), balance int);

 desc customers;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| accno    | varchar(12) | NO   | PRI | NULL    |       |
| username | varchar(20) | YES  |     | NULL    |       |
| password | varchar(10) | YES  |     | NULL    |       |
| mobile   | varchar(10) | YES  |     | NULL    |       |
| balance  | int         | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+

3.  create table transactions(accno varchar(12), debit int, credit int, available_balance int);

 desc transactions;
+-------------------+-------------+------+-----+---------+-------+
| Field             | Type        | Null | Key | Default | Extra |
+-------------------+-------------+------+-----+---------+-------+
| accno             | varchar(12) | YES  |     | NULL    |       |
| debit             | int         | YES  |     | NULL    |       |
| credit            | int         | YES  |     | NULL    |       |
| available_balance | int         | YES  |     | NULL    |       |
+-------------------+-------------+------+-----+---------+-------+
