package com.example.recyclerviewtutorial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter {


    List<SimpleViewModel> modelData;

    public SimpleAdapter(List<SimpleViewModel> generateSimpleList) {
        this.modelData = generateSimpleList;
    }

    public class SimpleViewHolder extends RecyclerView.ViewHolder {

        private TextView simpleTextView;

        public SimpleViewHolder(View itemView) {
            super(itemView);
            simpleTextView = itemView.findViewById(R.id.simple_text);
        }

        public void binData(final SimpleViewModel viewModel){
            simpleTextView.setText(viewModel.getSimpleText());
        }
    }


    @Override
    public SimpleViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.item_simple_itemview;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ((SimpleViewHolder) holder).binData(modelData.get(position));
    }

    @Override
    public int getItemCount() {
        return modelData.size();
    }
}
