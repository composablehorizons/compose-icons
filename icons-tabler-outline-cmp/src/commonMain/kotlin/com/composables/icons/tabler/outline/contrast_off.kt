package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ContrastOff: ImageVector
    get() {
        if (_ContrastOff != null) return _ContrastOff!!
        
        _ContrastOff = ImageVector.Builder(
            name = "contrast-off",
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
                moveTo(12f, 12f)
                verticalLineToRelative(5f)
                arcToRelative(4.984f, 4.984f, 0f, false, false, 3.522f, -1.45f)
                moveToRelative(1.392f, -2.623f)
                arcToRelative(5f, 5f, 0f, false, false, -4.914f, -5.927f)
                verticalLineToRelative(1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.641f, 5.631f)
                arcToRelative(9f, 9f, 0f, true, false, 12.719f, 12.738f)
                moveToRelative(1.68f, -2.318f)
                arcToRelative(9f, 9f, 0f, false, false, -12.074f, -12.098f)
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
        
        return _ContrastOff!!
    }

private var _ContrastOff: ImageVector? = null

