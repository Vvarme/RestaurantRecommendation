	package com.sebone.java.impl;

	import java.util.ArrayList;

import com.sebone.java.data.RestaurantResponse;
import com.sebone.java.restaurants.RestaurantInfo;
	/**
	 *Project name-RestaurantRecommendation
	 *class name-RestaurantInfoImpl
	 *implements class-RestaurantInfo
	 *@author-Vinod Varme
	 *objective-this class is created to provide implentation of RestaurantInfo methods 
	 *date -25/03/2022
	*/
	public class RestaurantInfoImpl implements RestaurantInfo {

		/**
		  *method name-getRestaurantDetails
	      *return_type-RestaurantResponse
	      *input parameter-this method takes one int type of argument in the parameter
	      *objective-this method show restaurant details based on pincode
	    */
		public RestaurantResponse getRestaurantDetails(int pincode) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		  *method name-getRestaurantByName
	      *return_type-RestaurantResponse
	      *input parameter-this method takes one string type of argument in the parameter
	      *objective- this method show the list of restaurant based on name
	    */
		public RestaurantResponse getRestaurantByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		  *method name-filterRestaurantDetails
	      *return_type-RestaurantResponse
	      *input parameter-this method takes one int type and second arraylist type of argument in the parameter
	      *objective- this method filter restaurant based on restaurant details
	    */
		public RestaurantResponse filterRestaurantDetails(int pincode, ArrayList<String> value) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		  *method name-sortRestaurant
	      *return_type-DishResponse
	      *input parameter-this method takes one int type and second string type of argument in the parameter
	      *objective-this method sort the restaurant based on given restaurant id and sortvalue
	    */
		public RestaurantResponse sortRestaurant(int pincode, String sortValue) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}
