import java.util.*;
public class sq_cubes
{
static boolean sq(int n)//n=4
{
int s= (int)Math.sqrt(n);//2
return (s*s)==n;
}
static boolean cu(int n)//n=8
{
int c= (int)Math.cbrt(n);//2
return (c*c*c)==n;
}
static int show(int n)//n=20
{
int count=0;
for(int i=1;i<=n;i++)//i=4
{
if(sq(i))//1 4 9 16
count++;//count=1
else if (cu(i))//8
count++;
}
return count;//count=5
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
int n= sc.nextInt();//20
System.out.println("no of sq and cu = "+(show(n)));
}
}
