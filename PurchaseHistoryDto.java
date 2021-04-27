package jp.co.internous.glider.model.domain.dto;

public class PurchaseHistoryDto {
	

	//購入履歴
	private String purchasedAt;
	//商品名
	private String productName;
	//価格
	private int price;
	//個数
	private int productCount;
	//宛先名:姓
	private String familyName;
	//宛先名:名
	private String firstName;
	//宛先
	private String address;
	
	
	public String getPurchasedAt() {
		return purchasedAt;
	}
	public void setPurchasedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
