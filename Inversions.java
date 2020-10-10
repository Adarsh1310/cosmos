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
\cf2 \cb3 \strokec2 class\cf4 \strokec4  Main\cb1 \
\cb3 \{\cb1 \
\cb3     \cf2 \strokec2 private\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf2 \strokec2 int\cf4 \strokec4  mergepro(\cf2 \strokec2 int\cf4 \strokec4 [] input, \cf2 \strokec2 int\cf4 \strokec4  left, \cf2 \strokec2 int\cf4 \strokec4  mid, \cf2 \strokec2 int\cf4 \strokec4  right) \cb1 \
\cb3     \{ \cf2 \strokec2 int\cf4 \strokec4  count=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3     \cf2 \strokec2 int\cf4 \strokec4  c=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  larray[]=\cf2 \strokec2 new\cf4 \strokec4  \cf2 \strokec2 int\cf4 \strokec4 [mid-left+\cf5 \strokec5 1\cf4 \strokec4 ];\cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  rarray[]=\cf2 \strokec2 new\cf4 \strokec4  \cf2 \strokec2 int\cf4 \strokec4 [right-mid];\cb1 \
\cb3         \cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4  j=left;j<mid+\cf5 \strokec5 1\cf4 \strokec4 ;j++)\cb1 \
\cb3         larray[c++]=input[j];\cb1 \
\cb3         c=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3         \cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4  j=mid+\cf5 \strokec5 1\cf4 \strokec4 ;j<right+\cf5 \strokec5 1\cf4 \strokec4 ;j++)\cb1 \
\cb3         rarray[c++]=input[j];\cb1 \
\cb3     \cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  i = \cf5 \strokec5 0\cf4 \strokec4 , j = \cf5 \strokec5 0\cf4 \strokec4 , k = left;\cb1 \
\cb3         \cf2 \strokec2 while\cf4 \strokec4  (i < larray.length && j < rarray.length) \{ \cb1 \
\cb3             \cf2 \strokec2 if\cf4 \strokec4  (larray[i] <= rarray[j]) \cb1 \
\cb3                 input[k++] = larray[i++]; \cb1 \
\cb3             \cf2 \strokec2 else\cf4 \strokec4  \{ \cb1 \
\cb3                 input[k++] = rarray[j++]; \cb1 \
\cb3                 count += (mid + \cf5 \strokec5 1\cf4 \strokec4 ) - (left + i); \cb1 \
\cb3             \} \cb1 \
\cb3         \} \cb1 \
\cb3         \cf2 \strokec2 for\cf4 \strokec4  (\cf2 \strokec2 int\cf4 \strokec4  d=\cf5 \strokec5 0\cf4 \strokec4 ;i<larray.length;i++)\cb1 \
\cb3         input[k++] = larray[d++]; \cb1 \
\cb3         \cf2 \strokec2 for\cf4 \strokec4  (\cf2 \strokec2 int\cf4 \strokec4  p=\cf5 \strokec5 0\cf4 \strokec4 ;i<rarray.length;i++) \cb1 \
\cb3         input[k++] = rarray[p++]; \cb1 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  count; \cb1 \
\cb3     \}\cb1 \
\cf2 \cb3 \strokec2 private\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf2 \strokec2 int\cf4 \strokec4  inversions(\cf2 \strokec2 int\cf4 \strokec4 [] input, \cf2 \strokec2 int\cf4 \strokec4  left, \cf2 \strokec2 int\cf4 \strokec4  right)  \cb1 \
\
\cb3     \{  \cf2 \strokec2 int\cf4 \strokec4  totalcount=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3     \cb1 \
\cb3         \cf2 \strokec2 if\cf4 \strokec4  (left >= right) \cb1 \
\cb3             \cf2 \strokec2 return\cf4 \strokec4  \cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3         \cf2 \strokec2 else\cf4 \strokec4 \{\cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  leftcount = \cf5 \strokec5 0\cf4 \strokec4 ; \cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  rightcount=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  mergecount=\cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  mid = (\cf2 \strokec2 int\cf4 \strokec4 )((left + right) / \cf5 \strokec5 2\cf4 \strokec4 ); \cb1 \
\cb3         leftcount += inversions(input, left, mid); \cb1 \
\cb3         rightcount += inversions(input, mid + \cf5 \strokec5 1\cf4 \strokec4 , right); \cb1 \
\cb3         mergecount += mergepro(input, left, mid, right); \cb1 \
\cb3         totalcount+=mergecount+leftcount+rightcount;\} \cb1 \
\cb3         \cf2 \strokec2 return\cf4 \strokec4  totalcount; \cb1 \
\cb3     \}\cb1 \
\cb3 \'a0\'a0\cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf2 \strokec2 void\cf4 \strokec4  main(String[] args) \cb1 \
\cb3     \{ Scanner sc=\cf2 \strokec2 new\cf4 \strokec4  Scanner(System.in);\cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  length=sc.nextInt();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf4 \strokec4  arr[]=\cf2 \strokec2 new\cf4 \strokec4  \cf2 \strokec2 int\cf4 \strokec4 [length];\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4  i=\cf5 \strokec5 0\cf4 \strokec4 ;i<length;i++)\cb1 \
\cb3 \'a0\'a0\'a0\'a0arr[i]=sc.nextInt();\cb1 \
\cb3   \cb1 \
\cb3         System.out.println(inversions(arr, \cf5 \strokec5 0\cf4 \strokec4 , length-\cf5 \strokec5 1\cf4 \strokec4 )); \cb1 \
\cb3     \} \cb1 \
\cb3 \}\cb1 \
\
}