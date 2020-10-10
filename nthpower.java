{\rtf1\ansi\ansicpg1252\cocoartf2571
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue254;\red0\green0\blue0;
\red19\green120\blue72;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c99608;\cssrgb\c0\c0\c0;
\cssrgb\c3529\c53333\c35294;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl420\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf4 \strokec4  java.util.*;\cb1 \
\cf2 \cb3 \strokec2 class\cf4 \strokec4  Main \{\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf2 \strokec2 double\cf4 \strokec4  powerofnumber(\cf2 \strokec2 double\cf4 \strokec4  a,\cf2 \strokec2 long\cf4 \strokec4  b)\cb1 \
\cb3   \{ \cb1 \
\cb3     \cf2 \strokec2 long\cf4 \strokec4  mid=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3     \cf2 \strokec2 double\cf4 \strokec4  t=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3     \cf2 \strokec2 double\cf4 \strokec4  temp=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3     \cf2 \strokec2 if\cf4 \strokec4 (b==\cf5 \strokec5 1\cf4 \strokec4 )\cb1 \
\cb3     \{\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  a;\cb1 \
\cb3     \}\cb1 \
\cb3     \cf2 \strokec2 else\cf4 \cb1 \strokec4 \
\cb3     \{\cb1 \
\cb3       mid=(\cf2 \strokec2 int\cf4 \strokec4 )b/\cf5 \strokec5 2\cf4 \strokec4 ;\cb1 \
\cb3       t=powerofnumber(a,mid);\cb1 \
\cb3       temp=t*t;\cb1 \
\cb3       \cf2 \strokec2 if\cf4 \strokec4 (b%\cf5 \strokec5 2\cf4 \strokec4 ==\cf5 \strokec5 0\cf4 \strokec4 )\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  temp;\cb1 \
\cb3       \cf2 \strokec2 else\cf4 \cb1 \strokec4 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  a*temp;\cb1 \
\cb3     \}\cb1 \
\
\cb3   \}\cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf2 \strokec2 double\cf4 \strokec4  nthpower(\cf2 \strokec2 long\cf4 \strokec4  a,\cf2 \strokec2 long\cf4 \strokec4  b)\cb1 \
\cb3   \{ \cf2 \strokec2 double\cf4 \strokec4  power=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3      \cf2 \strokec2 double\cf4 \strokec4  value=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3       \cf2 \strokec2 long\cf4 \strokec4  mid=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3     \cf2 \strokec2 long\cf4 \strokec4  d = \cf5 \strokec5 0\cf4 \strokec4 ; \cf2 \strokec2 long\cf4 \strokec4  e = a;\cb1 \
\cb3       \cf2 \strokec2 while\cf4 \strokec4 (d<=e)\cb1 \
\cb3       \{\cb1 \
\cb3         mid=(d+e)/\cf5 \strokec5 2\cf4 \strokec4 ;\cb1 \
\cb3         power=powerofnumber(mid,b);\cb1 \
\cb3         \cf2 \strokec2 if\cf4 \strokec4 ((\cf2 \strokec2 long\cf4 \strokec4 )power<=a && (\cf2 \strokec2 long\cf4 \strokec4 )powerofnumber(mid+\cf5 \strokec5 1\cf4 \strokec4 ,b)>a)\cb1 \
\cb3         \{\cb1 \
\cb3           \cf2 \strokec2 return\cf4 \strokec4  mid;\cb1 \
\cb3         \}\cb1 \
\cb3         \cf2 \strokec2 else\cf4 \strokec4  \cf2 \strokec2 if\cf4 \strokec4  ((\cf2 \strokec2 long\cf4 \strokec4 )power < a) \cb1 \
\cb3             \{ \cb1 \
\cb3                 d = mid + \cf5 \strokec5 1\cf4 \strokec4 ; \cb1 \
\cb3                 \cb1 \
\cb3             \} \cb1 \
\cb3         \cf2 \strokec2 else\cf4 \strokec4   \cb1 \
\cb3                 e = mid-\cf5 \strokec5 1\cf4 \strokec4 ; \cb1 \
\cb3         \}\cb1 \
\cb3       \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3     \}\cb1 \
\cb3   \cb1 \
\cb3   \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf2 \strokec2 void\cf4 \strokec4  main(String[] args) \{\cb1 \
\cb3     Scanner sc=\cf2 \strokec2 new\cf4 \strokec4  Scanner(System.in);\cb1 \
\cb3     \cb1 \
\cb3     \cf2 \strokec2 int\cf4 \strokec4  input=sc.nextInt();\cb1 \
\cb3     \cf2 \strokec2 long\cf4 \strokec4  power=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3     \cf2 \strokec2 long\cf4 \strokec4  n[]=\cf2 \strokec2 new\cf4 \strokec4  \cf2 \strokec2 long\cf4 \strokec4 [input];\cb1 \
\cb3     \cf2 \strokec2 long\cf4 \strokec4  k[]=\cf2 \strokec2 new\cf4 \strokec4  \cf2 \strokec2 long\cf4 \strokec4 [input];\cb1 \
\cb3     \cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4  i=\cf5 \strokec5 0\cf4 \strokec4 ;i<input;i++)\cb1 \
\cb3     \{\cb1 \
\cb3       n[i]=sc.nextLong();\cb1 \
\cb3       k[i]=sc.nextLong();\cb1 \
\cb3     \}\cb1 \
\cb3     \cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4  i=\cf5 \strokec5 0\cf4 \strokec4 ;i<input;i++)\cb1 \
\cb3     \{ \cb1 \
\cb3       System.out.println((\cf2 \strokec2 int\cf4 \strokec4 )nthpower(n[i],k[i]));\cb1 \
\cb3     \}\cb1 \
\cb3   \}\cb1 \
\cb3 \}\cb1 \
\
}