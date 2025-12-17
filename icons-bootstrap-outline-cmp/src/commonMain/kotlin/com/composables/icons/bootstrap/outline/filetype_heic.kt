package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeHeic: ImageVector
    get() {
        if (_FiletypeHeic != null) return _FiletypeHeic!!
        
        _FiletypeHeic = ImageVector.Builder(
            name = "filetype-heic",
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
                moveToRelative(-4.637f, 8.554f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.103f, 0.633f)
                verticalLineToRelative(0.495f)
                quadToRelative(0f, 0.369f, 0.103f, 0.627f)
                arcToRelative(0.83f, 0.83f, 0f, false, false, 0.299f, 0.393f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, 0.477f, 0.131f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.401f, -0.088f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, 0.273f, -0.248f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.117f, -0.364f)
                horizontalLineToRelative(0.765f)
                verticalLineToRelative(0.076f)
                arcToRelative(1.27f, 1.27f, 0f, false, true, -0.226f, 0.674f)
                quadToRelative(-0.205f, 0.29f, -0.55f, 0.454f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, -0.786f, 0.164f)
                quadToRelative(-0.54f, 0f, -0.914f, -0.216f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, -0.571f, -0.627f)
                quadToRelative(-0.194f, -0.408f, -0.194f, -0.976f)
                verticalLineToRelative(-0.498f)
                quadToRelative(0f, -0.568f, 0.197f, -0.978f)
                quadToRelative(0.196f, -0.411f, 0.571f, -0.633f)
                quadToRelative(0.378f, -0.223f, 0.911f, -0.223f)
                quadToRelative(0.328f, 0f, 0.607f, 0.097f)
                quadToRelative(0.28f, 0.093f, 0.489f, 0.272f)
                arcToRelative(1.32f, 1.32f, 0f, false, true, 0.466f, 0.964f)
                verticalLineToRelative(0.073f)
                horizontalLineToRelative(-0.765f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, -0.12f, -0.38f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.273f, -0.261f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.398f, -0.097f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.475f, 0.138f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, -0.301f, 0.398f)
                moveToRelative(-6.1f, -1.128f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-0.79f)
                verticalLineTo(14.21f)
                horizontalLineTo(0.79f)
                verticalLineToRelative(1.714f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(1.626f)
                horizontalLineToRelative(1.682f)
                verticalLineToRelative(-1.626f)
                close()
                moveToRelative(1.488f, 3.352f)
                horizontalLineToRelative(1.79f)
                verticalLineToRelative(0.647f)
                horizontalLineTo(3.966f)
                verticalLineToRelative(-3.999f)
                horizontalLineTo(6.54f)
                verticalLineToRelative(0.648f)
                horizontalLineTo(4.75f)
                verticalLineToRelative(1.025f)
                horizontalLineToRelative(1.684f)
                verticalLineToRelative(0.607f)
                horizontalLineTo(4.751f)
                close()
                moveToRelative(3.163f, 0.647f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(-0.791f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.79f)
                close()
            }
        }.build()
        
        return _FiletypeHeic!!
    }

private var _FiletypeHeic: ImageVector? = null

