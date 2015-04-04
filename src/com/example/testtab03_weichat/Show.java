package com.example.testtab03_weichat;

//用来定义显示每一列内容的类
public class Show {
	private String name;
	private String info;
	private int imageId;
	
	//只显示每列的名称
	public Show(String name){
		this.name=name;
	}
	
	//显示每列的名称和描述
	public Show(String name,String info){
		this.name=name;
		this.info=info;
	}

	//显示每列的名称和图标
	public Show(String name,int imageId){
		this.name=name;
		this.imageId=imageId;
	}

	//显示每列的名称、描述和图标
	public Show(String name,String info,int imageId){
		this.name=name;
		this.imageId=imageId;
		this.info=info;
	}
	
	//以下三个是获取到名称、描述和图标
	public String getName(){
		return name;
	}
	
	public String getInfo(){
		return info;
	}
	
	public int getImageId(){
		return imageId;
	}
	
	

}
