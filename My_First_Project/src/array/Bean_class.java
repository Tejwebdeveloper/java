package array;

public  class Bean_class implements Comparable {
    String Color;
    String Brand;
    double Price;
    public Bean_class(String Color,String Brand,double Price){
    	this.Price= Price;
    	this.Brand= Brand;
    	this.Color= Color;
    }
	public String getBrand() {
		return Brand;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public String getColor() {
		return Color;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Bean_class bn = (Bean_class)o;
		
		if(Price == bn.Price)
		{
		return 0;
	}
		else if(Price>bn.Price)
		{
			return 1;
		}
		else {
			return-1;
		}

}
}
