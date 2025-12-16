package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Library: ImageVector
    get() {
        if (_Library != null) return _Library!!
        
        _Library = ImageVector.Builder(
            name = "library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3.24941f)
                curveTo(1f, 2.55938f, 1.55917f, 2f, 2.24895f, 2f)
                horizontalLineTo(2.74852f)
                curveTo(3.4383f, 2f, 3.99747f, 2.55938f, 3.99747f, 3.24941f)
                verticalLineTo(12.745f)
                curveTo(3.99747f, 13.435f, 3.4383f, 13.9944f, 2.74852f, 13.9944f)
                horizontalLineTo(2.24895f)
                curveTo(1.55917f, 13.9944f, 1f, 13.435f, 1f, 12.745f)
                verticalLineTo(3.24941f)
                close()
                moveTo(2.24895f, 2.99953f)
                curveTo(2.11099f, 2.99953f, 1.99916f, 3.11141f, 1.99916f, 3.24941f)
                verticalLineTo(12.745f)
                curveTo(1.99916f, 12.883f, 2.11099f, 12.9948f, 2.24895f, 12.9948f)
                horizontalLineTo(2.74852f)
                curveTo(2.88648f, 12.9948f, 2.99831f, 12.883f, 2.99831f, 12.745f)
                verticalLineTo(3.24941f)
                curveTo(2.99831f, 3.11141f, 2.88648f, 2.99953f, 2.74852f, 2.99953f)
                horizontalLineTo(2.24895f)
                close()
                moveTo(4.99663f, 3.24941f)
                curveTo(4.99663f, 2.55938f, 5.5558f, 2f, 6.24557f, 2f)
                horizontalLineTo(6.74515f)
                curveTo(7.43492f, 2f, 7.9941f, 2.55938f, 7.9941f, 3.24941f)
                verticalLineTo(12.745f)
                curveTo(7.9941f, 13.435f, 7.43492f, 13.9944f, 6.74515f, 13.9944f)
                horizontalLineTo(6.24557f)
                curveTo(5.5558f, 13.9944f, 4.99663f, 13.435f, 4.99663f, 12.745f)
                verticalLineTo(3.24941f)
                close()
                moveTo(6.24557f, 2.99953f)
                curveTo(6.10762f, 2.99953f, 5.99578f, 3.11141f, 5.99578f, 3.24941f)
                verticalLineTo(12.745f)
                curveTo(5.99578f, 12.883f, 6.10762f, 12.9948f, 6.24557f, 12.9948f)
                horizontalLineTo(6.74515f)
                curveTo(6.88311f, 12.9948f, 6.99494f, 12.883f, 6.99494f, 12.745f)
                verticalLineTo(3.24941f)
                curveTo(6.99494f, 3.11141f, 6.88311f, 2.99953f, 6.74515f, 2.99953f)
                horizontalLineTo(6.24557f)
                close()
                moveTo(11.9723f, 4.77682f)
                curveTo(11.7231f, 4.15733f, 11.0311f, 3.84331f, 10.4011f, 4.06385f)
                lineTo(9.81888f, 4.26764f)
                curveTo(9.14658f, 4.50297f, 8.80684f, 5.25222f, 9.07268f, 5.91326f)
                lineTo(12.0098f, 13.2166f)
                curveTo(12.2589f, 13.8361f, 12.9509f, 14.1502f, 13.581f, 13.9296f)
                lineTo(14.1632f, 13.7258f)
                curveTo(14.8355f, 13.4904f, 15.1752f, 12.7412f, 14.9093f, 12.0802f)
                lineTo(11.9723f, 4.77682f)
                close()
                moveTo(10.7311f, 5.00729f)
                curveTo(10.8571f, 4.96318f, 10.9955f, 5.02598f, 11.0453f, 5.14988f)
                lineTo(13.9824f, 12.4532f)
                curveTo(14.0356f, 12.5854f, 13.9676f, 12.7353f, 13.8332f, 12.7823f)
                lineTo(13.251f, 12.9862f)
                curveTo(13.1249f, 13.0303f, 12.9865f, 12.9675f, 12.9367f, 12.8436f)
                lineTo(9.99964f, 5.5402f)
                curveTo(9.94647f, 5.40799f, 10.0144f, 5.25815f, 10.1489f, 5.21108f)
                lineTo(10.7311f, 5.00729f)
                close()
            }
        }.build()
        
        return _Library!!
    }

private var _Library: ImageVector? = null

