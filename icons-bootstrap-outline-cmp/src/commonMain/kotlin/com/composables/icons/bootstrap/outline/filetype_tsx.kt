package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeTsx: ImageVector
    get() {
        if (_FiletypeTsx != null) return _FiletypeTsx!!
        
        _FiletypeTsx = ImageVector.Builder(
            name = "filetype-tsx",
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
                moveTo(3.172f, 14.841f)
                arcToRelative(1.13f, 1.13f, 0f, false, false, 0.401f, 0.823f)
                quadToRelative(0.193f, 0.162f, 0.478f, 0.252f)
                quadToRelative(0.283f, 0.091f, 0.665f, 0.091f)
                quadToRelative(0.507f, 0f, 0.858f, -0.158f)
                quadToRelative(0.354f, -0.158f, 0.54f, -0.44f)
                arcToRelative(1.17f, 1.17f, 0f, false, false, 0.187f, -0.656f)
                quadToRelative(0f, -0.336f, -0.135f, -0.56f)
                arcToRelative(1f, 1f, 0f, false, false, -0.375f, -0.357f)
                arcToRelative(2f, 2f, 0f, false, false, -0.566f, -0.21f)
                lineToRelative(-0.62f, -0.144f)
                arcToRelative(1f, 1f, 0f, false, true, -0.405f, -0.176f)
                arcToRelative(0.37f, 0.37f, 0f, false, true, -0.144f, -0.299f)
                quadToRelative(0f, -0.234f, 0.185f, -0.384f)
                quadToRelative(0.188f, -0.152f, 0.513f, -0.152f)
                quadToRelative(0.213f, 0f, 0.369f, 0.068f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, 0.246f, 0.181f)
                arcToRelative(0.56f, 0.56f, 0f, false, true, 0.12f, 0.258f)
                horizontalLineToRelative(0.75f)
                arcToRelative(1.1f, 1.1f, 0f, false, false, -0.2f, -0.566f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.5f, -0.41f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -0.78f, -0.152f)
                quadToRelative(-0.438f, 0f, -0.776f, 0.15f)
                quadToRelative(-0.336f, 0.149f, -0.527f, 0.421f)
                quadToRelative(-0.19f, 0.273f, -0.19f, 0.639f)
                quadToRelative(0f, 0.302f, 0.122f, 0.524f)
                quadToRelative(0.124f, 0.223f, 0.352f, 0.367f)
                quadToRelative(0.228f, 0.143f, 0.54f, 0.213f)
                lineToRelative(0.617f, 0.144f)
                quadToRelative(0.311f, 0.073f, 0.463f, 0.193f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.152f, 0.326f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.084f, 0.29f)
                arcToRelative(0.56f, 0.56f, 0f, false, true, -0.255f, 0.193f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.413f, 0.07f)
                quadToRelative(-0.177f, 0f, -0.32f, -0.04f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.249f, -0.115f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, -0.255f, -0.384f)
                close()
                moveToRelative(-1.244f, 1.09f)
                verticalLineToRelative(-3.337f)
                horizontalLineToRelative(1.136f)
                verticalLineToRelative(-0.662f)
                horizontalLineTo(0f)
                verticalLineToRelative(0.662f)
                horizontalLineToRelative(1.134f)
                verticalLineToRelative(3.337f)
                close()
                moveToRelative(7.076f, -3.999f)
                horizontalLineToRelative(0.893f)
                lineToRelative(-1.274f, 2.007f)
                lineToRelative(1.254f, 1.992f)
                horizontalLineToRelative(-0.909f)
                lineToRelative(-0.85f, -1.415f)
                horizontalLineToRelative(-0.034f)
                lineToRelative(-0.853f, 1.415f)
                horizontalLineTo(6.37f)
                lineToRelative(1.239f, -2.016f)
                lineToRelative(-1.228f, -1.983f)
                horizontalLineToRelative(0.932f)
                lineToRelative(0.832f, 1.438f)
                horizontalLineToRelative(0.035f)
                close()
            }
        }.build()
        
        return _FiletypeTsx!!
    }

private var _FiletypeTsx: ImageVector? = null

