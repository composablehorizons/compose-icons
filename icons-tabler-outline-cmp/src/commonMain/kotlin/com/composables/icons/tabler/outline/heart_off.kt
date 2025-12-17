package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HeartOff: ImageVector
    get() {
        if (_HeartOff != null) return _HeartOff!!
        
        _HeartOff = ImageVector.Builder(
            name = "heart-off",
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
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 12.572f)
                lineToRelative(-1.5f, 1.428f)
                moveToRelative(-2f, 2f)
                lineToRelative(-4f, 4f)
                lineToRelative(-7.5f, -7.428f)
                arcToRelative(5f, 5f, 0f, false, true, -1.288f, -5.068f)
                arcToRelative(4.976f, 4.976f, 0f, false, true, 1.788f, -2.504f)
                moveToRelative(3f, -1f)
                curveToRelative(1.56f, 0f, 3.05f, 0.727f, 4f, 2f)
                arcToRelative(5f, 5f, 0f, true, true, 7.5f, 6.572f)
            }
        }.build()
        
        return _HeartOff!!
    }

private var _HeartOff: ImageVector? = null

