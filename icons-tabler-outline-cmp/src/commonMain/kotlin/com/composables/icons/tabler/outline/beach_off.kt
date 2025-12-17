package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BeachOff: ImageVector
    get() {
        if (_BeachOff != null) return _BeachOff!!
        
        _BeachOff = ImageVector.Builder(
            name = "beach-off",
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
                moveTo(15.071f, 15.102f)
                arcToRelative(7.502f, 7.502f, 0f, false, false, -8.124f, 1.648f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.27f, 6.269f)
                lineToRelative(9.926f, 5.731f)
                arcToRelative(6f, 6f, 0f, false, false, -10.32f, -6.123f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.732f, 10f)
                curveToRelative(1.658f, -2.87f, 2.225f, -5.644f, 1.268f, -6.196f)
                curveToRelative(-0.957f, -0.552f, -3.075f, 1.326f, -4.732f, 4.196f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                lineToRelative(-0.739f, 1.279f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.794f, 12.82f)
                lineToRelative(-0.794f, 1.376f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 19.25f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1f, -0.25f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.135f, -0.858f)
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
        
        return _BeachOff!!
    }

private var _BeachOff: ImageVector? = null

