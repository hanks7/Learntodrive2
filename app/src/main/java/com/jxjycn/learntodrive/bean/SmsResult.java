package com.jxjycn.learntodrive.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by liu on 15/11/19.
 */
public class SmsResult implements Parcelable {


    /**
     * status : false
     * message : 系统异常
     * data : {"validationnbr":"123456"}
     */

    private String status;
    private String message;
    /**
     * validationnbr : 123456
     */

    private DataEntity data;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity implements Parcelable {
        private String validationnbr;

        public void setValidationnbr(String validationnbr) {
            this.validationnbr = validationnbr;
        }

        public String getValidationnbr() {
            return validationnbr;
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.validationnbr);
        }

        public DataEntity() {
        }

        protected DataEntity(Parcel in) {
            this.validationnbr = in.readString();
        }

        public static final Creator<DataEntity> CREATOR = new Creator<DataEntity>() {
            public DataEntity createFromParcel(Parcel source) {
                return new DataEntity(source);
            }

            public DataEntity[] newArray(int size) {
                return new DataEntity[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.status);
        dest.writeString(this.message);
        dest.writeParcelable(this.data, 0);
    }

    public SmsResult() {
    }

    protected SmsResult(Parcel in) {
        this.status = in.readString();
        this.message = in.readString();
        this.data = in.readParcelable(DataEntity.class.getClassLoader());
    }

    public static final Creator<SmsResult> CREATOR = new Creator<SmsResult>() {
        public SmsResult createFromParcel(Parcel source) {
            return new SmsResult(source);
        }

        public SmsResult[] newArray(int size) {
            return new SmsResult[size];
        }
    };
}
