package MainPkg;

import com.aspose.slides.*;

public class Main {

	public static void main(String[] args) {
		
		Presentation pres = new Presentation("/home/luca/eclipse-workspace/PptxToImages/src/pptx/test.pptx");
		try {
		    for (ISlide sld : pres.getSlides()) {
		    	
		        IImage slideImage = sld.getImage(1f, 1f);

		        try {
		              slideImage.save(String.format("/home/luca/eclipse-workspace/PptxToImages/src/images/Slide_%d.jpg", sld.getSlideNumber()), ImageFormat.Jpeg);
		        } finally {
		             if (slideImage != null) slideImage.dispose();
		        }
		    }
		} finally {
		    if (pres != null) pres.dispose();
		}

	}

}
