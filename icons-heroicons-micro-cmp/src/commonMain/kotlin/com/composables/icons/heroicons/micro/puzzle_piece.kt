package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PuzzlePiece: ImageVector
    get() {
        if (_PuzzlePiece != null) return _PuzzlePiece!!
        
        _PuzzlePiece = ImageVector.Builder(
            name = "puzzle-piece",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 3.889f)
                curveToRelative(0f, -0.273f, 0.188f, -0.502f, 0.417f, -0.65f)
                curveToRelative(0.355f, -0.229f, 0.583f, -0.587f, 0.583f, -0.989f)
                curveTo(10f, 1.56f, 9.328f, 1f, 8.5f, 1f)
                reflectiveCurveTo(7f, 1.56f, 7f, 2.25f)
                curveToRelative(0f, 0.41f, 0.237f, 0.774f, 0.603f, 1.002f)
                curveToRelative(0.22f, 0.137f, 0.397f, 0.355f, 0.397f, 0.613f)
                curveToRelative(0f, 0.331f, -0.275f, 0.596f, -0.605f, 0.579f)
                curveToRelative(-0.744f, -0.04f, -1.482f, -0.1f, -2.214f, -0.18f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.83f, 0.81f)
                curveToRelative(0.067f, 0.764f, 0.111f, 1.535f, 0.133f, 2.312f)
                arcTo(0.6f, 0.6f, 0f, false, true, 3.882f, 8f)
                curveToRelative(-0.268f, 0f, -0.495f, -0.185f, -0.64f, -0.412f)
                curveTo(3.015f, 7.231f, 2.655f, 7f, 2.25f, 7f)
                curveTo(1.56f, 7f, 1f, 7.672f, 1f, 8.5f)
                reflectiveCurveTo(1.56f, 10f, 2.25f, 10f)
                curveToRelative(0.404f, 0f, 0.764f, -0.23f, 0.993f, -0.588f)
                curveToRelative(0.144f, -0.227f, 0.37f, -0.412f, 0.64f, -0.412f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, 0.601f, 0.614f)
                arcToRelative(39.338f, 39.338f, 0f, false, true, -0.231f, 3.3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.661f, 0.829f)
                curveToRelative(0.826f, 0.093f, 1.66f, 0.161f, 2.5f, 0.204f)
                arcTo(0.56f, 0.56f, 0f, false, false, 8f, 13.386f)
                curveToRelative(0f, -0.271f, -0.187f, -0.499f, -0.415f, -0.645f)
                curveTo(7.23f, 12.512f, 7f, 12.153f, 7f, 11.75f)
                curveToRelative(0f, -0.69f, 0.672f, -1.25f, 1.5f, -1.25f)
                reflectiveCurveToRelative(1.5f, 0.56f, 1.5f, 1.25f)
                curveToRelative(0f, 0.403f, -0.23f, 0.762f, -0.585f, 0.99f)
                curveToRelative(-0.228f, 0.147f, -0.415f, 0.375f, -0.415f, 0.646f)
                verticalLineToRelative(0.11f)
                curveToRelative(0f, 0.278f, 0.223f, 0.504f, 0.5f, 0.504f)
                curveToRelative(1.196f, 0f, 2.381f, -0.052f, 3.552f, -0.154f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.68f, -0.661f)
                curveToRelative(0.135f, -1.177f, 0.22f, -2.37f, 0.253f, -3.574f)
                arcToRelative(0.597f, 0.597f, 0f, false, false, -0.6f, -0.611f)
                curveToRelative(-0.27f, 0f, -0.498f, 0.187f, -0.644f, 0.415f)
                curveToRelative(-0.229f, 0.356f, -0.588f, 0.585f, -0.991f, 0.585f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.672f, -1.25f, -1.5f)
                reflectiveCurveTo(11.06f, 7f, 11.75f, 7f)
                curveToRelative(0.403f, 0f, 0.762f, 0.23f, 0.99f, 0.585f)
                curveToRelative(0.147f, 0.228f, 0.375f, 0.415f, 0.646f, 0.415f)
                arcToRelative(0.597f, 0.597f, 0f, false, false, 0.599f, -0.61f)
                arcToRelative(40.914f, 40.914f, 0f, false, false, -0.132f, -2.365f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.815f, -0.684f)
                arcTo(39.51f, 39.51f, 0f, false, true, 9.5f, 4.5f)
                arcToRelative(0.501f, 0.501f, 0f, false, true, -0.5f, -0.503f)
                verticalLineToRelative(-0.108f)
                close()
            }
        }.build()
        
        return _PuzzlePiece!!
    }

private var _PuzzlePiece: ImageVector? = null

