## Tests for countUnique

| Test case                         |  Expected Result      |
|-----------------------------------|-----------------------|
| one unique                        |  return 1             |
| three items in same type          |  return 3             |
| three items in different type     |  return 5             |
| same value item in different type |  return 3             |
| empty list                        |  return 2             |
| null element                      |  return 1             |
| null list                         |  NullPointerException |

## Tests for binarySearch

| Test case                          |  Expected Result          |
|------------------------------------|---------------------------|
| first position element             |  return 0                 |
| third position element             |  return 0                 |
| middle element of five items array |  return 2                 |
| element does not in array          |  return -1                |
| empty array                        |  return -1                |
| null element                       |  IllegalArgumentException |
| null array                         |  NullPointerException     |
