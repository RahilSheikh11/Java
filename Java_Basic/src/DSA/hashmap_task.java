package DSA;

import java.util.HashMap;
import java.util.Map;

public class hashmap_task {
public static void main(String[] args) {
	int matrix [][]= {{1,23,1},
			{23,4,6},
			{6,0,10}};
	HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
	for(int[] row: matrix) {
		for(int value:row) {
			h.put(value, h.getOrDefault(value, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:h.entrySet()) {
			System.out.println("The value  " + entry.getKey() + "  repeated  " + entry.getValue());
		}
		}
	}
	}


