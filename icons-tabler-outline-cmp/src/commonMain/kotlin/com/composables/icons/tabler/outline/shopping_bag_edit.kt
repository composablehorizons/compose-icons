package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ShoppingBagEdit: ImageVector
    get() {
        if (_ShoppingBagEdit != null) return _ShoppingBagEdit!!
        
        _ShoppingBagEdit = ImageVector.Builder(
            name = "shopping-bag-edit",
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
                moveTo(11f, 21f)
                horizontalLineToRelative(-2.426f)
                arcToRelative(3f, 3f, 0f, false, true, -2.965f, -2.544f)
                lineToRelative(-1.255f, -8.152f)
                arcToRelative(2f, 2f, 0f, false, true, 1.977f, -2.304f)
                horizontalLineToRelative(11.339f)
                arcToRelative(2f, 2f, 0f, false, true, 1.977f, 2.304f)
                lineToRelative(-0.109f, 0.707f)
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
                moveTo(18.42f, 15.61f)
                arcToRelative(2.1f, 2.1f, 0f, false, true, 2.97f, 2.97f)
                lineToRelative(-3.39f, 3.42f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineToRelative(3.42f, -3.39f)
                close()
            }
        }.build()
        
        return _ShoppingBagEdit!!
    }

private var _ShoppingBagEdit: ImageVector? = null

