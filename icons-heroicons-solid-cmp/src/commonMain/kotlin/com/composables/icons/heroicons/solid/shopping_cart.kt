package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ShoppingCart: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.386f)
                curveToRelative(0.17f, 0f, 0.318f, 0.114f, 0.362f, 0.278f)
                lineToRelative(2.558f, 9.592f)
                arcToRelative(3.752f, 3.752f, 0f, false, false, -2.806f, 3.63f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(15.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(5.378f)
                arcTo(2.25f, 2.25f, 0f, false, true, 7.5f, 15f)
                horizontalLineToRelative(11.218f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.674f, -0.421f)
                arcToRelative(60.358f, 60.358f, 0f, false, false, 2.96f, -7.228f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.525f, -0.965f)
                arcTo(60.864f, 60.864f, 0f, false, false, 5.68f, 4.509f)
                lineToRelative(-0.232f, -0.867f)
                arcTo(1.875f, 1.875f, 0f, false, false, 3.636f, 2.25f)
                horizontalLineTo(2.25f)
                close()
                moveTo(3.75f, 20.25f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                close()
                moveTo(16.5f, 20.25f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                close()
            }
        }.build()
        
        return _ShoppingCart!!
    }

private var _ShoppingCart: ImageVector? = null

