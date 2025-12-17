package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AlertTriangleOff: ImageVector
    get() {
        if (_AlertTriangleOff != null) return _AlertTriangleOff!!
        
        _AlertTriangleOff = ImageVector.Builder(
            name = "alert-triangle-off",
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
                moveTo(21.998f, 17.997f)
                arcToRelative(1.913f, 1.913f, 0f, false, false, -0.255f, -0.872f)
                lineToRelative(-8.106f, -13.534f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -3.274f, 0f)
                lineToRelative(-1.04f, 1.736f)
                moveToRelative(-1.493f, 2.493f)
                lineToRelative(-5.573f, 9.304f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, 1.636f, 2.871f)
                horizontalLineToRelative(16.107f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(0.01f)
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
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                verticalLineToRelative(1f)
            }
        }.build()
        
        return _AlertTriangleOff!!
    }

private var _AlertTriangleOff: ImageVector? = null

