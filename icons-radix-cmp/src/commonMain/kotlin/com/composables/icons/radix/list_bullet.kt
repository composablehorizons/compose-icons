package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ListBullet: ImageVector
    get() {
        if (_ListBullet != null) return _ListBullet!!
        
        _ListBullet = ImageVector.Builder(
            name = "list-bullet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 9.75002f)
                curveTo(1.91421f, 9.75002f, 2.25f, 10.0858f, 2.25f, 10.5f)
                curveTo(2.25f, 10.9142f, 1.91421f, 11.25f, 1.5f, 11.25f)
                curveTo(1.08579f, 11.25f, 0.75f, 10.9142f, 0.75f, 10.5f)
                curveTo(0.75f, 10.0858f, 1.08579f, 9.75002f, 1.5f, 9.75002f)
                close()
                moveTo(13.6006f, 10.0098f)
                curveTo(13.8286f, 10.0563f, 14f, 10.2583f, 14f, 10.5f)
                curveTo(14f, 10.7417f, 13.8286f, 10.9437f, 13.6006f, 10.9902f)
                lineTo(13.5f, 11f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 11f, 4f, 10.7762f, 4f, 10.5f)
                curveTo(4f, 10.2239f, 4.22386f, 10f, 4.5f, 10f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 10.0098f)
                close()
                moveTo(1.5f, 6.75002f)
                curveTo(1.91421f, 6.75002f, 2.25f, 7.0858f, 2.25f, 7.50002f)
                curveTo(2.25f, 7.91423f, 1.91421f, 8.25002f, 1.5f, 8.25002f)
                curveTo(1.08579f, 8.25002f, 0.75f, 7.91423f, 0.75f, 7.50002f)
                curveTo(0.75f, 7.0858f, 1.08579f, 6.75002f, 1.5f, 6.75002f)
                close()
                moveTo(13.6006f, 7.00978f)
                curveTo(13.8286f, 7.05631f, 14f, 7.2583f, 14f, 7.50002f)
                curveTo(14f, 7.74173f, 13.8286f, 7.94372f, 13.6006f, 7.99025f)
                lineTo(13.5f, 8.00002f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 8.00002f, 4f, 7.77616f, 4f, 7.50002f)
                curveTo(4f, 7.22387f, 4.22386f, 7.00002f, 4.5f, 7.00002f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 7.00978f)
                close()
                moveTo(1.5f, 3.75002f)
                curveTo(1.91421f, 3.75002f, 2.25f, 4.0858f, 2.25f, 4.50002f)
                curveTo(2.25f, 4.91423f, 1.91421f, 5.25002f, 1.5f, 5.25002f)
                curveTo(1.08579f, 5.25002f, 0.75f, 4.91423f, 0.75f, 4.50002f)
                curveTo(0.75f, 4.0858f, 1.08579f, 3.75002f, 1.5f, 3.75002f)
                close()
                moveTo(13.6006f, 4.00978f)
                curveTo(13.8286f, 4.05631f, 14f, 4.2583f, 14f, 4.50002f)
                curveTo(14f, 4.74173f, 13.8286f, 4.94372f, 13.6006f, 4.99025f)
                lineTo(13.5f, 5.00002f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 5.00002f, 4f, 4.77616f, 4f, 4.50002f)
                curveTo(4f, 4.22387f, 4.22386f, 4.00002f, 4.5f, 4.00002f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 4.00978f)
                close()
            }
        }.build()
        
        return _ListBullet!!
    }

private var _ListBullet: ImageVector? = null

