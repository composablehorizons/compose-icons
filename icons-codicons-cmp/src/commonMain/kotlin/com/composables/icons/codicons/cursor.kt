package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Cursor: ImageVector
    get() {
        if (_Cursor != null) return _Cursor!!
        
        _Cursor = ImageVector.Builder(
            name = "cursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.00165f, 2.99863f)
                curveTo(4.00165f, 2.17447f, 4.94264f, 1.70412f, 5.60184f, 2.19877f)
                lineTo(13.5993f, 8.19993f)
                curveTo(14.3679f, 8.77665f, 13.96f, 9.99978f, 12.9991f, 9.99978f)
                horizontalLineTo(9.05388f)
                curveTo(8.74293f, 9.99978f, 8.44968f, 10.1444f, 8.26043f, 10.3911f)
                lineTo(5.7951f, 13.6051f)
                curveTo(5.21352f, 14.3633f, 4.00165f, 13.952f, 4.00165f, 12.9964f)
                verticalLineTo(2.99863f)
                close()
                moveTo(12.9991f, 8.99978f)
                lineTo(5.00165f, 2.99863f)
                verticalLineTo(12.9964f)
                lineTo(7.46698f, 9.78251f)
                curveTo(7.84548f, 9.28907f, 8.43199f, 8.99978f, 9.05388f, 8.99978f)
                lineTo(12.9991f, 8.99978f)
                close()
            }
        }.build()
        
        return _Cursor!!
    }

private var _Cursor: ImageVector? = null

