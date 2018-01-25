package id.co.imastudio.lesson4drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by idn on 1/23/2018.
 */

public class CustomView extends View {
    private int warnaKotak, warnaTulisan;
    private  String tulisan;

    private Paint paintKotak;


    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        paintKotak = new Paint();
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CustomView,
                0, 0
        );

        warnaKotak = typedArray.getInt(R.styleable.CustomView_warnaKotak, 0);
        warnaTulisan = typedArray.getInt(R.styleable.CustomView_warnaTulisan, 0);
        tulisan = typedArray.getString(R.styleable.CustomView_tulisan);

        typedArray.recycle();
    }

    public int getWarnaKotak() {
        return warnaKotak;
    }

    public void setWarnaKotak(int warnaKotak) {
        this.warnaKotak = warnaKotak;
        invalidate();
        requestLayout();
    }

    public int getWarnaTulisan() {
        return warnaTulisan;
    }

    public void setWarnaTulisan(int warnaTulisan) {
        this.warnaTulisan = warnaTulisan;
        invalidate();
        requestLayout();
    }

    public String getTulisan() {
        return tulisan;
    }

    public void setTulisan(String tulisan) {
        this.tulisan = tulisan;
        invalidate();
        requestLayout();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (!isInEditMode()){
            paintKotak.setStyle(Paint.Style.FILL);
            paintKotak.setAntiAlias(true);

            paintKotak.setColor(warnaKotak);

            canvas.drawRect(0, 0, this.getMeasuredWidth(), getMeasuredHeight(), paintKotak);


            paintKotak.setColor(warnaTulisan);
            paintKotak.setTextAlign(Paint.Align.CENTER);
            paintKotak.setTextSize(50);

            canvas.drawText(
                    tulisan,
                    this.getMeasuredWidth()/2,
                    this.getMeasuredHeight()/2,
                    paintKotak);
        }
    }
}
