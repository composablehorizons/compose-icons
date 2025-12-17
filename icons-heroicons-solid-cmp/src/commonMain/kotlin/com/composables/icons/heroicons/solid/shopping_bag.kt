package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ShoppingBag: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 6f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(5.513f)
                curveToRelative(-0.96f, 0f, -1.764f, 0.724f, -1.865f, 1.679f)
                lineToRelative(-1.263f, 12f)
                arcTo(1.875f, 1.875f, 0f, false, false, 4.25f, 22.5f)
                horizontalLineToRelative(15.5f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, 1.865f, -2.071f)
                lineToRelative(-1.263f, -12f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -1.865f, -1.679f)
                horizontalLineTo(16.5f)
                verticalLineTo(6f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -9f, 0f)
                close()
                moveTo(12f, 3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
                moveToRelative(-3f, 8.25f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(0.75f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, -9f, 0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(0.75f)
                close()
            }
        }.build()
        
        return _ShoppingBag!!
    }

private var _ShoppingBag: ImageVector? = null

