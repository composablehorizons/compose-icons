package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BubbleTea2: ImageVector
    get() {
        if (_BubbleTea2 != null) return _BubbleTea2!!
        
        _BubbleTea2 = ImageVector.Builder(
            name = "bubble-tea-2",
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
                moveTo(17.95f, 9f)
                lineToRelative(-1.478f, 8.69f)
                curveToRelative(-0.25f, 1.463f, -0.374f, 2.195f, -0.936f, 2.631f)
                curveToRelative(-1.2f, 0.931f, -6.039f, 0.88f, -7.172f, 0f)
                curveToRelative(-0.562f, -0.436f, -0.687f, -1.168f, -0.936f, -2.632f)
                lineToRelative(-1.478f, -8.689f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                lineToRelative(0.514f, -1.286f)
                arcToRelative(5.908f, 5.908f, 0f, false, true, 10.972f, 0f)
                lineToRelative(0.514f, 1.286f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 9f)
                horizontalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                lineToRelative(4f, -7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                curveToRelative(0.593f, 0.642f, 1.484f, 1.017f, 2.5f, 1f)
                curveToRelative(1.016f, 0.017f, 1.907f, -0.358f, 2.5f, -1f)
                reflectiveCurveToRelative(1.484f, -1.017f, 2.5f, -1f)
                curveToRelative(1.016f, -0.017f, 1.907f, 0.358f, 2.5f, 1f)
            }
        }.build()
        
        return _BubbleTea2!!
    }

private var _BubbleTea2: ImageVector? = null

