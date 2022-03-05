public class LegoBricksCalc {
    public static void main(String[] args) {
        // choosing an odd number between 50 and 100.
        int amountOfBricks = 65;
        // choosing an even number between 5 and 10
        int containerCapacity = 6;

        double FullContainers;
        int notFullContainers;
        int TotalContainers;

                // A program to calculate how many full containers we have
                FullContainers = containerCapacity* (amountOfBricks / containerCapacity);
                System.out.println("The number of blocks that is completely full is: " + FullContainers);

                // calculating number of containers that aren't completely full
                notFullContainers = amountOfBricks % containerCapacity;
                System.out.println("The number of blocks that isn't completely full is: "+ notFullContainers);

                // calculating how many containers we have in general
                TotalContainers = (int)FullContainers + notFullContainers;
                System.out.println("Total Containers we have: " + TotalContainers);

                // if the steps aren't clear I can send a picture of handwriting for clarification of why I used what I used :)
            }
            
        }







