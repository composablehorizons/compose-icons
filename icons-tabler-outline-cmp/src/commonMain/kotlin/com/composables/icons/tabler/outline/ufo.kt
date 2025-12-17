package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ufo: ImageVector
    get() {
        if (_Ufo != null) return _Ufo!!
        
        _Ufo = ImageVector.Builder(
            name = "ufo",
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
                moveTo(16.95f, 9.01f)
                curveToRelative(3.02f, 0.739f, 5.05f, 2.123f, 5.05f, 3.714f)
                curveToRelative(0f, 2.367f, -4.48f, 4.276f, -10f, 4.276f)
                reflectiveCurveToRelative(-10f, -1.909f, -10f, -4.276f)
                curveToRelative(0f, -1.59f, 2.04f, -2.985f, 5.07f, -3.724f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                curveToRelative(0f, 1.105f, 2.239f, 2f, 5f, 2f)
                reflectiveCurveToRelative(5f, -0.895f, 5f, -2f)
                verticalLineToRelative(-0.035f)
                curveToRelative(0f, -2.742f, -2.239f, -4.965f, -5f, -4.965f)
                reflectiveCurveToRelative(-5f, 2.223f, -5f, 4.965f)
                verticalLineToRelative(0.035f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 17f)
                lineToRelative(2f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 17f)
                lineToRelative(-1.5f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 13f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _Ufo!!
    }

private var _Ufo: ImageVector? = null

