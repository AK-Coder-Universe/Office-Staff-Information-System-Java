# Office-Staff-Information-System-Java
Java Program Explanation: Staff and OfficeStaff Example
1. Abstract Class: Staff
- Defines common properties: id, name.
- Constructor initializes id and name.
- Abstract method displayDetails() must be implemented by subclasses.
2. Subclass: OfficeStaff
- Inherits from Staff.
- Adds department field.
- Constructor calls super() to initialize id and name, then sets department.
- Implements displayDetails() to print details.
3. Main Class: StaffDemo
- Uses Scanner to take input from the user.
- Creates an array of OfficeStaff objects.
- Loops to input id, name, and department for each staff member.
- Calls displayDetails() on each object to print all details.


Key Concepts:
1. Abstraction – Staff is abstract, cannot be instantiated directly.
2. Inheritance – OfficeStaff inherits from Staff.
3. Polymorphism – Subclasses implement displayDetails differently.
4. Array of Objects – staffArray stores multiple OfficeStaff instances.
5. Scanner – Used for dynamic user input.
Conclusion:
This program demonstrates abstraction, inheritance, polymorphism, and array of objects in Java
with user input handling.
