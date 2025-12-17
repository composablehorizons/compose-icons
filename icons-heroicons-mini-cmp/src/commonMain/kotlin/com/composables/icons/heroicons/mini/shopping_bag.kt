package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) return _ShoppingBag!!
        
        _ShoppingBag = ImageVector.Builder(
            name = "shopping-bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 5f)
                verticalLineToRelative(1f)
                horizontalLineTo(4.667f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, -1.743f, 1.598f)
                lineToRelative(-0.826f, 9.5f)
                arcTo(1.75f, 1.75f, 0f, false, false, 3.84f, 19f)
                horizontalLineTo(16.16f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, 1.743f, -1.902f)
                lineToRelative(-0.826f, -9.5f)
                arcTo(1.75f, 1.75f, 0f, false, false, 15.333f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
                close()
                moveToRelative(4f, -2.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 7.5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineTo(5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 10f, 2.5f)
                close()
                moveTo(7.5f, 10f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 5f, 0f)
                verticalLineTo(8.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(10f)
                arcToRelative(4f, 4f, 0f, false, true, -8f, 0f)
                verticalLineTo(8.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _ShoppingBag!!
    }

private var _ShoppingBag: ImageVector? = null

