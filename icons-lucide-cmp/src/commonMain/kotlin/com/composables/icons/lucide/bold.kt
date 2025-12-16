package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bold: ImageVector
    get() {
        if (_Bold != null) return _Bold!!
        
        _Bold = ImageVector.Builder(
            name = "bold",
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
                moveTo(6f, 12f)
                horizontalLineToRelative(9f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
            }
        }.build()
        
        return _Bold!!
    }

private var _Bold: ImageVector? = null

