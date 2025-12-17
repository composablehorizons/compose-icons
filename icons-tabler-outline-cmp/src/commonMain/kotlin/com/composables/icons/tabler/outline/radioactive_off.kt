package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RadioactiveOff: ImageVector
    get() {
        if (_RadioactiveOff != null) return _RadioactiveOff!!
        
        _RadioactiveOff = ImageVector.Builder(
            name = "radioactive-off",
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
                moveTo(14.118f, 14.127f)
                curveToRelative(-0.182f, 0.181f, -0.39f, 0.341f, -0.618f, 0.473f)
                lineToRelative(3f, 5.19f)
                arcToRelative(9f, 9f, 0f, false, false, 1.856f, -1.423f)
                moveToRelative(1.68f, -2.32f)
                arcToRelative(8.993f, 8.993f, 0f, false, false, 0.964f, -4.047f)
                horizontalLineToRelative(-5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 9.4f)
                lineToRelative(3f, -5.19f)
                arcToRelative(9f, 9f, 0f, false, false, -8.536f, -0.25f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 14.6f)
                lineToRelative(-3f, 5.19f)
                arcToRelative(9f, 9f, 0f, false, true, -4.5f, -7.79f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, false, 1.5f, 2.6f)
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
        
        return _RadioactiveOff!!
    }

private var _RadioactiveOff: ImageVector? = null

