package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Basket2: ImageVector
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
                moveTo(4f, 10f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                close()
            }
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
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-0.623f)
                lineToRelative(-1.844f, 6.456f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.722f, 0.544f)
                horizontalLineTo(3.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.722f, -0.544f)
                lineTo(1.123f, 8f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 6f)
                horizontalLineToRelative(1.717f)
                lineTo(5.07f, 1.243f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.686f, -0.172f)
                close()
                moveTo(2.163f, 8f)
                lineToRelative(1.714f, 6f)
                horizontalLineToRelative(8.246f)
                lineToRelative(1.714f, -6f)
                close()
            }
        }.build()
        
        return _Basket2!!
    }

private var _Basket2: ImageVector? = null

