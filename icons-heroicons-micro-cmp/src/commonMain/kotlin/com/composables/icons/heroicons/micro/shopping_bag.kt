package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) return _ShoppingBag!!
        
        _ShoppingBag = ImageVector.Builder(
            name = "shopping-bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 4f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(0.643f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.492f, 1.35f)
                lineToRelative(0.7f, 7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.342f, 15f)
                horizontalLineTo(3.657f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.492f, -1.65f)
                lineToRelative(0.7f, -7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.357f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                close()
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineTo(4f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                close()
                moveToRelative(-3f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                verticalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _ShoppingBag!!
    }

private var _ShoppingBag: ImageVector? = null

