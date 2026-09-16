public class totalTilesPlaced {

    public static int totalNumber(int n,int m){

        //base case
        if (n==m){
            return 2;
        }
        if(n<m){

            return 1;
        }
         //vertical
         int VerticalSize= totalNumber(n-m, m);

         //horizontal
         int horizontalSize= totalNumber(n-1, m);

         return VerticalSize+horizontalSize;
    }

    public static void main(String[] args){
        int total= totalNumber(4, 2);
        System.out.println(total);

    }

    
}
