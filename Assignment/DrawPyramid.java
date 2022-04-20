package Assignment;

public class DrawPyramid {

    public static void main(String[]args)
    {
        char last = 'E', alphabet = 'A';
        int rows = 5;


        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
              System.out.print("* ");

              for (i = 1; i <= (last - 'A' + 1); ++i) {
                System.out.print(alphabet++);
              }

              System.out.print(alphabet + " ");
            }
            System.out.println();
          }

    
    }
    }

    
    
}
