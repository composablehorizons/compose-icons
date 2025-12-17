package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) return _ShoppingCart!!
        
        _ShoppingCart = ImageVector.Builder(
            name = "shopping-cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.75f, 1.002f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                horizontalLineToRelative(1.835f)
                lineToRelative(1.24f, 5.113f)
                arcTo(3.752f, 3.752f, 0f, false, false, 2f, 11.25f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(3.628f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.75f, 9f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.73f, -0.578f)
                lineToRelative(0.846f, -3.595f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.578f, -0.906f)
                arcToRelative(44.118f, 44.118f, 0f, false, false, -7.996f, -0.91f)
                lineToRelative(-0.348f, -1.436f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.73f, -0.573f)
                horizontalLineTo(1.75f)
                close()
                moveTo(5f, 14f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveTo(13f, 14f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
            }
        }.build()
        
        return _ShoppingCart!!
    }

private var _ShoppingCart: ImageVector? = null

