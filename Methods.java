public class Methods{
    public void test(){
        System.out.println("Test import")
    }

    public void print(){
        for(int i = 0; i < 256; i++){
            System.out.println(i);
        }
    }

    public void oddNums(){
        for(int i = 1; i < 256; i+=2){
            System.out.println(i);
        }
    }

    public void sums(){
        int sum = 0;
        int input = 255;
        for(int i = 1; i <= input; i++){
            sum = sum + i;
            System.out.println(i + sum);
        }
        // adds to 32,895, may have done it wrong
    }

    public void iterateArr() {
        int[] myArray = {3, 6, 9, 12, 15, 18, 21};
        int i,x;
        for( i = 0; i < myArray.length; i++){
            x = myArray[i];
            System.out.println(x);
        }
    }

    public void findMax() {
        int[] allNegatives = {-6, -32, -11, -1};
        int max= allNegatives[3];
        for( int i=0; i < allNegatives.length; i++){
        System.out.println(max);
        }
    }

    public void oddArr(){
        int[] y = new int[256];
            
        for(int i = 0; i < y.length; i+=2){
        System.out.println(y[i]);
        }
    }
}