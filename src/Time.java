public class Time {

	private int hora;
	private int minu;
	private int segu;
	
	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minu = m;
		this.segu = s;
	}
	// vou "sobrecarregar" o método setTime
	public void setTime(int h, int m) {
		this.hora = h;
		this.minu = m;
		this.segu = 0;
	}
	
	public void setTime(int h) {
		this.hora = h;
		this.minu = 0;
		this.segu = 0;
	}
	
	public String exibirHoraUniversal() {
		String hh, mm, ss;
		hh = formataNumero(hora);
		mm = formataNumero(minu);
		ss = formataNumero(segu);
		return hh+":"+mm+":"+ss;
	}
	
	public String exibirHoraPadrao() {
		String hh,mm,ss, sufixo;
		if (this.minu < 10) {
			mm = "0"+minu;
		}
		else {
			mm = String.valueOf(minu);
		}
		
		if (this.segu < 10) {
			ss = "0"+segu;
		}
		else {
			ss = String.valueOf(segu);
		}
		
		if (hora == 0) {    // meia noite
			hh = "12";
			sufixo = "AM";
		}
		else if (hora == 12) {  // meidia
			hh = "12";
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) { // madrugada + manhã
			if (hora < 10) {
				hh = "0"+hora;
			}
			else {
				hh = String.valueOf(hora);
			}
			sufixo = "AM";
		}
		else {               // tarde/noite
			hh = String.valueOf(hora-12);
			sufixo = "PM";
		}
		return hh+":"+mm+":"+ss+sufixo;
	}
	
	public String formataNumero(int num) {
		if (num < 10) {
			return "0"+num;
		}
		else {
			return String.valueOf(num);
		}
	}
	
}