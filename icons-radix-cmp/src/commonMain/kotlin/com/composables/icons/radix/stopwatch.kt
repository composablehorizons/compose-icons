package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Stopwatch: ImageVector
    get() {
        if (_Stopwatch != null) return _Stopwatch!!
        
        _Stopwatch = ImageVector.Builder(
            name = "stopwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.00037f, 0f)
                curveTo(9.27633f, 2.11196E-4f, 9.50037f, 0.223988f, 9.50037f, 0.5f)
                curveTo(9.50037f, 0.776012f, 9.27633f, 0.999789f, 9.00037f, 1f)
                horizontalLineTo(8.00037f)
                verticalLineTo(2.12109f)
                curveTo(9.09904f, 2.2061f, 10.1194f, 2.56775f, 10.9926f, 3.1377f)
                curveTo(11.0122f, 3.11025f, 11.0334f, 3.08326f, 11.058f, 3.05859f)
                lineTo(11.5267f, 3.52734f)
                curveTo(11.5276f, 3.52808f, 11.5288f, 3.52856f, 11.5297f, 3.5293f)
                lineTo(11.5004f, 3.5f)
                lineTo(11.058f, 3.05859f)
                lineTo(11.8588f, 2.25781f)
                curveTo(12.1028f, 2.01426f, 12.4986f, 2.014f, 12.7426f, 2.25781f)
                curveTo(12.9863f, 2.50188f, 12.9864f, 2.89859f, 12.7426f, 3.14258f)
                lineTo(11.9662f, 3.91797f)
                curveTo(13.1585f, 5.08042f, 13.8997f, 6.70335f, 13.8998f, 8.5f)
                curveTo(13.8996f, 12.0343f, 11.0347f, 14.8992f, 7.50037f, 14.8994f)
                curveTo(3.96587f, 14.8994f, 1.10019f, 12.0344f, 1.09998f, 8.5f)
                curveTo(1.10016f, 5.13385f, 3.69958f, 2.37627f, 7.00037f, 2.12109f)
                verticalLineTo(1f)
                horizontalLineTo(6.00037f)
                curveTo(5.72422f, 1f, 5.50037f, 0.776142f, 5.50037f, 0.5f)
                curveTo(5.50037f, 0.223858f, 5.72422f, 0f, 6.00037f, 0f)
                horizontalLineTo(9.00037f)
                close()
                moveTo(7.50037f, 3.09961f)
                curveTo(4.51815f, 3.09961f, 2.10017f, 5.51783f, 2.09998f, 8.5f)
                curveTo(2.10019f, 11.4822f, 4.51816f, 13.8994f, 7.50037f, 13.8994f)
                curveTo(10.4824f, 13.8992f, 12.8996f, 11.482f, 12.8998f, 8.5f)
                curveTo(12.8996f, 5.51796f, 10.4824f, 3.09982f, 7.50037f, 3.09961f)
                close()
                moveTo(7.50037f, 4f)
                curveTo(7.77633f, 4.00021f, 8.00037f, 4.22399f, 8.00037f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(8.00037f, 9.77601f, 7.77633f, 9.99979f, 7.50037f, 10f)
                curveTo(7.22422f, 10f, 7.00037f, 9.77614f, 7.00037f, 9.5f)
                verticalLineTo(4.5f)
                curveTo(7.00037f, 4.22386f, 7.22422f, 4f, 7.50037f, 4f)
                close()
            }
        }.build()
        
        return _Stopwatch!!
    }

private var _Stopwatch: ImageVector? = null

