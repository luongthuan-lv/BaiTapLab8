package vn.edu.poly.baitaplab8;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BlankFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    public void initView(){
        RecyclerView recyclerView=getActivity().findViewById(R.id.rvPicture);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(getActivity(),linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<Picture> pictureArrayList=new ArrayList<>();
        pictureArrayList.add(new Picture(R.drawable.number,R.drawable.like,R.drawable.share,R.drawable.delete,"One"));
        pictureArrayList.add(new Picture(R.drawable.numbertwo,R.drawable.like,R.drawable.share,R.drawable.delete,"Two"));
        pictureArrayList.add(new Picture(R.drawable.numberthree,R.drawable.like,R.drawable.share,R.drawable.delete,"Three"));
        pictureArrayList.add(new Picture(R.drawable.numberfor,R.drawable.like,R.drawable.share,R.drawable.delete,"For"));

        pictureAdapter pictureAdapter=new pictureAdapter(pictureArrayList,getActivity());
        recyclerView.setAdapter(pictureAdapter);
    }
}
