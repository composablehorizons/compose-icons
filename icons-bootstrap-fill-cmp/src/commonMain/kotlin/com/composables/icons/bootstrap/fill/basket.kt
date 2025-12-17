package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Basket: ImageVector
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
                moveTo(5.071f, 1.243f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.858f, 0.514f)
                lineTo(3.383f, 6f)
                horizontalLineToRelative(9.234f)
                lineTo(10.07f, 1.757f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.858f, -0.514f)
                lineTo(13.783f, 6f)
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(15f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 6f)
                horizontalLineToRelative(1.717f)
                close()
                moveTo(3.5f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveToRelative(2.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveToRelative(2.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveToRelative(2.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveToRelative(2.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
            }
        }.build()
        
        return _Basket!!
    }

private var _Basket: ImageVector? = null

