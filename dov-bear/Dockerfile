#FROM library/node:22-slim
FROM node:22-slim

LABEL maintainer=sphuar
WORKDIR /app

COPY *.js .
COPY *.json .
COPY public public
COPY views views
# COPY main.js .
# COPY metrics.js .
# COPY package.json .
# COPY package-lock.json .
# COPY . .

#install node packages (clean install), --omit-dev optional (omits installing dev dependencies)
RUN npm ci --omit-dev

#run(build) image
ENV PORT=3000 METRICS_PORT=3100
EXPOSE ${PORT} ${METRICS_PORT}

# CMD node main
ENTRYPOINT node main.js


# cd go to directory with dockerfile in it
# enter code: docker image build -t sphuar/ssf-day14inclass:v1.0.0-practice .
# enter code: docker run -d -p 12345:3000 sphuar/ssf-day14inclass:v1.0.0-practice
# docker run turns the docker image into acontainer. Open app with localhost:12345, container ported from 3000, and forced to run with localhost:12345
# note that theres significance in how  we name our docker image build
    #Repo name is sphuar/ssf-day14inclass
    #tag(version no.) is v1.0.0-practice

