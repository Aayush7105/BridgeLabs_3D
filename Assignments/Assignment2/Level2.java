import java.util.Scanner;

public class Level2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.print("Enter ques number: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Level 2 program. Goodbye!");
                break;
            }

            switch (choice) {
                // Q1
                case 1:
                    System.out.print("Enter a natural number: ");
                    int n = input.nextInt();
                    if (n > 0) {
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 == 0) {
                                System.out.println(i + " is Even");
                            } else {
                                System.out.println(i + " is Odd");
                            }
                        }
                    } else {
                        System.out.println("Not a natural number!");
                    }
                    break;

                // Q2
                case 2:
                    System.out.print("Enter salary: ");
                    double salary = input.nextDouble();
                    System.out.print("Enter years of service: ");
                    int years = input.nextInt();
                    if (years > 5) {
                        double bonus = salary * 0.05;
                        System.out.println("Bonus amount is " + bonus);
                    } else {
                        System.out.println("No bonus");
                    }
                    break;

                // Q3
                case 3:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();
                    for (int i = 6; i <= 9; i++) {
                        System.out.println(n + " * " + i + " = " + (n * i));
                    }
                    break;

                // Q4
                case 4:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();
                    if (n > 0) {
                        for (int i = 1; i <= n; i++) {
                            if (i % 3 == 0 && i % 5 == 0) {
                                System.out.println("FizzBuzz");
                            } else if (i % 3 == 0) {
                                System.out.println("Fizz");
                            } else if (i % 5 == 0) {
                                System.out.println("Buzz");
                            } else {
                                System.out.println(i);
                            }
                        }
                    } else {
                        System.out.println("Not a positive integer!");
                    }
                    break;

                // Q5
                case 5:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();
                    if (n > 0) {
                        int i = 1;
                        while (i <= n) {
                            if (i % 3 == 0 && i % 5 == 0) {
                                System.out.println("FizzBuzz");
                            } else if (i % 3 == 0) {
                                System.out.println("Fizz");
                            } else if (i % 5 == 0) {
                                System.out.println("Buzz");
                            } else {
                                System.out.println(i);
                            }
                            i++;
                        }
                    } else {
                        System.out.println("Not a positive integer!");
                    }
                    break;

                // Q6
                case 6:
                    System.out.print("Enter Amar's age: ");
                    int amarAge = input.nextInt();
                    System.out.print("Enter Akbar's age: ");
                    int akbarAge = input.nextInt();
                    System.out.print("Enter Anthony's age: ");
                    int anthonyAge = input.nextInt();
                    System.out.print("Enter Amar's height: ");
                    int amarHeight = input.nextInt();
                    System.out.print("Enter Akbar's height: ");
                    int akbarHeight = input.nextInt();
                    System.out.print("Enter Anthony's height: ");
                    int anthonyHeight = input.nextInt();

                    int youngest = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
                    if (youngest == amarAge) {
                        System.out.println("Amar is youngest");
                    } else if (youngest == akbarAge) {
                        System.out.println("Akbar is youngest");
                    } else {
                        System.out.println("Anthony is youngest");
                    }

                    int tallest = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
                    if (tallest == amarHeight) {
                        System.out.println("Amar is tallest");
                    } else if (tallest == akbarHeight) {
                        System.out.println("Akbar is tallest");
                    } else {
                        System.out.println("Anthony is tallest");
                    }
                    break;

                // Q7
                case 7:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();
                    if (n > 0) {
                        for (int i2 = 1; i2 < n; i2++) {
                            if (n % i2 == 0) {
                                System.out.println(i2);
                            }
                        }
                    } else {
                        System.out.println("Not a positive integer!");
                    }
                    break;

                // Q8
                case 8:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();
                    if (n > 0) {
                        int c = 1;
                        while (c < n) {
                            if (n % c == 0) {
                                System.out.println(c);
                            }
                            c++;
                        }
                    } else {
                        System.out.println("Not a positive integer!");
                    }
                    break;

                // Q9
                case 9:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();
                    int greatestFactor = 1;
                    for (int i3 = n - 1; i3 >= 1; i3--) {
                        if (n % i3 == 0) {
                            greatestFactor = i3;
                            break;
                        }
                    }
                    System.out.println("Greatest factor (besides itself): " + greatestFactor);
                    break;

                // Q10
                case 10:
                    System.out.print("Enter a number: ");
                    n = input.nextInt();
                    greatestFactor = 1;
                    int counter = n - 1;
                    while (counter >= 1) {
                        if (n % counter == 0) {
                            greatestFactor = counter;
                            break;
                        }
                        counter--;
                    }
                    System.out.println("Greatest factor (besides itself): " + greatestFactor);
                    break;

                // Q11
                case 11:
                    System.out.print("Enter a number (<100): ");
                    n = input.nextInt();
                    if (n > 0 && n < 100) {
                        for (int i4 = 100; i4 >= 1; i4--) {
                            if (i4 % n == 0) {
                                System.out.println(i4);
                            }
                        }
                    } else {
                        System.out.println("Number must be positive and less than 100!");
                    }
                    break;

                // Q12
                case 12:
                    System.out.print("Enter number: ");
                    int base = input.nextInt();
                    System.out.print("Enter power: ");
                    int power = input.nextInt();
                    if (base > 0 && power >= 0) {
                        long result = 1;
                        for (int i5 = 1; i5 <= power; i5++) {
                            result *= base;
                        }
                        System.out.println(base + "^" + power + " = " + result);
                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;

                // Q13
                case 13:
                    System.out.print("Enter a number (<100): ");
                    n = input.nextInt();
                    if (n > 0 && n < 100) {
                        int c2 = 100;
                        while (c2 >= 1) {
                            if (c2 % n == 0) {
                                System.out.println(c2);
                            }
                            c2--;
                        }
                    } else {
                        System.out.println("Number must be positive and less than 100!");
                    }
                    break;

                // Q14
                case 14:
                    System.out.print("Enter number: ");
                    base = input.nextInt();
                    System.out.print("Enter power: ");
                    power = input.nextInt();
                    if (base > 0 && power >= 0) {
                        long result = 1;
                        int c3 = 0;
                        while (c3 < power) {
                            result *= base;
                            c3++;
                        }
                        System.out.println(base + "^" + power + " = " + result);
                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        input.close();
    }
}