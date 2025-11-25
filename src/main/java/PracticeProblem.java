public class PracticeProblem {

	public static void main(String args[]) {
		Object student1 = new Student("Alice", 19, "S11111");
        Object student2 = new Student("Bob", 21, "S11111");
        Object student3 = new Student("Alice", 19, "S22222");
            
        // Test equals method - should be equal because student numbers match
        System.out.println(student1.equals(student3));
	}

}
