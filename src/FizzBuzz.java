public class FizzBuzz
{
    public static void main (String[] args)
    {
        //calls the fizzBuzz100 function
        fizzBuzz100();

        helloWorld();

        greeting("Robert");

        System.out.println(add(5,8));
    }

    //creates the private function called fizzBuzz100
    private static void fizzBuzz100()
    {
        //starts a for loop that iderates from 1 to 100
        for (int i = 1; i <= 100; i++)
        {
            //checks to see if i % 3 = 0
            if ((i % 3) == 0)
                //if it does it prints fizz
                System.out.println("fizz");
            //checks to see if i % 5 = 0
            else if ((i % 5) == 0)
                // if it does prints buzz
                System.out.println("buzz");
            //checks to see if i % 3 = 0 and i % 5 = 0
            // but this condition needs to be above the others and is not working correctly at the moment
            else if (((i % 5) == 0) && ((i % 3) == 0))
                //if they are both true print fizzbuzz
                System.out.println("fizzbuzz");
            else
                System.out.println(i);
        }
    }

    private static void helloWorld()
    {
        System.out.println("Hello, World!");
    }

    private static void greeting(String name)
    {
        System.out.println("Hello, " + name);
    }

    private static double add(double num1, double num2)
    {
        return num1 + num2;
    }
}
