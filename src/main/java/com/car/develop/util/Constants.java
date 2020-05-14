package com.car.develop.util;

/**
 * @author jianglong
 * @date 2020/2/6 11:48
 **/
public class Constants {
    public interface StatusCode {
        String SUCCESS="000000";//全部成功
//        String USER_NOT_FOUND="000001";
        String SYSTEM_EXCEPTION="999999";
//        String NO_AUTH="000002";

        //注册
        String MOBIL_SIGN_IN = "000001";//手机号已注册
        String MOBIL_SIGN_NO = "000007";//手机号未注册
        String REGISTER_NO = "000004";//注册失败

        String RESET_PASSWORD_FAIL ="000008";
        String RESET_GESTRUEPASSWORD_FAIL="000009";
        String SAFECODE_NOTMACHE = "000010";

        //验证码
        String AUTH_CODE_NO = "000002";//验证码获取失败
        String VERIFY_NO = "000003";//验证码验证失败

        //登录
        String LOGIN_NO = "000005";//登录失败
        String SHOW_USER_NO = "000006";//显示用户名称失败

        //开户绑卡
        String ACCOUNT_YES = "000101";//已开户
        String ACCOUNT_NO = "000100";//未开户
        String ACCOUNT_FAILED = "000102";//开户失败
        String ID_AND_NAME_NO = "000103";//身份证号与姓名匹配失败
        String TIED_CARD_NO = "000110";//未绑卡
        String TIED_CARD_YES = "000113";//已绑卡
        String TIED_CARD_FAILED = "000105";//绑卡失败
        String NO_NAME = "000108";//绑卡失败,姓名不存在
        String NO_IDCARD = "000109";//绑卡失败，身份证号错误
        String NO_BANK = "000118";//绑卡失败，银行卡号错误
        String NO_MOBILE = "000111";//绑卡失败，手机号错误
        String BANK_IN_EXIST = "000112";//绑卡失败，银行卡已绑定
        String DEFAULT_BANK_NO = "000106";//解绑失败
        String ALREADY_BANK_NO = "000107";//已绑卡号显示失败
        String CHANGE_PASSWORD_NO = "000104";//修改交易密码失败
        //充值提现
        String TOP_UP_NO = "000201";//充值失败
        String PHONE_CARDS_MONEY_LACK = "000202";//充值所选银行卡金额不足
        String TOP_UP_MONEY_EXCEED = "000203";//充值金额超过每日最大额度
        String KITING_NO = "000204";//提现失败
        String ACCOUNT_BALANCE_LACK = "000205";//账户余额不足
        String KITING_MONEY_EXCEED = "000206";//提现金额超过每日最大金额
        String DEAL_PASSWORD = "000116";
        //转账
        String AUTOPAY_NO = "000207";//转账失败
        String BANK_BALANCE_LACK = "000208";//银行卡余额不足
        String AUTOPAY_MONEY_EXCEED = "000209";//转账金额超过每日最大限额
        String PAYEE_BANK_NONENTITY = "000210";//收款人卡号不存在
        String PAYEE_BANK_EXIST = "000212";//收款人卡号存在
        String PAYEE_NAME_BANK_NO = "000211";//收款人姓名和卡号不匹配
        String PAYEE_NAME_BANK_YES = "000213";//收款人姓名和卡号匹配

        //交易记录
        String TRADING_RECORD_SHOW_NO = "000301";//交易记录显示失败
        String NONE_TRADING_RECORD = "000302";//暂无交易记录

        //申购赎回
        String SHOW_MONEY_NO = "000303";//显示可用余额失败
        String PRODUCT_DISPLAY_NO = "000401";//产品清单显示失败
        String NONE_PRODUCT = "000402";//暂无产品
        String PRODUCT_DETAILS_NO = "000403";//产品详情显示失败
        String PURCHASE_NO = "000404";//申购失败
        String PURCHASE_MONEY_NO = "000405";//起购金额不足
        String ACCOUNT_MONEY_NO = "000406";//账户余额不足，请充值
        String PRODUCT_LIMIT_NO = "000407";//产品额度不足，请降低购入额度
        String PURCHASE_PRODUCT_DISPLAY_NO = "000408";//已购产品清单显示失败
        String RANSOM_NO = "000409";//赎回失败
        String TOP_UP_MONEY = "000410";//超出限额
        String DIE_PRODUCT = "000111";//死期产品无法赎回
        String PASSWORD_ERROR = "000412";//交易密码错误
        String NO_PRODUCT = "000413";//产品余量不足

        String NO_AUTH ="000500";//没有权限

    }
}
