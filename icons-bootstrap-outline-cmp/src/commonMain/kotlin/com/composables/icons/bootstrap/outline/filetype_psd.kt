package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypePsd: ImageVector
    get() {
        if (_FiletypePsd != null) return _FiletypePsd!!
        
        _FiletypePsd = ImageVector.Builder(
            name = "filetype-psd",
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
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.5f)
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
                moveTo(3.116f, 14.841f)
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
                moveTo(1.6f, 11.932f)
                horizontalLineTo(0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(-1.343f)
                horizontalLineToRelative(0.803f)
                quadToRelative(0.43f, 0f, 0.732f, -0.173f)
                quadToRelative(0.305f, -0.175f, 0.463f, -0.474f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, 0.161f, -0.677f)
                quadToRelative(0f, -0.375f, -0.158f, -0.677f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.46f, -0.477f)
                quadToRelative(-0.3f, -0.18f, -0.732f, -0.179f)
                moveToRelative(0.545f, 1.333f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.085f, 0.38f)
                arcToRelative(0.57f, 0.57f, 0f, false, true, -0.238f, 0.241f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.375f, 0.082f)
                horizontalLineTo(0.788f)
                verticalLineToRelative(-1.406f)
                horizontalLineToRelative(0.66f)
                quadToRelative(0.327f, 0f, 0.512f, 0.182f)
                quadToRelative(0.185f, 0.181f, 0.185f, 0.521f)
                moveToRelative(4.609f, 2.666f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(1.459f)
                quadToRelative(0.609f, 0f, 1.004f, 0.234f)
                quadToRelative(0.396f, 0.235f, 0.59f, 0.68f)
                quadToRelative(0.195f, 0.445f, 0.195f, 1.075f)
                quadToRelative(0f, 0.634f, -0.196f, 1.084f)
                reflectiveQuadToRelative(-0.594f, 0.689f)
                quadToRelative(-0.396f, 0.237f, -1f, 0.237f)
                horizontalLineTo(6.755f)
                close()
                moveToRelative(1.353f, -3.354f)
                horizontalLineToRelative(-0.562f)
                verticalLineToRelative(2.707f)
                horizontalLineToRelative(0.562f)
                quadToRelative(0.279f, 0f, 0.483f, -0.082f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.334f, -0.252f)
                arcToRelative(1.1f, 1.1f, 0f, false, false, 0.197f, -0.422f)
                quadToRelative(0.067f, -0.252f, 0.067f, -0.592f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -0.117f, -0.753f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -0.355f, -0.454f)
                quadToRelative(-0.236f, -0.152f, -0.609f, -0.152f)
            }
        }.build()
        
        return _FiletypePsd!!
    }

private var _FiletypePsd: ImageVector? = null

