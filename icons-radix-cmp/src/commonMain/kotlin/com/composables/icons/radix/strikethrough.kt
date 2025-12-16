package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) return _Strikethrough!!
        
        _Strikethrough = ImageVector.Builder(
            name = "strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5003f, 2.75f)
                curveTo(10.7763f, 2.75018f, 11.0003f, 2.97397f, 11.0003f, 3.25f)
                verticalLineTo(7.09961f)
                horizontalLineTo(12.5003f)
                lineTo(12.5814f, 7.1084f)
                curveTo(12.7632f, 7.14602f, 12.9007f, 7.30701f, 12.9007f, 7.5f)
                curveTo(12.9007f, 7.693f, 12.7632f, 7.85397f, 12.5814f, 7.8916f)
                lineTo(12.5003f, 7.90039f)
                horizontalLineTo(11.0003f)
                verticalLineTo(8.5498f)
                curveTo(11.0003f, 10.4827f, 9.43315f, 12.0496f, 7.50031f, 12.0498f)
                curveTo(5.56731f, 12.0498f, 4.00031f, 10.4828f, 4.00031f, 8.5498f)
                verticalLineTo(7.90039f)
                horizontalLineTo(2.50031f)
                curveTo(2.27939f, 7.90039f, 2.09991f, 7.72091f, 2.09991f, 7.5f)
                curveTo(2.09993f, 7.2791f, 2.2794f, 7.09961f, 2.50031f, 7.09961f)
                horizontalLineTo(4.00031f)
                verticalLineTo(3.25f)
                curveTo(4.00031f, 2.97386f, 4.22416f, 2.75f, 4.50031f, 2.75f)
                curveTo(4.77629f, 2.75018f, 5.00031f, 2.97397f, 5.00031f, 3.25f)
                verticalLineTo(7.09961f)
                horizontalLineTo(10.0003f)
                verticalLineTo(3.25f)
                curveTo(10.0003f, 2.97386f, 10.2242f, 2.75f, 10.5003f, 2.75f)
                close()
                moveTo(5.00031f, 7.90039f)
                verticalLineTo(8.5498f)
                curveTo(5.00031f, 9.93052f, 6.11959f, 11.0498f, 7.50031f, 11.0498f)
                curveTo(8.88086f, 11.0496f, 10.0003f, 9.9304f, 10.0003f, 8.5498f)
                verticalLineTo(7.90039f)
                horizontalLineTo(5.00031f)
                close()
            }
        }.build()
        
        return _Strikethrough!!
    }

private var _Strikethrough: ImageVector? = null

