package raiti.RJL.parsing;

import java.util.Arrays;
import java.util.List;

/**
 * <br>Created by Raiti-chan on 2017/02/12.
 *
 * @author Raiti-chan
 * @version 1.0.0
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class TokenUtil {
	/**
	 * 数値を表すタイプ
	 */
	public static final int NUMBER = 1;
	/**
	 * 予約語を表すタイプ
	 */
	public static final int KEYWORD = 2;
	/**
	 * 識別子を表すタイプ
	 */
	public static final int IDENTIFIER = 3;
	/**
	 * 演算子を表すタイプ
	 */
	public static final int OPERATOR = 4;
	/**
	 * 左丸括弧"("を表すタイプ
	 */
	public static final int L_PAREN = 5;
	/**
	 * 右丸括弧")"を表すタイプ
	 */
	public static final int R_PAREN = 6;
	/**
	 * 左中括弧"{"を表すタイプ
	 */
	public static final int L_BRACE = 7;
	/**
	 * 右中括弧"}"を表すタイプ
	 */
	public static final int R_BRACE = 8;
	/**
	 * 左角括弧"["を表タイプ
	 */
	public static final int L_BRACET = 9;
	/**
	 * 右角括弧"]"を表タイプ
	 */
	public static final int R_BRACET = 10;
	/**
	 * シングルクオーテーション"'"を表すタイプ
	 */
	public static final int SINGLE_QUOTATION = 11;
	/**
	 * ダブルクオーテーション"""を表すタイプ
	 */
	public static final int DOUBLE_QUOTATION = 12;
	/**
	 * ピリオド"."を表すタイプ
	 */
	public static final int PERIOD = 13;
	/**
	 * カンマ","を表すタイプ
	 */
	public static final int COMMA = 14;
	/**
	 * コロン":"を表すタイプ
	 */
	public static final int COLON = 15;
	/**
	 * セミコロン";"を表すタイプ
	 */
	public static final int SEMI_COLON = 16;
	/**
	 * 左山括弧"<"を表すタイプ
	 */
	public static final int L_ANGLE_BRACKET = 17;
	/**
	 * 右山括弧">"を表すタイプ
	 */
	public static final int R_ANGLE_BRACKET = 18;
	/**
	 * アットマーク"@"を表すタイプ
	 */
	public static final int AT_MARK = 19;
	/**
	 * バックスラッシュ"\"を表すタイプ
	 */
	public static final int BACK_SLASH = 20;
	
	/**
	 * 演算子のリスト
	 */
	public static final String[] OperatorArray = {
			"++", "--", "+", "-", "*", "/", "%", "=", "<", ">", "<=", ">=",
			"==", "!=", "!", "&", "^", "|", "&&", "||", "~", "<<", ">>", ">>>"
	};
	/**
	 * 演算子リスト
	 */
	public static final List<String> Operators = Arrays.asList(OperatorArray);
	
	/**
	 * 文字列が演算子を示すか
	 * @param s 文字列
	 * @return 示す場合true
	 */
	public static boolean isOperators(String s) {
		return Operators.contains(s);
	}
	
	/**
	 * トークンを文字列にフォーマットします。
	 * (デバッグ用)
	 * @param t トークン
	 * @return 文字列
	 */
	public static String toPrintFormat(Token t) {
		return "\tline :" + t.getLineNumber() + "\n" +
				"\tindex :" + t.getIndexNumber() + "\n" +
				"\tdata :" + t.getValueData() + "\n";
	}
}
