package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LockOpen1: ImageVector
    get() {
        if (_LockOpen1 != null) return _LockOpen1!!
        
        _LockOpen1 = ImageVector.Builder(
            name = "lock-open-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49902f, 0f)
                curveTo(8.57082f, 8.94091E-5f, 9.46493f, 0.337839f, 10.0879f, 1.00195f)
                curveTo(10.7065f, 1.66147f, 10.9999f, 2.58119f, 11f, 3.63574f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                curveTo(12.5523f, 6f, 13f, 6.44772f, 13f, 7f)
                verticalLineTo(13f)
                curveTo(13f, 13.5523f, 12.5523f, 14f, 12f, 14f)
                horizontalLineTo(3f)
                curveTo(2.44772f, 14f, 2f, 13.5523f, 2f, 13f)
                verticalLineTo(7f)
                curveTo(2f, 6.44772f, 2.44772f, 6f, 3f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(3.63574f)
                curveTo(9.99995f, 2.76039f, 9.75776f, 2.11236f, 9.3584f, 1.68652f)
                curveTo(8.96337f, 1.26538f, 8.35703f, 1.00009f, 7.49902f, 1f)
                curveTo(6.61111f, 1f, 5.99677f, 1.26857f, 5.60352f, 1.71484f)
                lineTo(5.52734f, 1.80664f)
                curveTo(5.1967f, 2.23329f, 5.00007f, 2.84315f, 5f, 3.63281f)
                horizontalLineTo(4f)
                curveTo(4.00007f, 2.68216f, 4.2373f, 1.83821f, 4.7373f, 1.19336f)
                lineTo(4.8584f, 1.04785f)
                curveTo(5.48245f, 0.342377f, 6.39938f, 0f, 7.49902f, 0f)
                close()
                moveTo(3f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _LockOpen1!!
    }

private var _LockOpen1: ImageVector? = null

