package com.geteit.rcouch

/**
  */
object Settings {

  case class ClusterSettings(
                            bucketName: String,
                            hosts: List[String],
                            user: String = "",
                            passwd: String = "",
                            connection: ConnectionSettings = new ConnectionSettings(),
                            node: NodeConfig = new NodeConfig()
                          )

  case class NodeConfig(
    maxMemcachedConnections: Int = 1,
    memcached: MemcachedSettings = new MemcachedSettings()
  )

  case class MemcachedSettings(

    user: String = "",

    password: String = "",

    maxQueueSize: Int = 256,

    maxAuthRetries: Int = 3,

    authEnabled: Boolean = true,

    connection: ConnectionSettings = new ConnectionSettings()
  )

  case class ConnectionSettings(
    /**
     * The maximum amount of time that the client will sleep before trying to reconnect to the server
     */
    maxReconnectDelayMillis: Int = 16000,

    /**
     * The maximum number of times that the client will try to reconnect to the server before aborting
     */
    maxReconnectAttempts: Int = 3
  )
}
