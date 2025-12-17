package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RewindBackward30: ImageVector
    get() {
        if (_RewindBackward30 != null) return _RewindBackward30!!
        
        _RewindBackward30 = ImageVector.Builder(
            name = "rewind-backward-30",
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
                moveTo(19.007f, 16.466f)
                arcToRelative(6f, 6f, 0f, false, false, -4.007f, -10.466f)
                horizontalLineToRelative(-11f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15.5f)
                verticalLineToRelative(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -3f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-1.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
        }.build()
        
        return _RewindBackward30!!
    }

private var _RewindBackward30: ImageVector? = null

