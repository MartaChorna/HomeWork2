package package4;

import java.util.ArrayList;


public class IsInstance {
	
	public void  isInst (ArrayList ff, ArrayList chrome) {
		
		boolean isFF = this instanceof FF;
		boolean isChr = this instanceof Chrome;
		if( isFF && isChr ) {
			ff.add( this );
			chrome.add( this );
		} else if( isChr ) {
			chrome.add( this );
		} else {
			ff.add( this);
		}

	}
	
	public String getContent( String content  ) {
		return "<div class='content'>"+content+"</div>";
	}

}



