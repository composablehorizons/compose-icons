package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
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
                moveTo(14.106f, 5.553f)
                arcToRelative(2f, 2f, 0f, false, false, 1.788f, 0f)
                lineToRelative(3.659f, -1.83f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4.619f)
                verticalLineToRelative(12.764f)
                arcToRelative(1f, 1f, 0f, false, true, -0.553f, 0.894f)
                lineToRelative(-4.553f, 2.277f)
                arcToRelative(2f, 2f, 0f, false, true, -1.788f, 0f)
                lineToRelative(-4.212f, -2.106f)
                arcToRelative(2f, 2f, 0f, false, false, -1.788f, 0f)
                lineToRelative(-3.659f, 1.83f)
                arcTo(1f, 1f, 0f, false, true, 3f, 19.381f)
                verticalLineTo(6.618f)
                arcToRelative(1f, 1f, 0f, false, true, 0.553f, -0.894f)
                lineToRelative(4.553f, -2.277f)
                arcToRelative(2f, 2f, 0f, false, true, 1.788f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 5.764f)
                verticalLineToRelative(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 3.236f)
                verticalLineToRelative(15f)
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

