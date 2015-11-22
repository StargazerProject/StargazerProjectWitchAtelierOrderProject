package com.pisual.witchatelier.start;

import com.pisual.liliaui.ui.LiliaMessageUIStart;
import com.pisual.www.cells.ui.PisualMessageUI;
import com.stargazer.witchatelier.messageservice.MessageService;
import com.stargazer.witchatelier.util.system.PropertiesUtil;

public class MessageServerStart {
	public static void main(String[] args) {
		LiliaMessageUIStart liliaMessageUIStart = new LiliaMessageUIStart();
		PropertiesUtil.getValue("SystemVers");
		MessageService messageService = new MessageService(10240);
		messageService.startMessageService();
	}
}
