import java.util.Scanner;

public class StreetAges {
    private final static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        //defining variables
        int numHouses;
        int[] houseNumbers ={};
        int numResidents;
        int[][] houseAges = {};
        int i;
        int j;
        int k;
        System.out.println("How many houses are in the street?");
        numHouses = keyboard.nextInt();
        houseNumbers = new int[numHouses];
        for(i=0;i<numHouses;i++){
            System.out.println("What is the next house number?");
            houseNumbers[i] = keyboard.nextInt();
        }
        for(j=0;j<numHouses;j++){
            System.out.println("How many people live in number " + houseNumbers[j] + "?");
            numResidents = keyboard.nextInt();
            houseAges = new int[numHouses][];
        }
        System.out.println(houseNumbers[2] + " " + houseAges[2][0]);
    }
    }

