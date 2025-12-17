package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FingerprintOff: ImageVector
    get() {
        if (_FingerprintOff != null) return _FingerprintOff!!
        
        _FingerprintOff = ImageVector.Builder(
            name = "fingerprint-off",
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
                moveTo(18.9f, 7f)
                arcToRelative(8f, 8f, 0f, false, true, 1.1f, 5f)
                verticalLineToRelative(1f)
                arcToRelative(6f, 6f, 0f, false, false, 0.8f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11f)
                curveToRelative(0f, -0.848f, 0.264f, -1.634f, 0.713f, -2.28f)
                moveToRelative(2.4f, -1.621f)
                arcToRelative(4f, 4f, 0f, false, true, 4.887f, 3.901f)
                lineToRelative(0f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineToRelative(1f)
                arcToRelative(14f, 14f, 0f, false, false, 2.5f, 8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 15f)
                arcToRelative(18f, 18f, 0f, false, false, 1.8f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.9f, 19f)
                arcToRelative(22f, 22f, 0f, false, true, -0.9f, -7f)
                verticalLineToRelative(-1f)
                arcToRelative(8f, 8f, 0f, false, true, 1.854f, -5.143f)
                moveToRelative(2.176f, -1.825f)
                arcToRelative(8f, 8f, 0f, false, true, 7.97f, 0.018f)
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
        
        return _FingerprintOff!!
    }

private var _FingerprintOff: ImageVector? = null

