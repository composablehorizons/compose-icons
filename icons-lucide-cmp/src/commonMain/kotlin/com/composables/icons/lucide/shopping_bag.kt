package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) return _ShoppingBag!!
        
        _ShoppingBag = ImageVector.Builder(
            name = "shopping-bag",
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
                moveTo(16f, 10f)
                arcToRelative(4f, 4f, 0f, false, true, -8f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.103f, 6.034f)
                horizontalLineToRelative(17.794f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.4f, 5.467f)
                arcToRelative(2f, 2f, 0f, false, false, -0.4f, 1.2f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6.667f)
                arcToRelative(2f, 2f, 0f, false, false, -0.4f, -1.2f)
                lineToRelative(-2f, -2.667f)
                arcTo(2f, 2f, 0f, false, false, 17f, 2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -1.6f, 0.8f)
                close()
            }
        }.build()
        
        return _ShoppingBag!!
    }

private var _ShoppingBag: ImageVector? = null

