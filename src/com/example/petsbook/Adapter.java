package com.example.petsbook;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends ArrayAdapter<Object> {

	// Array con los datos que se mostraran en la lista
	private static Tool[] datos = new Tool[] {
			new Tool("Perro1", "se perdio en la rambla", R.drawable.huella),
			new Tool("Perro2", "se perdio en la rambla", R.drawable.huella),
			new Tool("Perro3", "se perdio en la rambla", R.drawable.huella),
			new Tool("Perro4", "se perdio en la rambla", R.drawable.huella) };

	Activity context;

	public Adapter(Activity context) {
		super(context, R.layout.listaperdidos_item, datos);
		this.context = context;
	}

	// Metodo para asignar cada elemento de listItem a los datos
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View item = inflater.inflate(R.layout.listaperdidos_item, null);

		TextView lblTitulo = (TextView) item.findViewById(R.id.lblTitulo);
		lblTitulo.setText(datos[position].getTitulo());

		TextView lblSubtitulo = (TextView) item.findViewById(R.id.lblSubTitulo);
		lblSubtitulo.setText(datos[position].getSubtitulo());

		ImageView imagen = (ImageView) item.findViewById(R.id.Imagen);
		imagen.setImageResource(datos[position].getImagen());

		return item;
	}
}
