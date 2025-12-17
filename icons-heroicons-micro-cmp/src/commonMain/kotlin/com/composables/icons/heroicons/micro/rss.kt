package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Rss: ImageVector
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
                moveTo(2f, 2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.75f, 2f)
                curveTo(8.963f, 2f, 14f, 7.037f, 14f, 13.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                curveToRelative(0f, -5.385f, -4.365f, -9.75f, -9.75f, -9.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 2.75f)
                close()
                moveToRelative(0f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                arcToRelative(6.75f, 6.75f, 0f, false, true, 6.75f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                curveTo(8f, 10.35f, 5.65f, 8f, 2.75f, 8f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 7.25f)
                close()
                moveTo(3.5f, 11f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                close()
            }
        }.build()
        
        return _Rss!!
    }

private var _Rss: ImageVector? = null

