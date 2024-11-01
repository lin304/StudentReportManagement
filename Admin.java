import java.util.Scanner;
public class Admin {

    //calling other classes
    updateInfo infoUpdate = new updateInfo();
    Report report = new Report();

    //method for choosing options by admin
    public void adminProfile() {
        Scanner obj = new Scanner(System.in);

        System.out.println("\nChoose an option: ");
        System.out.println("1. Update Student Info");
        System.out.println("2. Show Student marks");
        System.out.println("3. Exit");

        char option = obj.next().charAt(0);

        switch (option) { //switch for choosing an option
            case '1':
                infoUpdate.studentScore(); //calling another class method
                char add;
                do{ //do-while loop for adding another student
                    System.out.println("\nDo you want to add another student info? Y/N");
                    add = obj.next().charAt(0);

                    //if the user input is Y or y, it will continue to add another student info
                    if (add == 'Y' || add == 'y') {
                        infoUpdate.studentScore(); //calling method from infoUpdate class for updating student info

                    } else //if the user input is other than Y or y
                        System.out.println("\n...Exiting...");

                } while (add == 'Y' || add == 'y'); //condition for do-while loop to continue or exit
                break;


            case '2':
                report.showStudentMarks(); //calling method from report class for viewing student info
                break;

            case '3':
                System.out.println("...Exiting...");
                break;


            default: //if user input is apart from given option, it will ask to enter again
                do {
                    System.out.println("\nInvalid option. Please Try Again.");
                    System.out.println("Choose an option: ");
                    System.out.println("1. Update Student Info");
                    System.out.println("2. Show Student marks");
                    System.out.println("3. Exit");

                    option = obj.next().charAt(0);

                    //switch loop to run option choices again
                    switch (option) {
                        case '1':
                            do{
                                infoUpdate.studentScore();
                                System.out.println("Do you want to add another student info? Y/N");
                                add = obj.next().charAt(0);

                                if (add == 'Y' || add == 'y') {
                                    infoUpdate.studentScore();

                                } else
                                    System.out.println("...Exiting...");

                            } while (add == 'Y' || add == 'y');
                            break;


                        case '2':
                            report.showStudentMarks();
                            break;

                        case '3':
                            System.out.println("\n...Exiting...");
                            break;
                    }
                } while (!(option == '1' || option == '2' || option == '3'));
        }
    }
}