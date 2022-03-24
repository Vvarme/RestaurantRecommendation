	package com.sebone.java.data;
	
	/**
	 *project name-RestaurantRecommendation
     *class name-DishResponse
     *@author-Vinod Varme
     *objective-this class is created to provide response related to Dish 
     *date -25/03/2022
   */
	import java.util.ArrayList;

	public class DishResponse {
		private boolean isSuccess;
		private String message;
		private ArrayList<DishDetails>dishDetails=new ArrayList<DishDetails>();
		
		public boolean isSuccess() {
			return isSuccess;
		}
		public void setSuccess(boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public ArrayList<DishDetails> getDishDetails() {
			return dishDetails;
		}
		public void setDishDetails(ArrayList<DishDetails> dishDetails) {
			this.dishDetails = dishDetails;
		}
		@Override
		public String toString() {
			return "DishResponse [isSuccess=" + isSuccess + ", message=" + message + ", dishDetails=" + dishDetails
					+ ", isSuccess()=" + isSuccess() + ", getMessage()=" + getMessage() + ", getDishDetails()="
					+ getDishDetails() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
}
