	package com.sebone.java.restaurants;

	import java.util.ArrayList;

import com.sebone.java.data.DishResponse;
	/**
	 *Project name-RestaurantRecommendation
	 *interface name-DishInfo
	 *implementer class-DishInfoImpl
	 *@author-Vinod Varme
	 *objective-this interface is created to provide declarations of DishData methods 
	 *date -25/03/2022
	*/
	public interface DishInfo {

		public DishResponse getDishByRestaurant(int restaurantId);
		
		public DishResponse searchDishesByKeyword(int restaurantId,String keyword);
		
		public DishResponse searchByDish(String keyword);
		
		public DishResponse sortDish(int restaurantId,ArrayList<String>sortValue);
		
		public DishResponse filterDish(int restaurantId,ArrayList<String>Value);
	
	}
