package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Basket: ImageVector
    get() {
        if (_Basket != null) return _Basket!!
        
        _Basket = ImageVector.Builder(
            name = "basket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.757f, 1.071f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.172f, 0.686f)
                lineTo(3.383f, 6f)
                horizontalLineToRelative(9.234f)
                lineTo(10.07f, 1.757f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.858f, -0.514f)
                lineTo(13.783f, 6f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-9f)
                arcTo(2.5f, 2.5f, 0f, false, true, 1f, 13.5f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1.217f)
                lineTo(5.07f, 1.243f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.686f, -0.172f)
                close()
                moveTo(2f, 9f)
                verticalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 15f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(9f)
                close()
                moveTo(1f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                verticalLineTo(7f)
                close()
                moveToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 10f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 10f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 10f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Basket!!
    }

private var _Basket: ImageVector? = null

