package walker.synonymy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;

public class GameActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		
		// Show the Up button in the action bar.
		setupActionBar();		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar()
	{
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
		{
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case android.R.id.home:
				// This ID represents the Home or Up button. In the case of this
				// activity, the Up button is shown. Use NavUtils to allow users
				// to navigate up one level in the application structure. For
				// more details, see the Navigation pattern on Android Design:
				//
				// http://developer.android.com/design/patterns/navigation.html#up-vs-back
				//
				NavUtils.navigateUpFromSameTask(this);
			
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	public void buttonHome_OnClick(View view)
	{
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	public void linearLayoutWord1_OnClick(View view)
	{
		//view.setBackgroundResource(R.color.selectedWordPanel);
		setLinearLayoutWordPanelSelected(view);
			
		/*View word2Layout = findViewById(R.id.linearLayoutWord2);
		View word3Layout = findViewById(R.id.linearLayoutWord3);
		word2Layout.setBackgroundColor(Color.BLACK);
		word3Layout.setBackgroundColor(Color.BLACK);*/
		setLinearLayoutWordPanelUnselected(R.id.linearLayoutWord2);
		setLinearLayoutWordPanelUnselected(R.id.linearLayoutWord3);
	}
	
	public void linearLayoutWord2_OnClick(View view)
	{
		//view.setBackgroundResource(R.color.selectedWordPanel);
		setLinearLayoutWordPanelSelected(view);
		
		/*View word1Layout = findViewById(R.id.linearLayoutWord1);
		View word3Layout = findViewById(R.id.linearLayoutWord3);
		word1Layout.setBackgroundColor(Color.BLACK);
		word3Layout.setBackgroundColor(Color.BLACK);*/
		setLinearLayoutWordPanelUnselected(R.id.linearLayoutWord1);
		setLinearLayoutWordPanelUnselected(R.id.linearLayoutWord3);
	}
	
	public void linearLayoutWord3_OnClick(View view)
	{
		//view.setBackgroundResource(R.color.selectedWordPanel);
		setLinearLayoutWordPanelSelected(view);
		
		/*View word1Layout = findViewById(R.id.linearLayoutWord1);
		View word2Layout = findViewById(R.id.linearLayoutWord2);
		word1Layout.setBackgroundColor(Color.BLACK);
		word2Layout.setBackgroundColor(Color.BLACK);*/
		setLinearLayoutWordPanelUnselected(R.id.linearLayoutWord1);
		setLinearLayoutWordPanelUnselected(R.id.linearLayoutWord2);
	}
	
	private void setLinearLayoutWordPanelSelected(View view)
	{
		int selectedWordPanelColor = getResources().getColor(R.color.selectedWordPanel);
		setViewBackgroundColor(view, selectedWordPanelColor);
	}
	
	private void setLinearLayoutWordPanelUnselected(int viewID)
	{
		View linearLayoutWordPanelView = findViewById(viewID);
		setViewBackgroundColor(linearLayoutWordPanelView, Color.BLACK);
	}
	
	private void setViewBackgroundColor(View view, int color)
	{
		view.setBackgroundColor(color);	
	}	
}
