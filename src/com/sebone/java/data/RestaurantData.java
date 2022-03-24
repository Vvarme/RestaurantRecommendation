	package com.sebone.java.data;
	/**
	 *Project name-RestaurantRecommendation
     *class name-RestaurantData
     *@author-Vinod Varme
     *objective-this class contains restaurant related data
     *date -25/03/2022
   */
	public class RestaurantData {

		private int restaurantId;
		private String restaurantName;
		private long contactNumber;
		private String restaurantMail;
		private String restaurantType;
		private String restaurantImage;
		private String restaurantStatus;
		private String restaurantDescription;
		private String restaurantOffer;
		private int restaurantAvgPrice;
		private double restaurantOpenTime;
		private double restaurantCloseTime;
		private double restaurantCreatedDateTime;
		private double restaurantModifiedDateTime;
	
	
		public int getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(int restaurantId) {
			this.restaurantId = restaurantId;
		}
		public String getRestaurantName() {
			return restaurantName;
		}
		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getRestaurantMail() {
			return restaurantMail;
		}
		public void setRestaurantMail(String restaurantMail) {
			this.restaurantMail = restaurantMail;
		}
		public String getRestaurantType() {
			return restaurantType;
		}
		public void setRestaurantType(String restaurantType) {
			this.restaurantType = restaurantType;
		}
		public String getRestaurantImage() {
			return restaurantImage;
		}
		public void setRestaurantImage(String restaurantImage) {
			this.restaurantImage = restaurantImage;
		}
		public String getRestaurantStatus() {
			return restaurantStatus;
		}
		public void setRestaurantStatus(String restaurantStatus) {
			this.restaurantStatus = restaurantStatus;
		}
		public String getRestaurantDescription() {
			return restaurantDescription;
		}
		public void setRestaurantDescription(String restaurantDescription) {
			this.restaurantDescription = restaurantDescription;
		}
		public String getRestaurantOffer() {
			return restaurantOffer;
		}
		public void setRestaurantOffer(String restaurantOffer) {
			this.restaurantOffer = restaurantOffer;
		}
		public int getRestaurantAvgPrice() {
			return restaurantAvgPrice;
		}
		public void setRestaurantAvgPrice(int restaurantAvgPrice) {
			this.restaurantAvgPrice = restaurantAvgPrice;
		}
		public double getRestaurantOpenTime() {
			return restaurantOpenTime;
		}
		public void setRestaurantOpenTime(double restaurantOpenTime) {
			this.restaurantOpenTime = restaurantOpenTime;
		}
		public double getRestaurantCloseTime() {
			return restaurantCloseTime;
		}
		public void setRestaurantCloseTime(double restaurantCloseTime) {
			this.restaurantCloseTime = restaurantCloseTime;
		}
		public double getRestaurantCreatedDateTime() {
			return restaurantCreatedDateTime;
		}
		public void setRestaurantCreatedDateTime(double restaurantCreatedDateTime) {
			this.restaurantCreatedDateTime = restaurantCreatedDateTime;
		}
		public double getRestaurantModifiedDateTime() {
			return restaurantModifiedDateTime;
		}
		public void setRestaurantModifiedDateTime(double restaurantModifiedDateTime) {
			this.restaurantModifiedDateTime = restaurantModifiedDateTime;
		}
		@Override
		public String toString() {
			return "RestaurantData [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
					+ ", contactNumber=" + contactNumber + ", restaurantMail=" + restaurantMail + ", restaurantType="
					+ restaurantType + ", restaurantImage=" + restaurantImage + ", restaurantStatus=" + restaurantStatus
					+ ", restaurantDescription=" + restaurantDescription + ", restaurantOffer=" + restaurantOffer
					+ ", restaurantAvgPrice=" + restaurantAvgPrice + ", restaurantOpenTime=" + restaurantOpenTime
					+ ", restaurantCloseTime=" + restaurantCloseTime + ", restaurantCreatedDateTime="
					+ restaurantCreatedDateTime + ", restaurantModifiedDateTime=" + restaurantModifiedDateTime
					+ ", getRestaurantId()=" + getRestaurantId() + ", getRestaurantName()=" + getRestaurantName()
					+ ", getContactNumber()=" + getContactNumber() + ", getRestaurantMail()=" + getRestaurantMail()
					+ ", getRestaurantType()=" + getRestaurantType() + ", getRestaurantImage()=" + getRestaurantImage()
					+ ", getRestaurantStatus()=" + getRestaurantStatus() + ", getRestaurantDescription()="
					+ getRestaurantDescription() + ", getRestaurantOffer()=" + getRestaurantOffer()
					+ ", getRestaurantAvgPrice()=" + getRestaurantAvgPrice() + ", getRestaurantOpenTime()="
					+ getRestaurantOpenTime() + ", getRestaurantCloseTime()=" + getRestaurantCloseTime()
					+ ", getRestaurantCreatedDateTime()=" + getRestaurantCreatedDateTime()
					+ ", getRestaurantModifiedDateTime()=" + getRestaurantModifiedDateTime() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}	
	
	}	
