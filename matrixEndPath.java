public class matrixEndPath {
    

    public static int totalPath(int i, int j,int n,int m){
          if (i==n || j==m){
            return 0;
          }
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
           // for downward
           int downPath = totalPath(i+1,j,n,m);

           //right path
           int rightPath = totalPath(i, j+1, n, m);
           return downPath+ rightPath;
    }

    public static void main(String[] args){
        int path= totalPath(0, 0, 3, 4); 
        System.out.println(path);


    }
}
