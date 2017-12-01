package com.predic8.workshop.stock.dto;

public class Stock {
	private String uuid;
    private long quantity;

	public Stock(String uuid, long quantity) {
		this.uuid = uuid;
		this.quantity = quantity;
	}

	public String getUuid() {
		return this.uuid;
	}

	public long getQuantity() {
		return this.quantity;
	}

	public String toString() {
		return "Stock(uuid=" + uuid + ", quantity=" + quantity + ")";
	}
}