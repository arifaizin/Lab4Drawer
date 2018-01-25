package id.co.imastudio.lesson4drawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {


    public GalleryFragment() {
        // Required empty public constructor
    }

    Button btnFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_gallery, container, false);
        btnFragment = fragmentView.findViewById(R.id.btn_fragment);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Context di Fragment --> getActivity()", Toast.LENGTH_SHORT).show();
            }
        });
        return fragmentView;
    }

    // 1 Harus buat variabel view-nya
    // 2 Context --> getActivity()
}
