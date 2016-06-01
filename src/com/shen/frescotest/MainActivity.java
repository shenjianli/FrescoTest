package com.shen.frescotest;

import java.util.ArrayList;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends Activity {
	//设置图片请求的基础地址
	private static final String BASE_URL = "http://img1.3lian.com/img2011/w1/106/85/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Fresco.initialize(this);
		setContentView(R.layout.activity_main);
		//创建一组数据用来填充ListView时在界面显示数据
		ArrayList<Product> dishList = new ArrayList<Product>();

		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		
		
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		//获取ListView组件并设置数据适配器
		ListView mListView = (ListView) this.findViewById(R.id.listview);
		ProductListViewAdapter adapter = new ProductListViewAdapter(dishList);
		mListView.setAdapter(adapter);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	// ListView适配器
	private class ProductListViewAdapter extends BaseAdapter {

		private ArrayList<Product> dataList;

		public ProductListViewAdapter(ArrayList<Product> list) {
			this.dataList = list;
		}

		@Override
		public int getCount() {
			return dataList.size();
		}

		@Override
		public Object getItem(int position) {
			return dataList.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				ListViewItemHolder item = null;
				if (convertView == null) {
					convertView = LayoutInflater.from(MainActivity.this).inflate(
							R.layout.main_listview_item, null);
					item = new ListViewItemHolder();
					item.img_iv = (SimpleDraweeView) convertView
							.findViewById(R.id.my_image_view);
					item.name_textview = (TextView) convertView
							.findViewById(R.id.textView1);
					item.price_textview = (TextView) convertView
							.findViewById(R.id.textView2);

					convertView.setTag(item);
				} else {
					item = (ListViewItemHolder) convertView.getTag();
				}

				Product product = dataList.get(position);

				Uri uri = Uri.parse(product.getImgUrl());
//				SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
//				draweeView.setImageURI(uri);
				item.img_iv.setImageURI(uri);
				
				DraweeController draweeController = Fresco.newDraweeControllerBuilder().setUri(product.getImgUrl()).build();
				
//				item.img_iv.setController(new DraweeController(){
//					
//					
//					
//				});
				
				item.name_textview.setText(product.getName());
				item.price_textview.setText(product.getPrice() + "元");

				return convertView;
			}

		}

		// ListView的Item组件类
		private class ListViewItemHolder {
			SimpleDraweeView img_iv;
			TextView name_textview;
			TextView price_textview;
		}
}
