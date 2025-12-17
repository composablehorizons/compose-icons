package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FishOff: ImageVector
    get() {
        if (_FishOff != null) return _FishOff!!
        
        _FishOff = ImageVector.Builder(
            name = "fish-off",
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
                moveTo(16.69f, 7.44f)
                arcToRelative(6.973f, 6.973f, 0f, false, false, -1.63f, 3.635f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9.504f)
                curveToRelative(5.307f, 5.948f, 10.293f, 8.57f, 14.597f, 7.1f)
                moveToRelative(2.583f, -1.449f)
                curveToRelative(0.988f, -0.788f, 1.93f, -1.836f, 2.82f, -3.153f)
                curveToRelative(-3f, -4.443f, -6.596f, -5.812f, -10.564f, -4.548f)
                moveToRelative(-2.764f, 1.266f)
                curveToRelative(-2.145f, 1.266f, -4.378f, 3.215f, -6.672f, 5.786f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 11f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.153f, 11.169f)
                curveToRelative(-0.287f, 0.777f, -0.171f, 1.554f, 0.347f, 2.331f)
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
        
        return _FishOff!!
    }

private var _FishOff: ImageVector? = null

