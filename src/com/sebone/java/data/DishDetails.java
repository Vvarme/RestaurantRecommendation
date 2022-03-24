	package com.sebone.java.data;
	
	/**
	 * project name-RestaurantRecommendation
     *class name-DishData
     *@author-Vinod Varme
     *objective-this class contains dish related information 
     *date -25/03/2022
   */
	public class DishDetails {

		private RestaurantDetails restaurantDetails=new RestaurantDetails();
		private DishData dishData=new DishData();
		
			public RestaurantDetails getRestaurantDetails() {
				return restaurantDetails;
			}
			public void setRestaurantDetails(RestaurantDetails restaurantDetails) {
				this.restaurantDetails = restaurantDetails;
			}
			public DishData getDishData() {
				return dishData;
			}
			public void setDishData(DishData dishData) {
				this.dishData = dishData;
			}
}
