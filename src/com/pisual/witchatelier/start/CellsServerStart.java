package com.pisual.witchatelier.start;

import com.pisual.liliaui.ui.LiliaCellsUIStart;
import com.stargazer.witchatelier.summusdensitatesegmentation.SummusDensitateSegmentationService;
import com.stargazer.witchatelier.util.system.PropertiesUtil;

public class CellsServerStart {
	public static void main(String[] args) {
		LiliaCellsUIStart liliaCellsUIStart = new LiliaCellsUIStart();
		PropertiesUtil.getValue("SystemVers");
		SummusDensitateSegmentationService s = new SummusDensitateSegmentationService(10740);
		s.startMessageService();
	}
}
