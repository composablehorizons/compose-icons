package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowsShuffle: ImageVector
    get() {
        if (_ArrowsShuffle != null) return _ArrowsShuffle!!
        
        _ArrowsShuffle = ImageVector.Builder(
            name = "arrows-shuffle",
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
                moveTo(18f, 4f)
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
                moveTo(18f, 20f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 7f)
                horizontalLineToRelative(3f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
                horizontalLineToRelative(5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                horizontalLineToRelative(-5f)
                arcToRelative(4.978f, 4.978f, 0f, false, false, -3f, 1f)
                moveToRelative(-4f, 8f)
                arcToRelative(4.984f, 4.984f, 0f, false, true, -3f, 1f)
                horizontalLineToRelative(-3f)
            }
        }.build()
        
        return _ArrowsShuffle!!
    }

private var _ArrowsShuffle: ImageVector? = null

