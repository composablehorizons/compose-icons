package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Diabolo: ImageVector
    get() {
        if (_Diabolo != null) return _Diabolo!!
        
        _Diabolo = ImageVector.Builder(
            name = "diabolo",
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
                moveTo(12f, 6f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 3f, 0f, true, false, 16f, 0f)
                arcToRelative(8f, 3f, 0f, true, false, -16f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                verticalLineToRelative(0.143f)
                arcToRelative(1f, 1f, 0f, false, false, 0.048f, 0.307f)
                lineToRelative(1.952f, 5.55f)
                lineToRelative(-1.964f, 5.67f)
                arcToRelative(1f, 1f, 0f, false, false, -0.036f, 0.265f)
                verticalLineToRelative(0.065f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                reflectiveCurveToRelative(8f, -1.343f, 8f, -3f)
                verticalLineToRelative(-0.065f)
                arcToRelative(1f, 1f, 0f, false, false, -0.036f, -0.265f)
                lineToRelative(-1.964f, -5.67f)
                lineToRelative(1.952f, -5.55f)
                arcToRelative(1f, 1f, 0f, false, false, 0.048f, -0.307f)
                verticalLineToRelative(-0.143f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                curveToRelative(0f, 1.105f, 2.686f, 2f, 6f, 2f)
                reflectiveCurveToRelative(6f, -0.895f, 6f, -2f)
            }
        }.build()
        
        return _Diabolo!!
    }

private var _Diabolo: ImageVector? = null

