	package com.sebone.java.impl;
   
	import java.util.ArrayList;

import com.sebone.java.data.DishResponse;
import com.sebone.java.restaurants.DishInfo;
	/**
	 *Project name-RestaurantRecommendation
	 *class name-DishInfoImpl
	 *implements class-DishInfo
	 *@author-Vinod Varme
	 *objective-this class is created to provide implementation of DishInfo methods 
	 *date -25/03/2022
	*/
	public class DishInfoImpl implements DishInfo {

		/**
		  *method name-getDishByRestaurant-
	      *return_type-DishResponse
	      *input parameter-this method takes one int type of argument in the parameter
	      *objective-this method show dish based on restaurant id
	    */
		public DishResponse getDishByRestaurant(int restaurantId) {
			// TODO Auto-generated method stub
			return null;
		}
		/**
		  *method name-searchDishesByKeyword
	      *return_type-DishResponse
	      *input parameter-this method takes one int type and second string type of argument in the parameter
	      *objective-this method show dish based on restaurant id and dish name
	    */
		public DishResponse searchDishesByKeyword(int restaurantId, String keyword) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		  *method name-searchByDish
	      *return_type-DishResponse
	      *input parameter-this method takes one string type of argument in the parameter
	      *objective- this method show the list of dishes for given keyword
	    */
		public DishResponse searchByDish(String keyword) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		  *method name-sortDish
	      *return_type-DishResponse
	      *input parameter-this method takes one int type and second arraylist type of argument in the parameter
	      *objective-this method sort the list of dishes on given restaurant id and sortvalue
	    */
		public DishResponse sortDish(int restaurantId, ArrayList<String> sortValue) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		  *method name-filterDish
	      *return_type-DishResponse
	      *input parameter-this method takes one int type and second arraylist type of argument in the parameter
	      *objective-this method filter the list of dishes on given restaurant id and sortvalue
	    */
		public DishResponse filterDish(int restaurantId, ArrayList<String> Value) {
			// TODO Auto-generated method stub
			return null;
		}

		
	}
