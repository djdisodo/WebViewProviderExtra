package com.github.djdisodo;

import android.annotation.Nullable;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebView;

public final class WebViewPrivateAccess {
    private final WebView.PrivateAccess privateAccess;
    WebViewPrivateAccess(WebView.PrivateAccess privateAccess) {
        this.privateAccess = privateAccess;
    }

    public int super_getScrollBarStyle() {
        return privateAccess.super_getScrollBarStyle();
    }

    public void super_scrollTo(int scrollX, int scrollY) {
        privateAccess.super_scrollTo(scrollX, scrollY);
    }

    public void super_computeScroll() {
        privateAccess.super_computeScroll();
    }

    public boolean super_onHoverEvent(MotionEvent event) {
        return privateAccess.super_onHoverEvent(event);
    }

    public boolean super_performAccessibilityAction(int action, Bundle arguments) {
        return privateAccess.super_performAccessibilityAction(action, arguments);
    }

    public boolean super_performLongClick() {
        return privateAccess.super_performLongClick();
    }

    public boolean super_setFrame(int left, int top, int right, int bottom) {
        return privateAccess.super_setFrame(left, top, right, bottom);
    }

    public boolean super_dispatchKeyEvent(KeyEvent event) {
        return privateAccess.super_dispatchKeyEvent(event);
    }

    public boolean super_onGenericMotionEvent(MotionEvent event) {
        return privateAccess.super_onGenericMotionEvent(event);
    }

    public void super_setLayoutParams(ViewGroup.LayoutParams params) {
        privateAccess.super_setLayoutParams(params);
    }

    public void super_startActivityForResult(Intent intent, int requestCode) {
        privateAccess.super_startActivityForResult(intent, requestCode);
    }

    @Nullable
    public WindowInsets super_onApplyWindowInsets(@Nullable WindowInsets insets) {
        return privateAccess.super_onApplyWindowInsets(insets);
    }

    public void overScrollBy(int deltaX, int deltaY,
                             int scrollX, int scrollY,
                             int scrollRangeX, int scrollRangeY,
                             int maxOverScrollX, int maxOverScrollY,
                             boolean isTouchEvent) {
        privateAccess.overScrollBy(deltaX, deltaY,
                scrollX, scrollY,
                scrollRangeX, scrollRangeY,
                maxOverScrollX, maxOverScrollY,
                isTouchEvent
        );
    }

    public void awakenScrollBars(int duration) {
        privateAccess.awakenScrollBars(duration);
    }

    public float getVerticalScrollFactor() {
        return privateAccess.getVerticalScrollFactor();
    }

    public float getHorizontalScrollFactor() {
        return privateAccess.getHorizontalScrollFactor();
    }

    public void setMeasuredDimension(int measuredWidth, int measuredHeight) {
        privateAccess.setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public void onScrollChanged(int l, int t, int oldl, int oldt) {
        privateAccess.onScrollChanged(l, t, oldl, oldt);
    }

    public int getHorizontalScrollbarHeight() {
        return privateAccess.getHorizontalScrollbarHeight();
    }

    public void super_onDrawVerticalScrollBar(Canvas canvas, Drawable scrollBar,
                                              int l, int t, int r, int b) {
        privateAccess.super_onDrawVerticalScrollBar(canvas, scrollBar, l, t, r, b);
    }

    public void setScrollXRaw(int scrollX) {
        privateAccess.setScrollXRaw(scrollX);
    }

    public void setScrollYRaw(int scrollY) {
        privateAccess.setScrollYRaw(scrollY);
    }
}
