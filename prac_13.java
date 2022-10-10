//THIS PROGRAM PREPARED BY PRACHI GAJERA 21CE030
// 13) (Display nonduplicate names in ascending order) Given one or more text files, each
// representing a day’s attendance in a course and containing the names of the students
// who attended the course on that particular day, write a program that displays, in
// ascending order, the names of those students who have attended at least one day of the
// course. The text file(s) is/are passed as command-line argument(
import java.io.File; 
import java.io.IOException; 
import java.util.*; 

public class prac_13 {
    
    public static void sortArray(String[] student, int k) {
        
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
               
                if (student[j].compareTo(student[j + 1]) > 0) {
                    String temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        // print the student array in ascending order
        for (int i = 0; i < k; i++) {
            System.out.println(student[i]);
        }
    }

    public static void main(String[] args) {
        
        String student[] = new String[500];
        
        int counter = 0;
        try {
           
            for (int i = 0; i < args.length; i++) {
                
                File file = new File(args[i]);
                
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    // reads one line
                    String line = sc.nextLine();
                    int flag = 0;
                    for (int j = 0; j < counter; j++) {
                        if (line.compareTo(student[j]) == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        student[counter] = line;
                        counter++;
                    }
                }
            }
            System.out.println("the list of students in ascending order:");
            
            sortArray(student, counter);
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}