package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SaudiRiyal: ImageVector
    get() {
        if (_SaudiRiyal != null) return _SaudiRiyal!!
        
        _SaudiRiyal = ImageVector.Builder(
            name = "saudi-riyal",
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
                moveTo(20f, 19.5f)
                lineToRelative(-5.5f, 1.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 4f)
                verticalLineToRelative(11.22f)
                arcToRelative(1f, 1f, 0f, false, false, 1.242f, 0.97f)
                lineTo(20f, 15.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.978f, 19.351f)
                lineToRelative(5.549f, -1.363f)
                arcTo(2f, 2f, 0f, false, false, 10f, 16f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 10f)
                lineTo(4f, 13.5f)
            }
        }.build()
        
        return _SaudiRiyal!!
    }

private var _SaudiRiyal: ImageVector? = null

