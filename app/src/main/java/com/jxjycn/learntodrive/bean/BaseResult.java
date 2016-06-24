package com.jxjycn.learntodrive.bean;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by liu on 15/9/15.
 */
public class BaseResult implements Parcelable {
    private String error;
    private String msg;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.error);
        dest.writeString(this.msg);
    }

    public BaseResult() {
    }

    protected BaseResult(Parcel in) {
        this.error = in.readString();
        this.msg = in.readString();
    }

}

