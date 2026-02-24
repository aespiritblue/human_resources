/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?

Composition

Q2: Color and Red are related
by which, Inheritance or Composition?

Inheritance

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?

Inheritance

Q4: Furniture and Desk are related
by which, Inheritance or Composition?

Inheritance

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?

Composition

*/
/*
Angelo Espiritu
2/20/2026
Purpose: To create a hr system that sorts through
Sources: 
https://www.geeksforgeeks.org/java/abstract-methods-in-java-with-examples/
https://www.w3schools.com/java/ref_string_format.asp
https://www.geeksforgeeks.org/java/command-line-arguments-in-java/
https://www.w3schools.com/java/java_inheritance.asp
https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
https://www.w3schools.com/Java/java_ref_scanner.asp
https://www.w3schools.com/java/java_arraylist.asp
https://www.geeksforgeeks.org/java/arraylist-in-java/
https://www.geeksforgeeks.org/java/abstraction-in-java-2/
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		//new line to add space
		System.out.println();
		//Instantiating a person object as a test
		Person testPerson = new Person("Darya",175, 57);
		System.out.println("Test person:");
		System.out.println(testPerson);
		System.out.println();
		//Instantiating a PersonSet object as a test
		PersonSet personSet = new PersonSet();
		//read in hr.txt and display it to command prompt
		try
		{
			Scanner fileReader = new Scanner(new File(args[0])); //reads in from command line

			fileReader.nextLine(); //Skips line

			while(fileReader.hasNext()) //reads in each part of the txt file
			{
				String name = fileReader.next();
				double height = fileReader.nextDouble();
				double weight = fileReader.nextDouble();

				Person p = new Person(name, height, weight); //assigns each line to p
				personSet.add(p); //adds it to person set

			}	
			System.out.println(personSet); //prints personset

			fileReader.close(); //close scanner
		}
		catch(FileNotFoundException e)
		{
    		System.out.println("File not found.");
		}

		
		/*
		// Don't overcomplicate the data
		// reading. After skipping the
		// first row, you can use the 
		// following to read a row of
		// character info, assuming your
		// Scanner is named "fileReader"
		*/
	
		/* 
		try
		{	
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
		*/
	}
}
