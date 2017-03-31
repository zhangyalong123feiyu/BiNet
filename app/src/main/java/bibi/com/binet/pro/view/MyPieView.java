package bibi.com.binet.pro.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import bibi.com.binet.R;

/**
 * Created by bibinet on 2017-2-21.
 */
public class MyPieView extends View {
    private Paint paintcan;
    private Paint paintused;
    private float bigRadus=100;
    private float smallRadus=80;
    /**
     * 饼图所占矩形区域（不包括文字）
     */
    private RectF BigChartCircleRectF = new RectF();
    private RectF SmallChartCircleRectF = new RectF();
    public MyPieView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
        initView();
    }


    public MyPieView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initView();
    }

    public MyPieView(Context context) {
        super(context);
        initView();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    canvas.drawArc(BigChartCircleRectF,0,270,true,paintcan);
    canvas.drawArc(SmallChartCircleRectF,270,360,true,paintcan);

    }

    private void init(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArray=getContext().obtainStyledAttributes(attrs, R.styleable.MyPieView,defStyleAttr,0);
        bigRadus=typedArray.getDimension(R.styleable.MyPieView_bigCircleRadus,bigRadus);
        smallRadus=typedArray.getDimension(R.styleable.MyPieView_smallCircleRadus,smallRadus);
        typedArray.recycle();
    }

    private void initView() {
        paintcan = new Paint();
        paintcan.setARGB(9, 158, 79, 3);
        paintcan.setStyle(Paint.Style.FILL);
        paintcan.setAntiAlias(true);
        paintused = new Paint();
        paintused.setARGB(254, 176, 204, -15);
        paintused.setStyle(Paint.Style.FILL);
        paintused.setAntiAlias(true);
    }
    /**
     * 设置饼状图的半径
     *
     * @param pieChartCircleRadius 饼状图的半径（px）
     */
    public void setPieChartCircleRadius(int pieChartCircleRadius) {

        this.bigRadus = pieChartCircleRadius;

        invalidate();
    }
    private void initBigCircleRectF() {
        BigChartCircleRectF.left = getWidth() / 2 - bigRadus;
        BigChartCircleRectF.top = getHeight() / 2 - bigRadus;
        BigChartCircleRectF.right = BigChartCircleRectF.left + bigRadus * 2;
        BigChartCircleRectF.bottom = BigChartCircleRectF.top + bigRadus * 2;
    }
    private void initSmallCircleRectF() {
        SmallChartCircleRectF.left = getWidth() / 2 - bigRadus;
        SmallChartCircleRectF.top = getHeight() / 2 - bigRadus;
        SmallChartCircleRectF.right = SmallChartCircleRectF.left + smallRadus * 2;
        SmallChartCircleRectF.bottom = SmallChartCircleRectF.top + smallRadus * 2;
    }
    public static class MypieViewHolder {
        private float startAgle;
        private float sweepAgle;

    }
}
