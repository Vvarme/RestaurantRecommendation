	package com.sebone.java.data;
	
	/**
	 *Project name-RestaurantRecommendation
     *class name-RatingData
     *@author-Vinod Varme
     *objective-this class is created to provide ratings on restaurant
     *date -25/03/2022
   */
	public class RatingData {
		private int ratingId;
		private int ratingStars;
		private String ratingDescription;
		private String ratingTime;
		private String ratingUser;
		private int restaurantId;
		private String ratingCreatedDateTime;
		private String ratingModifiedTime;
		
		public int getRatingId() {
			return ratingId;
		}
		public void setRatingId(int ratingId) {
			this.ratingId = ratingId;
		}
		public int getRatingStars() {
			return ratingStars;
		}
		public void setRatingStars(int ratingStars) {
			this.ratingStars = ratingStars;
		}
		public String getRatingDescription() {
			return ratingDescription;
		}
		public void setRatingDescription(String ratingDescription) {
			this.ratingDescription = ratingDescription;
		}
		public String getRatingTime() {
			return ratingTime;
		}
		public void setRatingTime(String ratingTime) {
			this.ratingTime = ratingTime;
		}
		public String getRatingUser() {
			return ratingUser;
		}
		public void setRatingUser(String ratingUser) {
			this.ratingUser = ratingUser;
		}
		public int getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(int restaurantId) {
			this.restaurantId = restaurantId;
		}
		public String getRatingCreatedDateTime() {
			return ratingCreatedDateTime;
		}
		public void setRatingCreatedDateTime(String ratingCreatedDateTime) {
			this.ratingCreatedDateTime = ratingCreatedDateTime;
		}
		public String getRatingModifiedTime() {
			return ratingModifiedTime;
		}
		public void setRatingModifiedTime(String ratingModifiedTime) {
			this.ratingModifiedTime = ratingModifiedTime;
		}
		@Override
		public String toString() {
			return "RatingData [ratingId=" + ratingId + ", ratingStars=" + ratingStars + ", ratingDescription="
					+ ratingDescription + ", ratingTime=" + ratingTime + ", ratingUser=" + ratingUser + ", restaurantId="
					+ restaurantId + ", ratingCreatedDateTime=" + ratingCreatedDateTime + ", ratingModifiedTime="
					+ ratingModifiedTime + ", getRatingId()=" + getRatingId() + ", getRatingStars()=" + getRatingStars()
					+ ", getRatingDescription()=" + getRatingDescription() + ", getRatingTime()=" + getRatingTime()
					+ ", getRatingUser()=" + getRatingUser() + ", getRestaurantId()=" + getRestaurantId()
					+ ", getRatingCreatedDateTime()=" + getRatingCreatedDateTime() + ", getRatingModifiedTime()="
					+ getRatingModifiedTime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
	}
