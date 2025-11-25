/**
	* Definition of the Student class
	* @author Wesley Cheung
	* @version 17.0.1
	*/
class Student {
    private String name;
    private int age;
    private String studentNumber;

	/**
	 * This class can be configured with 3 variables, name, age and studentNumber
	 * @param name String that is the name of the student
	 * @param age integer that is the age of the student
     * @param studentNumber String that is the student number of the student
	 */
    /** 
    * Class constructor specifying name, age, and studentNumber
    */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
	 * @return the value of name
	 *
	 */

    public String getName(){
        return this.name;
    }

    /**
	 * @return the value of age
	 *
	 */
    public int getAge(){
        return this.age;
    }

     /**
	 * @return the value of studentNumber
	 *
	 */
    public String getStudentNumber(){
        return this.studentNumber;
    }

    @Override
    public String toString() {
    return this.name + ", " + age + " - " + studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    } else if (this.getClass() != obj.getClass()) {
        return false;
    }
    Student other = (Student)obj;
    return other.getStudentNumber().equals(this.studentNumber);
    }
}