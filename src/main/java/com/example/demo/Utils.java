package com.example.demo;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.util.JdbcConstants;

public class Utils {

	public static void main(String[] args) {
		String str = "select * from user_daily_health_info where user_account_uid = #{userAccountUid} "
				+ "and target_date between #{startDate} and #{endDate}";
		str.replace("\"|+|\\n|\n", "");
		
		String result = SQLUtils.format(str, JdbcConstants.MYSQL);
		System.out.println(result);
	}
}
