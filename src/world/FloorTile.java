// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FloorTile.java

package world;

import java.awt.Graphics;
import java.awt.Image;
import maths.Vector2f;
import resource.ResourceManager;

// Referenced classes of package world:
//            Tile

public class FloorTile extends Tile {

	public FloorTile(Vector2f location, Vector2f radius) {
		super(location, radius);
		img = ResourceManager.resize(ResourceManager.cropImage(
				ResourceManager.imagesheet, 240, 240, 8, 8), 16, 16);
	}

	public void render(Graphics g) {
		g.drawImage(img, (int) getX(), (int) getY(), null);
	}

	public void update() {
	}

	public boolean isBlocked() {
		return false;
	}

	Image img;
}
