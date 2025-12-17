package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BugAnt: ImageVector
    get() {
        if (_BugAnt != null) return _BugAnt!!
        
        _BugAnt = ImageVector.Builder(
            name = "bug-ant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.478f, 1.6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.273f, 1.026f)
                arcToRelative(3.72f, 3.72f, 0f, false, false, -0.425f, 1.121f)
                curveToRelative(0.058f, 0.058f, 0.118f, 0.114f, 0.18f, 0.168f)
                arcTo(4.491f, 4.491f, 0f, false, true, 12f, 2.25f)
                curveToRelative(1.413f, 0f, 2.673f, 0.651f, 3.497f, 1.668f)
                curveToRelative(0.06f, -0.054f, 0.12f, -0.11f, 0.178f, -0.167f)
                arcToRelative(3.717f, 3.717f, 0f, false, false, -0.426f, -1.125f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.298f, -0.752f)
                arcToRelative(5.22f, 5.22f, 0f, false, true, 0.671f, 2.046f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.187f, 0.582f)
                curveToRelative(-0.241f, 0.27f, -0.505f, 0.52f, -0.787f, 0.749f)
                arcToRelative(4.494f, 4.494f, 0f, false, true, 0.216f, 2.1f)
                curveToRelative(-0.106f, 0.792f, -0.753f, 1.295f, -1.417f, 1.403f)
                curveToRelative(-0.182f, 0.03f, -0.364f, 0.057f, -0.547f, 0.081f)
                curveToRelative(0.152f, 0.227f, 0.273f, 0.476f, 0.359f, 0.742f)
                arcToRelative(23.122f, 23.122f, 0f, false, false, 3.832f, -0.803f)
                arcToRelative(23.241f, 23.241f, 0f, false, false, -0.345f, -2.634f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.474f, -0.28f)
                curveToRelative(0.21f, 1.115f, 0.348f, 2.256f, 0.404f, 3.418f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.516f, 0.75f)
                curveToRelative(-1.527f, 0.499f, -3.119f, 0.854f, -4.76f, 1.049f)
                curveToRelative(-0.074f, 0.38f, -0.22f, 0.735f, -0.423f, 1.05f)
                curveToRelative(2.066f, 0.209f, 4.058f, 0.672f, 5.943f, 1.358f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.492f, 0.75f)
                arcToRelative(24.665f, 24.665f, 0f, false, true, -1.189f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.425f, -0.47f)
                arcToRelative(23.14f, 23.14f, 0f, false, false, 1.077f, -5.306f)
                curveToRelative(-0.5f, -0.169f, -1.009f, -0.32f, -1.524f, -0.455f)
                curveToRelative(0.068f, 0.234f, 0.104f, 0.484f, 0.104f, 0.746f)
                curveToRelative(0f, 3.956f, -2.521f, 7.5f, -6f, 7.5f)
                curveToRelative(-3.478f, 0f, -6f, -3.544f, -6f, -7.5f)
                curveToRelative(0f, -0.262f, 0.037f, -0.511f, 0.104f, -0.746f)
                curveToRelative(-0.514f, 0.135f, -1.022f, 0.286f, -1.522f, 0.455f)
                curveToRelative(0.154f, 1.838f, 0.52f, 3.616f, 1.077f, 5.307f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.425f, 0.468f)
                arcToRelative(24.662f, 24.662f, 0f, false, true, -1.19f, -6.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.493f, -0.749f)
                arcToRelative(24.586f, 24.586f, 0f, false, true, 4.964f, -1.24f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.321f, -0.046f, 0.644f, -0.085f, 0.969f, -0.118f)
                arcToRelative(2.983f, 2.983f, 0f, false, true, -0.424f, -1.05f)
                arcToRelative(24.614f, 24.614f, 0f, false, true, -4.76f, -1.05f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.516f, -0.75f)
                curveToRelative(0.057f, -1.16f, 0.194f, -2.302f, 0.405f, -3.417f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.474f, 0.28f)
                curveToRelative(-0.164f, 0.862f, -0.28f, 1.74f, -0.345f, 2.634f)
                curveToRelative(1.237f, 0.371f, 2.517f, 0.642f, 3.832f, 0.803f)
                curveToRelative(0.085f, -0.266f, 0.207f, -0.515f, 0.359f, -0.742f)
                arcToRelative(18.698f, 18.698f, 0f, false, true, -0.547f, -0.08f)
                curveToRelative(-0.664f, -0.11f, -1.311f, -0.612f, -1.417f, -1.404f)
                arcToRelative(4.535f, 4.535f, 0f, false, true, 0.217f, -2.103f)
                arcToRelative(6.788f, 6.788f, 0f, false, true, -0.788f, -0.751f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.187f, -0.583f)
                arcToRelative(5.22f, 5.22f, 0f, false, true, 0.67f, -2.04f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.026f, -0.273f)
                close()
            }
        }.build()
        
        return _BugAnt!!
    }

private var _BugAnt: ImageVector? = null

