package com.example.testtab03_weichat;

//����������ʾÿһ�����ݵ���
public class Show {
	private String name;
	private String info;
	private int imageId;
	
	//ֻ��ʾÿ�е�����
	public Show(String name){
		this.name=name;
	}
	
	//��ʾÿ�е����ƺ�����
	public Show(String name,String info){
		this.name=name;
		this.info=info;
	}

	//��ʾÿ�е����ƺ�ͼ��
	public Show(String name,int imageId){
		this.name=name;
		this.imageId=imageId;
	}

	//��ʾÿ�е����ơ�������ͼ��
	public Show(String name,String info,int imageId){
		this.name=name;
		this.imageId=imageId;
		this.info=info;
	}
	
	//���������ǻ�ȡ�����ơ�������ͼ��
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
