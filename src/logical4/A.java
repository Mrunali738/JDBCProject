package logical4;

import java.util.ArrayList;
import java.util.List;

public class A {
	
	public static void main(String[] args){
		/*
		 * int[] array = {6,9,8}; List<Integer> list = new ArrayList<>();
		 * list.add(array[0]); list.add(array[2]); list.set(1, array[1]);
		 * list.remove(0); System.out.println(list);
		 */
	int i =1, j =1;
	for(; ;) {
		if(i>5)
			break;
		else
			j+=i--;
		System.out.println(j);
		i +=j;
		j=j+7;
	}	

        
}
}