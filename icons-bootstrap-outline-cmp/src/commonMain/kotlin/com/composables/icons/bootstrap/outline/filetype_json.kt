package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeJson: ImageVector
    get() {
        if (_FiletypeJson != null) return _FiletypeJson!!
        
        _FiletypeJson = ImageVector.Builder(
            name = "filetype-json",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1f)
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
                moveTo(4.151f, 15.29f)
                arcToRelative(1.2f, 1.2f, 0f, false, true, -0.111f, -0.449f)
                horizontalLineToRelative(0.764f)
                arcToRelative(0.58f, 0.58f, 0f, false, false, 0.255f, 0.384f)
                quadToRelative(0.105f, 0.073f, 0.25f, 0.114f)
                quadToRelative(0.142f, 0.041f, 0.319f, 0.041f)
                quadToRelative(0.245f, 0f, 0.413f, -0.07f)
                arcToRelative(0.56f, 0.56f, 0f, false, false, 0.255f, -0.193f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.084f, -0.29f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.152f, -0.326f)
                quadToRelative(-0.152f, -0.12f, -0.463f, -0.193f)
                lineToRelative(-0.618f, -0.143f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -0.539f, -0.214f)
                arcToRelative(1f, 1f, 0f, false, true, -0.352f, -0.367f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.123f, -0.524f)
                quadToRelative(0f, -0.366f, 0.19f, -0.639f)
                quadToRelative(0.192f, -0.272f, 0.528f, -0.422f)
                quadToRelative(0.337f, -0.15f, 0.777f, -0.149f)
                quadToRelative(0.456f, 0f, 0.779f, 0.152f)
                quadToRelative(0.326f, 0.153f, 0.5f, 0.41f)
                quadToRelative(0.18f, 0.255f, 0.2f, 0.566f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.56f, 0.56f, 0f, false, false, -0.12f, -0.258f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -0.246f, -0.181f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -0.37f, -0.068f)
                quadToRelative(-0.324f, 0f, -0.512f, 0.152f)
                arcToRelative(0.47f, 0.47f, 0f, false, false, -0.185f, 0.384f)
                quadToRelative(0f, 0.18f, 0.144f, 0.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.404f, 0.175f)
                lineToRelative(0.621f, 0.143f)
                quadToRelative(0.326f, 0.075f, 0.566f, 0.211f)
                arcToRelative(1f, 1f, 0f, false, true, 0.375f, 0.358f)
                quadToRelative(0.135f, 0.222f, 0.135f, 0.56f)
                quadToRelative(0f, 0.37f, -0.188f, 0.656f)
                arcToRelative(1.2f, 1.2f, 0f, false, true, -0.539f, 0.439f)
                quadToRelative(-0.351f, 0.158f, -0.858f, 0.158f)
                quadToRelative(-0.381f, 0f, -0.665f, -0.09f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, -0.478f, -0.252f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.29f, -0.375f)
                moveToRelative(-3.104f, -0.033f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -0.082f, -0.466f)
                horizontalLineToRelative(0.764f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, 0.074f, 0.27f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.454f, 0.246f)
                quadToRelative(0.285f, 0f, 0.422f, -0.164f)
                quadToRelative(0.137f, -0.165f, 0.137f, -0.466f)
                verticalLineToRelative(-2.745f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(2.725f)
                quadToRelative(0f, 0.66f, -0.357f, 1.005f)
                quadToRelative(-0.355f, 0.345f, -0.985f, 0.345f)
                arcToRelative(1.6f, 1.6f, 0f, false, true, -0.568f, -0.094f)
                arcToRelative(1.15f, 1.15f, 0f, false, true, -0.407f, -0.266f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.243f, -0.39f)
                moveToRelative(9.091f, -1.585f)
                verticalLineToRelative(0.522f)
                quadToRelative(0f, 0.384f, -0.117f, 0.641f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, -0.322f, 0.387f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.47f, 0.126f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.47f, -0.126f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, -0.32f, -0.387f)
                arcToRelative(1.55f, 1.55f, 0f, false, true, -0.117f, -0.641f)
                verticalLineToRelative(-0.522f)
                quadToRelative(0f, -0.386f, 0.117f, -0.641f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.32f, -0.387f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.47f, -0.129f)
                quadToRelative(0.265f, 0f, 0.47f, 0.129f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, 0.322f, 0.387f)
                quadToRelative(0.117f, 0.255f, 0.117f, 0.641f)
                moveToRelative(0.803f, 0.519f)
                verticalLineToRelative(-0.513f)
                quadToRelative(0f, -0.565f, -0.205f, -0.973f)
                arcToRelative(1.46f, 1.46f, 0f, false, false, -0.59f, -0.63f)
                quadToRelative(-0.38f, -0.22f, -0.916f, -0.22f)
                quadToRelative(-0.534f, 0f, -0.92f, 0.22f)
                arcToRelative(1.44f, 1.44f, 0f, false, false, -0.589f, 0.628f)
                quadToRelative(-0.205f, 0.407f, -0.205f, 0.975f)
                verticalLineToRelative(0.513f)
                quadToRelative(0f, 0.562f, 0.205f, 0.973f)
                quadToRelative(0.205f, 0.407f, 0.589f, 0.626f)
                quadToRelative(0.386f, 0.217f, 0.92f, 0.217f)
                quadToRelative(0.536f, 0f, 0.917f, -0.217f)
                quadToRelative(0.384f, -0.22f, 0.589f, -0.626f)
                quadToRelative(0.204f, -0.41f, 0.205f, -0.973f)
                moveToRelative(1.29f, -0.935f)
                verticalLineToRelative(2.675f)
                horizontalLineToRelative(-0.746f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(0.662f)
                lineToRelative(1.752f, 2.66f)
                horizontalLineToRelative(0.032f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-0.656f)
                lineToRelative(-1.761f, -2.676f)
                close()
            }
        }.build()
        
        return _FiletypeJson!!
    }

private var _FiletypeJson: ImageVector? = null

