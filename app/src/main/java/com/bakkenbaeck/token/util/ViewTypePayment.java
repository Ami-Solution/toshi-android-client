package com.bakkenbaeck.token.util;

import android.support.annotation.IntDef;

public class ViewTypePayment {
    @IntDef({
            TYPE_SEND,
            TYPE_REQUEST,
    })
    public @interface ViewType {}
    public static final int TYPE_SEND = 1;
    public static final int TYPE_REQUEST = 2;
}