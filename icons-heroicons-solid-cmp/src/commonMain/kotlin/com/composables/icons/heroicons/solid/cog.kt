package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Cog: ImageVector
    get() {
        if (_Cog != null) return _Cog!!
        
        _Cog = ImageVector.Builder(
            name = "cog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.004f, 10.407f)
                curveToRelative(0.138f, 0.435f, -0.216f, 0.842f, -0.672f, 0.842f)
                horizontalLineToRelative(-3.465f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.65f, -0.375f)
                lineToRelative(-1.732f, -3f)
                curveToRelative(-0.229f, -0.396f, -0.053f, -0.907f, 0.393f, -1.004f)
                arcToRelative(5.252f, 5.252f, 0f, false, true, 6.126f, 3.537f)
                close()
                moveTo(8.12f, 8.464f)
                curveToRelative(0.307f, -0.338f, 0.838f, -0.235f, 1.066f, 0.16f)
                lineToRelative(1.732f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 0.75f)
                lineToRelative(-1.732f, 3f)
                curveToRelative(-0.229f, 0.397f, -0.76f, 0.5f, -1.067f, 0.161f)
                arcTo(5.23f, 5.23f, 0f, false, true, 6.75f, 12f)
                arcToRelative(5.23f, 5.23f, 0f, false, true, 1.37f, -3.536f)
                close()
                moveTo(10.878f, 17.13f)
                curveToRelative(-0.447f, -0.098f, -0.623f, -0.608f, -0.394f, -1.004f)
                lineToRelative(1.733f, -3.002f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.65f, -0.375f)
                horizontalLineToRelative(3.465f)
                curveToRelative(0.457f, 0f, 0.81f, 0.407f, 0.672f, 0.842f)
                arcToRelative(5.252f, 5.252f, 0f, false, true, -6.126f, 3.539f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineToRelative(-0.783f)
                arcToRelative(8.22f, 8.22f, 0f, false, false, -0.237f, -1.357f)
                lineToRelative(0.734f, -0.267f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.513f, -1.41f)
                lineToRelative(-0.735f, 0.268f)
                arcToRelative(8.24f, 8.24f, 0f, false, false, -0.689f, -1.192f)
                lineToRelative(0.6f, -0.503f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.964f, -1.149f)
                lineToRelative(-0.6f, 0.504f)
                arcToRelative(8.3f, 8.3f, 0f, false, false, -1.054f, -0.885f)
                lineToRelative(0.391f, -0.678f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.299f, -0.75f)
                lineToRelative(-0.39f, 0.676f)
                arcToRelative(8.188f, 8.188f, 0f, false, false, -1.295f, -0.47f)
                lineToRelative(0.136f, -0.77f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.477f, -0.26f)
                lineToRelative(-0.136f, 0.77f)
                arcToRelative(8.36f, 8.36f, 0f, false, false, -1.377f, 0f)
                lineToRelative(-0.136f, -0.77f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.477f, 0.26f)
                lineToRelative(0.136f, 0.77f)
                curveToRelative(-0.448f, 0.121f, -0.88f, 0.28f, -1.294f, 0.47f)
                lineToRelative(-0.39f, -0.676f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.3f, 0.75f)
                lineToRelative(0.392f, 0.678f)
                arcToRelative(8.29f, 8.29f, 0f, false, false, -1.054f, 0.885f)
                lineToRelative(-0.6f, -0.504f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.965f, 1.149f)
                lineToRelative(0.6f, 0.503f)
                arcToRelative(8.243f, 8.243f, 0f, false, false, -0.689f, 1.192f)
                lineTo(3.8f, 8.216f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.513f, 1.41f)
                lineToRelative(0.735f, 0.267f)
                arcToRelative(8.222f, 8.222f, 0f, false, false, -0.238f, 1.356f)
                horizontalLineToRelative(-0.783f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.783f)
                curveToRelative(0.042f, 0.464f, 0.122f, 0.917f, 0.238f, 1.356f)
                lineToRelative(-0.735f, 0.268f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.513f, 1.41f)
                lineToRelative(0.735f, -0.268f)
                curveToRelative(0.197f, 0.417f, 0.428f, 0.816f, 0.69f, 1.191f)
                lineToRelative(-0.6f, 0.504f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.963f, 1.15f)
                lineToRelative(0.601f, -0.505f)
                curveToRelative(0.326f, 0.323f, 0.679f, 0.62f, 1.054f, 0.885f)
                lineToRelative(-0.392f, 0.68f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.3f, 0.75f)
                lineToRelative(0.39f, -0.679f)
                curveToRelative(0.414f, 0.192f, 0.847f, 0.35f, 1.294f, 0.471f)
                lineToRelative(-0.136f, 0.77f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.477f, 0.261f)
                lineToRelative(0.137f, -0.772f)
                arcToRelative(8.332f, 8.332f, 0f, false, false, 1.376f, 0f)
                lineToRelative(0.136f, 0.772f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.477f, -0.26f)
                lineToRelative(-0.136f, -0.771f)
                arcToRelative(8.19f, 8.19f, 0f, false, false, 1.294f, -0.47f)
                lineToRelative(0.391f, 0.677f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.3f, -0.75f)
                lineToRelative(-0.393f, -0.679f)
                arcToRelative(8.29f, 8.29f, 0f, false, false, 1.054f, -0.885f)
                lineToRelative(0.601f, 0.504f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.964f, -1.15f)
                lineToRelative(-0.6f, -0.503f)
                curveToRelative(0.261f, -0.375f, 0.492f, -0.774f, 0.69f, -1.191f)
                lineToRelative(0.735f, 0.267f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.512f, -1.41f)
                lineToRelative(-0.734f, -0.267f)
                curveToRelative(0.115f, -0.439f, 0.195f, -0.892f, 0.237f, -1.356f)
                horizontalLineToRelative(0.784f)
                close()
                moveToRelative(-2.657f, -3.06f)
                arcToRelative(6.744f, 6.744f, 0f, false, false, -1.19f, -2.053f)
                arcToRelative(6.784f, 6.784f, 0f, false, false, -1.82f, -1.51f)
                arcTo(6.705f, 6.705f, 0f, false, false, 12f, 5.25f)
                arcToRelative(6.8f, 6.8f, 0f, false, false, -1.225f, 0.11f)
                arcToRelative(6.7f, 6.7f, 0f, false, false, -2.15f, 0.793f)
                arcToRelative(6.784f, 6.784f, 0f, false, false, -2.952f, 3.489f)
                arcToRelative(0.76f, 0.76f, 0f, false, true, -0.036f, 0.098f)
                arcTo(6.74f, 6.74f, 0f, false, false, 5.251f, 12f)
                arcToRelative(6.74f, 6.74f, 0f, false, false, 3.366f, 5.842f)
                lineToRelative(0.009f, 0.005f)
                arcToRelative(6.704f, 6.704f, 0f, false, false, 2.18f, 0.798f)
                lineToRelative(0.022f, 0.003f)
                arcToRelative(6.792f, 6.792f, 0f, false, false, 2.368f, -0.004f)
                arcToRelative(6.704f, 6.704f, 0f, false, false, 2.205f, -0.811f)
                arcToRelative(6.785f, 6.785f, 0f, false, false, 1.762f, -1.484f)
                lineToRelative(0.009f, -0.01f)
                lineToRelative(0.009f, -0.01f)
                arcToRelative(6.743f, 6.743f, 0f, false, false, 1.18f, -2.066f)
                curveToRelative(0.253f, -0.707f, 0.39f, -1.469f, 0.39f, -2.263f)
                arcToRelative(6.74f, 6.74f, 0f, false, false, -0.408f, -2.309f)
                close()
            }
        }.build()
        
        return _Cog!!
    }

private var _Cog: ImageVector? = null

