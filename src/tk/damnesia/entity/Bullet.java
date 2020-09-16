// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Bullet.java

package tk.damnesia.entity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import maths.Vector2f;
import resource.ResourceManager;

// Referenced classes of package tk.damnesia.entity:
//            Entity

public class Bullet extends Entity {

	public Bullet(Vector2f location, Vector2f radius) {
		super(location, radius);
		rotation = 50;
		speed = 4;
	}

	public Bullet(Vector2f location, Vector2f radius, int rotation) {
		super(location, radius);
		this.rotation = 50;
		speed = 4;
		this.rotation = rotation;
	}

	public void update() {
		setX(getX() + (double) speed * Math.cos(Math.toRadians(rotation)));
		setY(getY() + (double) speed * Math.sin(Math.toRadians(rotation)));
	}

	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.translate(getX(), getY());
		g2d.rotate(Math.toRadians(rotation));
		g.drawImage(ResourceManager.bullet, 0, 0, null);
		g2d.rotate(Math.toRadians(-rotation));
		g2d.translate(-getX(), -getY());
	}

	int rotation;
	int speed;
}
