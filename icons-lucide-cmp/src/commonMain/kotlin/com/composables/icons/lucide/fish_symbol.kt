package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FishSymbol: ImageVector
    get() {
        if (_FishSymbol != null) return _FishSymbol!!
        
        _FishSymbol = ImageVector.Builder(
            name = "fish-symbol",
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
                moveTo(2f, 16f)
                reflectiveCurveToRelative(9f, -15f, 20f, -4f)
                curveTo(11f, 23f, 2f, 8f, 2f, 8f)
            }
        }.build()
        
        return _FishSymbol!!
    }

private var _FishSymbol: ImageVector? = null

