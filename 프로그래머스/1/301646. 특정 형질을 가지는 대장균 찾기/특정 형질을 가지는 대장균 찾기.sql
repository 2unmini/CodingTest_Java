SELECT COUNT(ID) as COUNT
FROM ECOLI_DATA
WHERE  1=1
AND (GENOTYPE & 2) = 0
AND ((GENOTYPE & 1) != 0 OR (GENOTYPE & 4) != 0);