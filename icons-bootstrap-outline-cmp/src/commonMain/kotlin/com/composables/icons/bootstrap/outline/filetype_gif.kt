package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeGif: ImageVector
    get() {
        if (_FiletypeGif != null) return _FiletypeGif!!
        
        _FiletypeGif = ImageVector.Builder(
            name = "filetype-gif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(3.278f, 13.124f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.14f, -0.492f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -0.314f, -0.407f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.48f, -0.275f)
                arcToRelative(1.9f, 1.9f, 0f, false, false, -0.636f, -0.1f)
                quadToRelative(-0.542f, 0f, -0.926f, 0.229f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.583f, 0.632f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -0.199f, 0.95f)
                verticalLineToRelative(0.506f)
                quadToRelative(0f, 0.408f, 0.105f, 0.745f)
                quadToRelative(0.105f, 0.336f, 0.32f, 0.58f)
                quadToRelative(0.213f, 0.243f, 0.533f, 0.377f)
                quadToRelative(0.323f, 0.132f, 0.753f, 0.132f)
                quadToRelative(0.402f, 0f, 0.697f, -0.111f)
                arcToRelative(1.29f, 1.29f, 0f, false, false, 0.788f, -0.77f)
                quadToRelative(0.097f, -0.261f, 0.097f, -0.551f)
                verticalLineToRelative(-0.797f)
                horizontalLineTo(1.717f)
                verticalLineToRelative(0.589f)
                horizontalLineToRelative(0.823f)
                verticalLineToRelative(0.255f)
                quadToRelative(0f, 0.199f, -0.09f, 0.363f)
                arcToRelative(0.67f, 0.67f, 0f, false, true, -0.273f, 0.264f)
                arcToRelative(1f, 1f, 0f, false, true, -0.457f, 0.096f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, -0.519f, -0.146f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.305f, -0.413f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, -0.096f, -0.615f)
                verticalLineToRelative(-0.499f)
                quadToRelative(0f, -0.547f, 0.234f, -0.85f)
                quadToRelative(0.237f, -0.3f, 0.665f, -0.301f)
                arcToRelative(1f, 1f, 0f, false, true, 0.3f, 0.044f)
                quadToRelative(0.136f, 0.044f, 0.236f, 0.126f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 0.17f, 0.19f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 0.097f, 0.25f)
                close()
                moveToRelative(1.353f, 2.801f)
                verticalLineToRelative(-3.999f)
                horizontalLineTo(3.84f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.79f)
                close()
                moveToRelative(1.493f, -1.59f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(-0.791f)
                verticalLineToRelative(-3.999f)
                horizontalLineTo(7.88f)
                verticalLineToRelative(0.653f)
                horizontalLineTo(6.124f)
                verticalLineToRelative(1.117f)
                horizontalLineToRelative(1.605f)
                verticalLineToRelative(0.638f)
                close()
            }
        }.build()
        
        return _FiletypeGif!!
    }

private var _FiletypeGif: ImageVector? = null

