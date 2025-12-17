package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MathIntegrals: ImageVector
    get() {
        if (_MathIntegrals != null) return _MathIntegrals!!
        
        _MathIntegrals = ImageVector.Builder(
            name = "math-integrals",
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
                moveTo(3f, 19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                curveToRelative(2f, 0f, 2f, -4f, 3f, -9f)
                reflectiveCurveToRelative(1f, -9f, 3f, -9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                curveToRelative(2f, 0f, 2f, -4f, 3f, -9f)
                reflectiveCurveToRelative(1f, -9f, 3f, -9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
        }.build()
        
        return _MathIntegrals!!
    }

private var _MathIntegrals: ImageVector? = null

