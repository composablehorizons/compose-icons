package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Mountain: ImageVector
    get() {
        if (_Mountain != null) return _Mountain!!
        
        _Mountain = ImageVector.Builder(
            name = "mountain",
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
                moveTo(8f, 3f)
                lineToRelative(4f, 8f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 15f)
                horizontalLineTo(2f)
                lineTo(8f, 3f)
                close()
            }
        }.build()
        
        return _Mountain!!
    }

private var _Mountain: ImageVector? = null

