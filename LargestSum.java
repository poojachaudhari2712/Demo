package Demo;
import java.util.Scanner;

public class LargestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number
        int largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }


        float average = (num1 + num2 + num3)/3;
        // Display the largest number
        System.out.println("The largest number is: " + largest);
        
        // Display the sum of the largest number
        System.out.println("The sum of the largest number is: " + largest);

        System.out.println("The average of the three numbers is: " + average);
        
        scanner.close();
    }
}


//git clone https://github.com/poojachaudhari2712/Demo.git
//git init
//git add .
// if error comes manually add the .java file in the cloned repository
//git add .java file name
//git commit -m "Pooja"
//git branch = to check the branch
//if branch is master then
//git branch -M main
// git push origin main
// fatal: 'origin' does not appear to be a git repository
// fatal: Could not read from remote repository.

// Please make sure you have the correct access rights
// and the repository exists.
// PS C:\Users\dac.STUDENTSDC\Desktop\Ptest> git remote add origin https://github.com/poojachaudhari2712/Demo.git
// PS C:\Users\dac.STUDENTSDC\Desktop\Ptest> 
