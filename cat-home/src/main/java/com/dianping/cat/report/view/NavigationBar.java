package com.dianping.cat.report.view;

import com.dianping.cat.report.ReportPage;
import com.site.web.mvc.Page;

public class NavigationBar {
	public Page[] getVisiblePages() {
		return new Page[] {

		ReportPage.HOME,

		ReportPage.TRANSACTION,

		ReportPage.EVENT,

		ReportPage.PROBLEM,

		ReportPage.HEARTBEAT,

		ReportPage.MATRIX,
		
		ReportPage.CROSS,
		
		ReportPage.CACHE,

		ReportPage.IP,

		ReportPage.HEATMAP,

		ReportPage.SQL,

		ReportPage.TASK,

		ReportPage.LOGVIEW,

		ReportPage.DATABASE,
		
		ReportPage.HEALTH

		};
	}
}
