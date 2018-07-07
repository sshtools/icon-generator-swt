package com.sshtools.icongenerator.swt;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.sshtools.icongenerator.IconBuilder;
import com.sshtools.icongenerator.IconGenerator;

public class SWTIconGenerator implements IconGenerator<Image> {

	@Override
	public Class<Image> getIconClass() {
		return Image.class;
	}

	@Override
	public Image generate(IconBuilder builder, Object... args) {
		final Display display = args.length == 0 ? Display.getCurrent() : (Display)args[0];
		SWTIconCanvas ic = new SWTIconCanvas(builder, display);
		Image img = new Image(display, (int)builder.width(), (int)builder.height());
		GC gc = new GC(img);
		ic.draw(gc);
		return img;
	}

}
