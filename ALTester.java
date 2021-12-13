import java.util.ArrayList;

public class ALTester{
  public static void main(String[] args){

      OrderedArrayList isSor = new OrderedArrayList();
      for (int i = 0; i < 23; i++){
        isSor.add(i);
      }

      OrderedArrayList notSor = new OrderedArrayList();
      for (int i = 0; i < 23; i++){
        notSor.add(i);
      }
      notSor.set(0, 2);

      System.out.println("Should be false ... " + isSorted(notSor));
      System.out.println("Should be true ... " + isSorted(isSor));
  }

  private static boolean isSorted(OrderedArrayList a){
    if (a.size() == 1){
      return true;
    }
    for (int i = 0; i< a.size()-1; i++){
      if (a.get(i) > a.get(i+1)){
        return false;
      }
    }
    return true;
  }

}
