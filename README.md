# POO_tema1
The application will consist of 4 files (classes):

1. `ComparableStack.java` -- This class will belong to the package `poo.test1.util`.
2. `Comparable.java` -- This class will belong to the package `poo.test1`.
3. `Student.java` -- This class will belong to the default package.
4. `Test.java` -- This class will belong to the default package.

## StivaDeComparabile.java
The class `ComparableStack` will implement the functionality of a Last In First Out (LIFO) data structure, i.e., a stack, which will hold elements of type `Comparable`. The elements will be stored in a member variable, an array of type `Comparable`. The class will have a constructor that takes an integer parameter representing the maximum size of the stack. The accessible methods from outside the class will be:
- `printElements` (starting from the top of the stack)
- `addElement` (add an element)
- `removeElement` (remove and return the top element)
- `sortElement` (descending order - the largest element on top)

Note: The methods will display messages for edge cases or important operations to notify the user.

## Comparabil.java
The class `Comparable` will have an externally accessible method `compare`. This method will take another `Comparable` variable as input and return an integer value randomly chosen from the set {-1, 0, 1}.

## Student.java
The `Student` class will extend `Comparable.java` and override the `compare` method. The class will have two private member variables: `name` (String) and `attendance` (int). The following methods will be available to the user:
- `getName` -- returns the student's name (no input parameters)
- `setName` -- sets the student's name provided as an input argument (no output parameter)
- `getAttendance`, `setAttendance`
- `compare` -- compares the current object with the parameter object based on the `attendance` field. If the number of attendances is equal, it returns 0; if the current object's attendance count is less / greater, it returns -1 / +1.

## Test.java
The `Test` class will contain a `main` method in which the following operations will be performed:
1. Create a `ComparableStack` object (the maximum size will be provided as a command-line argument and will be set to 4).
2. Display the content of the stack.
3. Using a `while` loop, add 5 elements (students with random attendance values and names of the format `Stud_ELTH_X`, where X is the current loop counter value).
4. Display the content of the stack.
5. Using another `while` loop, remove 2 elements.
6. Display the content of the stack.
7. Using another `while` loop, remove 4 elements.
8. Display the content of the stack.
9. Sort the elements of the stack.
10. Display the content of the stack.
