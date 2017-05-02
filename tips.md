# Tips for Assignments

Some random comments and tips on programming style and common mistakes that may make your assignment submissions (and general app development) better.

## Good Names Early

- When naming variables, fields, methods and classes, carefully choose good names for them early in your design. 
- DON'T choose a temporary name (like `x`) and think that you will come back later and assign an appropriate name. Assign the appropriate name straight away.
- For class instance fields DON'T include the class name in the field name. For example with class `Person`, use a field name of `firstName`, NOT `personFirstName` (which would be read as `Person.personFirstName` - this is wasteful/redundant).
- For GUI elements (such as JTextField, JLabel, JPanel) include the element name in the variable name. For example, if you have a Jlabel named `firstNameLabel` and a JTextField named `firstNameField`. 

## Comment As You Go

- Write comments as you write code. Coming back later to write comments generally doesn't happen.
- Use comments to explain *what your code does* and to explain *unexpected code* (e.g. you implement something in a not so obvious manner, it is a very important feature, your implement to overcome an error elsewhere).
- The details/need for comments can change as you get into more detailed code. For example:
  - Must write a comment for entire class
  - Should write comments for each block of variable definitions or for the set of getters/setters
  - May write comments for individual variable definitions or individual methods
  
## Paper Design of GUI

- Before implementing your GUI, draw a picture of it on paper. Start with a rectangle for a frame, then divide it into panels (rectangles), then add elements (text fields, labels, combo boxes) to each panel. It can be a quick hand drawn diagram.
- Now think about the layout managers: Grid, Flow and Border (North, Centre, South, ...). Which ones will be used to create your desired design? You may have to add more panels within panels to get a good layout.
- Now start naming the panels, and then name all the GUI elements (text fields, labels, etc)

## Follow the Instructions

- Assignments usually come with a marksheet. When marking, the lecturer must follow the marksheet. If the marksheet says 2 marks for including your student ID in the GUI, then you will get 0 marks if you don't. The lecturer has very little freedom in adjusting the marking scheme. 
- There are many *easy* marks to get - make sure you don't miss out on them.
- Make sure submissions use correct file formats, correct file names and include all necessary files. 

## Validate Everything

- Validation is checking that the input is *present* (e.g. not missing or null) and *appropriate* (e.g. write type). 
- Validation is often needed in two places: 
  1. When a user enters data via a GUI, e.g. a JTextField for `birthMonth`
  2. When data is passed into a method, e.g. a setter method `setPurchaseAmount(int amount)`
- Write methods to validate common things, e.g. `boolean isValidMonth(int month)`. You will often re-use these methods.

## Automate

- Make your life easier be automating common/repetitive tasks. IDEs such as NetBeans usually help with this, e.g.
  - Generate getters and setters
  - Indent code
  - Auto-complete methods and variables
  
## Split Long Code into Methods

- If you find you have a long section of code, think whether it makes sense to move parts of the code into separate methods. This can be done commonly for GUI code. Instead of putting all the GUI element initialisation together, separate into a set of methods:

```
initNewEmployeePanel();
initListOfEmployeesPanel();
initControlButtons();
```



