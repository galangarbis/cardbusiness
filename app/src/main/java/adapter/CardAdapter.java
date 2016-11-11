package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.galsdev.cardbusiness.R;
import com.example.galsdev.cardbusiness.list_card;

/**
 * Created by galsdev on 11/11/2016.
 */

public class CardAdapter extends BaseAdapter {
    String [] result;
    String [] result1;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;

    public CardAdapter (list_card mainActivity, String[] prgmNameList,String [] prgmCompany,int [] prgmImages){
        result=prgmNameList;
        result=prgmCompany;
        context=mainActivity;
        imageId=prgmImages;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return result.length;
    }

    @Override
    public Object getItem(int position){
        return position;
    }

    public class Holder {
        TextView tv,company;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.activity_main, null);
        holder.tv=(TextView) rowView.findViewById(R.id.);

    }
}
