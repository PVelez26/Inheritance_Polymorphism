
	
	public class Part {
		private int partID;
		private String partDescription;
		private double partSellPrice;
		public static final String DEFAULT_DESCRIPTION = "no part description";
		public static final double DEFAULT_SELL_PRICE = 0;
		
		
		 public Part(int ID) {
			 
		 }
		 
		 public Part(int partID, String partDescription, double partSellPrice) {
			
			 if (partID < 0) {
					partID = (Integer) null;
					// COME BACK TO THIS!!************MIGHT HAVE TO RETURN TO THE MAIN MENU
					System.out.print("Invalid value");
			 }
					
			 if (partSellPrice < 0) {
						partSellPrice = DEFAULT_SELL_PRICE;
						System.out.print("Invalid value");
			 }
						
			 if (partDescription == null || partDescription.length() < 0)
						{ 
							System.out.print("Invalid Value");
							System.out.print(DEFAULT_DESCRIPTION);	
							}
						}
			 
			 private int getPartID() {
					return partID;
				}

				private String getPartDescription() {
					return partDescription;
				}

				private double getPartSellPrice() {
					return partSellPrice;
				}

				private static String getDefaultDescription() {
					return DEFAULT_DESCRIPTION;
				}

				private static double getDefaultSellPrice() {
					return DEFAULT_SELL_PRICE;
				}
					
					@Override
					public String toString() {
						return "Part ID: " + partID + this.partID + "Part Description: " + this.partDescription + "Part Selling Price: "
								+ this.partSellPrice + "\n Class of the object";
						
						public double getTotalCost()  {
							return 0; // COME BACK TO THIS!!!!*******
						}
						
		
		 } // SECOND CONSTRUCTOR CLOSING LINE
			 
	} // CLOSING PART CLASS 
	
//  so your sub-class must have an explicit constructor that calls the constructor of the base class.
public class PurchasedPart extends Part {
	private double purchasePrice; //what does this part cost to buy?
	private String vendor;  //who do we buy this part from?
	private double handlingCost; //shipping and handling costs when we buy it
	public static final String DEFAULT_VENDOR_NAME = "no vendor name";
	public static final double DEFAULT_PURCHASE_PRICE = 0;
	public static final double DEFAULT_HANDLING_COST = 0; 
	
	public PurchasedPart(int ID) {
	}
	
	public PurchasedPart(int ID, double purchasePrice, String vendor, double handlingCost) {
		this.purchasePrice = purchasePrice;
		this.vendor = vendor;
		this.handlingCost = handlingCost;
	}
	
	public PurchasedPart(int ID, String partDescription, double partSellPrice, double handlingCost, 
			double purchasePrice, String vendor)
	
}

// o1 is special keyword in java, its called instanceof, and then we have a class name
// if (o1 instanceof classname)
			 
