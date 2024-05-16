import java.util.Scanner;

public class PersonalityTests 
{
    public static void main(String[] args) 
    {

        int numberOf_A_Selected = 0;
        int numberOf_B_Selected = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("\nWhat is your name? ");
        String userName = input.nextLine();

        System.out.printf("%nHi %s, you are required to answer A or B%nof all questions in this personality test.%nYour result will be determined by your responses.%n", userName);

        String options1 = "";
        String options2 = "";
        String options3 = "";
        String options4 = "";
        String options5 = "";
        String options6 = "";
        String options7 = "";
        String options8 = "";
        String options9 = "";
        String options10 = "";

        String options11 = "";
        String options12 = "";
        String options13 = "";
        String options14 = "";
        String options15 = "";
        String options16 = "";
        String options17 = "";
        String options18 = "";
        String options19 = "";
        String options20 = "";



        options1 = """
                \nA. expend energy, enjoy groups \t B. conserve energy, enjoy one-on-one
                """;
        options2 = """
                \nA. Interpret literally \t B. look for meaning and possibilities
                """;
        options3 = """
                \nA. logical, thinking, questioning \t B. empathetic, feeling, accommodating
                """;
        options4 = """
                \nA. organized, orderly \t B. flexible, adaptable
                """;
        options5 = """
                \nA. more outgoing, think out loud \t B. more reserved, think to yourself
                """;
        options6 = """
                \nA. practical, realistic, experiential \t B. imaginative, innovative, theoretical
                """;
        options7 = """
                \nA. candid, straight forward, frank \t B. tactful, kind, encouraging
                """;
        options8 = """
                \nA. plan, schedule \t B. unplanned, spontaneous
                """;
        options9 = """
                \nA. seek many tasks, public activities, interaction with others \t B. seek private, solitary activities with quiet to concentrate
                """;
        options10 = """
                \nA. standard, usual, conventional \t B. different, novel, unique
                """;
        options11 = """
                \nA. firm, tend to criticize, hold the line \t B. gentle, tend to appreciate, conciliate
                """;
        options12 = """
                \nA. regulated, structured \t B. easy-going, live and let live
                """;
        options13 = """
                \nA. external, communicative, express yourself \t B. internal, reticent, keep to yourself
                """;
        options14 = """
                \nA. focus on here-and-now \t B. look to the future, global perspective, big picture
                """;
        options15 = """
                \nA. tough-minded, just \t B. tender-hearted, merciful
                """;
        options16 = """
                \nA. preparation, plan ahead \t B. go with the flow, adapt as you go
                """;
        options17 = """
                \nA. active, initiate \t B. reflective, deliberate
                """;
        options18 = """
                \nA. facts, things, what is \t B. ideas, dreams, what could be", philosophical
                """;
        options19 = """
                \nA. matter of fact, issue-oriented \t B. sensitive, people-oriented, compassionate
                """;
        options20 = """
                \nA. control, govern \t B. latitude, freedom
                """;

        String user_Response_Options1 = "";
        String user_Response_Options2 = "";
        String user_Response_Options3 = "";
        String user_Response_Options4 = "";
        String user_Response_Options5 = "";
        String user_Response_Options6 = "";
        String user_Response_Options7 = "";
        String user_Response_Options8 = "";
        String user_Response_Options9 = "";
        String user_Response_Options10 = "";

        String user_Response_Options11 = "";
        String user_Response_Options12 = "";
        String user_Response_Options13 = "";
        String user_Response_Options14 = "";
        String user_Response_Options15 = "";
        String user_Response_Options16 = "";
        String user_Response_Options17 = "";
        String user_Response_Options18 = "";
        String user_Response_Options19 = "";
        String user_Response_Options20 = "";

        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options1);
        user_Response_Options1 = input.nextLine();
        switch (user_Response_Options1) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }

        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options2);
        user_Response_Options2 = input.nextLine();
        switch (user_Response_Options2) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }

        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options3);
        user_Response_Options3 = input.nextLine();
        switch (user_Response_Options3) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options4);
        user_Response_Options4 = input.nextLine();
        switch (user_Response_Options4) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options5);
        user_Response_Options5 = input.nextLine();
        switch (user_Response_Options5) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options6);
        user_Response_Options6 = input.nextLine();
        switch (user_Response_Options6) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options7);
        user_Response_Options7 = input.nextLine();
        switch (user_Response_Options7) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options8);
        user_Response_Options8 = input.nextLine();
        switch (user_Response_Options8) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options9);
        user_Response_Options9 = input.nextLine();
        switch (user_Response_Options9) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options10);
        user_Response_Options10 = input.nextLine();
        switch (user_Response_Options10) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }

        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options11);
        user_Response_Options11 = input.nextLine();
        switch (user_Response_Options11) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options12);
        user_Response_Options12 = input.nextLine();
        switch (user_Response_Options12) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options13);
        user_Response_Options13 = input.nextLine();
        switch (user_Response_Options13) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options14);
        user_Response_Options14 = input.nextLine();
        switch (user_Response_Options14) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options15);
        user_Response_Options15 = input.nextLine();
        switch (user_Response_Options15) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options16);
        user_Response_Options16 = input.nextLine();
        switch (user_Response_Options16) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options17);
        user_Response_Options17 = input.nextLine();
        switch (user_Response_Options17) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options18);
        user_Response_Options18 = input.nextLine();
        switch (user_Response_Options18) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options19);
        user_Response_Options19 = input.nextLine();
        switch (user_Response_Options19) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }
        System.out.printf("%nWhich best describes you?%n%s%nPlease select an option (A or B): ", options20);
        user_Response_Options20 = input.nextLine();
        switch (user_Response_Options20) {
            case "A":
                numberOf_A_Selected++;
                user_Response_Options1 = "A. tough-minded, just";
                break;
            case "B":
                numberOf_B_Selected++;
                user_Response_Options1 = "B. tender-hearted, merciful";
                numberOf_B_Selected++;
                break;
                
            default:
                System.out.println("Invalid Input.");
                break;
        }


        System.out.printf("\nCongratulations %s, you successfully completed your MBTI test%nYou selected...%n%n%s%n", userName, user_Response_Options1);

        String endNote = """
            INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). 
            INFP stands for Introversion, iNtuition, Feeling, and Perceiving, which are four core personality traits based on the work of psychologist C.G. Jung.

            Each of the four letters of the INFP code signifies a key personality trait of this type. 
            INFPs are energized by time alone (Introverted), focus on ideas and concepts rather than facts and details (iNtuitive), 
            make decisions based on feelings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).
                """;
        System.out.printf("Number of A selected %d%nNumber of B selected %d%n", numberOf_A_Selected, numberOf_B_Selected);
        System.out.println("\n" + endNote);
    }
}