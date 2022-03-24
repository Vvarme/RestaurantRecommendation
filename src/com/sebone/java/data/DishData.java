	package com.sebone.java.data;
	
	/**
	 *project name-RestaurantRecommendation
     *class name-DishData
     *@author-Vinod Varme
     *objective-this class contains dish related data
     *date -25/03/2022
   */
	public class DishData {

		private int dishId;
		private String dishName;
		private int dishPrice;
		private String dishImage;
		private String dishDescription;
		private String dishType;
		private int restaurantId;
		private String dishStatus;
		private String dishTime;
		private String dishCreationTime;
		private String dishModifiedTime;
		private String dishPreparationTime;
		
		public int getDishId() {
			return dishId;
		}
		public void setDishId(int dishId) {
			this.dishId = dishId;
		}
		public String getDishName() {
			return dishName;
		}
		public void setDishName(String dishName) {
			this.dishName = dishName;
		}
		public int getDishPrice() {
			return dishPrice;
		}
		public void setDishPrice(int dishPrice) {
			this.dishPrice = dishPrice;
		}
		public String getDishImage() {
			return dishImage;
		}
		public void setDishImage(String dishImage) {
			this.dishImage = dishImage;
		}
		public String getDishDescription() {
			return dishDescription;
		}
		public void setDishDescription(String dishDescription) {
			this.dishDescription = dishDescription;
		}
		public String getDishType() {
			return dishType;
		}
		public void setDishType(String dishType) {
			this.dishType = dishType;
		}	
		public int getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(int restaurantId) {
			this.restaurantId = restaurantId;
		}
		public String getDishStatus() {
			return dishStatus;
		}
		public void setDishStatus(String dishStatus) {
			this.dishStatus = dishStatus;
		}
		public String getDishTime() {
			return dishTime;
		}
		public void setDishTime(String dishTime) {
			this.dishTime = dishTime;
		}
		public String getDishCreationTime() {
			return dishCreationTime;
		}
		public void setDishCreationTime(String dishCreationTime) {
			this.dishCreationTime = dishCreationTime;
		}
		public String getDishModifiedTime() {
			return dishModifiedTime;
		}
		public void setDishModifiedTime(String dishModifiedTime) {
			this.dishModifiedTime = dishModifiedTime;
		}
		public String getDishPreparationTime() {
			return dishPreparationTime;
		}
		public void setDishPreparationTime(String dishPreparationTime) {
			this.dishPreparationTime = dishPreparationTime;
		}
		@Override
		public String toString() {
			return "DishData [dishId=" + dishId + ", dishName=" + dishName + ", dishPrice=" + dishPrice + ", dishImage="
				+ dishImage + ", dishDescription=" + dishDescription + ", dishType=" + dishType + ", restaurantId="
				+ restaurantId + ", dishStatus=" + dishStatus + ", dishTime=" + dishTime + ", dishCreationTime="
				+ dishCreationTime + ", dishModifiedTime=" + dishModifiedTime + ", dishPreparationTime="
				+ dishPreparationTime + ", getDishId()=" + getDishId() + ", getDishName()=" + getDishName()
				+ ", getDishPrice()=" + getDishPrice() + ", getDishImage()=" + getDishImage()
				+ ", getDishDescription()=" + getDishDescription() + ", getDishType()=" + getDishType()
				+ ", getRestaurantId()=" + getRestaurantId() + ", getDishStatus()=" + getDishStatus()
				+ ", getDishTime()=" + getDishTime() + ", getDishCreationTime()=" + getDishCreationTime()
				+ ", getDishModifiedTime()=" + getDishModifiedTime() + ", getDishPreparationTime()="
				+ getDishPreparationTime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
		}
	}
