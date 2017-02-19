
	
	public class Part {
		private int partID;
		private String partDescription;
		private double partSellPrice;
		public static final String DEFAULT_DESCRIPTION = "no part description";
		public static final double DEFAULT_SELL_PRICE = 0;
		
		// These constructors must edit the description to ensure it is not null or empty (zero length). 
		// If either condition occurs use the default value 
	
		
		// 1
		public Part(int ID) {
			
		} 
		 
	    // 2	
		public Part(int partID, String partDescription, double partSellPrice) {
			if (partID < 0) {
					partID = (Integer) null;
					// COME BACK TO THIS!!************MIGHT HAVE TO RETURN TO THE MAIN MENU
					System.out.print("Invalid value");
			 }
					
			if (partSellPrice <= 0 ) {
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
					}
						
						public double getTotalCost()  {
							return 0; // COME BACK TO THIS!!!!*******
						}
						
		
		 } // SECOND CONSTRUCTOR CLOSING LINE
			 
	 // CLOSING PART CLASS 
	
//  so your sub-class must have an explicit constructor that calls the constructor of the base class.
public class PurchasedPart  {
	private double purchasePrice; //what does this part cost to buy?
	private String vendor;  //who do we buy this part from?
	private double handlingCost; //shipping and handling costs when we buy it
	public static final String DEFAULT_VENDOR_NAME = "no vendor name";
	public static final double DEFAULT_PURCHASE_PRICE = 0;
	public static final double DEFAULT_HANDLING_COST = 0; 
	
	// 3
	public PurchasedPart(int ID) {}
	// 4
	public PurchasedPart(int ID, double purchasePrice, String vendor, double handlingCost) {
		// Coin myCoin = new Coin();
		}
	// 5
	public PurchasedPart(int ID, String partDescription, double partSellPrice, double handlingCost, 
			double purchasePrice, String vendor) {
		super();
		if (purchasePrice < 0) {
			System.out.print("Invalid Value" + DEFAULT_PURCHASE_PRICE);
			purchasePrice = DEFAULT_PURCHASE_PRICE;
	 }
			
		if (handlingCost < 0) {
		 	System.out.print("Invalid value" + DEFAULT_HANDLING_COST);
		 	handlingCost = DEFAULT_HANDLING_COST;
			
	 }
				
		if (vendor == null || vendor.length() <= 0) {
		 	System.out.print("Invalid Value");
		 	vendor = DEFAULT_VENDOR_NAME;	
					}
	} // CLOSING
	 @Override
		public String toString() {
			super();
		 return "Purchased Part: " + partID + this.partID + "Part Description: " + this.partDescription + "Part Selling Price: "
					+ this.partSellPrice + "Handling Cost: " + this.handlingCost + "Purchase Price: " + this.purchasePrice + "Vendor: " + this.vendor; ;
			
				} 
	 
	 public class ManufacturedPart {
				private double laborCost;//cost to make part 
				private double materialCost;//amount of material in product
				public static final double DEFAULT_LABOR_COST = 0;
				public static final double DEFAULT_MATERIAL_COST = 0;
	 // 6
	 public ManufacturedPart (int ID) {}
	 
	 // 7
	 public ManufacturedPart (int ID, double laborCost, double materialCost) {
		 
	 }
	 
	 // 8
	 public ManufacturedPart (int ID, String partDescription, double sellPrice, double laborCost, double materialCost) {
		 super();
		 if (laborCost < 0) {
				System.out.print("Invalid Value" + DEFAULT_LABOR_COST);
				purchasePrice = DEFAULT_LABOR_COST; 
				}
		 if (materialCost < 0) {
				System.out.print("Invalid Value" + DEFAULT_MATERIAL_COST);
				materialCost = DEFAULT_MATERIAL_COST; 
				}
	 }
	 
	 }
}

// o1 is special keyword in java, its called instanceof, and then we have a class name
// if (o1 instanceof classname)
			 
