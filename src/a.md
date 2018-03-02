# 查询首页交易数据
> 创建人员：**路飞**  
> 创建时间：2018-02-02     
> 最后一次修改人员：**路飞**

## 接口简介
查询首页交易数据

## 接口详情

### 请求地址
host/gateway.htm?command=appv4_index_data_summary

### 请求类型
Get

### 请求参数

| 参数名 | 类型 | 必填 | 取值范围 | 默认值 | 描述 |
| ---   | :---: | :---: | --- | --- |---|
| command | String | 是 |  |appv4_index_data_summary  |请求command|

### 返回正确JSON示例
```json
{
  "result":{
    "success":true
  },
  "data":{
    "stat":{
      "totalTradeAmt":"10000"  /*今日当前交易总额*/
      ,"curTradeInfo":{
        "curTradeAmt":"1000" /*当前整点的交易额*/
        ,"tradeAmtPct":-1.56  /*今日当前时间点交易额同比昨日升降百分比 ,通过正负号判断升降*/  
      }
      ,"summary":[/*首页的三个统计数据*/
        {
          "name":"交易笔数"
          ,"value":"1000"
        }
      ]
      ,"todayTradeTrend":[/*今日交易曲线数据*/ 
         {
           "value":"1000"       /*今日当前整点数交易额*/ 
           ,"time":24            /*今日当前整点数*/
         }
       ]
      ,"yesterdayTradeTrend":[/*昨日交易曲线数据*/ 
        {
          "value":"1500"         /*昨日当前整点数交易额*/ 
          ,"time":18              /*昨日当前整点数*/   
        }
      ]
    }
    ,"notices":[
      {
        "content":"这是通知内容"
        ,"targetUrl":"这是通知的目标url"
      }
    ]
    ,"news":[
      {
        "imgUrl":"这是资讯图片url"
        ,"targetUrl":"这是资讯的目标链接"
      }
    ]
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
