package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DirectionSignOff: ImageVector
    get() {
        if (_DirectionSignOff != null) return _DirectionSignOff!!
        
        _DirectionSignOff = ImageVector.Builder(
            name = "direction-sign-off",
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
                moveTo(18.73f, 14.724f)
                lineToRelative(1.949f, -1.95f)
                arcToRelative(1.095f, 1.095f, 0f, false, false, 0f, -1.548f)
                lineToRelative(-7.905f, -7.905f)
                arcToRelative(1.095f, 1.095f, 0f, false, false, -1.548f, 0f)
                lineToRelative(-1.95f, 1.95f)
                moveToRelative(-2.01f, 2.01f)
                lineToRelative(-3.945f, 3.945f)
                arcToRelative(1.095f, 1.095f, 0f, false, false, 0f, 1.548f)
                lineToRelative(7.905f, 7.905f)
                curveToRelative(0.427f, 0.428f, 1.12f, 0.428f, 1.548f, 0f)
                lineToRelative(3.95f, -3.95f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.748f, 13.752f)
                lineToRelative(-1.748f, 1.748f)
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
        
        return _DirectionSignOff!!
    }

private var _DirectionSignOff: ImageVector? = null

