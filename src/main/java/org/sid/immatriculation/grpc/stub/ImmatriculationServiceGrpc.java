package org.sid.immatriculation.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: immatriculation.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest,
      org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse> getGetOwnersListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOwnersList",
      requestType = org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest.class,
      responseType = org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest,
      org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse> getGetOwnersListMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest, org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse> getGetOwnersListMethod;
    if ((getGetOwnersListMethod = ImmatriculationServiceGrpc.getGetOwnersListMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetOwnersListMethod = ImmatriculationServiceGrpc.getGetOwnersListMethod) == null) {
          ImmatriculationServiceGrpc.getGetOwnersListMethod = getGetOwnersListMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest, org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "GetOwnersList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("GetOwnersList"))
                  .build();
          }
        }
     }
     return getGetOwnersListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest,
      org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse> getDeleteOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOwner",
      requestType = org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest.class,
      responseType = org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest,
      org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse> getDeleteOwnerMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest, org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse> getDeleteOwnerMethod;
    if ((getDeleteOwnerMethod = ImmatriculationServiceGrpc.getDeleteOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getDeleteOwnerMethod = ImmatriculationServiceGrpc.getDeleteOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getDeleteOwnerMethod = getDeleteOwnerMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest, org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "DeleteOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("DeleteOwner"))
                  .build();
          }
        }
     }
     return getDeleteOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest,
      org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse> getGetOwnerByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOwnerById",
      requestType = org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest.class,
      responseType = org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest,
      org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse> getGetOwnerByIdMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest, org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse> getGetOwnerByIdMethod;
    if ((getGetOwnerByIdMethod = ImmatriculationServiceGrpc.getGetOwnerByIdMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetOwnerByIdMethod = ImmatriculationServiceGrpc.getGetOwnerByIdMethod) == null) {
          ImmatriculationServiceGrpc.getGetOwnerByIdMethod = getGetOwnerByIdMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest, org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "GetOwnerById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("GetOwnerById"))
                  .build();
          }
        }
     }
     return getGetOwnerByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest,
      org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse> getGetVehicleListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVehicleList",
      requestType = org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest.class,
      responseType = org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest,
      org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse> getGetVehicleListMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest, org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse> getGetVehicleListMethod;
    if ((getGetVehicleListMethod = ImmatriculationServiceGrpc.getGetVehicleListMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetVehicleListMethod = ImmatriculationServiceGrpc.getGetVehicleListMethod) == null) {
          ImmatriculationServiceGrpc.getGetVehicleListMethod = getGetVehicleListMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest, org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "GetVehicleList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("GetVehicleList"))
                  .build();
          }
        }
     }
     return getGetVehicleListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest,
      org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse> getGetVehicleByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVehicleById",
      requestType = org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest.class,
      responseType = org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest,
      org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse> getGetVehicleByIdMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest, org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse> getGetVehicleByIdMethod;
    if ((getGetVehicleByIdMethod = ImmatriculationServiceGrpc.getGetVehicleByIdMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetVehicleByIdMethod = ImmatriculationServiceGrpc.getGetVehicleByIdMethod) == null) {
          ImmatriculationServiceGrpc.getGetVehicleByIdMethod = getGetVehicleByIdMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest, org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "GetVehicleById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("GetVehicleById"))
                  .build();
          }
        }
     }
     return getGetVehicleByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getOwnersList(org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnersListMethod(), responseObserver);
    }

    /**
     */
    public void deleteOwner(org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOwnerMethod(), responseObserver);
    }

    /**
     */
    public void getOwnerById(org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnerByIdMethod(), responseObserver);
    }

    /**
     */
    public void getVehicleList(org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleListMethod(), responseObserver);
    }

    /**
     */
    public void getVehicleById(org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOwnersListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest,
                org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse>(
                  this, METHODID_GET_OWNERS_LIST)))
          .addMethod(
            getDeleteOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest,
                org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse>(
                  this, METHODID_DELETE_OWNER)))
          .addMethod(
            getGetOwnerByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest,
                org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse>(
                  this, METHODID_GET_OWNER_BY_ID)))
          .addMethod(
            getGetVehicleListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest,
                org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse>(
                  this, METHODID_GET_VEHICLE_LIST)))
          .addMethod(
            getGetVehicleByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest,
                org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse>(
                  this, METHODID_GET_VEHICLE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceStub> {
    private ImmatriculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOwnersList(org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnersListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOwner(org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOwnerById(org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnerByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicleList(org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicleById(org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceBlockingStub> {
    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse getOwnersList(org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnersListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse deleteOwner(org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse getOwnerById(org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnerByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse getVehicleList(org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse getVehicleById(org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceFutureStub> {
    private ImmatriculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse> getOwnersList(
        org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnersListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse> deleteOwner(
        org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse> getOwnerById(
        org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnerByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse> getVehicleList(
        org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse> getVehicleById(
        org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OWNERS_LIST = 0;
  private static final int METHODID_DELETE_OWNER = 1;
  private static final int METHODID_GET_OWNER_BY_ID = 2;
  private static final int METHODID_GET_VEHICLE_LIST = 3;
  private static final int METHODID_GET_VEHICLE_BY_ID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OWNERS_LIST:
          serviceImpl.getOwnersList((org.sid.immatriculation.grpc.stub.Imt.OwnersListRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.OwnersListResponse>) responseObserver);
          break;
        case METHODID_DELETE_OWNER:
          serviceImpl.deleteOwner((org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.DeleteOwnerResponse>) responseObserver);
          break;
        case METHODID_GET_OWNER_BY_ID:
          serviceImpl.getOwnerById((org.sid.immatriculation.grpc.stub.Imt.OwnerByIdRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.GetOwnerResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICLE_LIST:
          serviceImpl.getVehicleList((org.sid.immatriculation.grpc.stub.Imt.VehiclesListRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.VehiclesListResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICLE_BY_ID:
          serviceImpl.getVehicleById((org.sid.immatriculation.grpc.stub.Imt.VehicleByIdRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculation.grpc.stub.Imt.GetVehicleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.immatriculation.grpc.stub.Imt.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationService");
    }
  }

  private static final class ImmatriculationServiceFileDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier {
    ImmatriculationServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationServiceMethodDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationServiceFileDescriptorSupplier())
              .addMethod(getGetOwnersListMethod())
              .addMethod(getDeleteOwnerMethod())
              .addMethod(getGetOwnerByIdMethod())
              .addMethod(getGetVehicleListMethod())
              .addMethod(getGetVehicleByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
