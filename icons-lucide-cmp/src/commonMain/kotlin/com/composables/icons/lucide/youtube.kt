package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Youtube: ImageVector
    get() {
        if (_Youtube != null) return _Youtube!!
        
        _Youtube = ImageVector.Builder(
            name = "youtube",
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
                moveTo(2.5f, 17f)
                arcToRelative(24.12f, 24.12f, 0f, false, true, 0f, -10f)
                arcToRelative(2f, 2f, 0f, false, true, 1.4f, -1.4f)
                arcToRelative(49.56f, 49.56f, 0f, false, true, 16.2f, 0f)
                arcTo(2f, 2f, 0f, false, true, 21.5f, 7f)
                arcToRelative(24.12f, 24.12f, 0f, false, true, 0f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, -1.4f, 1.4f)
                arcToRelative(49.55f, 49.55f, 0f, false, true, -16.2f, 0f)
                arcTo(2f, 2f, 0f, false, true, 2.5f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 15f)
                lineToRelative(5f, -3f)
                lineToRelative(-5f, -3f)
                close()
            }
        }.build()
        
        return _Youtube!!
    }

private var _Youtube: ImageVector? = null

