	package com.sebone.java.data;
	/**
	 *Project name-RestaurantRecommendation
     *class name-RestaurantDetails
     *mehods- getters and setters
     *@author-Vinod Varme
     *objective-this class contains restaurant related details
     *date -25/03/2022
   */
	import java.util.ArrayList;
	
	public class RestaurantDetails {

		private ArrayList<RestaurantData>list =new ArrayList<RestaurantData>();
		private ArrayList<RatingData>ratingList=new ArrayList<RatingData>();
		private ArrayList<OfferData>offerList=new ArrayList<OfferData>();
	
		public ArrayList<RestaurantData> getList() {
			return list;
		}
		public void setList(ArrayList<RestaurantData> list) {
			this.list = list;
		}
		public ArrayList<RatingData> getRatingList() {
			return ratingList;
		}
		public void setRatingList(ArrayList<RatingData> ratingList) {
			this.ratingList = ratingList;
		}
		public ArrayList<OfferData> getOfferList() {
			return offerList;
		}
		public void setOfferList(ArrayList<OfferData> offerList) {
			this.offerList = offerList;
		}
		@Override
		public String toString() {
			return "RestaurantDetails [list=" + list + ", ratingList=" + ratingList + ", offerList=" + offerList
					+ ", getList()=" + getList() + ", getRatingList()=" + getRatingList() + ", getOfferList()="
					+ getOfferList() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

	}
