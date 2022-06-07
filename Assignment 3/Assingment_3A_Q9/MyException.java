public class MyException {

    public static void main(String[] args) {
        try {
            
            min(new int[0]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static int min(int[] b)
    {
        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] > min) {
                min = b[i];
            }
        }
        return min;
    }


    
}
