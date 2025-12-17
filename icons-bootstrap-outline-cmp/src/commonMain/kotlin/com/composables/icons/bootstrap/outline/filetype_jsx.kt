package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeJsx: ImageVector
    get() {
        if (_FiletypeJsx != null) return _FiletypeJsx!!
        
        _FiletypeJsx = ImageVector.Builder(
            name = "filetype-jsx",
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
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
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
                moveTo(3.075f, 14.841f)
                arcToRelative(1.13f, 1.13f, 0f, false, false, 0.401f, 0.823f)
                quadToRelative(0.194f, 0.162f, 0.478f, 0.252f)
                quadToRelative(0.284f, 0.091f, 0.665f, 0.091f)
                quadToRelative(0.507f, 0f, 0.858f, -0.158f)
                quadToRelative(0.355f, -0.158f, 0.54f, -0.44f)
                arcToRelative(1.17f, 1.17f, 0f, false, false, 0.187f, -0.656f)
                quadToRelative(0f, -0.336f, -0.135f, -0.56f)
                arcToRelative(1f, 1f, 0f, false, false, -0.375f, -0.357f)
                arcToRelative(2f, 2f, 0f, false, false, -0.565f, -0.21f)
                lineToRelative(-0.621f, -0.144f)
                arcToRelative(1f, 1f, 0f, false, true, -0.405f, -0.176f)
                arcToRelative(0.37f, 0.37f, 0f, false, true, -0.143f, -0.299f)
                quadToRelative(0f, -0.234f, 0.184f, -0.384f)
                quadToRelative(0.188f, -0.152f, 0.513f, -0.152f)
                quadToRelative(0.214f, 0f, 0.37f, 0.068f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, 0.245f, 0.181f)
                arcToRelative(0.56f, 0.56f, 0f, false, true, 0.12f, 0.258f)
                horizontalLineToRelative(0.75f)
                arcToRelative(1.1f, 1.1f, 0f, false, false, -0.199f, -0.566f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.5f, -0.41f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -0.78f, -0.152f)
                quadToRelative(-0.44f, 0f, -0.776f, 0.15f)
                quadToRelative(-0.337f, 0.149f, -0.528f, 0.421f)
                quadToRelative(-0.19f, 0.273f, -0.19f, 0.639f)
                quadToRelative(0f, 0.302f, 0.123f, 0.524f)
                reflectiveQuadToRelative(0.351f, 0.367f)
                quadToRelative(0.229f, 0.143f, 0.54f, 0.213f)
                lineToRelative(0.618f, 0.144f)
                quadToRelative(0.31f, 0.073f, 0.462f, 0.193f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.153f, 0.326f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.085f, 0.29f)
                arcToRelative(0.56f, 0.56f, 0f, false, true, -0.255f, 0.193f)
                quadToRelative(-0.167f, 0.07f, -0.413f, 0.07f)
                quadToRelative(-0.176f, 0f, -0.32f, -0.04f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.248f, -0.115f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, -0.255f, -0.384f)
                close()
                moveTo(0f, 14.791f)
                quadToRelative(0f, 0.247f, 0.082f, 0.466f)
                quadToRelative(0.083f, 0.22f, 0.243f, 0.39f)
                quadToRelative(0.165f, 0.17f, 0.407f, 0.267f)
                quadToRelative(0.246f, 0.093f, 0.569f, 0.093f)
                quadToRelative(0.63f, 0f, 0.984f, -0.346f)
                quadToRelative(0.357f, -0.345f, 0.358f, -1.004f)
                verticalLineToRelative(-2.725f)
                horizontalLineToRelative(-0.791f)
                verticalLineToRelative(2.745f)
                quadToRelative(0f, 0.302f, -0.138f, 0.466f)
                reflectiveQuadToRelative(-0.422f, 0.164f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.454f, -0.246f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, -0.073f, -0.27f)
                close()
                moveToRelative(8.907f, -2.859f)
                horizontalLineTo(9.8f)
                lineToRelative(-1.274f, 2.007f)
                lineTo(9.78f, 15.93f)
                horizontalLineToRelative(-0.908f)
                lineToRelative(-0.85f, -1.415f)
                horizontalLineToRelative(-0.035f)
                lineToRelative(-0.853f, 1.415f)
                horizontalLineToRelative(-0.861f)
                lineToRelative(1.24f, -2.016f)
                lineToRelative(-1.228f, -1.983f)
                horizontalLineToRelative(0.931f)
                lineToRelative(0.832f, 1.438f)
                horizontalLineToRelative(0.036f)
                lineToRelative(0.823f, -1.438f)
                close()
            }
        }.build()
        
        return _FiletypeJsx!!
    }

private var _FiletypeJsx: ImageVector? = null

