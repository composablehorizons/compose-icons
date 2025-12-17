package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.GhostOff: ImageVector
    get() {
        if (_GhostOff != null) return _GhostOff!!
        
        _GhostOff = ImageVector.Builder(
            name = "ghost-off",
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
                moveTo(8.794f, 4.776f)
                arcToRelative(7f, 7f, 0f, false, true, 10.206f, 6.224f)
                verticalLineToRelative(4f)
                moveToRelative(-0.12f, 3.898f)
                arcToRelative(1.779f, 1.779f, 0f, false, true, -2.98f, 0.502f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -2.6f, 0f)
                arcToRelative(1.65f, 1.65f, 0f, false, true, -2.6f, 0f)
                arcToRelative(1.65f, 1.65f, 0f, false, false, -2.6f, 0f)
                arcToRelative(1.78f, 1.78f, 0f, false, true, -3.1f, -1.4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.683f, 0.594f, -3.227f, 1.583f, -4.434f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 4f, 0f)
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
        
        return _GhostOff!!
    }

private var _GhostOff: ImageVector? = null

