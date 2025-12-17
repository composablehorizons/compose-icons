package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Wind: ImageVector
    get() {
        if (_Wind != null) return _Wind!!
        
        _Wind = ImageVector.Builder(
            name = "wind",
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
                moveTo(9.59f, 4.59f)
                arcTo(2f, 2f, 0f, true, true, 11f, 8f)
                horizontalLineTo(2f)
                moveToRelative(10.59f, 11.41f)
                arcTo(2f, 2f, 0f, true, false, 14f, 16f)
                horizontalLineTo(2f)
                moveToRelative(15.73f, -8.27f)
                arcTo(2.5f, 2.5f, 0f, true, true, 19.5f, 12f)
                horizontalLineTo(2f)
            }
        }.build()
        
        return _Wind!!
    }

private var _Wind: ImageVector? = null

