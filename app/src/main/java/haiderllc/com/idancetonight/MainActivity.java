package haiderllc.com.idancetonight;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private ActionBar.Tab tab1, tab2;

    /*
    Fragment tabs for Splash screen, Milongas, and Classes
     */
    private Fragment fragmentSplash = new Fragment();
    private Fragment fragmentMilonga = new Fragment();
    private Fragment fragmentClasses = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setTitle(Html.fromHtml("<font color='#000000'>ActionBarTitle </font>"));

        tab1 = actionBar.newTab().setText("Milongas");
        tab2 = actionBar.newTab().setText("Classes");



        tab1.setTabListener(new TabListener(fragmentMilonga));
        tab2.setTabListener(new TabListener(fragmentClasses));

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
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
}
