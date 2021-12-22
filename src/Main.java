public class Main
{
    public static void main (String[] args)
    {
        String firstName = "Anakin";
        String lastName = "Skywalker";
        String birthYear = "41 BBY";
        String homeWorld = "Tatooine";
        String height = "1.88 m";
        String weight = "84 kilo";
        double purse = 150.0;

        System.out.println("You walk into Mubo’s Droid Depot to buy a droid. The cost is 24.3.");
        purse = purse - 24.3;
        System.out.println("You are left with " + purse + " Republic credits");
        System.out.println("Next, you walk into Dok-Ondar’s Den of Antiquities. You purchase a very fine set of boots that cost you a flat 45 credits.");
        purse = purse - 45;
        System.out.println("You are left with " + purse + " Republic credits");
        System.out.println("s you move around in the Black Spire Outpost you hear some noise down an alley. A group of Jedi are playing dice. You play a few rounds and double the credits in your purse");
        purse = purse * 2;
        System.out.println("You are left with " + purse + " Republic credits");
        System.out.println("With your purse bursting at the seams you walk into Savi’s Lightsabers. You inquire about a rare lightsabre, and the cashier says he will give it to you for one tenth of all the credits in your pocket.");
        purse = purse * .9;
        System.out.println("You are left with " + String.format("%.2f",purse) + " Republic credits");

        String handle = null;
        String blade = null;

        if (handle == "black" && blade == "purple")
        {
            System.out.println("That ones mine!");
        }
        else
        {
            System.out.println("Pass");
        }

        String escapeShip = null;

        if (escapeShip == "Mellenium Falcon")
        {
            System.out.println("Let's go");
        }
        else
        {
            System.out.println("Let's hide elsewhere");
        }

        boolean cantinaRec = true;
        double cantinaPrice = 6;

        if (cantinaRec == true && cantinaPrice < 5)
        {
            System.out.println("I'll try it");
        }
        else
        {
            System.out.println("I'll pass");
        }

        double cantinaDrink = 1;
        int cantinaSize = 16;

        if (cantinaDrink < 1 || cantinaSize > 24)
        {
            System.out.println("I'll take it");
        }
        else
        {
            System.out.println("I'm good");
        }
    }
}
