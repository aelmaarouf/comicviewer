package comicviewer.tools.display;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ComicView extends Activity  {
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comicview);
        
        
        Gallery g = (Gallery) findViewById(R.id.gallery1);
        g.setSpacing(2);
        g.setAdapter(new ImageAdapter(this));
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/
    
    public class ImageAdapter extends BaseAdapter {
   	 
        public ImageAdapter(Context c) {
            mContext = c;
        }
 
        public int getCount() {
            return mImageIds.length;
        }
 
        public Object getItem(int position) {
            return position;
        }
 
        public long getItemId(int position) {
            return position;
        }
 
        public View getView(int position, View convertView, ViewGroup parent) {
 
            ImageView i = new ImageView(mContext);
 
            i.setImageResource(mImageIds[position]);
            i.setScaleType(ImageView.ScaleType.FIT_XY);
            //i.setLayoutParams(new Gallery.LayoutParams(136, 88));
            i.setLayoutParams(new Gallery.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
            return i;
        }
 
        private Context mContext;
 
        private Integer[] mImageIds = {
                R.drawable.gallery_photo_1,
                R.drawable.gallery_photo_2,
                R.drawable.gallery_photo_3,
                R.drawable.gallery_photo_4,
                R.drawable.gallery_photo_5,
                R.drawable.gallery_photo_6,
                R.drawable.gallery_photo_7,
                R.drawable.gallery_photo_8,
                R.drawable.gallery_photo_9
        };
    }

}
