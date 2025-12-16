package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Overline: ImageVector
    get() {
        if (_Overline != null) return _Overline!!
        
        _Overline = ImageVector.Builder(
            name = "overline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5003f, 3.75038f)
                curveTo(10.7763f, 3.75054f, 11.0003f, 3.97434f, 11.0003f, 4.25038f)
                verticalLineTo(9.55019f)
                curveTo(11.0001f, 11.4829f, 9.43304f, 13.05f, 7.50031f, 13.0502f)
                curveTo(5.56744f, 13.0502f, 4.00051f, 11.483f, 4.00031f, 9.55019f)
                verticalLineTo(4.25038f)
                curveTo(4.00031f, 3.97424f, 4.22416f, 3.75038f, 4.50031f, 3.75038f)
                curveTo(4.77631f, 3.75054f, 5.00031f, 3.97434f, 5.00031f, 4.25038f)
                verticalLineTo(9.55019f)
                curveTo(5.00051f, 10.9307f, 6.11972f, 12.0502f, 7.50031f, 12.0502f)
                curveTo(8.88075f, 12.05f, 10.0001f, 10.9306f, 10.0003f, 9.55019f)
                verticalLineTo(4.25038f)
                curveTo(10.0003f, 3.97424f, 10.2242f, 3.75038f, 10.5003f, 3.75038f)
                close()
                moveTo(11.5814f, 1.10878f)
                curveTo(11.7632f, 1.14644f, 11.9007f, 1.30741f, 11.9007f, 1.50038f)
                curveTo(11.9005f, 1.69323f, 11.7631f, 1.85441f, 11.5814f, 1.89198f)
                lineTo(11.5003f, 1.90077f)
                horizontalLineTo(3.50031f)
                curveTo(3.27952f, 1.90077f, 3.10013f, 1.72112f, 3.09991f, 1.50038f)
                curveTo(3.09991f, 1.27947f, 3.27939f, 1.09999f, 3.50031f, 1.09999f)
                horizontalLineTo(11.5003f)
                lineTo(11.5814f, 1.10878f)
                close()
            }
        }.build()
        
        return _Overline!!
    }

private var _Overline: ImageVector? = null

