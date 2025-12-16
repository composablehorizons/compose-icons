package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ViewNone: ImageVector
    get() {
        if (_ViewNone != null) return _ViewNone!!
        
        _ViewNone = ImageVector.Builder(
            name = "view-none",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.6533f, 1.00781f)
                curveTo(13.8273f, 1.02548f, 13.9923f, 1.07351f, 14.1436f, 1.14551f)
                lineTo(14.1748f, 1.12012f)
                lineTo(14.2402f, 1.19727f)
                curveTo(14.6935f, 1.45532f, 15f, 1.94115f, 15f, 2.5f)
                verticalLineTo(12.5f)
                lineTo(14.9922f, 12.6533f)
                curveTo(14.9205f, 13.3593f, 14.3593f, 13.9205f, 13.6533f, 13.9922f)
                lineTo(13.5f, 14f)
                horizontalLineTo(1.5f)
                lineTo(1.34668f, 13.9922f)
                curveTo(1.17189f, 13.9744f, 1.0063f, 13.926f, 0.854492f, 13.8535f)
                lineTo(0.825195f, 13.8799f)
                lineTo(0.759766f, 13.8037f)
                curveTo(0.348324f, 13.5696f, 0.0579707f, 13.1473f, 0.0078125f, 12.6533f)
                lineTo(0f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(1.51001E-7f, 1.72334f, 0.590277f, 1.08461f, 1.34668f, 1.00781f)
                lineTo(1.5f, 1f)
                horizontalLineTo(13.5f)
                lineTo(13.6533f, 1.00781f)
                close()
                moveTo(1.85156f, 13f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 13f, 14f, 12.7761f, 14f, 12.5f)
                verticalLineTo(2.58691f)
                lineTo(1.85156f, 13f)
                close()
                moveTo(1.5f, 2f)
                curveTo(1.22386f, 2f, 1f, 2.22386f, 1f, 2.5f)
                verticalLineTo(12.4121f)
                lineTo(13.1484f, 2f)
                horizontalLineTo(1.5f)
                close()
            }
        }.build()
        
        return _ViewNone!!
    }

private var _ViewNone: ImageVector? = null

