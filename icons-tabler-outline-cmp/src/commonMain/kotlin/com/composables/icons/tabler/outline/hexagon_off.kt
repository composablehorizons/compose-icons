package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HexagonOff: ImageVector
    get() {
        if (_HexagonOff != null) return _HexagonOff!!
        
        _HexagonOff = ImageVector.Builder(
            name = "hexagon-off",
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
                moveTo(8.693f, 4.69f)
                lineToRelative(2.336f, -1.39f)
                arcToRelative(2.056f, 2.056f, 0f, false, true, 2f, 0f)
                lineToRelative(6f, 3.573f)
                horizontalLineToRelative(-0.029f)
                arcToRelative(2f, 2f, 0f, false, true, 1f, 1.747f)
                verticalLineToRelative(6.536f)
                curveToRelative(0f, 0.246f, -0.045f, 0.485f, -0.13f, 0.707f)
                moveToRelative(-2.16f, 1.847f)
                lineToRelative(-4.739f, 3.027f)
                arcToRelative(2f, 2f, 0f, false, true, -1.942f, 0f)
                lineToRelative(-6f, -3.833f)
                arcToRelative(2f, 2f, 0f, false, true, -1.029f, -1.747f)
                verticalLineToRelative(-6.537f)
                arcToRelative(2f, 2f, 0f, false, true, 1.029f, -1.748f)
                lineToRelative(1.154f, -0.687f)
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
        
        return _HexagonOff!!
    }

private var _HexagonOff: ImageVector? = null

