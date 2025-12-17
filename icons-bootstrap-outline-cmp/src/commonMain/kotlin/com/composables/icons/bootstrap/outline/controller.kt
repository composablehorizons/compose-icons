package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Controller: ImageVector
    get() {
        if (_Controller != null) return _Controller!!
        
        _Controller = ImageVector.Builder(
            name = "controller",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 6.027f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveToRelative(2.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveToRelative(-6.5f, -3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.051f, 3.26f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.354f, -0.613f)
                lineToRelative(1.932f, -0.518f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.62f, 0.39f)
                curveToRelative(0.655f, -0.079f, 1.35f, -0.117f, 2.043f, -0.117f)
                curveToRelative(0.72f, 0f, 1.443f, 0.041f, 2.12f, 0.126f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.622f, -0.399f)
                lineToRelative(1.932f, 0.518f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.306f, 0.729f)
                quadToRelative(0.211f, 0.136f, 0.373f, 0.297f)
                curveToRelative(0.408f, 0.408f, 0.78f, 1.05f, 1.095f, 1.772f)
                curveToRelative(0.32f, 0.733f, 0.599f, 1.591f, 0.805f, 2.466f)
                reflectiveCurveToRelative(0.34f, 1.78f, 0.364f, 2.606f)
                curveToRelative(0.024f, 0.816f, -0.059f, 1.602f, -0.328f, 2.21f)
                arcToRelative(1.42f, 1.42f, 0f, false, true, -1.445f, 0.83f)
                curveToRelative(-0.636f, -0.067f, -1.115f, -0.394f, -1.513f, -0.773f)
                curveToRelative(-0.245f, -0.232f, -0.496f, -0.526f, -0.739f, -0.808f)
                curveToRelative(-0.126f, -0.148f, -0.25f, -0.292f, -0.368f, -0.423f)
                curveToRelative(-0.728f, -0.804f, -1.597f, -1.527f, -3.224f, -1.527f)
                reflectiveCurveToRelative(-2.496f, 0.723f, -3.224f, 1.527f)
                curveToRelative(-0.119f, 0.131f, -0.242f, 0.275f, -0.368f, 0.423f)
                curveToRelative(-0.243f, 0.282f, -0.494f, 0.575f, -0.739f, 0.808f)
                curveToRelative(-0.398f, 0.38f, -0.877f, 0.706f, -1.513f, 0.773f)
                arcToRelative(1.42f, 1.42f, 0f, false, true, -1.445f, -0.83f)
                curveToRelative(-0.27f, -0.608f, -0.352f, -1.395f, -0.329f, -2.21f)
                curveToRelative(0.024f, -0.826f, 0.16f, -1.73f, 0.365f, -2.606f)
                curveToRelative(0.206f, -0.875f, 0.486f, -1.733f, 0.805f, -2.466f)
                curveToRelative(0.315f, -0.722f, 0.687f, -1.364f, 1.094f, -1.772f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, 0.433f, -0.335f)
                lineToRelative(-0.028f, -0.079f)
                close()
                moveToRelative(2.036f, 0.412f)
                curveToRelative(-0.877f, 0.185f, -1.469f, 0.443f, -1.733f, 0.708f)
                curveToRelative(-0.276f, 0.276f, -0.587f, 0.783f, -0.885f, 1.465f)
                arcToRelative(14f, 14f, 0f, false, false, -0.748f, 2.295f)
                arcToRelative(12.4f, 12.4f, 0f, false, false, -0.339f, 2.406f)
                curveToRelative(-0.022f, 0.755f, 0.062f, 1.368f, 0.243f, 1.776f)
                arcToRelative(0.42f, 0.42f, 0f, false, false, 0.426f, 0.24f)
                curveToRelative(0.327f, -0.034f, 0.61f, -0.199f, 0.929f, -0.502f)
                curveToRelative(0.212f, -0.202f, 0.4f, -0.423f, 0.615f, -0.674f)
                curveToRelative(0.133f, -0.156f, 0.276f, -0.323f, 0.44f, -0.504f)
                curveTo(4.861f, 9.969f, 5.978f, 9.027f, 8f, 9.027f)
                reflectiveCurveToRelative(3.139f, 0.942f, 3.965f, 1.855f)
                curveToRelative(0.164f, 0.181f, 0.307f, 0.348f, 0.44f, 0.504f)
                curveToRelative(0.214f, 0.251f, 0.403f, 0.472f, 0.615f, 0.674f)
                curveToRelative(0.318f, 0.303f, 0.601f, 0.468f, 0.929f, 0.503f)
                arcToRelative(0.42f, 0.42f, 0f, false, false, 0.426f, -0.241f)
                curveToRelative(0.18f, -0.408f, 0.265f, -1.02f, 0.243f, -1.776f)
                arcToRelative(12.4f, 12.4f, 0f, false, false, -0.339f, -2.406f)
                arcToRelative(14f, 14f, 0f, false, false, -0.748f, -2.295f)
                curveToRelative(-0.298f, -0.682f, -0.61f, -1.19f, -0.885f, -1.465f)
                curveToRelative(-0.264f, -0.265f, -0.856f, -0.523f, -1.733f, -0.708f)
                curveToRelative(-0.85f, -0.179f, -1.877f, -0.27f, -2.913f, -0.27f)
                reflectiveCurveToRelative(-2.063f, 0.091f, -2.913f, 0.27f)
            }
        }.build()
        
        return _Controller!!
    }

private var _Controller: ImageVector? = null

