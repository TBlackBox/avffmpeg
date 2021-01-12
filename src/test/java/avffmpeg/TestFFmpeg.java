package avffmpeg;

import java.io.File;
import java.net.URL;

import org.junit.Test;

import domain.VideoMetaInfo;
import domain.enums.PresetVauleEnum;
import util.MediaUtil;

public class TestFFmpeg {

	@Test
	public void test() {
		
//		System.getenv().forEach((k,v) ->{
//			System.out.println(k + " = " + v);
//		});
		
//		String rootPath = System.getProperty("user.dir");
//		System.out.println(rootPath);
//
//		URL xmlpath = this.getClass().getClassLoader().getResource("");
//        System.out.println(xmlpath);
		
		String rootPath = "D:\\Jason\\project\\code\\avffmpeg\\src\\main\\resources\\";
		
		String src = rootPath + "test\\src.mp4";
		
		String dist = rootPath + "test\\dist.flv";
		
		String m3u8 = rootPath + "test\\m3u8\\dist.m3u8";
		
		MediaUtil.setFFmpegPath(rootPath + "ffmpeg\\ffmpeg.exe");
		
//		MediaUtil.isExecutable();
		
		VideoMetaInfo videoMetaInfo = MediaUtil.getVideoMetaInfo(new File(src));
		System.out.println(videoMetaInfo.getFormat());
		
		MediaUtil.convertVideo(new File(src), new File(m3u8), true, 0, PresetVauleEnum.MAX_FAST_ZIP_SPEED.getPresetValue(), null, null);
	}
	
}
