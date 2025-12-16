package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Copy: ImageVector
    get() {
        if (_Copy != null) return _Copy!!
        
        _Copy = ImageVector.Builder(
            name = "copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 4.00003f)
                verticalLineTo(2.50003f)
                curveTo(10f, 2.22389f, 9.77614f, 2.00003f, 9.5f, 2.00003f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 2.00003f, 2f, 2.22389f, 2f, 2.50003f)
                verticalLineTo(9.50003f)
                curveTo(2f, 9.77617f, 2.22386f, 10f, 2.5f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(5.50003f)
                curveTo(4f, 4.6716f, 4.67157f, 4.00003f, 5.5f, 4.00003f)
                horizontalLineTo(10f)
                close()
                moveTo(5.5f, 5.00003f)
                curveTo(5.22386f, 5.00003f, 5f, 5.22389f, 5f, 5.50003f)
                verticalLineTo(12.5f)
                curveTo(5.00002f, 12.7762f, 5.22387f, 13f, 5.5f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 13f, 13f, 12.7762f, 13f, 12.5f)
                verticalLineTo(5.50003f)
                curveTo(13f, 5.22389f, 12.7761f, 5.00003f, 12.5f, 5.00003f)
                horizontalLineTo(5.5f)
                close()
                moveTo(12.5f, 4.00003f)
                curveTo(13.3284f, 4.00003f, 14f, 4.6716f, 14f, 5.50003f)
                verticalLineTo(12.5f)
                curveTo(14f, 13.3284f, 13.3284f, 14f, 12.5f, 14f)
                horizontalLineTo(5.5f)
                curveTo(4.67159f, 14f, 4.00002f, 13.3284f, 4f, 12.5f)
                verticalLineTo(11f)
                horizontalLineTo(2.5f)
                curveTo(1.67157f, 11f, 1f, 10.3285f, 1f, 9.50003f)
                verticalLineTo(2.50003f)
                curveTo(1f, 1.6716f, 1.67157f, 1.00003f, 2.5f, 1.00003f)
                horizontalLineTo(9.5f)
                curveTo(10.3284f, 1.00003f, 11f, 1.6716f, 11f, 2.50003f)
                verticalLineTo(4.00003f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _Copy!!
    }

private var _Copy: ImageVector? = null

