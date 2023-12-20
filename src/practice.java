import java.util.LinkedHashSet;

public class practice {
	public static void main(String[] args) {
		int a[]={1,1,2,2,2};
	      removeRepeatedValues(a);
	}
	public static void removeRepeatedValues(int[] a){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
      for(int i=0;i<a.length;i++){
          set.add(a[i]);
      }
      System.out.println(set);
        
    }
}
