package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FingerprintPattern: ImageVector
    get() {
        if (_FingerprintPattern != null) return _FingerprintPattern!!
        
        _FingerprintPattern = ImageVector.Builder(
            name = "fingerprint-pattern",
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
                moveTo(12f, 10f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                curveToRelative(0f, 1.02f, -0.1f, 2.51f, -0.26f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13.12f)
                curveToRelative(0f, 2.38f, 0f, 6.38f, -1f, 8.88f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.29f, 21.02f)
                curveToRelative(0.12f, -0.6f, 0.43f, -2.3f, 0.5f, -3.02f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                arcToRelative(10f, 10f, 0f, false, true, 18f, -6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 16f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.8f, 16f)
                curveToRelative(0.2f, -2f, 0.131f, -5.354f, 0f, -6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 19.5f)
                curveTo(5.5f, 18f, 6f, 15f, 6f, 12f)
                arcToRelative(6f, 6f, 0f, false, true, 0.34f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.65f, 22f)
                curveToRelative(0.21f, -0.66f, 0.45f, -1.32f, 0.57f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6.8f)
                arcToRelative(6f, 6f, 0f, false, true, 9f, 5.2f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _FingerprintPattern!!
    }

private var _FingerprintPattern: ImageVector? = null

