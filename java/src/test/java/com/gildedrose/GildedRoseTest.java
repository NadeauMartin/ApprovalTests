package com.gildedrose;

import static org.junit.Assert.*;

import org.approvaltests.Approvals;
import org.junit.Test;


public class GildedRoseTest {
	
	@Test
	public void updateQuality() throws Exception {
		Item[] items = new Item[] { new Item("xx", 0, 0) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		Approvals.verify(app.items[0].toString());
	}
}
