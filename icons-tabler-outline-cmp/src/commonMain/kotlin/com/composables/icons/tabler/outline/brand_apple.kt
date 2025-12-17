package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandApple: ImageVector
    get() {
        if (_BrandApple != null) return _BrandApple!!
        
        _BrandApple = ImageVector.Builder(
            name = "brand-apple",
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
                moveTo(8.286f, 7.008f)
                curveToRelative(-3.216f, 0f, -4.286f, 3.23f, -4.286f, 5.92f)
                curveToRelative(0f, 3.229f, 2.143f, 8.072f, 4.286f, 8.072f)
                curveToRelative(1.165f, -0.05f, 1.799f, -0.538f, 3.214f, -0.538f)
                curveToRelative(1.406f, 0f, 1.607f, 0.538f, 3.214f, 0.538f)
                reflectiveCurveToRelative(4.286f, -3.229f, 4.286f, -5.381f)
                curveToRelative(-0.03f, -0.011f, -2.649f, -0.434f, -2.679f, -3.23f)
                curveToRelative(-0.02f, -2.335f, 2.589f, -3.179f, 2.679f, -3.228f)
                curveToRelative(-1.096f, -1.606f, -3.162f, -2.113f, -3.75f, -2.153f)
                curveToRelative(-1.535f, -0.12f, -3.032f, 1.077f, -3.75f, 1.077f)
                curveToRelative(-0.729f, 0f, -2.036f, -1.077f, -3.214f, -1.077f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
        }.build()
        
        return _BrandApple!!
    }

private var _BrandApple: ImageVector? = null

