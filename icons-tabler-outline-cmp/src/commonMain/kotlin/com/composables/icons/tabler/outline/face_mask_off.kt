package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FaceMaskOff: ImageVector
    get() {
        if (_FaceMaskOff != null) return _FaceMaskOff!!
        
        _FaceMaskOff = ImageVector.Builder(
            name = "face-mask-off",
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
                moveTo(5f, 14.5f)
                horizontalLineToRelative(-0.222f)
                curveToRelative(-1.535f, 0f, -2.778f, -1.12f, -2.778f, -2.5f)
                reflectiveCurveToRelative(1.243f, -2.5f, 2.778f, -2.5f)
                horizontalLineToRelative(0.222f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 14.5f)
                horizontalLineToRelative(0.222f)
                curveToRelative(1.534f, 0f, 2.778f, -1.12f, 2.778f, -2.5f)
                reflectiveCurveToRelative(-1.244f, -2.5f, -2.778f, -2.5f)
                horizontalLineToRelative(-0.222f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10f)
                horizontalLineToRelative(1f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 14f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 15f)
                verticalLineToRelative(-6.49f)
                arcToRelative(2f, 2f, 0f, false, false, -1.45f, -1.923f)
                lineToRelative(-5f, -1.429f)
                arcToRelative(2f, 2f, 0f, false, false, -1.1f, 0f)
                lineToRelative(-1.788f, 0.511f)
                moveToRelative(-3.118f, 0.891f)
                lineToRelative(-0.094f, 0.027f)
                arcToRelative(2f, 2f, 0f, false, false, -1.45f, 1.922f)
                verticalLineToRelative(6.982f)
                arcToRelative(2f, 2f, 0f, false, false, 1.45f, 1.923f)
                lineToRelative(5f, 1.429f)
                arcToRelative(2f, 2f, 0f, false, false, 1.1f, 0f)
                lineToRelative(4.899f, -1.4f)
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
        
        return _FaceMaskOff!!
    }

private var _FaceMaskOff: ImageVector? = null

