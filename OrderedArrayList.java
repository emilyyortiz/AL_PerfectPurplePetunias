import java.util.ArrayList;

public class OrderedArrayList{

  private ArrayList<Integer> _data;

  public OrderedArrayList(){
	_data = new ArrayList<>();
	for (int i = 0; i<23; i++){
		_data.add(i);
        }
 }
  public String toString(){
  	if (_data.size() == 0) return "{}";
	
	String a = "";
	for (int x : _data) {
	a+=","+x;
	}
	return "{"+a.substring(1)+"}";
  	}

  public Integer remove(int i){
 	return _data.remove(i);
  }
/*
  private int findIndex (int value){
    for (int i = 0; i < _data.size(); i++){
      if (value <= _data.get(i)){
        return i;
      }
    }
    return _data.size();
  }
*/
  public void addLinear(Integer newVal){
    // move numbers to the right
   /* if (_data.size() == 0){
	_data.add(newVal);
    }*/
    for (int i = 0; i <_data.size()-1; i++){
	if (_data.get(i)>newVal){
		_data.add(i,newVal);
		break;
	}
   }
   if (_data.get(_data.size()-1)<newVal){
	_data.add(newVal);
   }
  }

  public Integer get(int index){
    return _data.get(index);
  }

  public int size(){
    return _data.size();
  }

  
  //should not have real functionality
/*
  public void set(int index, int value){
    a.set(index, value);
  }*/
  public static void main(String[] args){
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ ){
      Franz.addLinear( (int)( 50 * Math.random() ) );
    }
 System.out.println( Franz );
  /*  // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
  */
  }
}
