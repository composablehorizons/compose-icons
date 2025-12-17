package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Speech: ImageVector
    get() {
        if (_Speech != null) return _Speech!!
        
        _Speech = ImageVector.Builder(
            name = "speech",
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
                moveTo(8.8f, 20f)
                verticalLineToRelative(-4.1f)
                lineToRelative(1.9f, 0.2f)
                arcToRelative(2.3f, 2.3f, 0f, false, false, 2.164f, -2.1f)
                verticalLineTo(8.3f)
                arcTo(5.37f, 5.37f, 0f, false, false, 2f, 8.25f)
                curveToRelative(0f, 2.8f, 0.656f, 3.054f, 1f, 4.55f)
                arcToRelative(5.77f, 5.77f, 0f, false, true, 0.029f, 2.758f)
                lineTo(2f, 20f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.8f, 17.8f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, 0.003f, -10.603f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 15f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.025f, -4.975f)
            }
        }.build()
        
        return _Speech!!
    }

private var _Speech: ImageVector? = null

