

public class Main
{
    
  public static int binarySearch(int first,int last, int[] aRray, int val){
      if(first > last) return -1;
      if(aRray[first] == val) return first;
      else{
          return binarySearch(first + 1, last, aRray, val);
      }
  }
   
  
   public static void main(String args[]){
       int[] aRray = new int[5];
       for(int i = 0; i < 5; i++){
           aRray[i] = i;
       }
       System.out.println(binarySearch(0,3,aRray,3));
       
    }
}
