package ch05.ex04.case04;

public class SequenceMain {
	public static void main(String[]args) {
		Sequence seq1 = new Sequence();
		Sequence seq2 = new Sequence();
		
		Sequence.setBaseNum(1);
		System.out.printf("seq1: %d\n",seq1.nextNum());//sequence 클래스에서 ++이 뒤에있어서 결과값후 계산
		System.out.printf("seq2: %d\n",seq2.nextNum());//해서 위에는1 아래는 2
		System.out.printf("seq2: %d\n",seq2.nextNum());
		
		Sequence.setBaseNum(1);
		System.out.printf("seq1: %d\n",seq1.nextNum());//sequence 클래스에서 ++이 뒤에있어서 결과값후 계산
		System.out.printf("seq2: %d\n",seq2.nextNum());//해서 위에는1 아래는 2
		System.out.printf("seq1: %d\n",seq1	.nextNum());
	}
}
