Pod::Spec.new do |spec|
    spec.name                     = 'toppingkotlin'
    spec.version                  = '1.11.0'
    spec.homepage                 = ''
    spec.source                   = { :http=> ''}
    spec.authors                  = ''
    spec.license                  = ''
    spec.summary                  = ''
    spec.vendored_frameworks      = 'build/cocoapods/framework/toppingkotlin.framework'
    spec.libraries                = 'c++'
    spec.ios.deployment_target = '13.0'
    spec.dependency 'Topping', '0.5.3'
                
    spec.pod_target_xcconfig = {
        'KOTLIN_PROJECT_PATH' => ':toppingkotlin',
        'PRODUCT_MODULE_NAME' => 'toppingkotlin',
    }
                
    spec.script_phases = [
        {
            :name => 'Build toppingkotlin',
            :execution_position => :before_compile,
            :shell_path => '/bin/sh',
            :script => <<-SCRIPT
                if [ "YES" = "$COCOAPODS_SKIP_KOTLIN_BUILD" ]; then
                  echo "Skipping Gradle build task invocation due to COCOAPODS_SKIP_KOTLIN_BUILD environment variable set to \"YES\""
                  exit 0
                fi
                set -ev
                REPO_ROOT="$PODS_TARGET_SRCROOT"
                "$REPO_ROOT/../gradlew" -p "$REPO_ROOT" $KOTLIN_PROJECT_PATH:syncFramework \
                    -Pkotlin.native.cocoapods.platform=$PLATFORM_NAME \
                    -Pkotlin.native.cocoapods.archs="$ARCHS" \
                    -Pkotlin.native.cocoapods.configuration="$CONFIGURATION"
            SCRIPT
        }
    ]
                
end