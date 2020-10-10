#Adarsh_Srivastava_AI20MTECH14008
import numpy as np
def compute_gram_schmidt(A):
    #print(A)
    B=A.copy()
    #print(B)
    n = len(B[0])
    i=0
    while i<n:
        j=0
        while j<i:
            B[:, i] -= (np.dot(B[:, j], B[:, i])/(np.dot(B[:, j], B[:, j]))) * B[:, j]#performing b-(A.T/A.TA).A
            j=j+1
            #print(B)
        B[:, i] = B[:, i] / np.linalg.norm(B[:, i])#perfroming division by ||x||
        #print(B)
        i=i+1
    return B
test_matrices = np.load('testmatrices.npy',allow_pickle=True)
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
    if testpassed:
        print('Test passed')
