package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Css: ImageVector
    get() {
        if (_Css != null) return _Css!!
        
        _Css = ImageVector.Builder(
            name = "css",
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
                verticalLineTo(0f)
                close()
                moveTo(4.59f, 7.498f)
                quadToRelative(-0.908f, 0f, -1.455f, 0.508f)
                quadToRelative(-0.547f, 0.507f, -0.547f, 1.484f)
                verticalLineToRelative(3.106f)
                quadToRelative(0f, 0.986f, 0.527f, 1.484f)
                reflectiveQuadToRelative(1.406f, 0.498f)
                quadToRelative(0.576f, 0f, 1.016f, -0.224f)
                quadToRelative(0.45f, -0.225f, 0.703f, -0.674f)
                quadToRelative(0.255f, -0.45f, 0.254f, -1.114f)
                verticalLineToRelative(-0.185f)
                horizontalLineToRelative(-1.22f)
                verticalLineToRelative(0.176f)
                quadToRelative(0f, 0.449f, -0.186f, 0.683f)
                reflectiveQuadToRelative(-0.527f, 0.235f)
                quadToRelative(-0.372f, -0.01f, -0.557f, -0.264f)
                quadToRelative(-0.186f, -0.255f, -0.186f, -0.752f)
                verticalLineTo(9.686f)
                quadToRelative(0f, -0.547f, 0.166f, -0.811f)
                quadToRelative(0.177f, -0.264f, 0.577f, -0.264f)
                quadToRelative(0.321f, 0f, 0.517f, 0.225f)
                quadToRelative(0.195f, 0.224f, 0.195f, 0.693f)
                verticalLineToRelative(0.205f)
                horizontalLineToRelative(1.23f)
                verticalLineTo(9.52f)
                quadToRelative(0f, -0.674f, -0.243f, -1.124f)
                arcToRelative(1.55f, 1.55f, 0f, false, false, -0.664f, -0.673f)
                quadToRelative(-0.42f, -0.225f, -1.006f, -0.225f)
                moveToRelative(4.214f, -0.01f)
                quadToRelative(-0.586f, 0f, -1.006f, 0.244f)
                arcToRelative(1.67f, 1.67f, 0f, false, false, -0.635f, 0.674f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -0.225f, 0.996f)
                quadToRelative(0f, 0.753f, 0.293f, 1.182f)
                quadToRelative(0.304f, 0.42f, 0.967f, 0.732f)
                lineToRelative(0.469f, 0.215f)
                quadToRelative(0.44f, 0.186f, 0.625f, 0.43f)
                quadToRelative(0.186f, 0.244f, 0.186f, 0.635f)
                quadToRelative(0f, 0.478f, -0.166f, 0.703f)
                quadToRelative(-0.157f, 0.224f, -0.528f, 0.224f)
                quadToRelative(-0.36f, 0f, -0.547f, -0.244f)
                quadToRelative(-0.185f, -0.243f, -0.205f, -0.752f)
                horizontalLineTo(6.87f)
                quadToRelative(0.02f, 0.996f, 0.498f, 1.524f)
                quadToRelative(0.479f, 0.527f, 1.387f, 0.527f)
                reflectiveQuadToRelative(1.416f, -0.518f)
                reflectiveQuadToRelative(0.508f, -1.484f)
                quadToRelative(0f, -0.81f, -0.332f, -1.289f)
                quadToRelative(-0.333f, -0.479f, -1.045f, -0.79f)
                lineToRelative(-0.45f, -0.196f)
                quadToRelative(-0.39f, -0.166f, -0.556f, -0.381f)
                quadToRelative(-0.165f, -0.214f, -0.166f, -0.576f)
                quadToRelative(0f, -0.4f, 0.166f, -0.596f)
                quadToRelative(0.175f, -0.195f, 0.508f, -0.195f)
                quadToRelative(0.36f, 0f, 0.508f, 0.234f)
                quadToRelative(0.156f, 0.234f, 0.175f, 0.703f)
                horizontalLineToRelative(1.123f)
                quadToRelative(-0.03f, -0.976f, -0.498f, -1.484f)
                quadToRelative(-0.468f, -0.518f, -1.308f, -0.518f)
                moveToRelative(4.057f, 0f)
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
            }
        }.build()
        
        return _Css!!
    }

private var _Css: ImageVector? = null

