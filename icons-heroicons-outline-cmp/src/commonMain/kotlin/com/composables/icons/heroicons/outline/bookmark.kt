package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) return _Bookmark!!
        
        _Bookmark = ImageVector.Builder(
            name = "bookmark",
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
                moveTo(17.593f, 3.322f)
                curveToRelative(1.1f, 0.128f, 1.907f, 1.077f, 1.907f, 2.185f)
                verticalLineTo(21f)
                lineTo(12f, 17.25f)
                lineTo(4.5f, 21f)
                verticalLineTo(5.507f)
                curveToRelative(0f, -1.108f, 0.806f, -2.057f, 1.907f, -2.185f)
                arcToRelative(48.507f, 48.507f, 0f, false, true, 11.186f, 0f)
                close()
            }
        }.build()
        
        return _Bookmark!!
    }

private var _Bookmark: ImageVector? = null

