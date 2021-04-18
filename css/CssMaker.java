import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CssMaker {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter CSS File name");
            String filename = scanner.nextLine();
            FileWriter myWriter = new FileWriter(filename + ".css");

            System.out.print("How many number of classes: ");
            int num_of_classes = scanner.nextInt();

            for(int i=1; i<=num_of_classes; i++){
                System.out.println("Class: " + i);
                System.out.print("How many properties?: ");
                int tot_no_of_pv = scanner.nextInt();

                System.out.print("Selector Name: ");
                String css_selector = scanner.nextLine();

                String line1 = "." + css_selector + "{\n";
                myWriter.write(line1);

                for(int j=1;j<=tot_no_of_pv;j++){
                    System.out.print("Property Name: ");
                    String css_property = scanner.nextLine();
                    System.out.print("Value Name: ");
                    String css_value = scanner.nextLine();

                    String line2 = "    " + css_property + ": " + css_value + ";\n";
                    myWriter.write(line2);
                }
                String line3 = "}\n\n";
                myWriter.write(line3);
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
} 
