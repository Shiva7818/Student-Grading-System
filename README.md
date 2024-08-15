# SGPA Calculator using Java

## Overview

This Java program calculates the Semester Grade Point Average (SGPA) based on the marks and credits of subjects entered by the user.

## Classes and Functions

### SubjectandMarks Class

- **Fields:**
  - `sub`: Name of the subject
  - `internalmarks`: Internal marks obtained
  - `externalmarks`: External marks obtained
  - `credit`: Credit hours of the subject
  - `maxMarks`: Maximum marks for the subject

- **Methods:**
  - `setMaxMarks(int maxMarks)`: Sets the maximum marks for the subject.
  - `getMaxMarks()`: Retrieves the maximum marks for the subject.
  - `setSub(String sub)`: Sets the name of the subject.
  - `setInternalMarks(int internalmarks)`: Sets the internal marks obtained.
  - `setExternalMarks(int externalmarks)`: Sets the external marks obtained.
  - `setCredit(double credit)`: Sets the credit hours of the subject.
  - `getCredit()`: Retrieves the credit hours of the subject.
  - `getSub()`: Retrieves the name of the subject.
  - `getTotalMarkobtained()`: Calculates and retrieves the total marks obtained (internal + external).
  - `getInternalMarks()`: Retrieves the internal marks obtained.
  - `getExternalMarks()`: Retrieves the external marks obtained.
  - `getCreditSCORE(int totalmarks, double newcredit, int marksobtained)`: Calculates and retrieves the grade points multiplied by credit based on the total marks, new credit, and marks obtained.

### Std Class

- **Fields:**
  - `noOfSubjects`: Number of subjects for which SGPA is to be calculated.

- **Methods:**
  - `setNoOfSubjects(int noOfSubjects)`: Sets the number of subjects.
  - `returnsgpa()`: Calculates and returns the SGPA based on user input for each subject.

## Running the Program

To run the program, follow these steps:

1. **Compile the Java Program:**
   ```bash
   javac Main.java


   java Main


## Example Input and Output

### Example Input:

Suppose you want to calculate SGPA for 3 subjects:

1. Subject Name: Java Programming
   - Credit Hours: 4
   - Internal Marks: 40
   - External Marks: 60
   - Total Marks: 100

2. Subject Name: Database Management
   - Credit Hours: 3
   - Internal Marks: 35
   - External Marks: 55
   - Total Marks: 90

3. Subject Name: Software Engineering
   - Credit Hours: 3
   - Internal Marks: 38
   - External Marks: 58
   - Total Marks: 95

### Example Output:

Upon entering the above details, the program will calculate the SGPA based on the formula:

\[ \text{SGPA} = \frac{\sum(\text{Grade Points} \times \text{Credit Hours})}{\sum(\text{Credit Hours})} \]

For example, if the calculated Grade Points (GP) are:
- Java Programming: 9.0
- Database Management: 8.5
- Software Engineering: 8.7

And respective Credit Hours are:
- Java Programming: 4
- Database Management: 3
- Software Engineering: 3

Then, the SGPA will be calculated as:
\[ \text{SGPA} = \frac{(9.0 \times 4) + (8.5 \times 3) + (8.7 \times 3)}{4 + 3 + 3} \]

### Note:
- Ensure Java Development Kit (JDK) is installed on your system.
- Compile and run the program in a Java-supported IDE or command line.

## Development Environment

- Java Development Kit (JDK): Version X.X.X
- Integrated Development Environment (IDE): [IDE Name and Version]

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please feel free to [create an issue](link-to-issue-tracker) or submit a pull request.




Feel free to customize the `README.md` further based on your specific implementation details, development environment, and any additional information you want to include. This structured format helps users understand the purpose of your program, how to use it, and how to contribute to its development.



