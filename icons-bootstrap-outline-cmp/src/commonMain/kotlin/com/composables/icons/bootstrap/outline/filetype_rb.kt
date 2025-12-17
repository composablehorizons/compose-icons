package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeRb: ImageVector
    get() {
        if (_FiletypeRb != null) return _FiletypeRb!!
        
        _FiletypeRb = ImageVector.Builder(
            name = "filetype-rb",
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
                horizontalLineTo(8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
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
                moveTo(0f, 11.85f)
                horizontalLineToRelative(1.597f)
                quadToRelative(0.446f, 0f, 0.758f, 0.158f)
                quadToRelative(0.315f, 0.155f, 0.478f, 0.44f)
                quadToRelative(0.167f, 0.284f, 0.167f, 0.668f)
                arcToRelative(1.18f, 1.18f, 0f, false, true, -0.727f, 1.122f)
                lineToRelative(0.803f, 1.611f)
                horizontalLineToRelative(-0.885f)
                lineToRelative(-0.7f, -1.491f)
                horizontalLineTo(0.782f)
                verticalLineToRelative(1.491f)
                horizontalLineTo(0f)
                close()
                moveToRelative(0.782f, 0.621f)
                verticalLineToRelative(1.292f)
                horizontalLineToRelative(0.689f)
                quadToRelative(0.327f, 0f, 0.518f, -0.158f)
                quadToRelative(0.195f, -0.159f, 0.194f, -0.475f)
                quadToRelative(0f, -0.32f, -0.194f, -0.489f)
                arcToRelative(0.74f, 0.74f, 0f, false, false, -0.507f, -0.17f)
                close()
                moveToRelative(4.426f, 3.378f)
                horizontalLineTo(3.544f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(1.67f)
                quadToRelative(0.536f, 0f, 0.858f, 0.26f)
                quadToRelative(0.322f, 0.262f, 0.322f, 0.724f)
                arcToRelative(0.94f, 0.94f, 0f, false, true, -0.09f, 0.422f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.244f, 0.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.351f, 0.161f)
                verticalLineToRelative(0.035f)
                quadToRelative(0.243f, 0.024f, 0.445f, 0.141f)
                arcToRelative(0.85f, 0.85f, 0f, false, true, 0.322f, 0.325f)
                arcToRelative(1f, 1f, 0f, false, true, 0.123f, 0.51f)
                quadToRelative(0f, 0.357f, -0.178f, 0.61f)
                quadToRelative(-0.18f, 0.25f, -0.492f, 0.386f)
                arcToRelative(1.9f, 1.9f, 0f, false, true, -0.721f, 0.132f)
                moveToRelative(-0.179f, -3.404f)
                horizontalLineToRelative(-0.7f)
                verticalLineToRelative(1.07f)
                horizontalLineToRelative(0.521f)
                quadToRelative(0.267f, 0f, 0.434f, -0.065f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.249f, -0.185f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.082f, -0.296f)
                arcToRelative(0.49f, 0.49f, 0f, false, false, -0.155f, -0.384f)
                quadToRelative(-0.153f, -0.14f, -0.43f, -0.14f)
                close()
                moveToRelative(0.05f, 1.62f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(1.19f)
                horizontalLineToRelative(0.589f)
                quadToRelative(0.466f, 0f, 0.67f, -0.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.206f, -0.434f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -0.082f, -0.325f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.24f, -0.21f)
                arcToRelative(0.95f, 0.95f, 0f, false, false, -0.393f, -0.074f)
            }
        }.build()
        
        return _FiletypeRb!!
    }

private var _FiletypeRb: ImageVector? = null

