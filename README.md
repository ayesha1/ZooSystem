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
Human logs in the system

The system displays welcome message with different options
Owner, Visitor, and Employee
Human selects the appropriate position/identity
The system takes them (the human(s)) into appropriate pages
Owner’s page, Visitor’s page, and Employees page 
Variation #1
1.1 In step 2, if Human does not make a selection 
1.2 The system remains on the same page 
1.3 Continue with step 2. 


### For Visitors
Visits the Zoo
Visitor Log into the system
It enters name and age
The system displays Park Visitation Screen which shows the 6 environments
It clicks on one of the environment
Visitor selects on an animal
Visitor is then lead to a page where it can interact with the animal
Visitor can go back to the environment page
Variation #1 
2.1  In step 2,  Visitor enters nothing
2.2 The System will give an error on the screen
2.3 Displays, “Some areas are blank!” in red.
Variation #2 
7.1 It can go back to the Welcome page where the options are shown

### For Employees
Employee enters the zoo
The System displays options, Visitor, Employee, Owner
The Employee clicks on Employee button 
System shows email and password textfield. 
The Employee enters email and password
System confirms email and passwords and leads the employee into Employee details page which shows the employees different attributes.
The employee then decides to visit the Zoo Environments page
The employee selects and environment
The employee selects an animal
The employee interacts with the animal
Then it goes back to the Zoo Welcome page
Variation #1 
4.1 Employee enters wrong email or password
4.2 System does not let the employee in

### For Owner
Checks the System
The owner enters the Zoo
Zoo System displays three different options
Owner clicks on Owner Option
System displays email and password
Enters “0” and “0” for both fields
System displays owner options
Owner can go back to Zoo welcome page
Variation #1
6.1 Owner selects collect pay from Visitors
6.2 System displays “$0” and confirms that it has collected money
Variation #2 
6.1 Owner selects to pays employees
6.2 System displays that it has paid employees

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

