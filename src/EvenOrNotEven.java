public class EvenOrNotEven {
    public static void main(String[] args) {
        // generating random number between 1 and 100.
       int randomNumber = (int) (Math.random() * (100 - 1));

       // checking if it's odd or even using modulus
        if(randomNumber%2 == 0){
           System.out.println(randomNumber + " is an even number");
        } else{
            System.out.println(randomNumber + "is an odd number");
        }

        }

    }

