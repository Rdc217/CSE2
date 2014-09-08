//Ryan Cooney
//CSE2 HW02 9/5/2014
//Arithmetic
//Compute the cost of items bought while shopping with tax

public class Arithmetic {
    //create main method
    public static void main (String[] args) {
        //input variables
        int nSocks=3; //number of socks bought
        double sockCost$=2.58; //cost of a pair of socks
        //$ is part of the variable
        
        int nGlasses=6; //number of glasses bought
        double glassCost$=2.29; //cost of a glass
        
        int nEnvelopes=1; //number of envelopes bought
        double envelopeCost$=3.25, //cost of an envelope
        
         taxPercent=.06, //sales tax for PA
        
         totalSockCost$, //total cost of socks
         totalGlassCost$, //total cost of glasses
         totalEnvelopeCost$, //total envelope cost
         totalSalesTaxSocks$, //sales tax for the socks
         totalSalesTaxGlasses$, //sales tax for the glasses
         totalSalesTaxEnvelopes$, //sales tax for the envelopes
         totalCostOfPurchasesNoTax$, //total cost before tax
         totalSalesTax$, //total sales tax
         totalCostOfPurchasesWithTax$; //total cost plus tax
        
        //output
        totalSockCost$=nSocks*sockCost$; //total sock cost
        totalSalesTaxSocks$=totalSockCost$*taxPercent; 
        //sales tax socks
        totalGlassCost$=nGlasses*glassCost$; //total glass cost
        totalSalesTaxGlasses$=totalGlassCost$*taxPercent; 
        //sales tax glasses
        totalEnvelopeCost$=nEnvelopes*envelopeCost$; 
        //total envelope cost
        totalSalesTaxEnvelopes$=totalEnvelopeCost$*taxPercent;
        //sales tax on envelopes
        
        
        //conversion to make everthing have only two decimals
        int totalSockCost1$ = (int)(totalSockCost$*100);
        double totalSockCost2$ = totalSockCost1$/100.0;
        
        int totalSalesTaxSocks1$ = (int)(totalSalesTaxSocks$*100);
        double totalSalesTaxSocks2$ = totalSalesTaxSocks1$/100.0;
        
        int totalGlassCost1$ = (int)(totalGlassCost$*100);
        double totalGlassCost2$ = totalGlassCost1$/100.0;
        
        int totalSalesTaxGlasses1$ = (int)(totalSalesTaxGlasses$*100);
        double totalSalesTaxGlasses2$ = totalSalesTaxGlasses1$/100.0;
        
        int totalEnvelopeCost1$ = (int)(totalEnvelopeCost$*100);
        double totalEnvelopeCost2$ = totalEnvelopeCost1$/100.0;
         
        int totalSalesTaxEnvelopes1$ = (int)(totalSalesTaxEnvelopes$*100);
        double totalSalesTaxEnvelopes2$ = totalSalesTaxEnvelopes1$/100.0;
        
        //some outputs computed after conversions 
        totalCostOfPurchasesNoTax$ = totalSockCost2$+totalGlassCost2$+totalEnvelopeCost2$;
        //total cost of purchase with no tax
        totalSalesTax$ = totalSalesTaxSocks2$+totalSalesTaxGlasses2$+totalSalesTaxEnvelopes2$;
        //total sales tax of all purchases
        totalCostOfPurchasesWithTax$ = totalCostOfPurchasesNoTax$+totalSalesTax$;
        //total cost of purchase with sales tax
        
        //print output values
        System.out.println("The total cost of socks was $"+
        totalSockCost2$); //prints total sock cost
        System.out.println("The sales tax on socks was $"
        +totalSalesTaxSocks2$); //prints sales tax on socks
        
        System.out.println("The total cost of glasses was $"+
        totalGlassCost2$); //prints total glasses cost
        System.out.println("The sales tax on glasses was $"+
        totalSalesTaxGlasses2$); //prints sales tax on glasses
        
        System.out.println("The total cost of envelopes was $"
        +totalEnvelopeCost2$); //prints total envelope cost
        System.out.println("The sales tax on envelopes was $"
        +totalSalesTaxEnvelopes2$); //prints sales tax on
        //envelopes
        
        System.out.println("The total cost of items was $"
        +totalCostOfPurchasesNoTax$); 
        //prints total cost without tax
        System.out.println("The total sales tax was $"+
        totalSalesTax$); //prints total sales tax
        
        System.out.println("The total cost of items with sales tax $"
        +totalCostOfPurchasesWithTax$+0); 
        //prints total of purchase with sales tax
        
    }
}