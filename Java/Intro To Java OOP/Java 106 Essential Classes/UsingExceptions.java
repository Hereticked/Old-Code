/* Exceptions provide the means to separate the details of what to do when something out of the ordinary happens from the main logic of a program. In traditional programming, error detection, reporting, and handling often lead to confusing spaghetti code. For example, consider the pseudocode method here that reads an entire file into memory.

    readFile {
        open the file;
        determine its size;
        allocate that much memory;
        read the file into memory;
        close the file;
    }

At first glance, this function seems simple enough, but it ignores all the following potential errors.

    * What happens if the file can't be opened?
    * What happens if the length of the file can't be determined?
    * What happens if enough memory can't be allocated?
    * What happens if the read fails?
    * What happens if the file can't be closed? 

To handle such cases, the readFile function must have more code to do error detection, reporting, and handling. Here is an example of what the function might look like. */


    errorCodeType readFile {
        initialize errorCode = 0;
        
        open the file;
        if (theFileIsOpen) {
            determine the length of the file;
            if (gotTheFileLength) {
                allocate that much memory;
                if (gotEnoughMemory) {
                    read the file into memory;
                    if (readFailed) {
                        errorCode = -1;
                    }
                } else {
                    errorCode = -2;
                }
            } else {
                errorCode = -3;
            }
            close the file;
            if (theFileDidntClose && errorCode == 0) {
                errorCode = -4;
            } else {
                errorCode = errorCode and -4;
            }
        } else {
            errorCode = -5;
        }
        return errorCode;
    }

/* There's so much error detection, reporting, and returning here that the original seven lines of code are lost in the clutter. Worse yet, the logical flow of the code has also been lost, thus making it difficult to tell whether the code is doing the right thing: Is the file really being closed if the function fails to allocate enough memory? It's even more difficult to ensure that the code continues to do the right thing when you modify the method three months after writing it. Many programmers solve this problem by simply ignoring it - errors are reported when their programs crash.

Exceptions enable you to write the main flow of your code and to deal with the exceptional cases elsewhere. If the readFile function used exceptions instead of traditional error-management techniques, it would look more like the following. */


    readFile {
        try {
            open the file;
            determine its size;
            allocate that much memory;
            read the file into memory;
            close the file;
        } catch (fileOpenFailed) {
           doSomething;
        } catch (sizeDeterminationFailed) {
            doSomething;
        } catch (memoryAllocationFailed) {
            doSomething;
        } catch (readFailed) {
            doSomething;
        } catch (fileCloseFailed) {
            doSomething;
        }
    }


/* Note that exceptions don't spare you the effort of doing the work of detecting, reporting, and handling errors, but they do help you organize the work more effectively. */