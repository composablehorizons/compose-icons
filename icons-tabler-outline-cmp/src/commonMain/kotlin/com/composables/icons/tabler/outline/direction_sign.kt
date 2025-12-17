package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DirectionSign: ImageVector
    get() {
        if (_DirectionSign != null) return _DirectionSign!!
        
        _DirectionSign = ImageVector.Builder(
            name = "direction-sign",
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
                moveTo(3.32f, 12.774f)
                lineToRelative(7.906f, 7.905f)
                curveToRelative(0.427f, 0.428f, 1.12f, 0.428f, 1.548f, 0f)
                lineToRelative(7.905f, -7.905f)
                arcToRelative(1.095f, 1.095f, 0f, false, false, 0f, -1.548f)
                lineToRelative(-7.905f, -7.905f)
                arcToRelative(1.095f, 1.095f, 0f, false, false, -1.548f, 0f)
                lineToRelative(-7.905f, 7.905f)
                arcToRelative(1.095f, 1.095f, 0f, false, false, 0f, 1.548f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineToRelative(7.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
            }
        }.build()
        
        return _DirectionSign!!
    }

private var _DirectionSign: ImageVector? = null

