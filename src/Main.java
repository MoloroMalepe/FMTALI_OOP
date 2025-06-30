//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     int[] marks = new int[5]; //instantiating 1D array

        //initializing
        marks[0]=8;
        marks[1]=33;
        marks[2]=18;
        marks[3]=1;
        marks[4]=47;


        //imnitialiozing sum
        int sum=0;

        for (int i = 0; i < marks.length; i++) { //1d

            //print the sum of the elements
            sum+=marks[i];
        }
        System.out.println("The sum of the marks elements is: "+ sum);


        int [][] markks2 = new int[3][2];
        markks2[0][0]=2; markks2[0][1]=4;markks2[1][0]=11;markks2[1][1]=1;markks2[2][0]=9;markks2[2][1]=22;


        markks2[2][1]=87;
        for(int i=0;i<markks2.length;i++){
            for (int j=0;j<markks2[i].length;j++){

                System.out.print(markks2[i][j]+" ");
            }

            System.out.println();
            System.out.println("================================================================");
        }

        //1D 7 iontegers
        int[] numbers = new int[7];
        int size=numbers.length;

        System.out.println("The first 7 even numbers are:");
        for(int i=0;i<size;i++){

          numbers[i]=(i+1)*2;
            System.out.print(numbers[i]+" ");
            System.out.println();
        }
        System.out.println("===================================");

        //2D with 3*3 multiplication
        int[][] number2D=new int[3][3];
        int size2D=number2D.length;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                number2D[i][j]=(j+1)*(i+1);
                System.out.print(number2D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Etumeleng Did This");
        int multi[][] = new int[4][4];
        for (int row = 1; row < 4 ; row++) {
            for (int colm = 1; colm < 4; colm++) {
                multi[row][colm] = row*colm;
                System.out.println(multi[row][colm] + " ");

            }
            System.out.println();
        }
    }
}