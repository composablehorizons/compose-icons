package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ShoppingBagCheck: ImageVector
    get() {
        if (_ShoppingBagCheck != null) return _ShoppingBagCheck!!
        
        _ShoppingBagCheck = ImageVector.Builder(
            name = "shopping-bag-check",
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
                moveTo(11.5f, 21f)
                horizontalLineToRelative(-2.926f)
                arcToRelative(3f, 3f, 0f, false, true, -2.965f, -2.544f)
                lineToRelative(-1.255f, -8.152f)
                arcToRelative(2f, 2f, 0f, false, true, 1.977f, -2.304f)
                horizontalLineToRelative(11.339f)
                arcToRelative(2f, 2f, 0f, false, true, 1.977f, 2.304f)
                lineToRelative(-0.5f, 3.248f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                verticalLineToRelative(-5f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _ShoppingBagCheck!!
    }

private var _ShoppingBagCheck: ImageVector? = null

