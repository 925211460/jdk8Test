# 查询"我的"tab信息接口
> 创建人员：**路飞**  
> 创建时间：2018-02-05     
> 最后一次修改人员：**路飞**

## 接口简介
查询"我的"tab信息接口

### 请求地址


### 请求类型
Get

### 请求参数

| 参数名 | 类型 | 必填 | 取值范围 | 默认值 | 描述 |
| ---   | :---: | :---: | --- | --- |---|
| merchantUserId | String | 是 |  ||商户userId|


### 返回正确JSON示例
```json
{
  "result":{
    "success":true
    ,"errorCode": "100000"
    ,"errorMsg": "系统错误"
  },
  "data":{    
    "storeCount":10      /*门店数*/
    ,"operatorCount":10  /*收银员数*/
    ,"goodsCount":10     /*商品数*/
  }
}
```
### 返回异常状态码
```
	{
	    "result": {
	        "success": false,
	        "errorCode": "100000",
	        "errorMsg": "系统错误"
	    }
	}
``` 
### 备注说明
无

### 修改日志


