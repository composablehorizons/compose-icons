package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ThumbDownOff: ImageVector
    get() {
        if (_ThumbDownOff != null) return _ThumbDownOff!!
        
        _ThumbDownOff = ImageVector.Builder(
            name = "thumb-down-off",
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
                moveTo(7f, 13f)
                verticalLineToRelative(-6f)
                moveToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                verticalLineToRelative(-3f)
                moveToRelative(2f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                lineToRelative(-1f, -5f)
                curveToRelative(-0.295f, -1.26f, -1.11f, -2.076f, -2f, -2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.57f, 0f, -1.102f, 0.159f, -1.556f, 0.434f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _ThumbDownOff!!
    }

private var _ThumbDownOff: ImageVector? = null

