package raiti.RJL.parsing;

import raiti.RJL.parsing.values.IValueData;

/**
 * トークンオブジェクトお
 * <br>Created by Raiti-chan on 2017/02/12.
 *
 * @author Raiti-chan
 * @version 1.0.0
 * @since 1.0.0
 */
public class Token {
	
	/**
	 * トークンのタイプ
	 */
	private int type;
	/**
	 * データ
	 */
	private IValueData valueData;
	/**
	 * 行番号
	 */
	private int lineNumber;
	/**
	 * 列
	 */
	private int indexNumber;
	
	/**
	 * トークンオブジェクトを生成します。
	 * @param type トークンタイプ
	 * @param value データ
	 */
	public Token(int type, IValueData value) {
		this.type = type;
		this.valueData = value;
	}
	
	/**
	 * トークンオブジェクトを生成します。
	 * データはnullになります。
	 * @param type トークンタイプ
	 */
	public Token(int type) {
		this(type, IValueData.NullValue);
	}
	
	/**
	 * トークンのタイプを取得
	 * @return トークンタイプの整数値値
	 */
	public int getType() {
		return type;
	}
	
	/**
	 * データの取得
	 * @return データ
	 */
	public IValueData getValueData() {
		return valueData;
	}
	
	/**
	 * 行番号の設定
	 * @param lineNumber 行番号
	 */
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	/**
	 * 行番号の取得
	 * @return 行番号
	 */
	public int getLineNumber() {
		return lineNumber;
	}
	
	/**
	 * 列の設定
	 * @param indexNumber 列
	 */
	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}
	
	/**
	 * 列の取得
	 * @return 列
	 */
	public int getIndexNumber() {
		return indexNumber;
	}
}
