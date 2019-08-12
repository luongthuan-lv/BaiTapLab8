package vn.edu.poly.baitaplab8;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

class PictureHolder extends RecyclerView.ViewHolder {

    ImageView imgPicture;
    TextView tvText;
    ImageView imgItem1,imgItem2,imgItem3;
    public PictureHolder(@NonNull View itemView) {
        super(itemView);
        imgPicture=itemView.findViewById(R.id.imgPicture);
        tvText=itemView.findViewById(R.id.tvText);
        imgItem1=itemView.findViewById(R.id.imgItem1);
        imgItem2=itemView.findViewById(R.id.imgItem2);
        imgItem3=itemView.findViewById(R.id.imgItem3);





    }
}
