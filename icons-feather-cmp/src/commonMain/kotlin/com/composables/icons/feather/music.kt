package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Music: ImageVector
    get() {
        if (_Music != null) return _Music!!
        
        _Music = ImageVector.Builder(
            name = "music",
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
                moveTo(9f, 18f)
                verticalLineTo(5f)
                lineToRelative(12f, -2f)
                verticalLineToRelative(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                arcTo(3f, 3f, 0f, false, true, 6f, 21f)
                arcTo(3f, 3f, 0f, false, true, 3f, 18f)
                arcTo(3f, 3f, 0f, false, true, 9f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 16f)
                arcTo(3f, 3f, 0f, false, true, 18f, 19f)
                arcTo(3f, 3f, 0f, false, true, 15f, 16f)
                arcTo(3f, 3f, 0f, false, true, 21f, 16f)
                close()
            }
        }.build()
        
        return _Music!!
    }

private var _Music: ImageVector? = null

