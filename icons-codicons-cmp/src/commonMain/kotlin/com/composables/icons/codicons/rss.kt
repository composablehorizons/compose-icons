package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Rss: ImageVector
    get() {
        if (_Rss != null) return _Rss!!
        
        _Rss = ImageVector.Builder(
            name = "rss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4.5f)
                curveTo(1f, 3.119f, 2.119f, 2f, 3.5f, 2f)
                horizontalLineTo(11.5f)
                curveTo(12.881f, 2f, 14f, 3.119f, 14f, 4.5f)
                verticalLineTo(12.5f)
                curveTo(14f, 13.881f, 12.881f, 15f, 11.5f, 15f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 15f, 1f, 13.881f, 1f, 12.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(3.5f, 3f)
                curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 14f, 13f, 13.328f, 13f, 12.5f)
                verticalLineTo(4.5f)
                curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
                horizontalLineTo(3.5f)
                close()
                moveTo(4.5f, 12.25f)
                curveTo(4.914f, 12.25f, 5.25f, 11.914f, 5.25f, 11.5f)
                curveTo(5.25f, 11.086f, 4.914f, 10.75f, 4.5f, 10.75f)
                curveTo(4.086f, 10.75f, 3.75f, 11.086f, 3.75f, 11.5f)
                curveTo(3.75f, 11.914f, 4.086f, 12.25f, 4.5f, 12.25f)
                close()
                moveTo(8f, 11.5f)
                curveTo(8f, 9.57f, 6.43f, 8f, 4.5f, 8f)
                curveTo(4.224f, 8f, 4f, 8.224f, 4f, 8.5f)
                curveTo(4f, 8.776f, 4.224f, 9f, 4.5f, 9f)
                curveTo(5.879f, 9f, 7f, 10.121f, 7f, 11.5f)
                curveTo(7f, 11.776f, 7.224f, 12f, 7.5f, 12f)
                curveTo(7.776f, 12f, 8f, 11.776f, 8f, 11.5f)
                close()
                moveTo(11f, 11.5f)
                curveTo(11f, 7.916f, 8.084f, 5f, 4.5f, 5f)
                curveTo(4.224f, 5f, 4f, 5.224f, 4f, 5.5f)
                curveTo(4f, 5.776f, 4.224f, 6f, 4.5f, 6f)
                curveTo(7.532f, 6f, 10f, 8.468f, 10f, 11.5f)
                curveTo(10f, 11.776f, 10.224f, 12f, 10.5f, 12f)
                curveTo(10.776f, 12f, 11f, 11.776f, 11f, 11.5f)
                close()
            }
        }.build()
        
        return _Rss!!
    }

private var _Rss: ImageVector? = null

