package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ShoppingBagPlus: ImageVector
    get() {
        if (_ShoppingBagPlus != null) return _ShoppingBagPlus!!
        
        _ShoppingBagPlus = ImageVector.Builder(
            name = "shopping-bag-plus",
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
                moveTo(12.5f, 21f)
                horizontalLineToRelative(-3.926f)
                arcToRelative(3f, 3f, 0f, false, true, -2.965f, -2.544f)
                lineToRelative(-1.255f, -8.152f)
                arcToRelative(2f, 2f, 0f, false, true, 1.977f, -2.304f)
                horizontalLineToRelative(11.339f)
                arcToRelative(2f, 2f, 0f, false, true, 1.977f, 2.304f)
                lineToRelative(-0.263f, 1.708f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
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
        }.build()
        
        return _ShoppingBagPlus!!
    }

private var _ShoppingBagPlus: ImageVector? = null

