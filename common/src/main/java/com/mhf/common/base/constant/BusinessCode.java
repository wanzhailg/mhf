package com.mhf.common.base.constant;

import java.text.MessageFormat;

public enum BusinessCode {

	/*****************************************************************/
	// 标准回复

	/**
	 * 成功
	 */
	C0("C0", "成功"),

	/*****************************************************************/
	// 参数校验

	/**
	 * 参数不能为空
	 */
	C9000("C9000", "参数不能为空"),
	/**
	 * 参数不能为负数
	 */
	C9001("C9001", "参数不能为负数"),

	/*****************************************************************/
	// 异常回复

	/**
	 * 操作过于频繁。ip:{0}, uri:{1}, count:{2}, limit:{3}, expire:{4}
	 */
	C9994("C9994", "操作过于频繁。ip:{0}, uri:{1}, count:{2}, limit:{3}, expire:{4}"),
	/**
	 * 数据库操作异常（请求数据内容不正确）
	 */
	C9995("C9995", "数据库操作异常"),
	/**
	 * 查询表单流水号出错:{0}
	 */
	C9996("C9996", "查询表单流水号出错:{0}"),
	/**
	 * 数据已经过期，请重新刷新。class:{0}, id:{1}（更新数据时加入乐观锁）
	 */
	C9997("C9997", "数据已经过期，请重新刷新。class:{0}, id:{1}"),
	/**
	 * 请求数据异常（nullpointer，请求数据格式不正确）
	 */
	C9998("C9998", "请求数据异常"),
	/**
	 * 失败
	 */
	C9999("C9999", "失败"),

	/*****************************************************************/
	// 用户权限

	/**
	 * 用户登录token验证出错
	 */
	C0001("C0001", "用户token验证出错"),
	/**
	 * 用户token过期
	 */
	C0002("C0002", "用户token过期"),
	/**
	 * 用户token不能为空
	 */
	C0003("C0003", "用户token不能为空"),
	/**
	 * 用户login不能为空
	 */
	C0004("C0004", "用户login不能为空"),
	/**
	 * 用户login和token不匹配
	 */
	C0005("C0005", "用户login和token不匹配"),
	/**
	 * 用户类型不匹配
	 */
	C0006("C0006", "用户类型不匹配"),

	/*****************************************************************/
	// 验证码

	/**
	 * 验证码keyword不能为空
	 */
	C0100("C0100", "验证码keyword不能为空"),
	/**
	 * 验证码key不能为空
	 */
	C0101("C0101", "验证码key不能为空"),
	/**
	 * 验证码不正确{0}
	 */
	C0102("C0102", "验证码不正确{0}"),

	/*****************************************************************/
	// 注册/登陆/修改密码

	/**
	 * 手机号:{0}已存在
	 */
	C0200("C0200", "手机号:{0}已存在"),
	/**
	 * 邮箱:{0}已存在
	 */
	C0201("C0201", "邮箱:{0}已存在"),
	/**
	 * 用户名错误
	 */
	C0202("C0202", "用户名或者密码错误"),
	/**
	 * 用户名或者密码错误
	 */
	C0203("C0203", "用户名或者密码错误"),
	/**
	 * 手机号:{0}不存在
	 */
	C0204("C0204", "手机号:{0}不存在"),
	/**
	 * 邮箱:{0}不存在
	 */
	C0205("C0205", "邮箱:{0}不存在"),
	/**
	 * 用户:{0}不存在
	 */
	C0206("C0206", "用户:{0}不存在"),
	/**
	 * 证件:{0}已存在
	 */
	C0207("C0207", "证件:{0}已存在"),
	/**
	 * 证件:{0}不存在
	 */
	C0208("C0208", "证件:{0}不存在"),

	/*****************************************************************/
	// 商户信息校验

	/**
	 * 没有查询到相关信息。uri:{0}
	 */
	C0300("C0300", "没有查询到相关信息。uri:{0}"),
	/**
	 * 商户不处于开业状态。tianyanchaId:{0}, regStatus:{1}
	 */
	C0301("C0301", "商户不处于开业状态。tianyanchaId:{0}, regStatus:{1}"),
	/**
	 * 统一信用代码和商户名称不匹配。uscc:{0}, name:{1}
	 */
	C0302("C0302", "统一信用代码和商户名称不匹配。uscc:{0}, name:{1}"),

	/*****************************************************************/
	// 工具类

	/**
	 * 时间转换错误:{0}
	 */
	C1000("C1000", "时间转换错误:{0}"),

	/*****************************************************************/
	// 文件上传下载

	/**
	 * 获取文件流失败:{0}
	 */
	C1100("C1100", "获取文件流失败:{0}"),
	/**
	 * 获取指定文件失败，指定文件不存在:{0}
	 */
	C1101("C1101", "获取指定文件失败，指定文件不存在:{0}"),
	/**
	 * 指定key过期或不存在:{0}
	 */
	C1102("C1102", "指定key过期或不存在:{0}"),
	/**
	 * 文件key不能为空
	 */
	C1103("C1103", "文件key不能为空"),
	/**
	 * 文件原始名称编码转换失败。originalFilename:{0}
	 */
	C1104("C1104", "文件原始名称编码转换失败。originalFilename:{0}"),

	/*****************************************************************/
	// 模板

	/**
	 * freemarker模板生成异常
	 */
	C1200("C1200", "freemarker模板生成异常"),

	/*****************************************************************/
	// 存储（MS）

	/**
	 * 初始化容器失败:{0}
	 */
	C2000("C2000", "初始化容器失败:{0}"),
	/**
	 * 设置权限失败:{0}
	 */
	C2001("C2001", "设置权限失败:{0}"),
	/**
	 * 容器:{0}，上传失败:{1}
	 */
	C2002("C2002", "容器:{0}，上传失败:{1}"),
	/**
	 * 容器:{0}，下载失败:{1}
	 */
	C2003("C2003", "容器:{0}，下载失败:{1}"),
	/**
	 * 容器:{0}，删除失败:{1}
	 */
	C2004("C2004", "容器:{0}，删除失败:{1}"),
	/**
	 * 删除容器失败:{0}
	 */
	C2005("C2005", "删除容器失败:{0}"),

	/*****************************************************************/
	// 存储（HD）
	/**
	 * 初始化文件访问接口失败
	 */
	C2100("C2100", "初始化文件访问接口失败"),

	/*****************************************************************/
	// 品牌

	/**
	 * 品牌状态不正确。brandCode:{0}, status:{1}
	 */
	C5000("C5000", "品牌状态不正确。brandCode:{0}, status:{1}"),
	/**
	 * 品牌不处于可以更新的状态。brandCode:{0}, status:{1}
	 */
	C5001("C5001", "品牌不处于可以更新的状态。brandCode:{0}, status:{1}"),
	/**
	 * 品牌已经存在。name:{0}
	 */
	C5002("C5002", "品牌已经存在。name:{0}"),
	/**
	 * 品牌和商户已经绑定。merchantCode:{0}, brandCode:{1}
	 */
	C5003("C5003", "品牌和商户已经绑定。merchantCode:{0}, brandCode:{1}"),
	/**
	 * 品牌信息不存在。brandCode:{0}
	 */
	C5004("C5004", "品牌信息不存在。brandCode:{0}"),

	/*****************************************************************/
	// 关注

	/**
	 * 用户和商铺已经绑定。userCode:{0}, shopCode:{1}
	 */
	C5100("C5100", "用户和商铺已经绑定。userCode:{0}, shopCode:{1}"),

	/*****************************************************************/
	// 商户

	/**
	 * 商户信息不存在。merchantCode:{0}
	 */
	C5200("C5200", "商户信息不存在。merchantCode:{0}"),

	/*****************************************************************/
	// 商铺

	/**
	 * 商铺信息不存在。shopCode:{0}
	 */
	C5300("C5300", "商铺信息不存在。shopCode:{0}"),

	/*****************************************************************/
	// 出价

	/**
	 * 出价信息不存在。bidCode:{0}
	 */
	C6000("C6000", "出价信息不存在。bidCode:{0}"),
	/**
	 * 合同信息不存在。bidCode:{0}
	 */
	C6001("C6001", "合同信息不存在。bidCode:{0}"),
	/**
	 * 预览key不能为空
	 */
	C6002("C6002", "预览key不能为空"),
	/**
	 * 指定key过期或不存在:{0}
	 */
	C6003("C6003", "指定key过期或不存在:{0}"),
	/**
	 * 商铺信息不匹配。{0}:{1}
	 */
	C6004("C6004", "商铺信息不匹配。{0}:{1}"),
	/**
	 * 用户信息不匹配。{0}:{1}
	 */
	C6005("C6005", "用户信息不匹配。{0}:{1}"),
	/**
	 * 出价明细不能为空
	 */
	C6006("C6005", "出价明细不能为空"),

	/*****************************************************************/
	// 出价保存校验

	/**
	 * 起租日期必须大于等于当日。起租日期:{0}, 当日:{1}
	 */
	C6100("C6100", "起租日期必须大于等于当日。起租日期:{0}, 当日:{1}"),
	/**
	 * 起租日期必须大于等于最早可入住日期。起租日期:{0}, 最早可入住日期:{1}
	 */
	C6101("C6101", "起租日期必须大于等于最早可入住日期。起租日期:{0}, 最早可入住日期:{1}"),
	/**
	 * 起租日期必须小于等于终止日期。起租日期:{0}, 终止日期:{1}
	 */
	C6102("C6102", "起租日期必须小于等于终止日期。起租日期:{0}, 终止日期:{1}"),
	/**
	 * 开始日期必须大于等于起租日期。开始日期:{0}, 起租日期:{1}
	 */
	C6103("C6103", "开始日期必须大于等于起租日期。开始日期:{0}, 起租日期:{1}"),
	/**
	 * 结束日期必须小于等于终止日期。结束日期:{0}, 终止日期:{1}
	 */
	C6104("C6104", "结束日期必须小于等于终止日期。结束日期:{0}, 终止日期:{1}"),
	/**
	 * 开始日期必须小于等于结束日期。开始日期:{0}, 结束日期:{1}
	 */
	C6105("C6105", "开始日期必须小于等于结束日期。开始日期:{0}, 结束日期:{1}"),

	/*****************************************************************/
	// 交互-商户 -- 目前不使用该接口

	/**
	 * 操作码不正确:{0}
	 */
	C11000("C11000", "操作码不正确:{0}"),

	/*****************************************************************/
	// 交互-品牌 -- 目前不使用该接口

	/**
	 * 操作码不正确:{0}
	 */
	C11100("C11100", "操作码不正确:{0}"),

	/*****************************************************************/
	// 交互-出价

	/**
	 * 审批通过的出价过期日期不能为空。billNumber:{0}
	 */
	C11200("C11200", "审批通过的出价过期日期不能为空。billNumber:{0}"),
	/**
	 * 审批结果参数不正确。billNumber:{0}, isApprove:{1}
	 */
	C11201("C11201", "审批结果参数不正确。billNumber:{0}, isApprove:{1}"),
	/**
	 * 是否生效参数不正确。billNumber:{0}, isEffect:{1}
	 */
	C11202("C11202", "是否生效参数不正确。billNumber:{0}, isEffect:{1}"),
	/**
	 * 出价不存在。billNumber:{0}
	 */
	C11203("C11203", "出价不存在。billNumber:{0}"),

	/*****************************************************************/
	// 交互-海鼎-api

	/**
	 * 操作结果不正确:{0}
	 */
	C12000("C12000", "操作结果不正确:{0}")

	;
	private String code;

	private String message;

	private BusinessCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageFormat(Object[] objArr) {
		Object[] temp = new Object[objArr.length];
		for (int i = 0; i < objArr.length; i++) {
			// 因为坑爹的MessageFormat会自动格式化数字，所以转成String不格式化
			if (objArr[i] instanceof Integer || objArr[i] instanceof Long) {
				temp[i] = String.valueOf(objArr[i]);
			} else {
				temp[i] = objArr[i];
			}
		}
		return MessageFormat.format(this.message, temp);
	}

}
