package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Parentheses: ImageVector
    get() {
        if (_Parentheses != null) return _Parentheses!!
        
        _Parentheses = ImageVector.Builder(
            name = "parentheses",
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
                moveTo(8f, 21f)
                reflectiveCurveToRelative(-4f, -3f, -4f, -9f)
                reflectiveCurveToRelative(4f, -9f, 4f, -9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3f)
                reflectiveCurveToRelative(4f, 3f, 4f, 9f)
                reflectiveCurveToRelative(-4f, 9f, -4f, 9f)
            }
        }.build()
        
        return _Parentheses!!
    }

private var _Parentheses: ImageVector? = null

