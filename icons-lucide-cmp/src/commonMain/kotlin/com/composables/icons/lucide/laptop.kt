package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Laptop: ImageVector
    get() {
        if (_Laptop != null) return _Laptop!!
        
        _Laptop = ImageVector.Builder(
            name = "laptop",
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
                moveTo(18f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8.526f)
                arcToRelative(2f, 2f, 0f, false, false, 0.212f, 0.897f)
                lineToRelative(1.068f, 2.127f)
                arcToRelative(1f, 1f, 0f, false, true, -0.9f, 1.45f)
                horizontalLineTo(3.62f)
                arcToRelative(1f, 1f, 0f, false, true, -0.9f, -1.45f)
                lineToRelative(1.068f, -2.127f)
                arcTo(2f, 2f, 0f, false, false, 4f, 15.526f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.054f, 15.987f)
                horizontalLineTo(3.946f)
            }
        }.build()
        
        return _Laptop!!
    }

private var _Laptop: ImageVector? = null

