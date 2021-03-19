# SMU Advanced Computer Programming and Problem Solving Course Assignment #1: TimeConverter

This program intakes 4 digits that represents a time on the 24 hour time clock and converts it to a time on a 12 hour clock.

Assignment Instructions:

Write a program TimeConverter.java that takes as input a 4 digit number that represents a time on the 24 hour time clock (0200, 2315, 0730). The program should convert the time to a time on the 12 hour clock and display it in the usual format (2:00 am, 11:15 pm, 7:00 am) then pause before ending. 

The program should verify that the input is valid (4 characters that are digits and represent a valid time). If the input is not valid the program should display an error message and pause before ending (the program should NOT crash!!!). 

Note: 0000 and 2400 both refer to the same time, we will consider 0000 to be the ONLY valid representation for that time.

Your program should display the standard information header (part 1 of lab01) and the code should meet all the code style requirements including the required comments, self assessment, and test cases as discussed in lecture. You will submit a single .java file for grading, the .class file is not required.

The following is an example of what a valid run of the program should look like:

Assignment##
Lastname, Firstname
A########
Description of the program

Enter a 4 digit 24h time: 0005
0005 is 12:05 am
Press enter to end...

And for something invalid:

Assignment##
Lastname, Firstname
A########
Description of the program

Enter a 4 digit 24h time: 3:05
Error: invalid input 3:05
Press enter to end...
