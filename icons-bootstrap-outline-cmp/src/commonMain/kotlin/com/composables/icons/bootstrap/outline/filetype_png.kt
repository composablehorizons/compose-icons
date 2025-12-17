package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypePng: ImageVector
    get() {
        if (_FiletypePng != null) return _FiletypePng!!
        
        _FiletypePng = ImageVector.Builder(
            name = "filetype-png",
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
                verticalLineToRelative(-1f)
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
                moveToRelative(-3.76f, 8.132f)
                quadToRelative(0.114f, 0.23f, 0.14f, 0.492f)
                horizontalLineToRelative(-0.776f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.097f, -0.249f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.17f, -0.19f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.237f, -0.126f)
                arcToRelative(1f, 1f, 0f, false, false, -0.299f, -0.044f)
                quadToRelative(-0.427f, 0f, -0.665f, 0.302f)
                quadToRelative(-0.234f, 0.301f, -0.234f, 0.85f)
                verticalLineToRelative(0.498f)
                quadToRelative(0f, 0.351f, 0.097f, 0.615f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.304f, 0.413f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, 0.519f, 0.146f)
                arcToRelative(1f, 1f, 0f, false, false, 0.457f, -0.096f)
                arcToRelative(0.67f, 0.67f, 0f, false, false, 0.272f, -0.264f)
                quadToRelative(0.09f, -0.164f, 0.091f, -0.363f)
                verticalLineToRelative(-0.255f)
                horizontalLineTo(8.82f)
                verticalLineToRelative(-0.59f)
                horizontalLineToRelative(1.576f)
                verticalLineToRelative(0.798f)
                quadToRelative(0f, 0.29f, -0.097f, 0.55f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -0.293f, 0.458f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, -0.495f, 0.313f)
                quadToRelative(-0.296f, 0.111f, -0.697f, 0.111f)
                arcToRelative(2f, 2f, 0f, false, true, -0.753f, -0.132f)
                arcToRelative(1.45f, 1.45f, 0f, false, true, -0.533f, -0.377f)
                arcToRelative(1.6f, 1.6f, 0f, false, true, -0.32f, -0.58f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.105f, -0.745f)
                verticalLineToRelative(-0.506f)
                quadToRelative(0f, -0.543f, 0.2f, -0.95f)
                quadToRelative(0.201f, -0.406f, 0.582f, -0.633f)
                quadToRelative(0.384f, -0.228f, 0.926f, -0.228f)
                quadToRelative(0.357f, 0f, 0.636f, 0.1f)
                quadToRelative(0.281f, 0.1f, 0.48f, 0.275f)
                quadToRelative(0.2f, 0.176f, 0.314f, 0.407f)
                close()
                moveToRelative(-8.64f, -0.706f)
                horizontalLineTo(0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(-1.343f)
                horizontalLineToRelative(0.803f)
                quadToRelative(0.43f, 0f, 0.732f, -0.172f)
                quadToRelative(0.305f, -0.177f, 0.463f, -0.475f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, 0.161f, -0.677f)
                quadToRelative(0f, -0.374f, -0.158f, -0.677f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.46f, -0.477f)
                quadToRelative(-0.3f, -0.18f, -0.732f, -0.179f)
                moveToRelative(0.545f, 1.333f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.085f, 0.381f)
                arcToRelative(0.57f, 0.57f, 0f, false, true, -0.238f, 0.24f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.375f, 0.082f)
                horizontalLineTo(0.788f)
                verticalLineToRelative(-1.406f)
                horizontalLineToRelative(0.66f)
                quadToRelative(0.327f, 0f, 0.512f, 0.182f)
                quadToRelative(0.185f, 0.181f, 0.185f, 0.521f)
                moveToRelative(1.964f, 2.666f)
                verticalLineTo(13.25f)
                horizontalLineToRelative(0.032f)
                lineToRelative(1.761f, 2.675f)
                horizontalLineToRelative(0.656f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(-0.032f)
                lineToRelative(-1.752f, -2.66f)
                horizontalLineToRelative(-0.662f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _FiletypePng!!
    }

private var _FiletypePng: ImageVector? = null

