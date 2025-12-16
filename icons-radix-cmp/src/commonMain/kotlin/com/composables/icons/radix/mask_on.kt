package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.MaskOn: ImageVector
    get() {
        if (_MaskOn != null) return _MaskOn!!
        
        _MaskOn = ImageVector.Builder(
            name = "mask-on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 1f)
                curveTo(14.5523f, 1f, 15f, 1.44772f, 15f, 2f)
                verticalLineTo(13f)
                curveTo(15f, 13.5523f, 14.5523f, 14f, 14f, 14f)
                horizontalLineTo(1f)
                curveTo(0.447715f, 14f, 2.01331E-8f, 13.5523f, 0f, 13f)
                verticalLineTo(2f)
                curveTo(0f, 1.44772f, 0.447715f, 1f, 1f, 1f)
                horizontalLineTo(14f)
                close()
                moveTo(7.5f, 4.375f)
                curveTo(5.77411f, 4.375f, 4.375f, 5.77411f, 4.375f, 7.5f)
                curveTo(4.375f, 9.22589f, 5.77411f, 10.625f, 7.5f, 10.625f)
                curveTo(9.22589f, 10.625f, 10.625f, 9.22589f, 10.625f, 7.5f)
                curveTo(10.625f, 5.77411f, 9.22589f, 4.375f, 7.5f, 4.375f)
                close()
            }
        }.build()
        
        return _MaskOn!!
    }

private var _MaskOn: ImageVector? = null

