package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BookmarkEdit: ImageVector
    get() {
        if (_BookmarkEdit != null) return _BookmarkEdit!!
        
        _BookmarkEdit = ImageVector.Builder(
            name = "bookmark-edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                lineToRelative(-6f, 4f)
                verticalLineToRelative(-14f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(4f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.42f, 15.61f)
                arcToRelative(2.1f, 2.1f, 0f, true, true, 2.97f, 2.97f)
                lineToRelative(-3.39f, 3.42f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineToRelative(3.42f, -3.39f)
                close()
            }
        }.build()
        
        return _BookmarkEdit!!
    }

private var _BookmarkEdit: ImageVector? = null

