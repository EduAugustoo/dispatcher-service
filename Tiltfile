custom_build(
    ref = 'dispatcher-service',
    command = '.\\mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=${env.EXPECTED_REF}',
    deps = ['pom.xml', 'src']
)

k8s_yaml(['k8s/deployment.yml'])

k8s_resource('dispatcher-service', port_forwards=['9003'])