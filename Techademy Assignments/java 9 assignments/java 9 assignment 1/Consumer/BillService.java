package Consumer;
class BillService{
    public static String billCalculation(Consumer consumer){

        //gets the number of units consumed by a consumer from getunitsConsumed()
        double units = consumer.getunitConsumed();
        
        // initializes the finalBill as 300 because 
        //even if the consumer doesn't use units or less than 201 
        //the consumer has to pay 300 rs
        double finalBill = 300;

        //calculate the final bill using conditions
        if(units>=201 && units<=500){
            finalBill+= units * 1.25;
        } else if(units>= 501 && units<= 1000){
            finalBill+= units*1.0;
        } else if(units>=1001){
            finalBill+= units * 0.75;
        } 

        //converting the finalBill to String
        String bill = Double.toString(finalBill);

        //returning the bill
        return bill;

    }
}