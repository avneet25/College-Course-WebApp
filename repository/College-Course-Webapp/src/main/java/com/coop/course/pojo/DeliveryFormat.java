package com.coop.course.pojo;

public class DeliveryFormat {
	
	private Integer deliveryFormatId;
	private String type;
	
	public DeliveryFormat() {
		super();
	}

	public DeliveryFormat(Integer deliveryFormatId, String type) {
		super();
		this.deliveryFormatId = deliveryFormatId;
		this.type = type;
	}

	public Integer getDeliveryFormatId() {
		return deliveryFormatId;
	}

	public void setDeliveryFormatId(Integer deliveryFormatId) {
		this.deliveryFormatId = deliveryFormatId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "DeliveryFormat [deliveryFormatId=" + deliveryFormatId + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryFormatId == null) ? 0 : deliveryFormatId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeliveryFormat other = (DeliveryFormat) obj;
		if (deliveryFormatId == null) {
			if (other.deliveryFormatId != null)
				return false;
		} else if (!deliveryFormatId.equals(other.deliveryFormatId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	

}
