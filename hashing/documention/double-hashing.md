# Double Hashing 

1. Formula ==> <br>
        hash(key,i) = (h1(key) + i*h2(key))%m <br>
        h1(key) = key % m <br>
        h2(key) = capacity - key % m; <br>


# Algorithm

        void doubleHashingInsert(key) { 
            if(table if full) {
                return error;
            }

            probe = h1(key);
            offset = h2(key);

            while(table[probe] in occupied) {
                probe = (probe + offset)%m;
            }
            table[probe] = key;
        }
1. For linear probing offset will be 1
2. Same approach can be used for searching an element
3. Search will be over if empty slot found or traversed with entire array

# Performance Analysis of search ( Unsuccessful search )

1. Load factor alpha = n / m ( should be <= 1 )
2. Every probe sequence looks at a random location
3. 1 - alpha fraction of the table is empty
4. Expected number of probe required = 1 / (1 - alpha)



