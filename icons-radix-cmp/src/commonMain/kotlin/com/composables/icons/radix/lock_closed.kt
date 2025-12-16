package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) return _LockClosed!!
        
        _LockClosed = ImageVector.Builder(
            name = "lock-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50098f, 0.97831f)
                curveTo(8.5754f, 0.97831f, 9.46932f, 1.32269f, 10.0908f, 1.99198f)
                curveTo(10.7073f, 2.65592f, 11f, 3.57934f, 11f, 4.63358f)
                verticalLineTo(5.99979f)
                horizontalLineTo(12f)
                curveTo(12.5522f, 5.99979f, 12.9999f, 6.4476f, 13f, 6.99979f)
                verticalLineTo(12.9998f)
                curveTo(13f, 13.5521f, 12.5523f, 13.9998f, 12f, 13.9998f)
                horizontalLineTo(3f)
                curveTo(2.44772f, 13.9998f, 2f, 13.5521f, 2f, 12.9998f)
                verticalLineTo(6.99979f)
                curveTo(2.00011f, 6.4476f, 2.44778f, 5.99979f, 3f, 5.99979f)
                horizontalLineTo(4f)
                verticalLineTo(4.63554f)
                curveTo(4.00009f, 3.58126f, 4.29322f, 2.65732f, 4.91016f, 1.99296f)
                curveTo(5.53211f, 1.32327f, 6.42651f, 0.978401f, 7.50098f, 0.97831f)
                close()
                moveTo(3f, 12.9998f)
                horizontalLineTo(12f)
                verticalLineTo(6.99979f)
                horizontalLineTo(3f)
                verticalLineTo(12.9998f)
                close()
                moveTo(7.50098f, 1.97831f)
                curveTo(6.64571f, 1.9784f, 6.0396f, 2.24726f, 5.64355f, 2.67362f)
                curveTo(5.24259f, 3.10537f, 5.00009f, 3.76007f, 5f, 4.63554f)
                verticalLineTo(5.99979f)
                horizontalLineTo(10f)
                verticalLineTo(4.63358f)
                curveTo(10f, 3.75741f, 9.75854f, 3.10258f, 9.3584f, 2.67167f)
                curveTo(8.96322f, 2.24619f, 8.35692f, 1.97831f, 7.50098f, 1.97831f)
                close()
            }
        }.build()
        
        return _LockClosed!!
    }

private var _LockClosed: ImageVector? = null

