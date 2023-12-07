package CameraRental.Store;

public class MyStore {
	private int id;
	private String brands;
	private String model;
	private float PricePerDay;
	private String avaibility;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrands() {
		return brands;
	}
	public void setBrands(String brands) {
		this.brands = brands;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPricePerDay() {
		return PricePerDay;
	}
	public void setPricePerDay(float pricePerDay) {
		PricePerDay = pricePerDay;
	}
	public String getAvaibility() {
		return avaibility;
	}
	public void setAvaibility(String avaibility) {
		this.avaibility = avaibility;
	}
	public MyStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyStore(int id, String brands, String model, float pricePerDay, String avaibility) {
		super();
		this.id = id;
		this.brands = brands;
		this.model = model;
		PricePerDay = pricePerDay;
		this.avaibility = avaibility;
	}
	@Override
	public String toString() {
		return " id=" + id + ", brands=" + brands + ", model=" + model + ", PricePerDay=" + PricePerDay
				+ ", avaibility=" + avaibility ;
	}
	
}
