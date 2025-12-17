package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SwordOff: ImageVector
    get() {
        if (_SwordOff != null) return _SwordOff!!
        
        _SwordOff = ImageVector.Builder(
            name = "sword-off",
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
                moveTo(11.938f, 7.937f)
                lineToRelative(3.062f, -3.937f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineToRelative(-3.928f, 3.055f)
                moveToRelative(-2.259f, 1.757f)
                lineToRelative(-2.813f, 2.188f)
                lineToRelative(-4f, 4f)
                lineToRelative(-3f, -3f)
                lineToRelative(4f, -4f)
                lineToRelative(2.19f, -2.815f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 11.5f)
                lineToRelative(6f, 6f)
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
        
        return _SwordOff!!
    }

private var _SwordOff: ImageVector? = null

