package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Spade: ImageVector
    get() {
        if (_Spade != null) return _Spade!!
        
        _Spade = ImageVector.Builder(
            name = "spade",
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
                moveTo(12f, 18f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 14.499f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 9.591f, 3.675f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, 0.818f, 0.001f)
                arcTo(5.5f, 5.5f, 0f, false, false, 22f, 14.5f)
                curveToRelative(0f, -2.29f, -1.5f, -4f, -3f, -5.5f)
                lineToRelative(-5.492f, -5.312f)
                arcToRelative(2f, 2f, 0f, false, false, -3f, -0.02f)
                lineTo(5f, 8.999f)
                curveToRelative(-1.5f, 1.5f, -3f, 3.2f, -3f, 5.5f)
            }
        }.build()
        
        return _Spade!!
    }

private var _Spade: ImageVector? = null

