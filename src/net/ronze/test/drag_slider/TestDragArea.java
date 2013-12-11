package net.ronze.test.drag_slider;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import net.ronze.widget.DragGridView;

public class TestDragArea extends FrameLayout {
	
	private DragGridView mUpperGrid;
	private DragGridView mLowerGrid;

	public TestDragArea(Context context) {
		this(context, null);
	}

	public TestDragArea(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public TestDragArea(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}


	
}
