package com.example.testtab03_weichat;

import java.util.ArrayList;
import java.util.List;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements OnClickListener {

	private ViewPager mViewPager;
	private FragmentPagerAdapter mAdapter;
	private List<Fragment> mFragments;

	private LinearLayout mTabWeixin;
	private LinearLayout mTabFrd;
	private LinearLayout mTabAddress;
	private LinearLayout mTabSettings;

	private ImageButton mImageWeixin;
	private ImageButton mImageFrd;
	private ImageButton mImageAddress;
	private ImageButton mImageSettings;

	private Button button1;
	private static final int update = 1;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		initView();
		initEvent();

		// WeixinFragment wxFragment=new WeixinFragment();
		// FragmentManager fragmentManager=getFragmentManager();
		// wxFragment=(WeixinFragment)getFragmentManager().findFragmentById(R.id.)

		setSelect(0);
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_MENU) { // 监听 menu 按键
			Toast.makeText(this, "你按了一下menu键", 1).show();
		}
		return super.onKeyDown(keyCode, event);
	}

	// public void switchContent(Fragment from, Fragment to) {
	// get
	// if (mContent != to) {
	// mContent = to;
	// FragmentTransaction transaction =
	// mFragmentMan.beginTransaction().setCustomAnimations(
	// android.R.anim.fade_in, R.anim.slide_out);
	// if (!to.isAdded()) { // 先判断是否被add过
	// transaction.hide(from).add(R.id.content_frame, to).commit(); //
	// 隐藏当前的fragment，add下一个到Activity中
	// } else {
	// transaction.hide(from).show(to).commit(); // 隐藏当前的fragment，显示下一个
	// }
	// }
	// }

	// public void switchContent(Fragment fragment) {
	// if(mContent != fragment) {
	// mContent = fragment;
	// mFragmentMan.beginTransaction()
	// .setCustomAnimations(android.R.anim.fade_in, R.anim.slide_out)
	// .replace(R.id.content_frame, fragment) // 替换Fragment，实现切换
	// .commit();
	// }
	// }

	private void initEvent() {
		mTabWeixin.setOnClickListener(this);
		mTabFrd.setOnClickListener(this);
		mTabAddress.setOnClickListener(this);
		mTabSettings.setOnClickListener(this);
	}

	private void initView() {
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

		mTabWeixin = (LinearLayout) findViewById(R.id.id_tab_weixin);
		mTabFrd = (LinearLayout) findViewById(R.id.id_tab_frd);
		mTabAddress = (LinearLayout) findViewById(R.id.id_tab_address);
		mTabSettings = (LinearLayout) findViewById(R.id.id_tab_settings);

		mImageWeixin = (ImageButton) findViewById(R.id.id_tab_weinxin_img);
		mImageFrd = (ImageButton) findViewById(R.id.id_tab_frd_img);
		mImageAddress = (ImageButton) findViewById(R.id.id_tab_address_img);
		mImageSettings = (ImageButton) findViewById(R.id.id_tab_settings_img);

		if (mFragments == null) {
			mFragments = new ArrayList<Fragment>();
			// Fragment mTab01 = new WeixinFragment();
			// Fragment mTab02 = new FrdFragment();
			// Fragment mTab03 = new AddressFragment();
			// Fragment mTab04 = new SettingFragment();

			Fragment mTab01 = null;
			Fragment mTab02 = null;
			Fragment mTab03 = null;
			Fragment mTab04 = null;

			if (mTab01 == null) {
				mTab01 = new WeixinFragment();
			}
			if (mTab02 == null) {
				mTab02 = new FrdFragment();
			}
			if (mTab03 == null) {
				mTab03 = new AddressFragment();
			}
			if (mTab04 == null) {
				mTab04 = new SettingFragment();
			}

			mFragments.add(mTab01);
			mFragments.add(mTab02);
			mFragments.add(mTab03);
			mFragments.add(mTab04);

			mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
				public int getCount() {
					return mFragments.size();
				}

				public Fragment getItem(int arg0) {
					return mFragments.get(arg0);
				}
			};

		}
		// else if (mFragments!=null){
		//
		// }

		mViewPager.setAdapter(mAdapter);
		mViewPager.setOnPageChangeListener(new OnPageChangeListener() {
			public void onPageSelected(int arg0) {
				int currentItem = mViewPager.getCurrentItem();
				setTab(currentItem);
			}

			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.id_tab_weixin:
			setSelect(0);
			break;
		case R.id.id_tab_frd:
			setSelect(1);
			break;
		case R.id.id_tab_address:
			setSelect(2);
			break;
		case R.id.id_tab_settings:
			setSelect(3);
			break;
		}
	}

	private void setSelect(int i) {
		setTab(i);
		mViewPager.setCurrentItem(i);
	}

	private void setTab(int i) {
		resetImgs();
		// 设置图片为亮色
		// 切换内容区域
		switch (i) {
		case 0:
			mImageWeixin.setImageResource(R.drawable.tab_weixin_pressed);
			break;
		case 1:
			mImageFrd.setImageResource(R.drawable.tab_find_frd_pressed);
			break;
		case 2:
			mImageAddress.setImageResource(R.drawable.tab_address_pressed);
			break;
		case 3:
			mImageSettings.setImageResource(R.drawable.tab_settings_pressed);
			break;
		}
	}

	private void resetImgs() {
		mImageWeixin.setImageResource(R.drawable.tab_weixin_normal);
		mImageFrd.setImageResource(R.drawable.tab_find_frd_normal);
		mImageAddress.setImageResource(R.drawable.tab_address_normal);
		mImageSettings.setImageResource(R.drawable.tab_settings_normal);
	}
}
