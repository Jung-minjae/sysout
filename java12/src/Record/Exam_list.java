package Record;

public class Exam_list {
	Exam[] exams;
	int current;

	public Exam_list() {
		this.current = 0;
		this.exams = new Exam[3];
	}

	public Exam get(int i) {
		return exams[i];
	}

	public void add(int kor, int eng, int math) {
		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	
		if (exams.length == current) {
			Exam[] temp = new Exam[exams.length + 5];
			for (int i = 0; i < exams.length; i++) {
				temp[i] = exams[i];
			}
			exams = temp; // 주석 추가
		}
		exams[current] = exam;
		current++;
	}
	
	public int size() {
		return current;
	}
}