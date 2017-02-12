package raiti.RJL.parsing.values;

/**
 * データを扱うインターフェイス
 * <br>Created by Raiti-chan on 2017/02/12.
 *
 * @author Raiti-chan
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IValueData<E> {
	
	E getValue();
	
	void setValue(E value);
	
	IValueData<Object> NullValue = new IValueData<Object>() {
		
		@Override
		public Object getValue() {
			return null;
		}
		
		@Override
		public void setValue(Object value) {
			
		}
	};
	
}
