const path = require('path');
const webpack = require('webpack');

module.exports = {
    entry: './src/app.js',
    output: {
        path: path.join(__dirname, 'public'),
        filename: 'bundle.js'
    },
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude: /(node_modules|bower_componets)/,
                loader: 'babel-loader',
            },
            {
                test: /\.css$/,
                use: ['style-loader', 'css-loader']
            }
        ]
    },
    devServer: {
        contentBase: path.join(__dirname, 'public'),
        historyApiFallback: true
    },
    plugins: [ new webpack.HotModuleReplacementPlugin() ]
};


// module.exports = {
//     entry: "./src/app.js",
//     output: {
//         path: path.resolve(__dirname, 'public'),
//         filename: "bundle.js"
//     },
//     module: {
//         rules: [
//             {
//                 test: /\.(js|jsx)$/,
//                 exclude: /(node_modules|bower_componets)/,
//                 loader: 'babel-loader',
//                 options: {presets: ['env']}
//             },
//             {
//                 test: /\.css$/,
//                 use: ['style-loader', 'css-loader']
//             }
//         ]
//     },
//     resolve: {extensions: ['*', '.js', '.jsx']},
//     devServer: {
//         contentBase: path.join(__dirname, 'public'),
//     }
// };