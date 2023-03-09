package Consumer;
class Consumer {
    //initializing the variables of consumer class
    private String id;
    private String name;
    private int unitConsumed;
    private String finalPayment;

    //parameterized constructor
    Consumer(String id, String name, int unitConsumed){
        setId(id);
        setName(name);
        setunitConsumed(unitConsumed);
        setFinalPayment();
    }

    //sets the units consumed
    public void setunitConsumed(int unitConsumed){
        this.unitConsumed = unitConsumed; 
    }

    //retruns the units consumed
    public int getunitConsumed(){
        return unitConsumed; 
    }

    //sets the name
    public void setName(String name) {
        this.name = name;
    }

    //returns the name
    public String getName() {
        return name;
    }

    //sets the ID
    public void setId(String id) {
        this.id = id;
    }

    //returns the ID
    public String getId() {
        return id;
    }

    //sets the finalPayment
    public void setFinalPayment() {
        //calls the billCalculation() from BillService
        //since it is a static method, it doesn't need an object
        this.finalPayment = BillService.billCalculation(this);
    }

    //returns final Payment
    public String getFinalPayment() {
        return finalPayment;
    }

    //overrides the toString method
    //returns the values of the object
    @Override
    public String toString() {
        return "ID: "+this.id+" \nName: "+this.name+" \nUnits Consumed : "+this.unitConsumed+" \nFinal payment to be done is rs."+this.finalPayment+"\n";
        
    }

}
