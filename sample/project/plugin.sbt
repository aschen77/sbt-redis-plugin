resolvers += Resolver.url("fmonniot", url("https://dl.bintray.com/fmonniot/sbt-plugins"))(Resolver.ivyStylePatterns)

addSbtPlugin("eu.monniot.redis" % "redis-plugin" % "0.1.1")