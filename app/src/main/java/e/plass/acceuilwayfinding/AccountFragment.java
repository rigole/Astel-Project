package e.plass.acceuilwayfinding;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class AccountFragment extends android.support.v4.app.Fragment {

    EditText txtNom;
    TextView val;

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_account, container, false);
       /* txtNom = v.findViewById(R.id.Txtnm);
        val = v.findViewById(R.id.refe);
        txtNom.setText(val.getText());*/



        return v;
    }

}
