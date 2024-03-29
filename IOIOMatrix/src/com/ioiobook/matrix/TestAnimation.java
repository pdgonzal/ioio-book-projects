/**
 * code from the book Getting Started with IOIO
 * <br>Copyright 2011 Simon Monk
 *
 * <p>This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2
 * as published by the Free Software Foundation (see COPYING).
 * 
 * <p>This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */


package com.ioiobook.matrix;

public class TestAnimation {

	public final static int frameDelay = 500;

	public final static int[][][] animation = {
		{ //1
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //2
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //3
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //4
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //5
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //6
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //7
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //8
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //9
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //10
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //11
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //12
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //13
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //14
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //15
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //16
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //17
			{0,0,0,1,1,1,1,0},
			{0,0,1,1,1,1,1,1},
			{0,1,1,2,1,1,2,1},
			{0,1,1,1,1,1,1,1},
			{0,0,0,3,0,0,3,0},
			{0,0,0,3,0,0,3,0},
			{0,0,0,3,0,0,3,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //18
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1},
			{0,0,0,1,1,1,1,1},
			{0,0,1,1,2,1,1,2},
			{0,0,1,1,1,1,1,1},
			{0,0,0,0,3,0,0,3},
			{0,0,0,3,0,0,0,0},
			{0,0,0,0,3,0,0,3}
		},
		{ //19
			{0,0,0,0,0,1,1,1},
			{0,0,0,0,1,1,1,1},
			{0,0,0,1,1,2,1,1},
			{0,0,0,1,1,1,1,1},
			{0,0,0,0,3,0,0,3},
			{0,0,0,0,3,0,0,3},
			{0,0,0,0,3,0,0,3},
			{0,0,0,0,0,0,0,0}
		},
		{ //20
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,1,1,1},
			{0,0,0,0,1,1,2,1},
			{0,0,0,0,1,1,1,1},
			{0,0,0,0,0,0,3,0},
			{0,0,0,0,0,3,0,0},
			{0,0,0,0,0,0,3,0}
		},
		{ //21
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,1,1,2},
			{0,0,0,0,0,1,1,1},
			{0,0,0,0,0,0,0,3},
			{0,0,0,0,0,0,3,0},
			{0,0,0,0,0,0,0,3}
		},
		{ //22
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,3},
			{0,0,0,0,0,0,0,0}
		},
		{ //23
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,3},
			{0,0,0,0,0,0,0,0}
		},
		{ //24
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,3},
			{0,0,0,0,0,0,0,0}
		},
		{ //25
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,1,1,2},
			{0,0,0,0,0,1,1,1},
			{0,0,0,0,0,0,0,3},
			{0,0,0,0,0,0,3,0},
			{0,0,0,0,0,0,0,3}
		},
		{ //26
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,1},
			{0,0,0,0,0,1,1,1},
			{0,0,0,0,1,1,2,1},
			{0,0,0,0,1,1,1,1},
			{0,0,0,0,0,0,3,0},
			{0,0,0,0,0,3,0,0},
			{0,0,0,0,0,0,3,0}
		},
		{ //27
			{0,0,0,0,0,1,1,1},
			{0,0,0,0,1,1,1,1},
			{0,0,0,1,1,2,1,1},
			{0,0,0,1,1,1,1,1},
			{0,0,0,0,3,0,0,3},
			{0,0,0,0,3,0,0,3},
			{0,0,0,0,3,0,0,3},
			{0,0,0,0,0,0,0,0}
		},
		{ //28
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1},
			{0,0,0,1,1,1,1,1},
			{0,0,1,1,2,1,1,2},
			{0,0,1,1,1,1,1,1},
			{0,0,0,0,3,0,0,3},
			{0,0,0,3,0,0,0,0},
			{0,0,0,0,3,0,0,3}
		},		
		{ //29
			{0,0,0,1,1,1,1,0},
			{0,0,1,1,1,1,1,1},
			{0,1,1,2,1,1,2,1},
			{0,1,1,1,1,1,1,1},
			{0,0,0,3,0,0,3,0},
			{0,0,0,3,0,0,3,0},
			{0,0,0,3,0,0,3,0},
			{0,0,0,0,0,0,0,0}
		},		
		{ //30
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},		
		{ //31
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //32
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //33
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //34
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
		{ //31
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,3,0,0,3,0,0},
			{0,0,0,0,0,0,0,0}
		},
		{ //32
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,0},
			{1,1,2,1,1,2,1,1},
			{1,1,1,1,1,1,1,1},
			{0,0,3,0,0,3,0,0},
			{0,3,0,0,0,0,3,0},
			{0,0,3,0,0,3,0,0}
		},
				
	};

}
