package core.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Texture {

//	private String path;
//	
//	public Texture(String path) {
//		this.path = path;
//	}
//	
//	public String getPath() {
//		return path;
//	}
//
//	public void setPath(String path) {
//		this.path = path;
//	}

	public static BufferedImage loadImage(String path){
		try {

			return ImageIO.read(Texture.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1); 
		}
		return null;
	}
}
