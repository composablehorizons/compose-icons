package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Club: ImageVector
    get() {
        if (_Club != null) return _Club!!
        
        _Club = ImageVector.Builder(
            name = "club",
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
                moveTo(17.28f, 9.05f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, -10.56f, 0f)
                arcTo(5.5f, 5.5f, 0f, true, false, 12f, 17.66f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 5.28f, -8.6f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17.66f)
                lineTo(12f, 22f)
            }
        }.build()
        
        return _Club!!
    }

private var _Club: ImageVector? = null

