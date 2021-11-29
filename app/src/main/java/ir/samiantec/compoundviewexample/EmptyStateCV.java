package ir.samiantec.compoundviewexample;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EmptyStateCV extends LinearLayout {

    private OnClickListener onClickListener;

    private TextView tv;

    public EmptyStateCV(Context context) {
        this(context, null);
    }

    public EmptyStateCV(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EmptyStateCV(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EmptyStateCV(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    private void init() {
        inflate(getContext(), R.layout.cv, this);
        tv = (TextView) findViewById(R.id.tv);

        tv.setOnClickListener(view -> {
            if (onClickListener != null)
                onClickListener.onClick();
        });
    }

    public void setText(String text) {
        tv.setText(text);
    }

    interface OnClickListener {
        void onClick();
    }

}