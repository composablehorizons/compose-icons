package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ViewGrid: ImageVector
    get() {
        if (_ViewGrid != null) return _ViewGrid!!
        
        _ViewGrid = ImageVector.Builder(
            name = "view-grid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.6533f, 1.00781f)
                curveTo(14.4097f, 1.08461f, 15f, 1.72334f, 15f, 2.5f)
                verticalLineTo(12.5f)
                lineTo(14.9922f, 12.6533f)
                curveTo(14.9205f, 13.3593f, 14.3593f, 13.9205f, 13.6533f, 13.9922f)
                lineTo(13.5f, 14f)
                horizontalLineTo(1.5f)
                lineTo(1.34668f, 13.9922f)
                curveTo(0.64069f, 13.9205f, 0.0794913f, 13.3593f, 0.0078125f, 12.6533f)
                lineTo(0f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(1.51001E-7f, 1.72334f, 0.590277f, 1.08461f, 1.34668f, 1.00781f)
                lineTo(1.5f, 1f)
                horizontalLineTo(13.5f)
                lineTo(13.6533f, 1.00781f)
                close()
                moveTo(8f, 13f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 13f, 14f, 12.7761f, 14f, 12.5f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                close()
                moveTo(1f, 12.5f)
                curveTo(1f, 12.7761f, 1.22386f, 13f, 1.5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineTo(12.5f)
                close()
                moveTo(8f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(2.5f)
                curveTo(14f, 2.22386f, 13.7761f, 2f, 13.5f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                close()
                moveTo(1.5f, 2f)
                curveTo(1.22386f, 2f, 1f, 2.22386f, 1f, 2.5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(1.5f)
                close()
            }
        }.build()
        
        return _ViewGrid!!
    }

private var _ViewGrid: ImageVector? = null

