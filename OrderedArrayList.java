import java.util.ArrayList;

public class OrderedArrayList{

  private int findIndex (ArrayList <Integer> a, int value){
    for (int i = 0; i < a.size(); i++){
      if (value <= a.get(i)){
        return i;
      }
    }
    return a.size();
  }

  private void add(ArrayList <Integer> a, int value, int index){
    // move numbers to the right
    for (int i = a.size(); i > index; i--){
      a.add(i, a.get(i-1));
    }

    a.add(index, value);
  }
}
