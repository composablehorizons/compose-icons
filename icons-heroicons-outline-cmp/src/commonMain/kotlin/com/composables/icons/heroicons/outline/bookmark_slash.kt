package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BookmarkSlash: ImageVector
    get() {
        if (_BookmarkSlash != null) return _BookmarkSlash!!
        
        _BookmarkSlash = ImageVector.Builder(
            name = "bookmark-slash",
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
                moveTo(3f, 3f)
                lineToRelative(1.664f, 1.664f)
                moveTo(21f, 21f)
                lineToRelative(-1.5f, -1.5f)
                moveToRelative(-5.485f, -1.242f)
                lineTo(12f, 17.25f)
                lineTo(4.5f, 21f)
                verticalLineTo(8.742f)
                moveToRelative(0.164f, -4.078f)
                arcToRelative(2.15f, 2.15f, 0f, false, true, 1.743f, -1.342f)
                arcToRelative(48.507f, 48.507f, 0f, false, true, 11.186f, 0f)
                curveToRelative(1.1f, 0.128f, 1.907f, 1.077f, 1.907f, 2.185f)
                verticalLineTo(19.5f)
                moveTo(4.664f, 4.664f)
                lineTo(19.5f, 19.5f)
            }
        }.build()
        
        return _BookmarkSlash!!
    }

private var _BookmarkSlash: ImageVector? = null

