	package com.sebone.java.data;

	import java.util.ArrayList;
	/**
	 *Project name-RestaurantRecommendation
     *class name-RestaurantResponse
     *methods- getters and setters
     *@author-Vinod Varme
     *objective-this class is created to provide ratings on restaurant
     *date -25/03/2022
   */
	public class RestaurantResponse {

		private boolean isSuccess;
		private ArrayList<RestaurantDetails>restaurantList=new ArrayList<RestaurantDetails>();
		private String message;
		
		public boolean isSuccess() {
			return isSuccess;
		}
		public void setSuccess(boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
		public ArrayList<RestaurantDetails> getRestaurantList() {
			return restaurantList;
		}
		public void setRestaurantList(ArrayList<RestaurantDetails> restaurantList) {
			this.restaurantList = restaurantList;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		@Override
		public String toString() {
			return "RestaurantResponse [isSuccess=" + isSuccess + ", restaurantList=" + restaurantList + ", message="
					+ message + ", isSuccess()=" + isSuccess() + ", getRestaurantList()=" + getRestaurantList()
					+ ", getMessage()=" + getMessage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}

	}
