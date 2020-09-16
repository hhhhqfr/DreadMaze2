// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Animation.java

package tk.damnesia.entity;

import java.awt.Graphics;
import java.awt.Image;
import java.io.PrintStream;
import java.util.ArrayList;

public class Animation {

	public Animation() {
		images = new ArrayList();
		looptime = 150;
		index = 0;
		lastLoopTime = Long.valueOf(System.currentTimeMillis());
	}

	public void addImage(Image img) {
		images.add(img);
	}

	public void setLoopTime(int looptime) {
		this.looptime = looptime;
	}

	public int getLoopTime() {
		return looptime;
	}

	public void update() {
		if (System.currentTimeMillis() - lastLoopTime.longValue() > (long) looptime) {
			lastLoopTime = Long.valueOf(System.currentTimeMillis());
			if (index < images.size() - 1)
				index++;
			else
				index = 0;
		}
	}

	public void render(Graphics g, int x, int y) {
		g.drawImage((Image) images.get(index), x, y, null);
	}

	public void removeImage(int index) {
		if (index + 1 > images.size())
			System.out.println("Error: Can't remove image");
	}

	ArrayList images;
	public int looptime;
	int index;
	Long lastLoopTime;
}
