package com.prabs.travelasha;

import android.content.Context;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class MyMovieAdapter extends RecyclerView.Adapter<MyMovieAdapter.ViewHolder> {

    MyMovieData[] myMovieData;
    Context context;


    public MyMovieAdapter(MyMovieData[] myMovieData,DestinationActivity activity) {
        this.myMovieData = myMovieData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final MyMovieData myMovieDataList = myMovieData[position];
         holder.destName.setText(myMovieDataList.getMovieName());
        holder.destDesc.setText(myMovieDataList.getMovieDate());

//        if(myMovieDataList.getMovieImage() == 0){
//
//            Log.d("img","img1");
//       //     holder.img1.setImageResource(R.mipmap.ic_launcher);
//        //   holder.img2.setImageResource(R.mipmap.ic_launcher);
////            holder.img1.setScaleX(0.0f);
////            holder.img1.setScaleY(0.0f);
////            holder.img2.setScaleX(0.0f);
////            holder.img2.setScaleY(0.0f);
//           // holder.img1.setLayoutParams();
//            //holder.img2.setLayoutParams(new ViewGroup.LayoutParams(10, 10));
//
//            ConstraintLayout.LayoutParams lp = (ConstraintLayout.LayoutParams) holder.img1.getLayoutParams();
//            lp.height = 1;
//            holder.img1.setLayoutParams(lp);
//            ConstraintLayout.LayoutParams lp2 = (ConstraintLayout.LayoutParams) holder.img2.getLayoutParams();
//            lp2.height = 1;
//            holder.img2.setLayoutParams(lp2);
//
//
//        }else {
//            Log.d("img", "imgNO");
//
//        }

        holder.img1.setImageResource(myMovieDataList.getMovieImage());
        holder.img2.setImageResource(myMovieDataList.getMovieImage2());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myMovieDataList.getMovieName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myMovieData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img1;
        ImageView img2;
        TextView destName;
        TextView destDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img1 = itemView.findViewById(R.id.img1);
            img2 = itemView.findViewById(R.id.img2);
            destName = itemView.findViewById(R.id.destName);
            destDesc = itemView.findViewById(R.id.destDesc);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                destDesc.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            }

        }
    }

}
