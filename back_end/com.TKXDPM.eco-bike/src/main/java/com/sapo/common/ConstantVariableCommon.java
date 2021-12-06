package com.sapo.common;

public class ConstantVariableCommon {
    public static final int STATUS_VEHICLE_1 = 1;
    public static final int STATUS_VEHICLE_2 = 2;
    public static final int STATUS_VEHICLE_3 = 3;

    //Hàm chuyển status từ int sang string
    public static String statusVehicleIntToString(int status) {
        if (status == STATUS_VEHICLE_1) return "aaaaaaaa";
        if (status == STATUS_VEHICLE_2) return "bbbbbbbbbb";
        return "cccccc";
    }
}