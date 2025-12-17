package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShoppingCart: ImageVector
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
                moveTo(9f, 21f)
                arcTo(1f, 1f, 0f, false, true, 8f, 22f)
                arcTo(1f, 1f, 0f, false, true, 7f, 21f)
                arcTo(1f, 1f, 0f, false, true, 9f, 21f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 21f)
                arcTo(1f, 1f, 0f, false, true, 19f, 22f)
                arcTo(1f, 1f, 0f, false, true, 18f, 21f)
                arcTo(1f, 1f, 0f, false, true, 20f, 21f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.05f, 2.05f)
                horizontalLineToRelative(2f)
                lineToRelative(2.66f, 12.42f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 1.58f)
                horizontalLineToRelative(9.78f)
                arcToRelative(2f, 2f, 0f, false, false, 1.95f, -1.57f)
                lineToRelative(1.65f, -7.43f)
                horizontalLineTo(5.12f)
            }
        }.build()
        
        return _ShoppingCart!!
    }

private var _ShoppingCart: ImageVector? = null

