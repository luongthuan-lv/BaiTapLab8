package vn.edu.poly.baitaplab8;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class pictureAdapter extends RecyclerView.Adapter<PictureHolder> {
    ArrayList<Picture> pictureArrayList;
    Context context;

    public pictureAdapter(ArrayList<Picture> pictureArrayList, Context context) {
        this.pictureArrayList = pictureArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public PictureHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.item_picture,viewGroup,false);
        PictureHolder pictureHolder=new PictureHolder(view);
        return pictureHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PictureHolder pictureHolder, final int position) {
     pictureHolder.imgPicture.setImageResource(pictureArrayList.get(position).getImage());
     pictureHolder.tvText.setText(pictureArrayList.get(position).getText());
     pictureHolder.imgItem1.setImageResource(pictureArrayList.get(position).getItem1());
        pictureHolder.imgItem2.setImageResource(pictureArrayList.get(position).getItem2());
        pictureHolder.imgItem3.setImageResource(pictureArrayList.get(position).getItem3());


        pictureHolder.imgItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Delete",Toast.LENGTH_SHORT).show();
            }
        });

        pictureHolder.imgItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Share",Toast.LENGTH_SHORT).show();
            }
        });

        pictureHolder.imgItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Like",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return pictureArrayList.size();
    }

    public void RemoveItem(int position){
        pictureArrayList.remove(position);
        notifyItemChanged(position);
    }
}
