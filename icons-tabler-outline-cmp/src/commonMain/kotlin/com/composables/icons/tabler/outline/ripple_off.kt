package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RippleOff: ImageVector
    get() {
        if (_RippleOff != null) return _RippleOff!!
        
        _RippleOff = ImageVector.Builder(
            name = "ripple-off",
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
                moveTo(3f, 7f)
                curveToRelative(0.915f, -0.61f, 1.83f, -1.034f, 2.746f, -1.272f)
                moveToRelative(4.212f, 0.22f)
                curveToRelative(0.68f, 0.247f, 1.361f, 0.598f, 2.042f, 1.052f)
                curveToRelative(3f, 2f, 6f, 2f, 9f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                curveToRelative(3f, -2f, 6f, -2f, 9f, 0f)
                curveToRelative(2.092f, 1.395f, 4.184f, 1.817f, 6.276f, 1.266f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                curveToRelative(3f, -2f, 6f, -2f, 9f, 0f)
                moveToRelative(5.482f, 1.429f)
                curveToRelative(1.173f, -0.171f, 2.345f, -0.647f, 3.518f, -1.429f)
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
        
        return _RippleOff!!
    }

private var _RippleOff: ImageVector? = null

