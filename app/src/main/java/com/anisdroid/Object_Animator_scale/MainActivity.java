package com.anisdroid.Object_Animator_scale;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.animation.*;

public class MainActivity extends Activity 
{
	
	ImageView iii;
	Button st_bt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		iii = (ImageView)findViewById(R.id.img);
		st_bt = (Button) findViewById(R.id.start_button);
		
		st_bt.setOnClickListener(
		
			new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					
					PropertyValuesHolder pvhx = PropertyValuesHolder.ofFloat(View.SCALE_X,1,0);
					PropertyValuesHolder pvhy = PropertyValuesHolder.ofFloat(View.SCALE_Y,1,0);
					
					ObjectAnimator anim = ObjectAnimator.ofPropertyValuesHolder(iii,pvhx,pvhy);
					anim.setRepeatCount(1);
					anim.setRepeatMode(ValueAnimator.REVERSE);
					anim.setDuration(4000);
					anim.start();
					
				}
				
				
			}
		
		);
		
    }
}
