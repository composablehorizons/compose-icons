package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Magnetic: ImageVector
    get() {
        if (_Magnetic != null) return _Magnetic!!
        
        _Magnetic = ImageVector.Builder(
            name = "magnetic",
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
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 7f)
                curveToRelative(-0.633f, -1.255f, -1.538f, -2f, -2.5f, -2f)
                curveToRelative(-1.933f, 0f, -3.5f, 3.134f, -3.5f, 7f)
                reflectiveCurveToRelative(1.567f, 7f, 3.5f, 7f)
                reflectiveCurveToRelative(3.5f, -3.134f, 3.5f, -7f)
                verticalLineToRelative(-1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 7f)
                curveToRelative(0.633f, -1.255f, 1.538f, -2f, 2.5f, -2f)
                curveToRelative(1.933f, 0f, 3.5f, 3.134f, 3.5f, 7f)
                reflectiveCurveToRelative(-1.567f, 7f, -3.5f, 7f)
                reflectiveCurveToRelative(-3.5f, -3.134f, -3.5f, -7f)
                verticalLineToRelative(-1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 13f)
                lineToRelative(2f, -2f)
                lineToRelative(2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 13f)
                lineToRelative(2f, -2f)
                lineToRelative(2f, 2f)
            }
        }.build()
        
        return _Magnetic!!
    }

private var _Magnetic: ImageVector? = null

