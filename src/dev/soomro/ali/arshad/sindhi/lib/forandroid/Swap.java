package dev.soomro.ali.arshad.sindhi.lib.forandroid;
/**
 * Copyright (C) 2013-14 Arshad Ali Soomro <http://stackoverflow.com/users/1367918/arshad-ali-soomro>
 *	<e-mail arshadalisoomro7@gmail.com>
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import android.app.Activity;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;

/**
 * @author Arshad Ali
 *
 */
public class Swap {
	
	public static final String SINDHI = 
			Sindhi.SEEN_SITI.toString() 
			+ Sindhi.NOON_NATH.toString() 
			+ Sindhi.DHAL_DHOBI.toString()
			+ Sindhi.YE_YAQOOT.toString();
	
	public static void setSindhiEnabled(Activity activity, int id) {
		EditText editText = (EditText) activity.findViewById(id);
		InputFilter inF = Swap.getSwaps;
		editText.setFilters(new InputFilter[]{inF});
	}
	
	public static InputFilter getSwaps = new InputFilter() {
		
		@Override
		public CharSequence filter(CharSequence source, int arg1, int arg2,
				Spanned arg3, int arg4, int arg5) {
			// TODO Auto-generated method stub
			return Swap.swapLetters(source);
		}
	};
	
	public static CharSequence swapLetters(CharSequence source) {
		if(source.toString().equals("@")){
            return Sindhi.ALLAH;
        }else if(source.toString().equals("a")){
            return Sindhi.ALIF;
        }else if(source.toString().equals("A")){
            return Sindhi.ALIF_MADDA;
        }else if(source.toString().equals("b")){
            return Sindhi.BAY_BADAK;
        }else if(source.toString().equals("B")){
            return Sindhi.BAY_BUK;
        }else if(source.toString().equals("c")){
            return Sindhi.TUAY_TOTO;
        }else if(source.toString().equals("C")){
            return Sindhi.ZUAY_ZALIM;
        }else if(source.toString().equals("d")){
            return Sindhi.DAAL_DAR;
        }else if(source.toString().equals("D")){
            return Sindhi.DAAL_DEL;
        }else if(source.toString().equals("e")){
            return Sindhi.YE_YAQOOT;
        }else if(source.toString().equals("E")){
            return Sindhi.YE_HAMZA;
        }else if(source.toString().equals("f")){
            return Sindhi.FE_FANOOS;
        }else if(source.toString().equals("F")){
            return Sindhi.PHAY_PHETHO;
        }else if(source.toString().equals("g")){
            return Sindhi.GAAF_GADAH;
        }else if(source.toString().equals("G")){
            return Sindhi.GAY_GAOON;
        }else if(source.toString().equals("h")){
            return Sindhi.HAY_HATH;
        }else if(source.toString().equals("H")){
            return Sindhi.HAY_HAJAM;
        }else if(source.toString().equals("i")){
            return Sindhi.CHHAY_CHHATI;
        }else if(source.toString().equals("I")){
            return Sindhi.CHAY_CHAND;
        }else if(source.toString().equals("j")){
            return Sindhi.JEEM_JUTI;
        }else if(source.toString().equals("J")){
            return Sindhi.JAY_JIBHA;
        }else if(source.toString().equals("k")){
            return Sindhi.KAAF_KUTTO;
        }else if(source.toString().equals("K")){
            return Sindhi.NAY_SINGH;
        }else if(source.toString().equals("l")){
            return Sindhi.LAAM_LAKUN;
        }else if(source.toString().equals("L")){
            return Sindhi.LAAM_LA;
        }else if(source.toString().equals("m")){
            return Sindhi.MEEM_MAS;
        }else if(source.toString().equals("M")){
            return Sindhi.MAIN;
        }else if(source.toString().equals("n")){
            return Sindhi.NOON_NATH;
        }else if(source.toString().equals("N")){
            return Sindhi.NOON_WAN;
        }else if(source.toString().equals("o")){
            return Sindhi.WA_WADHO;
        }else if(source.toString().equals("O")){
            return Sindhi.THHAY_THHOOTHH;
        }else if(source.toString().equals("p")){
            return Sindhi.PAY_PAG;
        }else if(source.toString().equals("P")){
            return Sindhi.NAY_MUNJA;
        }else if(source.toString().equals("q")){
            return Sindhi.QUAF_QULAM;
        }else if(source.toString().equals("Q")){
            return Sindhi.DHAL_DHOBI;
        }else if(source.toString().equals("r")){
            return Sindhi.RE_RAIL;
        }else if(source.toString().equals("R")){
            return Sindhi.RAY_MARI;
        }else if(source.toString().equals("s")){
            return Sindhi.SEEN_SITI;
        }else if(source.toString().equals("S")){
            return Sindhi.SHEEN_SHEEHN;
        }else if(source.toString().equals("t")){
            return Sindhi.TAY_TARO;
        }else if(source.toString().equals("T")){
            return Sindhi.TAY_TOOPI;
        }else if(source.toString().equals("u")){
            return Sindhi.AEEN_AENAK;
        }else if(source.toString().equals("U")){
            return Sindhi.GUAEN_GUALICHO;
        }else if(source.toString().equals("V")){
            return Sindhi.ALIF_NANDHRO;
        }else if(source.toString().equals(",")){
            return Sindhi.DAAL_DEDAR;
        }else if(source.toString().equals("/")){
            return Sindhi.DAHAL_DAHAGO;
        }else if(source.toString().equals("v")){
            return Sindhi.BHAY_BHIT;
        }else if(source.toString().equals("w")){
            return Sindhi.SUWAD_SANDOOQ;
        }else if(source.toString().equals("W")){
            return Sindhi.ZUWAD_ZAEEF;
        }else if(source.toString().equals("x")){
            return Sindhi.KHAY_KHACHAR;
        }else if(source.toString().equals("X")){
            return Sindhi.KHE_KHAT;
        }else if(source.toString().equals("y")){
            return Sindhi.THAY_THELHO;
        }else if(source.toString().equals("Y")){
            return Sindhi.SAY_SAWAB;
        }else if(source.toString().equals("z")){
            return Sindhi.ZAY_ZANJEER;
        }else if(source.toString().equals("Z")){
            return Sindhi.ZALL_ZARO;
        }
		return null;
	}
}
