class Student4 {
    int id;
    String name;
   

	Student4(int id, String name) {
    this.id = id;
	this.name = name;
			
    }

    int calctotal() {
        int total = 0;
        return this.m1 + this.m2 + this.m3;
    }
  
    double calcavg(int total) {
        return total / 3.0;
    }

    char getresult(double avg) {
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

    void display() {
        System.out.println("Id:" + this.id);
        System.out.println("Name:" + this.name);
        System.out.println("M1:" + this.m1);
        System.out.println("M2:" + this.m2);
        System.out.println("M3:" + this.m3);

        int total = this.calctotal();
        double avg = this.calcavg(total);
        char result = this.getresult(avg);

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Result: " + result);
    }
}
