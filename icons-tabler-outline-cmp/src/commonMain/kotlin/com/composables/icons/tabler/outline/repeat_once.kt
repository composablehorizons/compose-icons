package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RepeatOnce: ImageVector
    get() {
        if (_RepeatOnce != null) return _RepeatOnce!!
        
        _RepeatOnce = ImageVector.Builder(
            name = "repeat-once",
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
                moveTo(4f, 12f)
                verticalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(13f)
                moveToRelative(-3f, -3f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-13f)
                moveToRelative(3f, 3f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 11f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(4f)
            }
        }.build()
        
        return _RepeatOnce!!
    }

private var _RepeatOnce: ImageVector? = null

