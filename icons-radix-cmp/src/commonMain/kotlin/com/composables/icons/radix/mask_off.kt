package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.MaskOff: ImageVector
    get() {
        if (_MaskOff != null) return _MaskOff!!
        
        _MaskOff = ImageVector.Builder(
            name = "mask-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.1025f, 1.00488f)
                curveTo(14.6067f, 1.05621f, 15f, 1.48232f, 15f, 2f)
                verticalLineTo(13f)
                lineTo(14.9951f, 13.1025f)
                curveTo(14.9472f, 13.573f, 14.573f, 13.9472f, 14.1025f, 13.9951f)
                lineTo(14f, 14f)
                horizontalLineTo(1f)
                lineTo(0.897461f, 13.9951f)
                curveTo(0.427034f, 13.9472f, 0.0527828f, 13.573f, 0.00488281f, 13.1025f)
                lineTo(0f, 13f)
                verticalLineTo(2f)
                curveTo(0f, 1.48232f, 0.393331f, 1.05621f, 0.897461f, 1.00488f)
                lineTo(1f, 1f)
                horizontalLineTo(14f)
                lineTo(14.1025f, 1.00488f)
                close()
                moveTo(1f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                close()
                moveTo(7.5f, 3.875f)
                curveTo(9.50203f, 3.875f, 11.125f, 5.49797f, 11.125f, 7.5f)
                curveTo(11.125f, 9.50203f, 9.50203f, 11.125f, 7.5f, 11.125f)
                curveTo(5.49797f, 11.125f, 3.875f, 9.50203f, 3.875f, 7.5f)
                curveTo(3.875f, 5.49797f, 5.49797f, 3.875f, 7.5f, 3.875f)
                close()
                moveTo(7.5f, 4.875f)
                curveTo(6.05025f, 4.875f, 4.875f, 6.05025f, 4.875f, 7.5f)
                curveTo(4.875f, 8.94975f, 6.05025f, 10.125f, 7.5f, 10.125f)
                curveTo(8.94975f, 10.125f, 10.125f, 8.94975f, 10.125f, 7.5f)
                curveTo(10.125f, 6.05025f, 8.94975f, 4.875f, 7.5f, 4.875f)
                close()
            }
        }.build()
        
        return _MaskOff!!
    }

private var _MaskOff: ImageVector? = null

