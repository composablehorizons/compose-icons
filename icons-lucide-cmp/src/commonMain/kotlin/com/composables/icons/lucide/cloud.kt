package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cloud: ImageVector
    get() {
        if (_Cloud != null) return _Cloud!!
        
        _Cloud = ImageVector.Builder(
            name = "cloud",
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
                moveTo(17.5f, 19f)
                horizontalLineTo(9f)
                arcToRelative(7f, 7f, 0f, true, true, 6.71f, -9f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 0f, 9f)
                close()
            }
        }.build()
        
        return _Cloud!!
    }

private var _Cloud: ImageVector? = null

