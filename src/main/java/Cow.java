/**
	* Definition of the Cow class
	* @author Wesley Cheung
	* @version 17.0.1
	*/
class Cow {
    private String name;
    private int age;
    private double weight;

	/**
	 * This class can be configured with 3 variables, name, age and weight
	 * @param name String that is the name of the cow
	 * @param age integer that is the age of the cow
     * @param weight double that is the weight of the cow
	 */
    /** 
    * Class constructor specifying name, age, and weight
    */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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
	 * @return the value of weight
	 *
	 */
    public double getWeight(){
        return this.weight;
    }

    @Override
    public String toString() {
    return this.name + ", " + age + " - " + weight;
    }

    @Override
    public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    } else if (this.getClass() != obj.getClass()) {
        return false;
    }
    Cow other = (Cow)obj;
    return this.name.equals(other.getName()) && this.age == other.getAge() && this.weight == other.getWeight();
    }
}