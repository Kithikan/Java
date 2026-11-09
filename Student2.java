class Student2 {
    int id;
    String name;
    int[] Marks

    void SetStudent(int id, String name, int m1, int m2, int m3) {
        this.id = id;
        this.name = name;
        this.marks = marks;    
    }
    int calctotal() {
        int total = 0; 
	    for (int i = 0; i < marks.length; i++){
		    total = total + marks[i];
		}
		return total;
	}
    double calcavg() {
        return calctotal()/marks.length;
    }
	char GetResult(){
		double avg = calcavg();
	
        if (avg >= 75) {
            return 'A';
        } else if (avg >= 65) {
            return 'B';
        } else if (avg >= 55) {
            return 'C';
        } else if (avg >= 45) {
            return 'D';
        } else {
            return 'F';
        }
    }

		String[] getSubjectResult(){
		String[] subjectResult = new String[marks.length];
		
		for (int i = 0; i < marks.length; i++){
			if (marks[i] >= 35){
				subjectResult[i] = "Pass";
			} else{
				subjectResult[i] = "Fail"
			}
		}
		
		return subjectResult;
	}
	void display(int id, String name, int[] marks) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);

        String[] subjectResult = getSubjectResult();

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                "Subject " + (i + 1) + " Marks: " + marks[i]
                + " - " + subjectResult[i]
            );
        }

        System.out.println("Total: " + calctotal());
        System.out.println("Average: " + calcavg());
        System.out.println("Grade: " + getresult());
    }
}