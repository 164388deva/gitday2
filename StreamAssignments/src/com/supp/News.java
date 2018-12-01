package com.supp;

public class News {
	 private int newsId;
	private String postedByUser ;	
	
	
	private String comments,commentByUser;
	
	public News( int i, String postedByUser, String commentByUser,
			String comment) {
	
		this.newsId=i;
		this.postedByUser = postedByUser;
		this.comments=comment;
		this.commentByUser =commentByUser;
	}


	public int getNewsId() {
		return newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	
	public String getComments() {
		return comments;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser
				+ ", commentByUser=" + commentByUser + ", comment=" + comments
				+ "]";
	} 
	
	
	
}
