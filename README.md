# Zoo System
<div>Icons made by <a href="https://www.freepik.com/" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" 			    title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" 			    title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>

🐯A Zoo Management System lets you see different types of animals. <br>
Video Demo <a href="https://www.youtube.com/watch?v=SvF-fqdC41s">here</a>
## Table of Contents
1. [Overview](#Overview)
1. [Use Cases](#Use-Cases)
1. [UML Diagrams](#UML-Diagrams)
1. [Design patterns applied](#Design-Patterns-Applied)
1. [Components](#Components)

## Overview
### Description
This application is a Zoo Management System where you can enter the zoo as a visitor, employee or the owner. As a visitor, you can visit the 6 environment and interact with the animals. 

## Use Cases
Make Use Cases from Textual Descriptions 
Each Use Case focuses on a specific scenario, and describes the steps that are necessary to bring it to successful completion. Each step in a use case represents an interaction with people or entities outside the computer system (the actors) and the system itself. 

As per the textual description of the project, the actors in the use cases will be Humans, the Visitors, Owner, Employees.
For Humans

### Log into the System 
1 Human logs in the system<br>
2 The system displays welcome message with different options<br>
3 Owner, Visitor, and Employee<br>
4 Human selects the appropriate position/identity<br>
5 The system takes them (the human(s)) into appropriate pages<br>
6 Owner’s page, Visitor’s page, and Employees page <br>
Variation #1<br>
1.1 In step 2, if Human does not make a selection <br>
1.2 The system remains on the same page <br>
1.3 Continue with step 2. <br>


### For Visitors
1 Visits the Zoo<br>
2 Visitor Log into the system<br>
3 It enters name and age<br>
4 The system displays Park Visitation Screen which shows the 6 environments<br>
5 It clicks on one of the environment<br>
6 Visitor selects on an animal<br>
7 Visitor is then lead to a page where it can interact with the animal<br>
8 Visitor can go back to the environment page<br>
9 Variation #1 <br>
2.1  In step 2,  Visitor enters nothing<br>
2.2 The System will give an error on the screen<br>
2.3 Displays, “Some areas are blank!” in red.<br>
Variation #2 <br>
7.1 It can go back to the Welcome page where the options are shown<br>

### For Employees
1 Employee enters the zoo<br>
2 The System displays options, Visitor, Employee, Owner<br>
3 The Employee clicks on Employee button <br>
4 System shows email and password textfield. <br>
5 The Employee enters email and password<br>
6 System confirms email and passwords and leads the employee into Employee details page which shows the employees different attributes.<br>
7 The employee then decides to visit the Zoo Environments page<br>
8 The employee selects and environment<br>
9 The employee selects an animal<br>
10 The employee interacts with the animal<br>
11 Then it goes back to the Zoo Welcome page<br>
12 Variation #1 <br>
4.1 Employee enters wrong email or password<br>
4.2 System does not let the employee in<br>

### For Owner
1 Checks the System<br>
2 The owner enters the Zoo<br>
3 Zoo System displays three different options<br>
4 Owner clicks on Owner Option<br>
5 System displays email and password<br>
6 Enters “0” and “0” for both fields<br>
7 System displays owner options<br>
8 Owner can go back to Zoo welcome page<br>
Variation #1<br>
6.1 Owner selects collect pay from Visitors<br>
6.2 System displays “$0” and confirms that it has collected money<br>
Variation #2 <br>
6.1 Owner selects to pays employees<br>
6.2 System displays that it has paid employees<br>

## UML Diagrams
<img src="https://i.imgur.com/kvfY8tH.png" width=700 hspace="20">

### Sequence Diagrams
### Visitor Sequence Diagram
<img src="https://i.imgur.com/675Whd0.png" width=700 hspace="20">
<img src="https://i.imgur.com/qDPwDuW.png" width=700 hspace="20">
### Owner Sequence Diagram
<img src="https://i.imgur.com/GFf6ktT.png" width=700 hspace="20">

## Design Patterns Applied
Iterator 
- To iterate the list of Employees to get the Sign In
- Check SignInEmployee.java to see how we loop through

Strategy 
- We have an interface AnimalActions.java
- Utilizes static methods to implement the 'STRATEGY' pattern
- Each animal object implements said interface and rewrites the methods

MVC Model View Controller 
- We separated the Model, View and the Controller
  - Model is where the data is
  - View, we used JavaFx to display the views and uses the Controller
  - Controller handles the input from the user and manipulates the data and view to update.

## Components
We have one file for all the implementation
We have another file for images
<img src="https://i.imgur.com/Dtmnid0.png" width=400 hspace="20">

