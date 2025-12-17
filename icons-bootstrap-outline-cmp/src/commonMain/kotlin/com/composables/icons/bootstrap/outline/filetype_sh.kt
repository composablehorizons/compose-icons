package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeSh: ImageVector
    get() {
        if (_FiletypeSh != null) return _FiletypeSh!!
        
        _FiletypeSh = ImageVector.Builder(
            name = "filetype-sh",
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
                moveTo(0.111f, 15.29f)
                arcTo(1.2f, 1.2f, 0f, false, true, 0f, 14.84f)
                horizontalLineToRelative(0.765f)
                arcToRelative(0.58f, 0.58f, 0f, false, false, 0.255f, 0.384f)
                quadToRelative(0.105f, 0.073f, 0.249f, 0.114f)
                quadToRelative(0.143f, 0.041f, 0.319f, 0.041f)
                quadToRelative(0.246f, 0f, 0.413f, -0.07f)
                arcToRelative(0.56f, 0.56f, 0f, false, false, 0.255f, -0.193f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.085f, -0.29f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.153f, -0.326f)
                quadToRelative(-0.151f, -0.12f, -0.462f, -0.193f)
                lineToRelative(-0.619f, -0.143f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -0.539f, -0.214f)
                arcToRelative(1f, 1f, 0f, false, true, -0.351f, -0.367f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.123f, -0.524f)
                quadToRelative(0f, -0.366f, 0.19f, -0.639f)
                quadToRelative(0.19f, -0.272f, 0.528f, -0.422f)
                quadToRelative(0.336f, -0.15f, 0.776f, -0.149f)
                quadToRelative(0.457f, 0f, 0.78f, 0.152f)
                quadToRelative(0.324f, 0.153f, 0.5f, 0.41f)
                quadToRelative(0.18f, 0.255f, 0.2f, 0.566f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.56f, 0.56f, 0f, false, false, -0.12f, -0.258f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -0.247f, -0.181f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -0.369f, -0.068f)
                quadToRelative(-0.326f, 0f, -0.513f, 0.152f)
                arcToRelative(0.47f, 0.47f, 0f, false, false, -0.184f, 0.384f)
                quadToRelative(0f, 0.18f, 0.143f, 0.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.405f, 0.175f)
                lineToRelative(0.62f, 0.143f)
                quadToRelative(0.327f, 0.075f, 0.566f, 0.211f)
                quadToRelative(0.24f, 0.136f, 0.375f, 0.358f)
                reflectiveQuadToRelative(0.135f, 0.56f)
                quadToRelative(0f, 0.37f, -0.188f, 0.656f)
                arcToRelative(1.2f, 1.2f, 0f, false, true, -0.539f, 0.439f)
                quadToRelative(-0.351f, 0.158f, -0.858f, 0.158f)
                quadToRelative(-0.381f, 0f, -0.665f, -0.09f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, -0.478f, -0.252f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.29f, -0.375f)
                close()
                moveToRelative(6.67f, -3.358f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-1.715f)
                horizontalLineTo(4.308f)
                verticalLineToRelative(1.714f)
                horizontalLineToRelative(-0.792f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(0.792f)
                verticalLineToRelative(1.626f)
                horizontalLineTo(5.99f)
                verticalLineToRelative(-1.626f)
                close()
            }
        }.build()
        
        return _FiletypeSh!!
    }

private var _FiletypeSh: ImageVector? = null

