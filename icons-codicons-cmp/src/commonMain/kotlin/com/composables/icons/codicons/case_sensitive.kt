package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CaseSensitive: ImageVector
    get() {
        if (_CaseSensitive != null) return _CaseSensitive!!
        
        _CaseSensitive = ImageVector.Builder(
            name = "case-sensitive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.02602f, 3.34176f)
                curveTo(4.16218f, 2.93404f, 4.83818f, 2.93398f, 4.97426f, 3.34176f)
                lineTo(6.97426f, 9.34274f)
                curveTo(6.97526f, 9.34674f, 6.97817f, 9.35544f, 6.97817f, 9.35544f)
                lineTo(7.97426f, 12.3427f)
                curveTo(8.06126f, 12.6047f, 7.91984f, 12.8875f, 7.65786f, 12.9756f)
                curveTo(7.60486f, 12.9926f, 7.55165f, 13.0009f, 7.49965f, 13.0009f)
                curveTo(7.29082f, 13.0008f, 7.09602f, 12.868f, 7.02602f, 12.6591f)
                lineTo(6.14028f, 10.0009f)
                horizontalLineTo(2.86f)
                lineTo(1.97426f, 12.6591f)
                curveTo(1.88728f, 12.919f, 1.60634f, 13.0634f, 1.34243f, 12.9746f)
                curveTo(1.08043f, 12.8866f, 0.93902f, 12.6038f, 1.02602f, 12.3418f)
                lineTo(2.02211f, 9.35544f)
                curveTo(2.02311f, 9.35144f, 2.02602f, 9.34274f, 2.02602f, 9.34274f)
                lineTo(4.02602f, 3.34176f)
                close()
                moveTo(3.19399f, 8.99997f)
                horizontalLineTo(5.80629f)
                lineTo(4.49965f, 5.08102f)
                lineTo(3.19399f, 8.99997f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.8581f, 6.66794f)
                curveTo(13.165f, 6.73296f, 13.9427f, 7.48427f, 13.9967f, 8.69626f)
                lineTo(13.9997f, 8.83297f)
                verticalLineTo(12.5078f)
                curveTo(13.9957f, 12.7568f, 13.809f, 12.9621f, 13.568f, 12.9951f)
                lineTo(13.4997f, 13f)
                curveTo(13.2469f, 12.9998f, 13.0376f, 12.8121f, 13.0045f, 12.5683f)
                lineTo(12.9997f, 12.5f)
                verticalLineTo(12.4297f)
                curveTo(12.3407f, 12.8066f, 11.7316f, 13f, 11.1666f, 13f)
                curveTo(9.94081f, 12.9998f, 8.99965f, 12.1369f, 8.99965f, 10.833f)
                curveTo(8.99967f, 9.68299f, 9.79211f, 8.82889f, 11.1061f, 8.66989f)
                curveTo(11.7279f, 8.59493f, 12.3589f, 8.64164f, 12.9987f, 8.80954f)
                curveTo(12.9915f, 8.07194f, 12.6279f, 7.70704f, 11.8082f, 7.66598f)
                curveTo(11.1672f, 7.63398f, 10.7158f, 7.72415f, 10.4518f, 7.90915f)
                curveTo(10.2258f, 8.06799f, 9.91347f, 8.01301f, 9.75551f, 7.78708f)
                curveTo(9.59671f, 7.56115f, 9.65178f, 7.24878f, 9.87758f, 7.09079f)
                curveTo(10.3165f, 6.78283f, 10.9138f, 6.64715f, 11.6666f, 6.6611f)
                lineTo(11.8581f, 6.66794f)
                close()
                moveTo(12.7965f, 9.8154f)
                curveTo(12.2587f, 9.66749f, 11.7361f, 9.62551f, 11.2262f, 9.68747f)
                curveTo(10.4042f, 9.78747f, 9.99868f, 10.2244f, 9.99868f, 10.8574f)
                curveTo(9.99884f, 11.5881f, 10.474f, 12.0242f, 11.1657f, 12.0244f)
                curveTo(11.6196f, 12.0244f, 12.1777f, 11.8137f, 12.8336f, 11.3818f)
                lineTo(12.9987f, 11.2695f)
                verticalLineTo(9.87594f)
                lineTo(12.7965f, 9.8154f)
                close()
            }
        }.build()
        
        return _CaseSensitive!!
    }

private var _CaseSensitive: ImageVector? = null

