package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Triangle: ImageVector
    get() {
        if (_Triangle != null) return _Triangle!!
        
        _Triangle = ImageVector.Builder(
            name = "triangle",
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
                moveTo(10.29f, 3.86f)
                lineTo(1.82f, 18f)
                arcToRelative(2f, 2f, 0f, false, false, 1.71f, 3f)
                horizontalLineToRelative(16.94f)
                arcToRelative(2f, 2f, 0f, false, false, 1.71f, -3f)
                lineTo(13.71f, 3.86f)
                arcToRelative(2f, 2f, 0f, false, false, -3.42f, 0f)
                close()
            }
        }.build()
        
        return _Triangle!!
    }

private var _Triangle: ImageVector? = null

