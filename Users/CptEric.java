public class CptEric extends Room15User {

	private boolean isRoomOwner = false;
	private boolean isDumbass = false;
	private boolean hasCircle = true;
	private boolean isSpanish = true;
	private boolean knowsHisShitThroughJCenter = true;

	public CptEric() {
		
	}

	public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
	}

	public boolean isDumbass() {
		return isDumbass;
	}

	public String isSpanish() {
		if (isSpanish) {
			return "Sí";
		} 
		else {
			return "No";
		}
	}

	public boolean knowsHisShitThroughJCenter() {
		if (knowsHisShitThroughJCenter) {
			return knowsHisShitThroughJCenter;
		}
		else {
			return true;
		}
	}
}