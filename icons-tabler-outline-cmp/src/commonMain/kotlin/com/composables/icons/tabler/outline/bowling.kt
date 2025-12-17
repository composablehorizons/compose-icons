package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bowling: ImageVector
    get() {
        if (_Bowling != null) return _Bowling!!
        
        _Bowling = ImageVector.Builder(
            name = "bowling",
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
                moveTo(7f, 11f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 10f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.059f, 6.07f)
                arcToRelative(8f, 8f, 0f, true, false, 0.32f, 15.81f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.969f, 9f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.969f, 5f)
                curveToRelative(0f, 1.5f, 1f, 2f, 1f, 4f)
                curveToRelative(0f, 2.5f, -2f, 4.5f, -2f, 7f)
                curveToRelative(0f, 2.6f, 1.9f, 6f, 1.9f, 6f)
                horizontalLineToRelative(4.1f)
                reflectiveCurveToRelative(2f, -3.4f, 2f, -6f)
                curveToRelative(0f, -2.5f, -2f, -4.5f, -2f, -7f)
                curveToRelative(0f, -2f, 1f, -2.5f, 1f, -4f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
            }
        }.build()
        
        return _Bowling!!
    }

private var _Bowling: ImageVector? = null

