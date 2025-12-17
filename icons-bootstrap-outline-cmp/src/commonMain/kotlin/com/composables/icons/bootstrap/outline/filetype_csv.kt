package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeCsv: ImageVector
    get() {
        if (_FiletypeCsv != null) return _FiletypeCsv!!
        
        _FiletypeCsv = ImageVector.Builder(
            name = "filetype-csv",
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
                moveTo(3.517f, 14.841f)
                arcToRelative(1.13f, 1.13f, 0f, false, false, 0.401f, 0.823f)
                quadToRelative(0.195f, 0.162f, 0.478f, 0.252f)
                quadToRelative(0.284f, 0.091f, 0.665f, 0.091f)
                quadToRelative(0.507f, 0f, 0.859f, -0.158f)
                quadToRelative(0.354f, -0.158f, 0.539f, -0.44f)
                quadToRelative(0.187f, -0.284f, 0.187f, -0.656f)
                quadToRelative(0f, -0.336f, -0.134f, -0.56f)
                arcToRelative(1f, 1f, 0f, false, false, -0.375f, -0.357f)
                arcToRelative(2f, 2f, 0f, false, false, -0.566f, -0.21f)
                lineToRelative(-0.621f, -0.144f)
                arcToRelative(1f, 1f, 0f, false, true, -0.404f, -0.176f)
                arcToRelative(0.37f, 0.37f, 0f, false, true, -0.144f, -0.299f)
                quadToRelative(0f, -0.234f, 0.185f, -0.384f)
                quadToRelative(0.188f, -0.152f, 0.512f, -0.152f)
                quadToRelative(0.214f, 0f, 0.37f, 0.068f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, 0.246f, 0.181f)
                arcToRelative(0.56f, 0.56f, 0f, false, true, 0.12f, 0.258f)
                horizontalLineToRelative(0.75f)
                arcToRelative(1.1f, 1.1f, 0f, false, false, -0.2f, -0.566f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.5f, -0.41f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -0.78f, -0.152f)
                quadToRelative(-0.439f, 0f, -0.776f, 0.15f)
                quadToRelative(-0.337f, 0.149f, -0.527f, 0.421f)
                quadToRelative(-0.19f, 0.273f, -0.19f, 0.639f)
                quadToRelative(0f, 0.302f, 0.122f, 0.524f)
                quadToRelative(0.124f, 0.223f, 0.352f, 0.367f)
                quadToRelative(0.228f, 0.143f, 0.539f, 0.213f)
                lineToRelative(0.618f, 0.144f)
                quadToRelative(0.31f, 0.073f, 0.463f, 0.193f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.152f, 0.326f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.085f, 0.29f)
                arcToRelative(0.56f, 0.56f, 0f, false, true, -0.255f, 0.193f)
                quadToRelative(-0.167f, 0.07f, -0.413f, 0.07f)
                quadToRelative(-0.175f, 0f, -0.32f, -0.04f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.248f, -0.115f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, -0.255f, -0.384f)
                close()
                moveTo(0.806f, 13.693f)
                quadToRelative(0f, -0.373f, 0.102f, -0.633f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.302f, -0.399f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 0.475f, -0.137f)
                quadToRelative(0.225f, 0f, 0.398f, 0.097f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 0.272f, 0.26f)
                arcToRelative(0.85f, 0.85f, 0f, false, true, 0.12f, 0.381f)
                horizontalLineToRelative(0.765f)
                verticalLineToRelative(-0.072f)
                arcToRelative(1.33f, 1.33f, 0f, false, false, -0.466f, -0.964f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.489f, -0.272f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -0.606f, -0.097f)
                quadToRelative(-0.534f, 0f, -0.911f, 0.223f)
                quadToRelative(-0.375f, 0.222f, -0.572f, 0.632f)
                quadToRelative(-0.195f, 0.41f, -0.196f, 0.979f)
                verticalLineToRelative(0.498f)
                quadToRelative(0f, 0.568f, 0.193f, 0.976f)
                quadToRelative(0.197f, 0.407f, 0.572f, 0.626f)
                quadToRelative(0.375f, 0.217f, 0.914f, 0.217f)
                quadToRelative(0.439f, 0f, 0.785f, -0.164f)
                reflectiveQuadToRelative(0.55f, -0.454f)
                arcToRelative(1.27f, 1.27f, 0f, false, false, 0.226f, -0.674f)
                verticalLineToRelative(-0.076f)
                horizontalLineToRelative(-0.764f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.118f, 0.363f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.272f, 0.25f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.401f, 0.087f)
                arcToRelative(0.85f, 0.85f, 0f, false, true, -0.478f, -0.132f)
                arcToRelative(0.83f, 0.83f, 0f, false, true, -0.299f, -0.392f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -0.102f, -0.627f)
                close()
                moveToRelative(8.239f, 2.238f)
                horizontalLineToRelative(-0.953f)
                lineToRelative(-1.338f, -3.999f)
                horizontalLineToRelative(0.917f)
                lineToRelative(0.896f, 3.138f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.888f, -3.138f)
                horizontalLineToRelative(0.879f)
                close()
            }
        }.build()
        
        return _FiletypeCsv!!
    }

private var _FiletypeCsv: ImageVector? = null

