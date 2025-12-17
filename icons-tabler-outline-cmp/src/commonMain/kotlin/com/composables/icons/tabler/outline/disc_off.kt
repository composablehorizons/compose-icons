package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DiscOff: ImageVector
    get() {
        if (_DiscOff != null) return _DiscOff!!
        
        _DiscOff = ImageVector.Builder(
            name = "disc-off",
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
                moveTo(20.044f, 16.04f)
                arcToRelative(9f, 9f, 0f, false, false, -12.082f, -12.085f)
                moveToRelative(-2.333f, 1.688f)
                arcToRelative(9f, 9f, 0f, false, false, 6.371f, 15.357f)
                curveToRelative(2.491f, 0f, 4.73f, -1f, 6.36f, -2.631f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.298f, 11.288f)
                arcToRelative(1f, 1f, 0f, true, false, 1.402f, 1.427f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12f)
                curveToRelative(0f, -1.38f, 0.559f, -2.629f, 1.462f, -3.534f)
                moveToRelative(2.607f, -1.38f)
                curveToRelative(0.302f, -0.056f, 0.613f, -0.086f, 0.931f, -0.086f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                arcToRelative(4.985f, 4.985f, 0f, false, false, 3.551f, -1.48f)
                moveToRelative(1.362f, -2.587f)
                curveToRelative(0.057f, -0.302f, 0.087f, -0.614f, 0.087f, -0.933f)
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
        
        return _DiscOff!!
    }

private var _DiscOff: ImageVector? = null

