package co.buckets.modules.dnd;

import android.view.View;

import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;


public class RNDragNDropManager extends ViewGroupManager<RNCardView> {

    @Override
    public String getName() {
        return "RNDnDView";
    }

    @Override
    public RNDnDView createViewInstance(ThemedReactContext reactContext) {
        RNDnDView dndView = new RNDnDView(reactContext);
        ReactViewGroup reactViewGroup = new ReactViewGroup(reactContext);
        dndView.addView(reactViewGroup);
        return dndView;
    }

    @Override
    public View getChildAt(RNDnDView parent, int index) {
        View content = parent.getChildAt(0);
        if (content != null && content instanceof ReactViewGroup) {
            return ((ReactViewGroup) content).getChildAt(index);
        }
        return null;
    }

    @Override
    public int getChildCount(RNDnDView parent) {
        View content = parent.getChildAt(0);
        if (content != null && content instanceof ReactViewGroup) {
            return ((ReactViewGroup) content).getChildCount();
        }
        return 0;
    }

    @Override
    public void addView(RNDnDView parent, View child, int index) {
        View content = parent.getChildAt(0);
        if (content != null && content instanceof ReactViewGroup) {
            ((ReactViewGroup) content).addView(child, index);
        }
    }

    @Override
    public void removeViewAt(RNDnDView parent, int index) {
        View content = parent.getChildAt(0);
        if (content != null && content instanceof ReactViewGroup) {
            ((ReactViewGroup) content).removeViewAt(index);
        }
    }

    @Override
    public void removeAllViews(RNDnDView parent) {
        View content = parent.getChildAt(0);
        if (content != null && content instanceof ReactViewGroup) {
            ((ReactViewGroup) content).removeAllViews();
        }
    }
}
