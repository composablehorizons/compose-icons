package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EarOff: ImageVector
    get() {
        if (_EarOff != null) return _EarOff!!
        
        _EarOff = ImageVector.Builder(
            name = "ear-off",
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
                moveTo(6f, 10f)
                curveToRelative(0f, -1.146f, 0.277f, -2.245f, 0.78f, -3.219f)
                moveToRelative(1.792f, -2.208f)
                arcToRelative(7f, 7f, 0f, false, true, 10.428f, 9.027f)
                arcToRelative(10f, 10f, 0f, false, true, -0.633f, 0.762f)
                moveToRelative(-2.045f, 1.96f)
                arcToRelative(8f, 8f, 0f, false, false, -1.322f, 2.278f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -6.8f, 1.4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.42f, 7.414f)
                arcToRelative(3f, 3f, 0f, false, true, 4.131f, 4.13f)
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
        
        return _EarOff!!
    }

private var _EarOff: ImageVector? = null

