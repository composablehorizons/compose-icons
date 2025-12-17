package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeSql: ImageVector
    get() {
        if (_FiletypeSql != null) return _FiletypeSql!!
        
        _FiletypeSql = ImageVector.Builder(
            name = "filetype-sql",
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
                curveToRelative(0.284f, 0.09f, 0.411f, 0.091f, 0.665f, 0.091f)
                quadToRelative(0.507f, 0f, 0.858f, -0.158f)
                quadToRelative(0.355f, -0.159f, 0.54f, -0.44f)
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
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.153f, 0.325f)
                quadToRelative(0f, 0.165f, -0.085f, 0.29f)
                arcTo(0.56f, 0.56f, 0f, false, true, 2f, 15.31f)
                quadToRelative(-0.167f, 0.07f, -0.413f, 0.07f)
                quadToRelative(-0.176f, 0f, -0.32f, -0.04f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.248f, -0.115f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, -0.255f, -0.384f)
                close()
                moveToRelative(6.878f, 1.489f)
                lineToRelative(-0.507f, -0.739f)
                quadToRelative(0.264f, -0.243f, 0.401f, -0.6f)
                quadToRelative(0.138f, -0.358f, 0.138f, -0.806f)
                verticalLineToRelative(-0.501f)
                quadToRelative(0f, -0.556f, -0.208f, -0.967f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.589f, -0.636f)
                quadToRelative(-0.383f, -0.225f, -0.917f, -0.225f)
                quadToRelative(-0.527f, 0f, -0.914f, 0.225f)
                quadToRelative(-0.384f, 0.223f, -0.592f, 0.636f)
                arcToRelative(2.14f, 2.14f, 0f, false, false, -0.205f, 0.967f)
                verticalLineToRelative(0.5f)
                quadToRelative(0f, 0.554f, 0.205f, 0.965f)
                quadToRelative(0.208f, 0.41f, 0.592f, 0.636f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 0.914f, 0.222f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 0.6f, -0.1f)
                lineToRelative(0.294f, 0.422f)
                horizontalLineToRelative(0.788f)
                close()
                moveTo(4.262f, 14.2f)
                verticalLineToRelative(-0.522f)
                quadToRelative(0f, -0.369f, 0.114f, -0.63f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, 0.325f, -0.398f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, 0.495f, -0.138f)
                quadToRelative(0.288f, 0f, 0.495f, 0.138f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, 0.325f, 0.398f)
                quadToRelative(0.115f, 0.261f, 0.115f, 0.63f)
                verticalLineToRelative(0.522f)
                quadToRelative(0f, 0.246f, -0.053f, 0.445f)
                quadToRelative(-0.053f, 0.196f, -0.155f, 0.34f)
                lineToRelative(-0.106f, -0.14f)
                lineToRelative(-0.105f, -0.147f)
                horizontalLineToRelative(-0.733f)
                lineToRelative(0.451f, 0.65f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, -0.251f, 0.047f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, -0.487f, -0.147f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.32f, -0.404f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -0.11f, -0.644f)
                moveToRelative(3.986f, 1.057f)
                horizontalLineToRelative(1.696f)
                verticalLineToRelative(0.674f)
                horizontalLineTo(7.457f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(0.79f)
                close()
            }
        }.build()
        
        return _FiletypeSql!!
    }

private var _FiletypeSql: ImageVector? = null

