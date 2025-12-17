package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTesla: ImageVector
    get() {
        if (_BrandTesla != null) return _BrandTesla!!
        
        _BrandTesla = ImageVector.Builder(
            name = "brand-tesla",
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
                moveTo(12f, 21f)
                lineToRelative(3f, -11f)
                curveToRelative(2.359f, 0f, 3f, 0f, 3f, 1f)
                curveToRelative(0f, 0f, 1.18f, -1.745f, 2f, -3f)
                curveToRelative(-3.077f, -1.464f, -6f, -1f, -6f, -1f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                reflectiveCurveToRelative(-2.923f, -0.464f, -6f, 1f)
                curveToRelative(0.82f, 1.255f, 2f, 3f, 2f, 3f)
                curveToRelative(0f, -1f, 0.744f, -1f, 3f, -1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 5f)
                curveToRelative(-5.114f, -2f, -10.886f, -2f, -16f, 0f)
            }
        }.build()
        
        return _BrandTesla!!
    }

private var _BrandTesla: ImageVector? = null

