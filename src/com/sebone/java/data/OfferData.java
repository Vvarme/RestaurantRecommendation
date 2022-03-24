	package com.sebone.java.data;
	
	/**
	 * project name-RestaurantRecommendation
     *class name-DishData
     *@author-Vinod Varme
     *objective-this class contains dish related information 
     *date -25/03/2022
   */
	public class OfferData {
		int offerId;
		String offerType;
		String offerDescription;
		String offerStartDateTime;
		String offerEndDateTime;
		String offerStatus;
		int RestaurantId;
		
			public int getOfferId() {
				return offerId;
			}
			public void setOfferId(int offerId) {
				this.offerId = offerId;
			}
			public String getOfferType() {
				return offerType;
			}
			public void setOfferType(String offerType) {
				this.offerType = offerType;
			}
			public String getOfferDescription() {
				return offerDescription;
			}
			public void setOfferDescription(String offerDescription) {
				this.offerDescription = offerDescription;
			}
			public String getOfferStartDateTime() {
				return offerStartDateTime;
			}
			public void setOfferStartDateTime(String offerStartDateTime) {
				this.offerStartDateTime = offerStartDateTime;
			}
			public String getOfferEndDateTime() {
				return offerEndDateTime;
			}
			public void setOfferEndDateTime(String offerEndDateTime) {
				this.offerEndDateTime = offerEndDateTime;
			}
			public String getOfferStatus() {
				return offerStatus;
			}
			public void setOfferStatus(String offerStatus) {
				this.offerStatus = offerStatus;
			}
			public int getRestaurantId() {
				return RestaurantId;
			}
			public void setRestaurantId(int restaurantId) {
				RestaurantId = restaurantId;
			}
			@Override
			public String toString() {
				return "OfferData [offerId=" + offerId + ", offerType=" + offerType + ", offerDescription="
						+ offerDescription + ", offerStartDateTime=" + offerStartDateTime + ", offerEndDateTime="
						+ offerEndDateTime + ", offerStatus=" + offerStatus + ", RestaurantId=" + RestaurantId
						+ ", getOfferId()=" + getOfferId() + ", getOfferType()=" + getOfferType()
						+ ", getOfferDescription()=" + getOfferDescription() + ", getOfferStartDateTime()="
						+ getOfferStartDateTime() + ", getOfferEndDateTime()=" + getOfferEndDateTime()
						+ ", getOfferStatus()=" + getOfferStatus() + ", getRestaurantId()=" + getRestaurantId()
						+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
						+ "]";
			}
			
		
		
	
	}
