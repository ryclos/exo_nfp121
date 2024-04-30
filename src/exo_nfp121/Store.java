package exo_nfp121;

import java.util.ArrayList;
import java.util.List;

public class Store {
	private Smartphone[] smartphones;
	private Laptop[] laptops;
	private Accessories[] accessories;
	
	public Store() {
		List<Product> listProduct = new ArrayList<Product>();
		
		listProduct.add(new Smartphone("Samsung", "A1", "Android", 9990));
		listProduct.add(new Smartphone("Samsung", "A1", "Android", 9990));
		
		listProduct.add(new Laptop("Lenovo", "Xiou", "Windoww", 19990));
		listProduct.add(new Laptop("HP", "Extra", "Linux", 99920));
		
		listProduct.add(new Accessories("Coque", "Telephon", 990));
		listProduct.add(new Accessories("Samsung", "A1", 9990));
	}
	
	public String getCatalogue(String type) {
		String res = "";
		for(Product m:listProduct) {
			if(m.getClass().getName().equals(type));
			res = res+m.formatCourt+"\n";
			return res;
		}
	}
}
