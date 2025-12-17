package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Rewind: ImageVector
    get() {
        if (_Rewind != null) return _Rewind!!
        
        _Rewind = ImageVector.Builder(
            name = "rewind",
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
                moveTo(12f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, -3.414f, -1.414f)
                lineToRelative(-6f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 2.828f)
                lineToRelative(6f, 6f)
                arcTo(2f, 2f, 0f, false, false, 12f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, -3.414f, -1.414f)
                lineToRelative(-6f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 2.828f)
                lineToRelative(6f, 6f)
                arcTo(2f, 2f, 0f, false, false, 22f, 18f)
                close()
            }
        }.build()
        
        return _Rewind!!
    }

private var _Rewind: ImageVector? = null

