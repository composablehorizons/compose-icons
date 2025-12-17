package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Weight: ImageVector
    get() {
        if (_Weight != null) return _Weight!!
        
        _Weight = ImageVector.Builder(
            name = "weight",
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
                moveTo(15f, 5f)
                arcTo(3f, 3f, 0f, false, true, 12f, 8f)
                arcTo(3f, 3f, 0f, false, true, 9f, 5f)
                arcTo(3f, 3f, 0f, false, true, 15f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 8f)
                arcToRelative(2f, 2f, 0f, false, false, -1.905f, 1.46f)
                lineTo(2.1f, 18.5f)
                arcTo(2f, 2f, 0f, false, false, 4f, 21f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 1.925f, -2.54f)
                lineTo(19.4f, 9.5f)
                arcTo(2f, 2f, 0f, false, false, 17.48f, 8f)
                close()
            }
        }.build()
        
        return _Weight!!
    }

private var _Weight: ImageVector? = null

