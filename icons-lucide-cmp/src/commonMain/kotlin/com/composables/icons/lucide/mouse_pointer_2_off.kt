package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MousePointer2Off: ImageVector
    get() {
        if (_MousePointer2Off != null) return _MousePointer2Off!!
        
        _MousePointer2Off = ImageVector.Builder(
            name = "mouse-pointer-2-off",
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
                moveTo(15.55f, 8.45f)
                lineToRelative(5.138f, 2.087f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.063f, 0.947f)
                lineToRelative(-6.124f, 1.58f)
                arcToRelative(2f, 2f, 0f, false, false, -1.438f, 1.435f)
                lineToRelative(-1.579f, 6.126f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.947f, 0.063f)
                lineTo(8.45f, 15.551f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.816f, 11.528f)
                lineToRelative(-2.779f, -6.84f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0.651f, -0.651f)
                lineToRelative(6.84f, 2.779f)
            }
        }.build()
        
        return _MousePointer2Off!!
    }

private var _MousePointer2Off: ImageVector? = null

