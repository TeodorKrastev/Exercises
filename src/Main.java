import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        planVacation();
    }
    public static void testArithmeticOperations() {
        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1 + num2));
        System.out.println("num1 - num2: " + (num1 - num2));
        System.out.println("num1 * num2: " + (num1 * num2));
        System.out.println("num1 / num2: " + (num1 / num2));
        System.out.println("num1 % num2: " + (num1 % num2));
    }

    public static void testAutoOperator() {
        int num1 = 100;
        int num2 = 200;

        num1++; // 101
        num2--; // 199

        //Increases num2 after the result is calculated
        System.out.println(num1 + num2++); // 101 + 199 = 300; num2 + 1 = 200

        //Increases num2 before the result is calculated
        System.out.println(num1 + (++num2)); // 101 + (200 + 1) = 302
    }

    public static void testAssignmentOperators() {
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        System.out.println("= Output: " + num2);

        num2 += num1;
        System.out.println("+= Output: " + num2);

        num2 -= num1;
        System.out.println("-= Output: " + num2);

        num2 *= num1;
        System.out.println("*= Output: " + num2);

        num2 /= num1;
        System.out.println("/= Output: " + num2);

        num2 %= num1;
        System.out.println("%= Output: " + num2);
    }

    public static void testLogicalOperator() {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + !(b1 && b2));
    }

    public static void testTernaryOperator() {
        int num1, num2;
        num1 = 25;
        /* num1 is not equal to 10 that's why
         * the second value after colon is assigned
         * to the variable num2
         */
        num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);

        /* num1 is equal to 25 that's why
         * the first value is assigned
         * to the variable num2
         */
        num2 = (num1 == 25) ? 100 : 200;
        System.out.println("num2: " + num2);

    }

    public static void testIfStatement() {
        int num = 70;
        if (num < 100) {
            System.out.println("number is less than 100");
        }
    }

    public static void testNestedIfStatement() {
        int num = 70;
        if (num < 100) {
            System.out.println("number is less than 100");
            if (num > 50) {
                System.out.println("number is greater than 50");
            }
        }
    }

    public static void testIfElseStatement() {
        int num = 120;
        if (num < 50) {
            System.out.println("num is less than 50");
        } else {
            System.out.println("num is greater than or equal 50");
        }
    }

    public static void testIfElseIfStatement() {
        int num = 1234;
        if (num < 100 && num >= 1) {
            System.out.println("Its a two digit number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("Its a three digit number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("Its a four digit number");
        } else {
            System.out.println("number is not between 1 & 99999");
        }
    }

    public static void testSwitchStatement() {
        int i = 2;
        switch (i) {
            case 1:
                System.out.println("Case1 ");
                break;
            case 2:
                System.out.println("Case2 ");
                break;
            case 3:
                System.out.println("Case3 ");
                break;
            default:
                System.out.println("Default ");
        }
    }

    public static void testForLoop() {
        for (int i = 10; i > 1; i--) {
            System.out.println("The value of i is:" + i);
        }
    }

    public static void testForIterateArray() {
        int[] arr = {2, 11, 45, 9};
        //i starts with 0 as array index starts with 0 too
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void testWhileLoop() {
        int i = 10;
        while (i > 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void testWhileLoopArray() {
        int[] arr = {2, 11, 45, 9};
        //i starts with 0 as array index starts with 0 too
        int i = 0;
        while (i < 4) {
            System.out.println(arr[i]);
            i++;
        }

    }

    public static void testDoWhileLoop() {
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 1);

    }

    public static void testDoWhileLoopIterateArray() {
        int[] arr = {7, 15, 43, 8};
        //i starts with 0 as array index starts with 0
        int i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i < 4);

    }

    public static void testContinueStatement() {
        for (int j = 0; j <= 6; j++) {
            if (j == 4) {
                continue;
            }
            System.out.print(j + " ");
        }

    }

    public static void testBreakStatement() {
        int var;
        for (var = 100; var >= 10; var--) {
            System.out.println("var: " + var);
            if (var == 99) {
                break;
            }
        }
        System.out.println("Out of for-loop");
    }

    public static void printWeekDay() {
        System.out.println("Please enter a day of the week:");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("The " + day + "-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + day + "-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + day + "-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + day + "-th day of the week is Tuesday");
                break;
            case 5:
                System.out.println("The " + day + "-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + day + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + day + "-th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid day:" + day + " Please select a day between 1-7");
        }
    }

    public static void isPersonEligibleToWork() {
        String eligibleToWorkMessage = "You are eligible to work";
        String notEligibleToWorkMessage = "You are NOT eligible to work";

        System.out.println("Please enter your age:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 16) {
            if (age > 67) {
                System.out.println(notEligibleToWorkMessage);
            } else {
                System.out.println(eligibleToWorkMessage);
            }
        } else {
            System.out.println(notEligibleToWorkMessage);
        }
    }

    public static void calculateRevenue() {
        double revenue;
        double unitPrice;
        int quantity;
        double discountRate;
        double discount;
        String revenueMessage = "The revenue from sale: ";
        String discountMessage = "Discount: ";
        char dollar = '$';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter unit price:");
        unitPrice = scanner.nextDouble();

        System.out.println("Please enter quantity:");
        quantity = scanner.nextInt();

        revenue = unitPrice * quantity;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        } else {
            discountRate = 0;
        }

        discount = revenue * discountRate;
        revenue = revenue - discount;

        System.out.println(revenueMessage + revenue + dollar);
        System.out.println(discountMessage + discount + dollar);
    }

    public static void printLargestNumber() {
        int[] arr = {2, 11, 45, 9};
        //int[] arr = {-3, -5, -2, -4};
        //int[] arr = {-23, -1, -4, -5, 0};

        int largestNumber = arr[0];
        int i;

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber)
                largestNumber = arr[i];
        }

        System.out.println("The largest number is: " + largestNumber);
    }

    public static void planVacation() {
        String vacationType;
        double budget;
        double dailyBudget;
        int people;
        int days;
        String bulgariaDestinationMessage = "Available destination: Bulgaria";
        String nonBulgariaDestinationMessage = "Available destination: Outside Bulgaria";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter vacation type:");
        vacationType = scanner.nextLine();

        System.out.println("Please enter number of days:");
        days = scanner.nextInt();

        System.out.println("Please enter number of people:");
        people = scanner.nextInt();

        System.out.println("Please enter your budget:");
        budget = scanner.nextDouble();

        dailyBudget = budget / (days * people);

        switch (vacationType) {
            case "Beach":
                if (dailyBudget < 50) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
                break;
            case "Mountain":
                if (dailyBudget < 30) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation!");
        }
    }

    public static void printDivisibleNumbers() {
        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int num;

        for (int i = 0; i < list.length; i++) {
            num = list[i];
            if ((num % 5) == 0) {
                System.out.println(num);
                if (num > 150) {
                    break;
                }
            }
        }
    }

    public static void reverseList() {
        int[] list = {2, 11, 45, 9};

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }
}
