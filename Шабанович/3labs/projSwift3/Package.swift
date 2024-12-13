// swift-tools-version: 6.0
// The swift-tools-version declares the minimum version of Swift required to build this package.

import PackageDescription

let package = Package(

    name: "projSwift3",

    products: [

        // Products define the executables and libraries a package produces, making them visible to other packages.

        .executable(

            name: "main",

            targets: ["projSwift3"])

    ],

    targets: [

        // Targets are the basic building blocks of a package, defining a module or a test suite.

        // Targets can depend on other targets in this package and products from dependencies.

        .target(

            name: "projSwift3", 

            dependencies: []),

        .testTarget(

            name: "projSwift3Tests",

            dependencies: ["projSwift3"])

    ]

)