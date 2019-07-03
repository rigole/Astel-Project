package e.plass.acceuilwayfinding;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import e.plass.acceuilwayfinding.model.Formation;
import e.plass.acceuilwayfinding.model.Util;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 *  interface
 * to handle interaction events.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class FragmentDescriptionProduit extends Fragment {
    private TextView description,title;

    public FragmentDescriptionProduit() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Formation f = Util.getCurrentFormation();
        View view = inflater.inflate(R.layout.fragment_description_produit, container, false);
        description = view.findViewById(R.id.TextView_description_item_produit);
        title = view.findViewById(R.id.TextView_description_title_item_produit);


        //description.setText(f.getDescripetion().trim());
        title.setText(f.getName());
        return view;
    }

}
