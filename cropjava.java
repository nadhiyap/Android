package com.example.cropcultivation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
Button b1,b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	b1=(Button) findViewById(R.id.button1);
	b2=(Button) findViewById(R.id.button2);
	b1.setOnClickListener(new OnClickListener()
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent(getApplicationContext(),AdminLogin.class);
			startActivity(i);
		}
		
	}
	);
	b2.setOnClickListener(new OnClickListener()
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent in=new Intent(getApplicationContext(),AgricultureTypes.class);
			startActivity(in);
		}
		
	}
	);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

package com.example.cropcultivation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends Activity {
EditText et1,et2;
Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admin_login);
		et1=(EditText) findViewById(R.id.editText1);
		et2=(EditText) findViewById(R.id.editText2);
		b1=(Button) findViewById(R.id.button1);
		
		b1.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String u=et1.getText().toString();
				String p=et2.getText().toString();
				if(u.equals("agnp")&& p.equals("4578"))
				{
					Toast.makeText(getApplication(),"Login Successfully",0).show();
					Intent i=new Intent(getApplicationContext(),Admin.class);
					startActivity(i);
				}
				else
					
					Toast.makeText(getApplication(),"Incorrect Login",0).show();
			}
			
		}
		);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admin_login, menu);
		return true;
	}

}
package com.example.cropcultivation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class AgricultureTypes extends Activity {
TextView t2,t3,t4,t5,t6,t7,t8,t9,t10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_agriculture_types);
		t2=(TextView) findViewById(R.id.textView2);
		t3=(TextView) findViewById(R.id.textView3);
		t4=(TextView) findViewById(R.id.textView4);
		t5=(TextView) findViewById(R.id.textView5);
		t6=(TextView) findViewById(R.id.textView6);
		t7=(TextView) findViewById(R.id.textView7);
		t8=(TextView) findViewById(R.id.textView8);
		t9=(TextView) findViewById(R.id.textView9);
		t10=(TextView) findViewById(R.id.textView10);	
		t2.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ia=new Intent(getApplicationContext(),ShiftingAgriculture.class);
				startActivity(ia);
				
			}
			
		}
		);
		t3.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		
				Intent ib=new Intent(getApplicationContext(),SubsistenceAgriculture.class);
				startActivity(ib);
			}
			
		}
		);
		t4.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ic=new Intent(getApplicationContext(),IntensiveAgriculture.class);
				startActivity(ic);
				
			}
			
		}
		);
		t5.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent id=new Intent(getApplicationContext(),ExtensiveAgriculture.class);
				startActivity(id);
			}
			
		}
		);
		t6.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ie=new Intent(getApplicationContext(),CommercialAgriculture.class);
				startActivity(ie);
			}
			
		}
		);
		t7.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ig=new Intent(getApplicationContext(),PlantationAgriculture.class);
				startActivity(ig);
			}
			
		}
		);
		t8.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ih=new Intent(getApplicationContext(),DryLandAgriculture.class);
				startActivity(ih);
			}
			
		}
		);
		t9.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(getApplicationContext(),WetLandAgriculture.class);
				startActivity(ii);
			}
			
		}
		);
		t10.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ij=new Intent(getApplicationContext(),Aquaponics.class);
				startActivity(ij);
			}
			
		}
		);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.agriculture_types, menu);
		return true;
	}

}

package com.example.cropcultivation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ShiftingAgriculture extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shifting_agriculture);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shifting_agriculture, menu);
		return true;
	}

}

package com.example.cropcultivation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SubsistenceAgriculture extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_subsistence_agriculture);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.subsistence_agriculture, menu);
		return true;
	}

}

package com.example.cropcultivation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Aquaponics extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aquaponics);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aquaponics, menu);
		return true;
	}

}

