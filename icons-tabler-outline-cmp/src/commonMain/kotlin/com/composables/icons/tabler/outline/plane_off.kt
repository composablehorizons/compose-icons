package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PlaneOff: ImageVector
    get() {
        if (_PlaneOff != null) return _PlaneOff!!
        
        _PlaneOff = ImageVector.Builder(
            name = "plane-off",
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
                moveTo(9.788f, 5.758f)
                lineToRelative(-0.788f, -2.758f)
                horizontalLineToRelative(3f)
                lineToRelative(4f, 7f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineToRelative(-2f)
                moveToRelative(-2.718f, 1.256f)
                lineToRelative(-3.282f, 5.744f)
                horizontalLineToRelative(-3f)
                lineToRelative(2f, -7f)
                horizontalLineToRelative(-4f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(-3f)
                lineToRelative(2f, -4f)
                lineToRelative(-2f, -4f)
                horizontalLineToRelative(3f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(3f)
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
        
        return _PlaneOff!!
    }

private var _PlaneOff: ImageVector? = null

