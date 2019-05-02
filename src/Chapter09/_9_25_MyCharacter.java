package Chapter09;

public class _9_25_MyCharacter {
	
	static class MyCharacter{
		/**
		 * The value of the {@code Character}.
		 */
		private final char value;
		//静态内部类
		private static class MyCharacterCache {
	        private MyCharacterCache(){}

	        static final MyCharacter cache[] = new MyCharacter[127 + 1];
	        //这里的写法我是第一次见
	        static {
	            for (int i = 0; i < cache.length; i++)
	                cache[i] = new MyCharacter((char)i);
	        }
	    }
		/**
	     * Constructs a newly allocated {@code Character} object that
	     * represents the specified {@code char} value.
	     *
	     * @param  value   the value to be represented by the
	     *                  {@code Character} object.
	     */
		public MyCharacter(char value) {
	        this.value = value;
	    }
		
		/**
	     * Returns the value of this {@code Character} object.
	     * @return  the primitive {@code char} value represented by
	     *          this object.
	     */
	    public char charValue() {
	        return value;
	    }
	    
	    /**
	     * Compares two {@code Character} objects numerically.
	     *
	     * @param   anotherCharacter   the {@code Character} to be compared.

	     * @return  the value {@code 0} if the argument {@code Character}
	     *          is equal to this {@code Character}; a value less than
	     *          {@code 0} if this {@code Character} is numerically less
	     *          than the {@code Character} argument; and a value greater than
	     *          {@code 0} if this {@code Character} is numerically greater
	     *          than the {@code Character} argument (unsigned comparison).
	     *          Note that this is strictly a numerical comparison; it is not
	     *          locale-dependent.
	     * @since   1.2
	     */
	    public int compareTo(MyCharacter anotherCharacter) {
	        return compare(this.value, anotherCharacter.value);
	    }
	    
	    /**
	     * Compares two {@code char} values numerically.
	     * The value returned is identical to what would be returned by:
	     * <pre>
	     *    Character.valueOf(x).compareTo(Character.valueOf(y))
	     * </pre>
	     *
	     * @param  x the first {@code char} to compare
	     * @param  y the second {@code char} to compare
	     * @return the value {@code 0} if {@code x == y};
	     *         a value less than {@code 0} if {@code x < y}; and
	     *         a value greater than {@code 0} if {@code x > y}
	     * @since 1.7
	     */
	    public static int compare(char x, char y) {
	        return x - y;
	    }
	    
	    /**
	     * Compares this object against the specified object.
	     * The result is {@code true} if and only if the argument is not
	     * {@code null} and is a {@code Character} object that
	     * represents the same {@code char} value as this object.
	     *
	     * @param   obj   the object to compare with.
	     * @return  {@code true} if the objects are the same;
	     *          {@code false} otherwise.
	     */
	    public boolean equals(Object obj) {
	        if (obj instanceof Character) {
	            return value == ((Character)obj).charValue();
	        }
	        return false;
	    }
	    
	    /**
	     * Returns a {@code String} object representing this
	     * {@code Character}'s value.  The result is a string of
	     * length 1 whose sole component is the primitive
	     * {@code char} value represented by this
	     * {@code Character} object.
	     *
	     * @return  a string representation of this object.
	     */
	    public String toString() {
	        char buf[] = {value};
	        return String.valueOf(buf);
	    }
	    
	    /**
	     * Returns a <tt>Character</tt> instance representing the specified
	     * <tt>char</tt> value.
	     * If a new <tt>Character</tt> instance is not required, this method
	     * should generally be used in preference to the constructor
	     * {@link #Character(char)}, as this method is likely to yield
	     * significantly better space and time performance by caching
	     * frequently requested values.
	     *
	     * This method will always cache values in the range {@code
	     * '\u005Cu0000'} to {@code '\u005Cu007F'}, inclusive, and may
	     * cache other values outside of this range.
	     *
	     * @param  c a char value.
	     * @return a <tt>Character</tt> instance representing <tt>c</tt>.
	     * @since  1.5
	     */
	    public static MyCharacter valueOf(char c) {
	        if (c <= 127) { // must cache
	            return MyCharacterCache.cache[(int)c];
	        }
	        return new MyCharacter(c);
	    }
	}
	
	public static void main(String[] args){
		
		char charValue1 = 't';
		char charValue2 = 'r';
		
		MyCharacter charObject1 = new MyCharacter(charValue1);
		MyCharacter charObject2 = new MyCharacter(charValue2);
		
		if(charObject1.compareTo(charObject2)>0)
			System.out.println(""+charObject1+" greater than "+charObject2);
		if(charObject1.equals(charObject2))
			System.out.println(""+charObject1+" equals to "+charObject2);
		
		MyCharacter charObject3 = MyCharacter.valueOf('a');
	}
}
