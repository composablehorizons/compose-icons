package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.PuzzlePiece: ImageVector
    get() {
        if (_PuzzlePiece != null) return _PuzzlePiece!!
        
        _PuzzlePiece = ImageVector.Builder(
            name = "puzzle-piece",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.25f, 5.337f)
                curveToRelative(0f, -0.355f, -0.186f, -0.676f, -0.401f, -0.959f)
                arcToRelative(1.647f, 1.647f, 0f, false, true, -0.349f, -1.003f)
                curveToRelative(0f, -1.036f, 1.007f, -1.875f, 2.25f, -1.875f)
                reflectiveCurveTo(15f, 2.34f, 15f, 3.375f)
                curveToRelative(0f, 0.369f, -0.128f, 0.713f, -0.349f, 1.003f)
                curveToRelative(-0.215f, 0.283f, -0.401f, 0.604f, -0.401f, 0.959f)
                curveToRelative(0f, 0.332f, 0.278f, 0.598f, 0.61f, 0.578f)
                curveToRelative(1.91f, -0.114f, 3.79f, -0.342f, 5.632f, -0.676f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.878f, 0.645f)
                arcToRelative(49.17f, 49.17f, 0f, false, true, 0.376f, 5.452f)
                arcToRelative(0.657f, 0.657f, 0f, false, true, -0.66f, 0.664f)
                curveToRelative(-0.354f, 0f, -0.675f, -0.186f, -0.958f, -0.401f)
                arcToRelative(1.647f, 1.647f, 0f, false, false, -1.003f, -0.349f)
                curveToRelative(-1.035f, 0f, -1.875f, 1.007f, -1.875f, 2.25f)
                reflectiveCurveToRelative(0.84f, 2.25f, 1.875f, 2.25f)
                curveToRelative(0.369f, 0f, 0.713f, -0.128f, 1.003f, -0.349f)
                curveToRelative(0.283f, -0.215f, 0.604f, -0.401f, 0.959f, -0.401f)
                curveToRelative(0.31f, 0f, 0.557f, 0.262f, 0.534f, 0.571f)
                arcToRelative(48.774f, 48.774f, 0f, false, true, -0.595f, 4.845f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.61f, 0.61f)
                curveToRelative(-1.82f, 0.317f, -3.673f, 0.533f, -5.555f, 0.642f)
                arcToRelative(0.58f, 0.58f, 0f, false, true, -0.611f, -0.581f)
                curveToRelative(0f, -0.355f, 0.186f, -0.676f, 0.401f, -0.959f)
                curveToRelative(0.221f, -0.29f, 0.349f, -0.634f, 0.349f, -1.003f)
                curveToRelative(0f, -1.035f, -1.007f, -1.875f, -2.25f, -1.875f)
                reflectiveCurveToRelative(-2.25f, 0.84f, -2.25f, 1.875f)
                curveToRelative(0f, 0.369f, 0.128f, 0.713f, 0.349f, 1.003f)
                curveToRelative(0.215f, 0.283f, 0.401f, 0.604f, 0.401f, 0.959f)
                arcToRelative(0.641f, 0.641f, 0f, false, true, -0.658f, 0.643f)
                arcToRelative(49.118f, 49.118f, 0f, false, true, -4.708f, -0.36f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.645f, -0.878f)
                curveToRelative(0.293f, -1.614f, 0.504f, -3.257f, 0.629f, -4.924f)
                arcTo(0.53f, 0.53f, 0f, false, false, 5.337f, 15f)
                curveToRelative(-0.355f, 0f, -0.676f, 0.186f, -0.959f, 0.401f)
                curveToRelative(-0.29f, 0.221f, -0.634f, 0.349f, -1.003f, 0.349f)
                curveToRelative(-1.036f, 0f, -1.875f, -1.007f, -1.875f, -2.25f)
                reflectiveCurveToRelative(0.84f, -2.25f, 1.875f, -2.25f)
                curveToRelative(0.369f, 0f, 0.713f, 0.128f, 1.003f, 0.349f)
                curveToRelative(0.283f, 0.215f, 0.604f, 0.401f, 0.959f, 0.401f)
                arcToRelative(0.656f, 0.656f, 0f, false, false, 0.659f, -0.663f)
                arcToRelative(47.703f, 47.703f, 0f, false, false, -0.31f, -4.82f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.83f, -0.832f)
                curveToRelative(1.343f, 0.155f, 2.703f, 0.254f, 4.077f, 0.294f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.657f, -0.642f)
                close()
            }
        }.build()
        
        return _PuzzlePiece!!
    }

private var _PuzzlePiece: ImageVector? = null

