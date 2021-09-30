# String Calculator TDD Kata


The Code is based on the problem named TDD Kata.  
The main aim of the Code is to return the sum of the numbers passed as String to the method Signature named int Add(String number).  
The method supports Delimiters such as , and \n along with Custom Delimiters with syntax "//[delimiter]\n[numbers…]"  
  
For Example, "//.\n1.2"

## Some of Cases and their Outputs are Descirbed below  
#### Test Case 1:
##### Input : ""
##### Output : 0
The empty String is Passed so the result will be 0

#### Test Case 2:
##### Input : "4"
##### Output : 4
The String is Passed that contains only one Number so the result will be 4


#### Test Case 3:
##### Input : "1,4,3"
##### Output : 8
The String is Passed that contains Number separated by "," so the result will be 8 as 1+4+3 is 8


#### Test Case 4:
##### Input : "1\n2,3"
##### Output : 6
The String is Passed that contains Number separated by "," and new line(\n) i.e., multiple delimiters so the result will be 6 as 1+2+3 is 6


#### Test Case 5:
##### Input : "//;\n4;2;3"
##### Output : 9
The String is Passed that contains Number separated by ";" as per the custom Delimiter Syntax, the result will be 9 as 4+2+3 is 9


## Tools Used 
IntelliJ Idea
