package com.kensuuu.grpckotlin

import com.google.protobuf.Empty
import com.google.protobuf.Timestamp
import com.kensuuu.GreetingServiceGrpc.GreetingServiceImplBase
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class GreetingService : GreetingServiceImplBase() {

    override fun hello(request: Empty, responseObserver: StreamObserver<Timestamp>) {
        responseObserver.onNext(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000).build())
        responseObserver.onCompleted()
    }
}
