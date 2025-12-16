package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Underline: ImageVector
    get() {
        if (_Underline != null) return _Underline!!
        
        _Underline = ImageVector.Builder(
            name = "underline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5814f, 13.1084f)
                curveTo(11.7633f, 13.146f, 11.9007f, 13.307f, 11.9008f, 13.5f)
                curveTo(11.9008f, 13.693f, 11.7633f, 13.854f, 11.5814f, 13.8916f)
                lineTo(11.5004f, 13.9004f)
                horizontalLineTo(3.50037f)
                curveTo(3.27945f, 13.9004f, 3.09998f, 13.7209f, 3.09998f, 13.5f)
                curveTo(3.10001f, 13.2791f, 3.27947f, 13.0996f, 3.50037f, 13.0996f)
                horizontalLineTo(11.5004f)
                lineTo(11.5814f, 13.1084f)
                close()
                moveTo(10.5004f, 2.25f)
                curveTo(10.7763f, 2.25019f, 11.0004f, 2.47398f, 11.0004f, 2.75f)
                verticalLineTo(8.0498f)
                curveTo(11.0004f, 9.98268f, 9.4332f, 11.5496f, 7.50037f, 11.5498f)
                curveTo(5.56737f, 11.5498f, 4.00037f, 9.9828f, 4.00037f, 8.0498f)
                verticalLineTo(2.75f)
                curveTo(4.00037f, 2.47386f, 4.22422f, 2.25f, 4.50037f, 2.25f)
                curveTo(4.77635f, 2.25019f, 5.00037f, 2.47398f, 5.00037f, 2.75f)
                verticalLineTo(8.0498f)
                curveTo(5.00037f, 9.43052f, 6.11965f, 10.5498f, 7.50037f, 10.5498f)
                curveTo(8.88092f, 10.5496f, 10.0004f, 9.4304f, 10.0004f, 8.0498f)
                verticalLineTo(2.75f)
                curveTo(10.0004f, 2.47386f, 10.2242f, 2.25f, 10.5004f, 2.25f)
                close()
            }
        }.build()
        
        return _Underline!!
    }

private var _Underline: ImageVector? = null

