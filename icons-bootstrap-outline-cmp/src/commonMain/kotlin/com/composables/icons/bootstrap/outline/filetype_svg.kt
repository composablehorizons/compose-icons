package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeSvg: ImageVector
    get() {
        if (_FiletypeSvg != null) return _FiletypeSvg!!
        
        _FiletypeSvg = ImageVector.Builder(
            name = "filetype-svg",
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
                moveTo(0f, 14.841f)
                arcToRelative(1.13f, 1.13f, 0f, false, false, 0.401f, 0.823f)
                quadToRelative(0.194f, 0.162f, 0.478f, 0.252f)
                quadToRelative(0.285f, 0.091f, 0.665f, 0.091f)
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
                quadToRelative(0.187f, -0.152f, 0.513f, -0.152f)
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
                arcToRelative(0.56f, 0.56f, 0f, false, true, -0.256f, 0.193f)
                quadToRelative(-0.167f, 0.07f, -0.413f, 0.07f)
                quadToRelative(-0.176f, 0f, -0.32f, -0.04f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.248f, -0.115f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, -0.255f, -0.384f)
                close()
                moveToRelative(4.575f, 1.09f)
                horizontalLineToRelative(0.952f)
                lineToRelative(1.327f, -3.999f)
                horizontalLineToRelative(-0.879f)
                lineToRelative(-0.887f, 3.138f)
                horizontalLineTo(5.05f)
                lineToRelative(-0.897f, -3.138f)
                horizontalLineToRelative(-0.917f)
                close()
                moveToRelative(5.483f, -3.293f)
                quadToRelative(0.114f, 0.228f, 0.14f, 0.492f)
                horizontalLineToRelative(-0.776f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.096f, -0.249f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.17f, -0.19f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.237f, -0.126f)
                arcToRelative(1f, 1f, 0f, false, false, -0.3f, -0.044f)
                quadToRelative(-0.427f, 0f, -0.664f, 0.302f)
                quadToRelative(-0.235f, 0.3f, -0.235f, 0.85f)
                verticalLineToRelative(0.497f)
                quadToRelative(0f, 0.352f, 0.097f, 0.616f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.305f, 0.413f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, 0.518f, 0.146f)
                arcToRelative(1f, 1f, 0f, false, false, 0.457f, -0.097f)
                arcToRelative(0.67f, 0.67f, 0f, false, false, 0.273f, -0.263f)
                quadToRelative(0.09f, -0.164f, 0.09f, -0.364f)
                verticalLineToRelative(-0.254f)
                horizontalLineToRelative(-0.823f)
                verticalLineToRelative(-0.59f)
                horizontalLineToRelative(1.576f)
                verticalLineToRelative(0.798f)
                quadToRelative(0f, 0.29f, -0.096f, 0.55f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -0.293f, 0.457f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, -0.495f, 0.314f)
                quadToRelative(-0.296f, 0.111f, -0.698f, 0.111f)
                arcToRelative(2f, 2f, 0f, false, true, -0.752f, -0.132f)
                arcToRelative(1.45f, 1.45f, 0f, false, true, -0.534f, -0.377f)
                arcToRelative(1.6f, 1.6f, 0f, false, true, -0.319f, -0.58f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.105f, -0.745f)
                verticalLineToRelative(-0.507f)
                quadToRelative(0f, -0.54f, 0.199f, -0.949f)
                quadToRelative(0.202f, -0.406f, 0.583f, -0.633f)
                quadToRelative(0.383f, -0.228f, 0.926f, -0.228f)
                quadToRelative(0.357f, 0f, 0.635f, 0.1f)
                quadToRelative(0.282f, 0.1f, 0.48f, 0.275f)
                quadToRelative(0.2f, 0.176f, 0.314f, 0.407f)
            }
        }.build()
        
        return _FiletypeSvg!!
    }

private var _FiletypeSvg: ImageVector? = null

