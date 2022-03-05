
public class MarsWeightCalcYusra {
    public static void main(String[] args) {
        
        // Declaring all variables .
        float earthWeightYusra;
        float marsWeightYusra;
        double marsWeightInDoubleYusra;
        int marsWeightInIntYusra;


        earthWeightYusra = 63;
        marsWeightYusra = (earthWeightYusra * 0.38F);
        System.out.println(earthWeightYusra + "kg on Earth is " + marsWeightYusra + "kg on Mars");
        
        // initially float and assigning to double type
        marsWeightInDoubleYusra = marsWeightYusra;
        System.out.println("Kilograms on Mars after converting to double "+marsWeightInDoubleYusra);

        // limiting length to 4 decimal place
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsWeightInDoubleYusra);

        //casting double type to int
        marsWeightInIntYusra = (int)marsWeightInDoubleYusra;
        System.out.println("Kilograms on Mars when casted to integer"+ marsWeightInIntYusra );

        //casting int to char type
        char c = (char)marsWeightInIntYusra;
        System.out.println("The ASCII Table equivalent of marsWeightInIntYusra is: " + c);

        // doing math operation on char type and assigning to int type
        int exampleOfMathOnChar = c * c;
        System.out.println("An example of mathematical operation on the char type: "+ exampleOfMathOnChar);






    }
}
