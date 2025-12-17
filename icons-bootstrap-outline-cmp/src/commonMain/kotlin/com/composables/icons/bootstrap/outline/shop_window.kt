package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ShopWindow: ImageVector
    get() {
        if (_ShopWindow != null) return _ShopWindow!!
        
        _ShopWindow = ImageVector.Builder(
            name = "shop-window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.97f, 1.35f)
                arcTo(1f, 1f, 0f, false, true, 3.73f, 1f)
                horizontalLineToRelative(8.54f)
                arcToRelative(1f, 1f, 0f, false, true, 0.76f, 0.35f)
                lineToRelative(2.609f, 3.044f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 5.37f)
                verticalLineToRelative(0.255f)
                arcToRelative(2.375f, 2.375f, 0f, false, true, -4.25f, 1.458f)
                arcTo(2.37f, 2.37f, 0f, false, true, 9.875f, 8f)
                arcTo(2.37f, 2.37f, 0f, false, true, 8f, 7.083f)
                arcTo(2.37f, 2.37f, 0f, false, true, 6.125f, 8f)
                arcToRelative(2.37f, 2.37f, 0f, false, true, -1.875f, -0.917f)
                arcTo(2.375f, 2.375f, 0f, false, true, 0f, 5.625f)
                verticalLineTo(5.37f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.361f, -0.976f)
                close()
                moveToRelative(1.78f, 4.275f)
                arcToRelative(1.375f, 1.375f, 0f, false, false, 2.75f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                arcToRelative(1.375f, 1.375f, 0f, false, false, 2.75f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                arcToRelative(1.375f, 1.375f, 0f, true, false, 2.75f, 0f)
                verticalLineTo(5.37f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.12f, -0.325f)
                lineTo(12.27f, 2f)
                horizontalLineTo(3.73f)
                lineTo(1.12f, 5.045f)
                arcTo(0.5f, 0.5f, 0f, false, false, 1f, 5.37f)
                verticalLineToRelative(0.255f)
                arcToRelative(1.375f, 1.375f, 0f, false, false, 2.75f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveTo(1.5f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(12f)
                verticalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(2f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(8f)
                verticalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _ShopWindow!!
    }

private var _ShopWindow: ImageVector? = null

