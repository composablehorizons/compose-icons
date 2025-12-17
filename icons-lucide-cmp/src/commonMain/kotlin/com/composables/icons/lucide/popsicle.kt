package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Popsicle: ImageVector
    get() {
        if (_Popsicle != null) return _Popsicle!!
        
        _Popsicle = ImageVector.Builder(
            name = "popsicle",
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
                moveTo(18.6f, 14.4f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2f, 0f, -2.8f)
                lineToRelative(-8.1f, -8.1f)
                arcToRelative(4.95f, 4.95f, 0f, true, false, -7.1f, 7.1f)
                lineToRelative(8.1f, 8.1f)
                curveToRelative(0.9f, 0.7f, 2.1f, 0.7f, 2.9f, -0.1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineToRelative(-5.5f, -5.5f)
            }
        }.build()
        
        return _Popsicle!!
    }

private var _Popsicle: ImageVector? = null

