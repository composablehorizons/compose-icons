package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RecycleOff: ImageVector
    get() {
        if (_RecycleOff != null) return _RecycleOff!!
        
        _RecycleOff = ImageVector.Builder(
            name = "recycle-off",
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
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
                moveToRelative(-2f, -2f)
                horizontalLineToRelative(9f)
                moveToRelative(1.896f, -2.071f)
                arcToRelative(2f, 2f, 0f, false, false, -0.146f, -0.679f)
                lineToRelative(-0.55f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.536f, 11f)
                lineToRelative(-0.732f, -2.732f)
                lineToRelative(-2.732f, 0.732f)
                moveToRelative(2.732f, -0.732f)
                lineToRelative(-4.5f, 7.794f)
                arcToRelative(2f, 2f, 0f, false, false, 1.506f, 2.89f)
                lineToRelative(1.141f, 0.024f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.464f, 11f)
                lineToRelative(2.732f, 0.732f)
                lineToRelative(0.732f, -2.732f)
                moveToRelative(-0.732f, 2.732f)
                lineToRelative(-4.5f, -7.794f)
                arcToRelative(2f, 2f, 0f, false, false, -3.256f, -0.14f)
                lineToRelative(-0.591f, 0.976f)
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
        
        return _RecycleOff!!
    }

private var _RecycleOff: ImageVector? = null

