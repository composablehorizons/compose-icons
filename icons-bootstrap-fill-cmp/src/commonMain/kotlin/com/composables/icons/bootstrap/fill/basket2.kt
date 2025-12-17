package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Basket2: ImageVector
    get() {
        if (_Basket2 != null) return _Basket2!!
        
        _Basket2 = ImageVector.Builder(
            name = "basket2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.929f, 1.757f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.858f, -0.514f)
                lineTo(2.217f, 6f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(0.623f)
                lineToRelative(1.844f, 6.456f)
                arcTo(0.75f, 0.75f, 0f, false, false, 3.69f, 15f)
                horizontalLineToRelative(8.622f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.722f, -0.544f)
                lineTo(14.877f, 8f)
                horizontalLineToRelative(0.623f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.717f)
                lineTo(10.93f, 1.243f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.858f, 0.514f)
                lineTo(12.617f, 6f)
                horizontalLineTo(3.383f)
                close()
                moveTo(4f, 10f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                close()
                moveToRelative(4f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _Basket2!!
    }

private var _Basket2: ImageVector? = null

