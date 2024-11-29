package com.breezefieldflorida.features.alarm.model

import com.breezefieldflorida.base.BaseResponse

/**
 * Created by Kinsuk on 20-02-2019.
 */
class AttendanceReportDataModel : BaseResponse() {
    var attendance_report_list: ArrayList<AttendanceReport>? = null
}