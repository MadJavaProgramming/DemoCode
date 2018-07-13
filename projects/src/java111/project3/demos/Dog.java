/**
 *  This class holds information about an individual dog
 *
 * @author    eknapp
 */
public class Dog {
    private  String  name;
    private  String  owner;
    private int weight;




    /**
     *  Description of the Method
     *
     * @return    Description of the Return Value
     */
    public int calculateFoodNeeded() {
        if (weight <= 50) {
            return 1;
        } else {
            return 2;
        }
    }

    /**
     *  Description of the Method
     *
     * @return    Description of the Return Value
     */
    public String display() {
        return "Name: " + getName()
                + "\nOwner: " + getOwner()
                + "\nWeight: " + getWeight()
                + "\nFood Needed: " + calculateFoodNeeded();
    }

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of owner
	* @return
	*/
	public String getOwner() {
		return owner;
	}

	/**
	* Sets new value of owner
	* @param
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	* Returns value of weight
	* @return
	*/
	public int getWeight() {
		return weight;
	}

	/**
	* Sets new value of weight
	* @param weight Weight of the dog
	*/
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
