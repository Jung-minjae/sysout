package Record;

public class Exam {
	private int Kor;
	private int Eng;
	private int Math;

	private int couuret;

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		Kor = kor;
	}

	public int getEng() {
		return Eng;
	}

	public void setEng(int eng) {
		Eng = eng;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getCouuret() {
		return couuret;	
	}

	public void setCouuret(int couuret) {
		this.couuret = couuret;
	}

	public int getTotal() {
		int Total = Kor + Eng + Math;
		return Total;
	}

	public double getavg() {
		double avg = (Kor + Eng + Math) / 3;
		return avg;
	}
}
