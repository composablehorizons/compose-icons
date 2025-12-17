package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ampersands: ImageVector
    get() {
        if (_Ampersands != null) return _Ampersands!!
        
        _Ampersands = ImageVector.Builder(
            name = "ampersands",
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
                moveTo(10f, 17f)
                curveToRelative(-5f, -3f, -7f, -7f, -7f, -9f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                curveToRelative(0f, 2.5f, -5f, 2.5f, -5f, 6f)
                curveToRelative(0f, 1.7f, 1.3f, 3f, 3f, 3f)
                curveToRelative(2.8f, 0f, 5f, -2.2f, 5f, -5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 17f)
                curveToRelative(-5f, -3f, -7f, -7f, -7f, -9f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                curveToRelative(0f, 2.5f, -5f, 2.5f, -5f, 6f)
                curveToRelative(0f, 1.7f, 1.3f, 3f, 3f, 3f)
                curveToRelative(2.8f, 0f, 5f, -2.2f, 5f, -5f)
            }
        }.build()
        
        return _Ampersands!!
    }

private var _Ampersands: ImageVector? = null

