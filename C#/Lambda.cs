// Lambda.cs
using System;

class Lambda
{
	static void Main (string[] args)
	{
		Console.WriteLine (
        		((Func<int, int>)(x => x * x)) (3)
      		);
	}
}



