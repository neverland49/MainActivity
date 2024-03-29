package com.special;

public class ListItem {
	private int imageId;
	private String title;
	private String desc;
	private String nr;
	private String nrtxt;
	
	public ListItem(int imageId, String title, String desc, String nr, String nrtxt) {
		this.imageId = imageId;
		this.title = title;
		this.desc = desc;
		this.nr = nr;
		this.nrtxt = nrtxt;
	}
	
	
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNr(){
		return nr;
	}
	public String getNrTxt(){
		return nrtxt;
	}
	@Override
	public String toString() {
		return title + "\n" + desc;
	}	
}