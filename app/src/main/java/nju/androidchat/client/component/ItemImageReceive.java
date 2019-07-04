package nju.androidchat.client.component;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.annotation.StyleableRes;

import java.util.UUID;

import nju.androidchat.client.R;


public class ItemImageReceive extends LinearLayout {


    @StyleableRes
    int index0 = 0;

    private ImageView imageView;
    private Context context;
    private UUID messageId;
    private OnRecallMessageRequested onRecallMessageRequested;
    private String url;


    public ItemImageReceive(Context context, String url, UUID messageId) {
        super(context);
        this.context = context;
        inflate(context, R.layout.item_img_receive, this);
        this.imageView = findViewById(R.id.chat_item_content_img);
        this.messageId = messageId;
        setImgURL(url);
    }

    public void init(Context context) {

    }

    public String getURL() {
        return this.url;
    }

    public void setImgURL(String URL) {
        this.url = URL;
        setURLimage(URL);
    }

    public void setURLimage(String url) {
        Glide.with(context).load(url).into(this.imageView);
    }
}
