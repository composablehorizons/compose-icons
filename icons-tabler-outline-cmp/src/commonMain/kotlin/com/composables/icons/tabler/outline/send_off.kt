package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SendOff: ImageVector
    get() {
        if (_SendOff != null) return _SendOff!!
        
        _SendOff = ImageVector.Builder(
            name = "send-off",
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
                moveTo(10f, 14f)
                lineToRelative(2f, -2f)
                moveToRelative(2f, -2f)
                lineToRelative(7f, -7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.718f, 6.713f)
                lineToRelative(10.282f, -3.713f)
                lineToRelative(-3.715f, 10.289f)
                moveToRelative(-1.063f, 2.941f)
                lineToRelative(-1.722f, 4.77f)
                arcToRelative(0.55f, 0.55f, 0f, false, true, -1f, 0f)
                lineToRelative(-3.5f, -7f)
                lineToRelative(-7f, -3.5f)
                arcToRelative(0.55f, 0.55f, 0f, false, true, 0f, -1f)
                lineToRelative(4.772f, -1.723f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _SendOff!!
    }

private var _SendOff: ImageVector? = null

