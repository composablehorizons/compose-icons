package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PuzzlePiece: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(14.25f, 6.087f)
                curveToRelative(0f, -0.355f, 0.186f, -0.676f, 0.401f, -0.959f)
                curveToRelative(0.221f, -0.29f, 0.349f, -0.634f, 0.349f, -1.003f)
                curveToRelative(0f, -1.036f, -1.007f, -1.875f, -2.25f, -1.875f)
                reflectiveCurveToRelative(-2.25f, 0.84f, -2.25f, 1.875f)
                curveToRelative(0f, 0.369f, 0.128f, 0.713f, 0.349f, 1.003f)
                curveToRelative(0.215f, 0.283f, 0.401f, 0.604f, 0.401f, 0.959f)
                verticalLineToRelative(0f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, -0.657f, 0.643f)
                arcToRelative(48.39f, 48.39f, 0f, false, true, -4.163f, -0.3f)
                curveToRelative(0.186f, 1.613f, 0.293f, 3.25f, 0.315f, 4.907f)
                arcToRelative(0.656f, 0.656f, 0f, false, true, -0.658f, 0.663f)
                verticalLineToRelative(0f)
                curveToRelative(-0.355f, 0f, -0.676f, -0.186f, -0.959f, -0.401f)
                arcToRelative(1.647f, 1.647f, 0f, false, false, -1.003f, -0.349f)
                curveToRelative(-1.036f, 0f, -1.875f, 1.007f, -1.875f, 2.25f)
                reflectiveCurveToRelative(0.84f, 2.25f, 1.875f, 2.25f)
                curveToRelative(0.369f, 0f, 0.713f, -0.128f, 1.003f, -0.349f)
                curveToRelative(0.283f, -0.215f, 0.604f, -0.401f, 0.959f, -0.401f)
                verticalLineToRelative(0f)
                curveToRelative(0.31f, 0f, 0.555f, 0.26f, 0.532f, 0.57f)
                arcToRelative(48.039f, 48.039f, 0f, false, true, -0.642f, 5.056f)
                curveToRelative(1.518f, 0.19f, 3.058f, 0.309f, 4.616f, 0.354f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.657f, -0.643f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.355f, -0.186f, -0.676f, -0.401f, -0.959f)
                arcToRelative(1.647f, 1.647f, 0f, false, true, -0.349f, -1.003f)
                curveToRelative(0f, -1.035f, 1.008f, -1.875f, 2.25f, -1.875f)
                curveToRelative(1.243f, 0f, 2.25f, 0.84f, 2.25f, 1.875f)
                curveToRelative(0f, 0.369f, -0.128f, 0.713f, -0.349f, 1.003f)
                curveToRelative(-0.215f, 0.283f, -0.4f, 0.604f, -0.4f, 0.959f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.333f, 0.277f, 0.599f, 0.61f, 0.58f)
                arcToRelative(48.1f, 48.1f, 0f, false, false, 5.427f, -0.63f)
                arcToRelative(48.05f, 48.05f, 0f, false, false, 0.582f, -4.717f)
                arcToRelative(0.532f, 0.532f, 0f, false, false, -0.533f, -0.57f)
                verticalLineToRelative(0f)
                curveToRelative(-0.355f, 0f, -0.676f, 0.186f, -0.959f, 0.401f)
                curveToRelative(-0.29f, 0.221f, -0.634f, 0.349f, -1.003f, 0.349f)
                curveToRelative(-1.035f, 0f, -1.875f, -1.007f, -1.875f, -2.25f)
                reflectiveCurveToRelative(0.84f, -2.25f, 1.875f, -2.25f)
                curveToRelative(0.37f, 0f, 0.713f, 0.128f, 1.003f, 0.349f)
                curveToRelative(0.283f, 0.215f, 0.604f, 0.401f, 0.96f, 0.401f)
                verticalLineToRelative(0f)
                arcToRelative(0.656f, 0.656f, 0f, false, false, 0.658f, -0.663f)
                arcToRelative(48.422f, 48.422f, 0f, false, false, -0.37f, -5.36f)
                curveToRelative(-1.886f, 0.342f, -3.81f, 0.574f, -5.766f, 0.689f)
                arcToRelative(0.578f, 0.578f, 0f, false, true, -0.61f, -0.58f)
                verticalLineToRelative(0f)
                close()
            }
        }.build()
        
        return _PuzzlePiece!!
    }

private var _PuzzlePiece: ImageVector? = null

