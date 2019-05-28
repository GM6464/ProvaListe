package com.gm.provaliste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class DettaglioAdapter extends ArrayAdapter<DettaglioRecord>
{

    ArrayList<DettaglioRecord> elenco = new ArrayList<>();
    Context Contesto ;
    public DettaglioAdapter(Context context, int textViewResourceId, ArrayList<DettaglioRecord> objects)
    {
        super(context, textViewResourceId, objects);
        elenco = objects;
        Contesto= context;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.dettaglioitem, null);
        }

        TextView txtTitoloSecondario = (TextView) convertView.findViewById(R.id.txtTitoloSecondario);
        TextView txtTitolo = (TextView) convertView.findViewById(R.id.txtTitolo);

        DettaglioRecord c = getItem(position);

        txtTitoloSecondario.setText(c.TitoloSecondario);
        txtTitolo.setText(c.Titolo);



        final int posizione = position;


        return convertView;

    }

}