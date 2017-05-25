package com.example.silan.clockalarm;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView clockView;
    private TextView musicView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        clockView = (TextView) itemView.findViewById(R.id.clock);
        musicView = (TextView) itemView.findViewById(R.id.music);
    }

    public void bind(ModelItem modelItem) {
        clockView.setText(modelItem.getClockTimeFormat());
        musicView.setText(modelItem.getNameMusic());
    }
}
