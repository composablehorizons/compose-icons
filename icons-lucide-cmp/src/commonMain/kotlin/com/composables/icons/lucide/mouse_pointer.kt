package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MousePointer: ImageVector
    get() {
        if (_MousePointer != null) return _MousePointer!!
        
        _MousePointer = ImageVector.Builder(
            name = "mouse-pointer",
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
                moveTo(12.586f, 12.586f)
                lineTo(19f, 19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.688f, 3.037f)
                arcToRelative(0.497f, 0.497f, 0f, false, false, -0.651f, 0.651f)
                lineToRelative(6.5f, 15.999f)
                arcToRelative(0.501f, 0.501f, 0f, false, false, 0.947f, -0.062f)
                lineToRelative(1.569f, -6.083f)
                arcToRelative(2f, 2f, 0f, false, true, 1.448f, -1.479f)
                lineToRelative(6.124f, -1.579f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.063f, -0.947f)
                close()
            }
        }.build()
        
        return _MousePointer!!
    }

private var _MousePointer: ImageVector? = null

