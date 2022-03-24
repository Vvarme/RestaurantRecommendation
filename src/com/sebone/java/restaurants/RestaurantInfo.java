	package com.sebone.java.restaurants;

	import java.util.ArrayList;
	import com.sebone.java.data.RestaurantResponse;
	/**
	 *Project name-RestaurantRecommendation
	 *interface name-RestaurantInfo
	 *implementer class-RestaurantInfoImpl
	 *@author-Vinod Varme
	 *objective-this interface is created to provide declarations of RestaurantData methods 
	 *date -25/03/2022
	*/

	public interface RestaurantInfo {

		public RestaurantResponse getRestaurantDetails(int pincode);
		
		public RestaurantResponse getRestaurantByName(String name);
		
		public RestaurantResponse filterRestaurantDetails(int pincode,ArrayList<String>value);
		
		public RestaurantResponse sortRestaurant(int pincode,String sortValue);
	}
