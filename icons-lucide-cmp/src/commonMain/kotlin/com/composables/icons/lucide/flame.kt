package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Flame: ImageVector
    get() {
        if (_Flame != null) return _Flame!!
        
        _Flame = ImageVector.Builder(
            name = "flame",
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
                moveTo(12f, 3f)
                quadToRelative(1f, 4f, 4f, 6.5f)
                reflectiveQuadToRelative(3f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, true, -14f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 1f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, 5f, 0f)
                curveToRelative(0f, -2f, -1.5f, -3f, -1.5f, -5f)
                quadToRelative(0f, -2f, 2.5f, -4f)
            }
        }.build()
        
        return _Flame!!
    }

private var _Flame: ImageVector? = null

