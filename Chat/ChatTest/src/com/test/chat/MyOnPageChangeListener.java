package com.test.chat;

import android.support.v4.view.ViewPager.OnPageChangeListener;
/**
 * 当ViewPager翻页时触发
 * @author daobo.yuan
 *
 */
public class MyOnPageChangeListener implements OnPageChangeListener{

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		updateSelectedIndex(arg0);
	}
	/**
	 * 更新当前ViewPager索引
	 * @param currentSelectIndex
	 */
	private void updateSelectedIndex(int currentSelectIndex){
		if(null!=ChatTestActivity.self){
			int childCount = ChatTestActivity.self.ll_vp_selected_index.getChildCount();
			for (int i = 0; i < childCount; i++) {
				if(currentSelectIndex==i){
					ChatTestActivity.self.ll_vp_selected_index.getChildAt(i).setBackgroundResource(R.drawable.page_focused);
				}else{
					ChatTestActivity.self.ll_vp_selected_index.getChildAt(i).setBackgroundResource(R.drawable.page_unfocused);
				}
			}
		}
	}
}
