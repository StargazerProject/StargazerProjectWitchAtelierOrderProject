package com.pisual.test;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

import com.stargazer.witchatelier.model.event.Order;
import com.stargazer.witchatelier.model.factory.OrderFactory;
import com.stargazer.witchatelier.util.socketnio.NIOServer;

public class SratrCells2 {
	public static void main(String[] args) {
		try {
			SocketChannel socketChannel = SocketChannel.open();
			SocketAddress socketAddress = new InetSocketAddress("10.0.1.12",
					10740);
			socketChannel.connect(socketAddress);
			OrderFactory o = new OrderFactory();
			Order order = o.SampleMessgeOrder();
			order.getOrderMessage().setOrderLevel("SystemLevelCommand");
			order.getOrderMessage().getOrderMethod().getMethod().get(0).setMethodName("systemStart");
			order.getOrderMessage().getOrderMethod().getMethod().get(0).getParameter().get(0).setParameter("StartBigCGCellsServerTest.jar");
			order.getOrderMessage().getOrderMethod().getMethod().get(0).getParameter().get(1).setParameter("6");
			NIOServer.sendData(socketChannel, order);
			socketChannel.socket().shutdownOutput();
		} catch (Exception ex) {
			System.out.println("me: " + ex.getMessage());
		}
	}
}