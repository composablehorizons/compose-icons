package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Toilet: ImageVector
    get() {
        if (_Toilet != null) return _Toilet!!
        
        _Toilet = ImageVector.Builder(
            name = "toilet",
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
                moveTo(7f, 12f)
                horizontalLineToRelative(13f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-0.598f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.424f, 0.765f)
                lineToRelative(1.544f, 2.47f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.424f, 0.765f)
                horizontalLineTo(5.402f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.424f, -0.765f)
                lineTo(7f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
            }
        }.build()
        
        return _Toilet!!
    }

private var _Toilet: ImageVector? = null

