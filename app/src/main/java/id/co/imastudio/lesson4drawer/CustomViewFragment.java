package id.co.imastudio.lesson4drawer;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomViewFragment extends Fragment {


    public CustomViewFragment() {
        // Required empty public constructor
    }


    CustomView custom;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_custom_view, container, false);
        custom = view.findViewById(R.id.custom_view);
        custom.setWarnaKotak(Color.GREEN);
        custom.setWarnaTulisan(Color.YELLOW);
        custom.setTulisan("Contoh Custom View");

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                custom.setWarnaKotak(Color.BLUE);
                custom.setWarnaTulisan(Color.WHITE);
                custom.setTulisan("Custom View Berubah");
            }
        });

        return view;
    }

}
