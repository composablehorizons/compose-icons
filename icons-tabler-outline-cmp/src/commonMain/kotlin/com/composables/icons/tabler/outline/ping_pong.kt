package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PingPong: ImageVector
    get() {
        if (_PingPong != null) return _PingPong!!
        
        _PingPong = ImageVector.Builder(
            name = "ping-pong",
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
                moveTo(12.718f, 20.713f)
                arcToRelative(7.64f, 7.64f, 0f, false, true, -7.48f, -12.755f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(7.643f, 7.643f, 0f, false, true, 9.105f, -1.283f)
                lineToRelative(2.387f, -2.345f)
                arcToRelative(2.08f, 2.08f, 0f, false, true, 3.057f, 2.815f)
                lineToRelative(-0.116f, 0.126f)
                lineToRelative(-2.346f, 2.387f)
                arcToRelative(7.644f, 7.644f, 0f, false, true, -1.052f, 8.864f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.3f, 5.3f)
                lineToRelative(9.4f, 9.4f)
            }
        }.build()
        
        return _PingPong!!
    }

private var _PingPong: ImageVector? = null

