package baabtra.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","90","31"};
    String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String years[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spin1=(Spinner) findViewById(R.id.spinner1);
        ArrayAdapter myAdapter1= new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, days);
        spin1.setAdapter(myAdapter1);


        Spinner spin2=(Spinner) findViewById(R.id.spinner2);
        ArrayAdapter myAdapter2= new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, months);
        spin2.setAdapter(myAdapter2);


        Spinner spin3=(Spinner) findViewById(R.id.spinner3);
        ArrayAdapter myAdapter3= new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, years);
        spin3.setAdapter(myAdapter3);
    }

    public void buttonClicked(View v)
    {
        Toast.makeText(this.getApplicationContext(),"Successful",Toast.LENGTH_SHORT).show();
    }
}
