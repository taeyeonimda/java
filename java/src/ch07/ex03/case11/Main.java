package ch07.ex03.case11;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<String>list4 = new ArrayList<>();
		
		pocket.sum(list1);
		pocket.sum(list2);
		pocket.sum(list3);
		//pocket.sum(list4); API보면 Double과 Integer는 Number아래 변수  String은 아님
		
		pocket.printList(list1);
		pocket.printList(list2);
		pocket.printList(list3);
		pocket.printList(list4);
		
		pocket.addList(list1);
		pocket.addList(list2);
		/*pocket.addList(list3);
		pocket.addList(list4);*/
	}
}
