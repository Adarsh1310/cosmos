# -*- coding: utf-8 -*-
"""Gram.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1pInY1rV1LW5mgM9TECIy0GO4y4O_rVmw
"""

import numpy as np
def compute_gram_schmidt(A):
    """
    This should compute the Gram Schmidt orthogonalization for the matrix A.
    The input will generally be an m-by-n real-valued matrix A
    The output should be a matrix B which satisfies the following properties:
       1. B^T B = I
       2. The ColumnSpace(B) = ColumnSpace(A)
    Both A and B should be np.array
    """
    B=np.zeros(A.shape)
    i=0
    while(i<A.shape[1]):
        B[:,i]=A[:,i]
        j=0
        while(j<i):
          B[:,i]=B[:,i]-((np.dot(B[:,j],B[:,i]))*B[:,j])
          j=j+1
        k=0
        while(k<A.shape[0]):
            if(abs(B[k,i])<pow(10,-5)):
                B[k,i]=0
            k=k+1
        if(np.any(B[:,i])):
            B[:,i]=B[:,i]/np.sqrt(np.dot(B[:,i],B[:,i]))
        i=i+1
    value=B[...,:]
    extra=np.argwhere(np.all(value==0,axis=0))
    return(np.delete(B,extra,axis=1))
"""
Actual code begins here.
Make sure that the file testmatrices.npy is in the current directory

Each matrix is a numpy array
"""

test_matrices = np.load('testmatrices_final.npy',allow_pickle=True)

no_matrices = len(test_matrices)

for i in range(no_matrices):

    A = test_matrices[i].copy()
    B = compute_gram_schmidt(A)
    print('Matrix ',i)
    testpassed = True
    if np.linalg.norm(np.matmul(B.transpose(),B) - np.eye(np.shape(B)[1])) > 0.0001:
        print('Test failed: B^TB is not identity')
        testpassed = False
    augmat = np.concatenate((A,B), axis=1)
    if not ( np.linalg.matrix_rank(augmat)==np.linalg.matrix_rank(A) and np.linalg.matrix_rank(A)==np.linalg.matrix_rank(B) ):
        print('Test failed: A and B do not have the same column space')
        testpassed = False
        print(B)
    if testpassed:
        print('Test passed')