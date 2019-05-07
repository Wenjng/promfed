

cheetsheet:

## use following command to open a shell in the image (myapp)
## then ls command will list all content

$ docker run -ti --entrypoint /bin/sh myapp
/ # ls