package com.breezefieldflorida.features.contacts

import com.breezefieldflorida.app.domain.CallHisEntity
import com.breezefieldflorida.app.domain.CompanyMasterEntity
import com.breezefieldflorida.app.domain.SourceMasterEntity
import com.breezefieldflorida.app.domain.StageMasterEntity
import com.breezefieldflorida.app.domain.StatusMasterEntity
import com.breezefieldflorida.app.domain.TeamAllListEntity
import com.breezefieldflorida.app.domain.TeamListEntity
import com.breezefieldflorida.app.domain.TypeMasterEntity
import com.breezefieldflorida.base.BaseResponse

data class ContactGr(var gr_id:String="",var gr_name:String="")
data class ContactDtls(var gr_name:String="",var contact_id:String="",var addr:String="", var name:String="", var number:String="", var isTick:Boolean = false)
data class ScheduleContactDtls(val contact_name:String="", val contact_number:String="", val contact_id:String="", var isTick:Boolean = false)

data class ContactMasterRes(var company_list:ArrayList<CompanyMasterEntity>):BaseResponse()
data class TypeMasterRes(var type_list:ArrayList<TypeMasterEntity>):BaseResponse()
data class StatusMasterRes(var status_list:ArrayList<StatusMasterEntity>):BaseResponse()
data class TeamListRes(var member_list:ArrayList<TeamListEntity>):BaseResponse()
data class TeamAllListRes(var member_list:ArrayList<TeamAllListEntity>):BaseResponse()


data class CustomData(var id:String="",var name:String="")
data class CustomDataLms(var id:String="",var name:String="",var topic_parcentage:Int=0)
data class CustomDataForAssignedto(var id:String="",var name:String="",var number:String="")

data class SourceMasterRes(var source_list:ArrayList<SourceMasterEntity>):BaseResponse()
data class StageMasterRes(var stage_list:ArrayList<StageMasterEntity>):BaseResponse()

data class CallHisDtls(var user_id:String="",var call_his_list:ArrayList<CallHisEntity> = ArrayList()) :BaseResponse()

data class CompanyReqData(var created_by:String = "",var session_token:String="",var company_name_list:ArrayList<CompanyName> = ArrayList())

data class CompanyName(var company_name:String="")

data class AutoMailDtls(var automail_sending_email:String="",var automail_sending_pass:String="",var recipient_email_ids:String=""):BaseResponse()

data class ProductDtls(var product_id:String="",var product_name:String="",var isTick:Boolean = false)

data class TargetTypeResponse(var target_type_list:ArrayList<TargetTypeDtls> = ArrayList()):BaseResponse()
data class TargetLevelResponse(var target_level_list:ArrayList<TargetTypeDtls> = ArrayList()):BaseResponse()
data class DateRangeResponse(var target_time_list:ArrayList<TargetTypeDtls> = ArrayList()):BaseResponse()

data class TargetTypeDtls(var id:Int=0,var name:String="")

data class LoanDtlsResponse(var user_id:String="",var shop_id:String="",var risk_id:String="",var risk_name:String="",
    var workable:String="",var disposition_code_id:String="",var disposition_code_name:String="",var ptp_Date:String="",
    var ptp_amt:String="",var collection_date:String="",var collection_amount:String="",var final_status_id:String="",
    var final_status_name:String="")

data class TargetAcvhResponse(var value_for:String="",var target:String="",var achv:String="",
                              var achv_list:ArrayList<TargetAcvhDtls> = ArrayList()):BaseResponse()
data class TargetAcvhDtls(var name:String="",var value:String="",var date_time:String="")

data class TargetAcvhParam(var user_id:String="",var target_type_id:String="",var target_level_id:String="",
                           var time_frame:String="",var start_date:String="",var end_date:String="")


