package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) return _ShoppingCart!!
        
        _ShoppingCart = ImageVector.Builder(
            name = "shopping-cart",
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
                moveTo(10f, 21f)
                arcTo(1f, 1f, 0f, false, true, 9f, 22f)
                arcTo(1f, 1f, 0f, false, true, 8f, 21f)
                arcTo(1f, 1f, 0f, false, true, 10f, 21f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 21f)
                arcTo(1f, 1f, 0f, false, true, 20f, 22f)
                arcTo(1f, 1f, 0f, false, true, 19f, 21f)
                arcTo(1f, 1f, 0f, false, true, 21f, 21f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1f, 1f)
                horizontalLineToRelative(4f)
                lineToRelative(2.68f, 13.39f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 1.61f)
                horizontalLineToRelative(9.72f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -1.61f)
                lineTo(23f, 6f)
                horizontalLineTo(6f)
            }
        }.build()
        
        return _ShoppingCart!!
    }

private var _ShoppingCart: ImageVector? = null

