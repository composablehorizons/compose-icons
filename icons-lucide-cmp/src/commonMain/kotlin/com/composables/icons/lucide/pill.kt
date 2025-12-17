package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pill: ImageVector
    get() {
        if (_Pill != null) return _Pill!!
        
        _Pill = ImageVector.Builder(
            name = "pill",
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
                moveTo(10.5f, 20.5f)
                lineToRelative(10f, -10f)
                arcToRelative(4.95f, 4.95f, 0f, true, false, -7f, -7f)
                lineToRelative(-10f, 10f)
                arcToRelative(4.95f, 4.95f, 0f, true, false, 7f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 8.5f)
                lineToRelative(7f, 7f)
            }
        }.build()
        
        return _Pill!!
    }

private var _Pill: ImageVector? = null

