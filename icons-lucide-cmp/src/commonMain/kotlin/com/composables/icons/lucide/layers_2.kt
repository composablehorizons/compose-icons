package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Layers2: ImageVector
    get() {
        if (_Layers2 != null) return _Layers2!!
        
        _Layers2 = ImageVector.Builder(
            name = "layers-2",
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
                moveTo(13f, 13.74f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 0f)
                lineTo(2.5f, 8.87f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.74f)
                lineTo(11f, 2.26f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 0f)
                lineToRelative(8.5f, 4.87f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.74f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 14.285f)
                lineToRelative(1.5f, 0.845f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.74f)
                lineTo(13f, 21.74f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 0f)
                lineToRelative(-8.5f, -4.87f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.74f)
                lineToRelative(1.5f, -0.845f)
            }
        }.build()
        
        return _Layers2!!
    }

private var _Layers2: ImageVector? = null

