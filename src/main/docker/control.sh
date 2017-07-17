#!/bin/sh

SCRIPT_PATH=${0%/*}

shutdown_all_containers() {
  COUNT=`docker ps -q |wc -l`
  echo "INFO: Stopping all containers [$COUNT]"
  if [ $COUNT -gt 0 ]; then
    docker stop $(docker ps -q) 2>&1
  fi
  COUNT=`docker ps -q |wc -l`
  if [ $COUNT -gt 0 ]; then
    echo "Failed to stop all containers, [$COUNT remaining]" >&2
  fi
}

delete_all_containers() {
  COUNT=`docker ps -a -q |wc -l`
  echo "INFO: Deleting all containers [$COUNT]"
  if [ $COUNT -gt 0 ]; then
    docker rm -f $(docker ps -a -q) 2>&1
  fi
  COUNT=`docker ps -a -q |wc -l`
  if [ $COUNT -gt 0 ]; then
    echo "Failed to delete all containers, [$COUNT remaining]" >&2
  fi
}

delete_all_images() {
  COUNT=`docker images -qa |wc -l`
  echo "INFO: Deleting all images [$COUNT]"
  if [ $COUNT -gt 0 ]; then
    docker rmi -f $(docker images -q) 2>&1
  fi
  COUNT=`docker images -qa |wc -l`
  if [ $COUNT -gt 0 ]; then
    echo "Failed to delete all images, [$COUNT remaining]" >&2
  fi
}

usage() {
  echo "Usage: $0 [stop|reset]"
}

case "$1" in
  stop)
    shutdown_all_containers
    ;;
  reset)
    shutdown_all_containers
    delete_all_containers
    delete_all_images
    ;;
  *)
    usage
    exit 1
esac
