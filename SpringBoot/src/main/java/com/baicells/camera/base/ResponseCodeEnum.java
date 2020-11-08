package com.baicells.camera.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author jincheng
 * @version 1.0
 * @date 2020/3/24 20:58
 */

@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseCodeEnum {

    SUCCESS("操作成功", 200),
    CODE_IS_NULL("code为空", -100100),
    USER_IS_NULL("用户不存在", -100101),
    FAIL("操作失败", -100102),
    SYSTEM_BUSY("微信系统繁忙", -1),
    CODE_IS_INVALID("code无效", -40029),
    FREQUENCY_LIMIT("频率限制,请一分钟之后再试", -45011),
    USER_ID_IS_NULL("用户id为空", -100103),
    SEARCH_IS_NULL("搜索内容不能为空", -100104),
    BANNER_POSITION_IS_NOT_NULL("搜索banner位置不能为空", -100105),
    PARAM_IS_ERROR("参数不正确", -100106),
    CONTENT_IS_NULL("内容已下架", -100107),
    ORDER_IS_NULL("查询不到该订单", -100108),
    ORDER_START_IS_ERROR("订单状态不正确", -100109),
    ORDER_IS_PAY("订单已支付,无需重复确认",-100123),
    QUALITY_NOT_REFUND("优享订单不支持退款操作", -100110),
    AWAITING_AUDIT("申请成功,等待审核", 200),
    CODE_TYPE_ERROR("验证码类型错误", -100111),
    SEND_CODE_FAIL("发送验证码失败", -100112),
    NOT_STORE_BUSINESS("还未收藏该商家", -100113),
    IS_STORE_BUSINESS("已收藏过该商家了", -100114),
    NOT_STORE_PRODUCT("暂未收藏该产品", -100115),
    IS_STORE_PRODUCT("已收藏过该产品", -100116),
    CODE_BEEN_USED("code已被使用过",-100117),
    SHARE_USER_IS_ENOUGH("推荐分享用户不够,暂未拥有领取会员资格",-100118),
    USER_IS_NOT_BING_MOBILE("未绑定手机号",-100119),
    WECHAT_PAY_FAIL("微信支付失败",-100120),
    XML_DATA_INCORRECTNESS("xml数据格式不正确",-100121),
    IS_FANS_MEMBER("已经领取过会员了",-100122),
    ORDER_IS_ASSESS("该订单已评价过,无需重复评价",-100123),
    WECHAT_REFUND_FAIL("微信退款失败",-100124),
    WECHAT_BUSINESS_PAY_FAIL("微信企业付款失败",-100125),
    VALIDATE_CODE_IS_NULL("验证码不存在,请重新发送验证码",-100126)
    ;

    private String message;

    private Integer code;
}
