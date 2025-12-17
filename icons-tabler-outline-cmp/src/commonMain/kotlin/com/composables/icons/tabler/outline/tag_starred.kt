package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TagStarred: ImageVector
    get() {
        if (_TagStarred != null) return _TagStarred!!
        
        _TagStarred = ImageVector.Builder(
            name = "tag-starred",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 7.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                verticalLineToRelative(5.172f)
                arcToRelative(2f, 2f, 0f, false, false, 0.586f, 1.414f)
                lineToRelative(7.71f, 7.71f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 3.408f, 0f)
                lineToRelative(5.592f, -5.592f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, -3.408f)
                lineToRelative(-7.71f, -7.71f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, -0.586f)
                horizontalLineToRelative(-5.172f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 13.847f)
                lineToRelative(-1.5f, 1.153f)
                lineToRelative(0.532f, -1.857f)
                lineToRelative(-1.532f, -1.143f)
                horizontalLineToRelative(1.902f)
                lineToRelative(0.598f, -1.8f)
                lineToRelative(0.598f, 1.8f)
                horizontalLineToRelative(1.902f)
                lineToRelative(-1.532f, 1.143f)
                lineToRelative(0.532f, 1.857f)
                close()
            }
        }.build()
        
        return _TagStarred!!
    }

private var _TagStarred: ImageVector? = null

