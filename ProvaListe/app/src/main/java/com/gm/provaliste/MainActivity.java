package com.gm.provaliste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
{
    ArrayList<DettaglioRecord> elenco;
    ListView ElencoView;
    DettaglioAdapter adattatore;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elenco = new ArrayList<>();
        for (int i=0;i<100;i++)
        {
            elenco.add(new DettaglioRecord("Titolo "+i,"Sottotitolo " +i));
        }


        ElencoView = (ListView) findViewById(R.id.ElencoView);



        adattatore = new DettaglioAdapter(this, R.layout.dettaglioitem, elenco);
        ElencoView.setAdapter(adattatore);
        ElencoView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                // recordselezionato= (DettaglioOperatoriRecord) parent.getAdapter().getItem(position);
                //  Vai();
            }
        });




    }
}
