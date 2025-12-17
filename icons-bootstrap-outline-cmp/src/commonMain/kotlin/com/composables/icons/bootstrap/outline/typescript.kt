package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Typescript: ImageVector
    get() {
        if (_Typescript != null) return _Typescript!!
        
        _Typescript = ImageVector.Builder(
            name = "typescript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
                moveToRelative(-1.139f, 7.488f)
                quadToRelative(-0.585f, 0f, -1.006f, 0.244f)
                arcToRelative(1.67f, 1.67f, 0f, false, false, -0.634f, 0.674f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -0.225f, 0.996f)
                quadToRelative(0f, 0.753f, 0.293f, 1.182f)
                quadToRelative(0.303f, 0.42f, 0.967f, 0.732f)
                lineToRelative(0.469f, 0.215f)
                quadToRelative(0.438f, 0.186f, 0.625f, 0.43f)
                quadToRelative(0.185f, 0.244f, 0.185f, 0.635f)
                quadToRelative(0f, 0.478f, -0.166f, 0.703f)
                quadToRelative(-0.156f, 0.224f, -0.527f, 0.224f)
                quadToRelative(-0.361f, 0.001f, -0.547f, -0.244f)
                quadToRelative(-0.186f, -0.243f, -0.205f, -0.752f)
                horizontalLineToRelative(-1.162f)
                quadToRelative(0.02f, 0.996f, 0.498f, 1.524f)
                quadToRelative(0.479f, 0.527f, 1.386f, 0.527f)
                quadToRelative(0.909f, 0f, 1.417f, -0.518f)
                quadToRelative(0.507f, -0.517f, 0.507f, -1.484f)
                quadToRelative(0f, -0.81f, -0.332f, -1.289f)
                reflectiveQuadToRelative(-1.045f, -0.79f)
                lineToRelative(-0.449f, -0.196f)
                quadToRelative(-0.39f, -0.166f, -0.556f, -0.381f)
                quadToRelative(-0.166f, -0.214f, -0.166f, -0.576f)
                quadToRelative(0f, -0.4f, 0.165f, -0.596f)
                quadToRelative(0.177f, -0.195f, 0.508f, -0.195f)
                quadToRelative(0.361f, 0f, 0.508f, 0.234f)
                quadToRelative(0.156f, 0.234f, 0.176f, 0.703f)
                horizontalLineToRelative(1.123f)
                quadToRelative(-0.03f, -0.976f, -0.498f, -1.484f)
                quadToRelative(-0.47f, -0.518f, -1.309f, -0.518f)
                moveTo(7f, 7.596f)
                verticalLineToRelative(1.113f)
                horizontalLineToRelative(1.3f)
                verticalLineTo(14.5f)
                horizontalLineToRelative(1.221f)
                verticalLineTo(8.709f)
                horizontalLineToRelative(1.289f)
                verticalLineTo(7.596f)
                close()
            }
        }.build()
        
        return _Typescript!!
    }

private var _Typescript: ImageVector? = null

