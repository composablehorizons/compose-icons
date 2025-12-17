package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Rss: ImageVector
    get() {
        if (_Rss != null) return _Rss!!
        
        _Rss = ImageVector.Builder(
            name = "rss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(12.75f, 19.5f)
                verticalLineToRelative(-0.75f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, -7.5f, -7.5f)
                horizontalLineTo(4.5f)
                moveToRelative(0f, -6.75f)
                horizontalLineToRelative(0.75f)
                curveToRelative(7.87f, 0f, 14.25f, 6.38f, 14.25f, 14.25f)
                verticalLineToRelative(0.75f)
                moveTo(6f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
            }
        }.build()
        
        return _Rss!!
    }

private var _Rss: ImageVector? = null

