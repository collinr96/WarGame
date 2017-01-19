package wargame;
/**
 *
 * @author colli
 */
public class WarGame {
        public static void main(String[] args) {
       
        //warm up exercise 1
       for (int i = 100; i>1 ; i -= 5)
           System.out.println(i);
       
       System.out.printf("If the snow depth is 30, the method returns: %b%n", timeToSki(30));
       System.out.printf("If the snow depth is 45, the method returns: %b%n", timeToSki(45));
       
       displayStars(10);
       displayStars(100);
       
       Card myFirstCard = new Card("Jack","Hearts",11);
       
       System.out.printf("My card is %s%n", myFirstCard.toString());
       
       Card mySecondCard = new Card("Ace","Spades",14);
       System.out.printf("My second card is %s%n", mySecondCard.toString());
       
       DeckOfCards theDeck = new DeckOfCards();
       System.out.printf("The deck has the following cards: %n%s", theDeck.toString());

       
    }  // end of the main method
    
    /**
     * This method will return true if the snow depth is
     * greater than 30 cm
     */
    public static boolean timeToSki(int snowDepth)
    {
        return (snowDepth > 30);
        
        // if (snowDepth > 30)
        //      return true;
        //  else
        //      return false;
    }
    
    /**
     * This will produce a fun little design on the screen
     */
    public static void displayStars(int numOfLines)
    {
        for ( ; numOfLines > 0; numOfLines--)
        {
            for (int i=1; i <= numOfLines; i++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}
