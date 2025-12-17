package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Cog6Tooth: ImageVector
    get() {
        if (_Cog6Tooth != null) return _Cog6Tooth!!
        
        _Cog6Tooth = ImageVector.Builder(
            name = "cog-6-tooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.455f, 1.45f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.952f, 1f)
                horizontalLineToRelative(2.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.497f, 0.45f)
                lineToRelative(0.186f, 1.858f)
                arcToRelative(4.996f, 4.996f, 0f, false, true, 1.466f, 0.848f)
                lineToRelative(1.703f, -0.769f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.639f, 0.206f)
                lineToRelative(1.047f, 1.814f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.14f, 0.656f)
                lineToRelative(-1.517f, 1.09f)
                arcToRelative(5.026f, 5.026f, 0f, false, true, 0f, 1.694f)
                lineToRelative(1.516f, 1.09f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.141f, 0.656f)
                lineToRelative(-1.047f, 1.814f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.639f, 0.206f)
                lineToRelative(-1.703f, -0.768f)
                curveToRelative(-0.433f, 0.36f, -0.928f, 0.649f, -1.466f, 0.847f)
                lineToRelative(-0.186f, 1.858f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.497f, 0.45f)
                horizontalLineTo(6.952f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.497f, -0.45f)
                lineToRelative(-0.186f, -1.858f)
                arcToRelative(4.993f, 4.993f, 0f, false, true, -1.466f, -0.848f)
                lineToRelative(-1.703f, 0.769f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.639f, -0.206f)
                lineToRelative(-1.047f, -1.814f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.14f, -0.656f)
                lineToRelative(1.517f, -1.09f)
                arcToRelative(5.033f, 5.033f, 0f, false, true, 0f, -1.694f)
                lineToRelative(-1.516f, -1.09f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.141f, -0.656f)
                lineTo(2.46f, 3.593f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.639f, -0.206f)
                lineToRelative(1.703f, 0.769f)
                curveToRelative(0.433f, -0.36f, 0.928f, -0.65f, 1.466f, -0.848f)
                lineToRelative(0.186f, -1.858f)
                close()
                moveToRelative(-0.177f, 7.567f)
                lineToRelative(-0.022f, -0.037f)
                arcToRelative(2f, 2f, 0f, false, true, 3.466f, -1.997f)
                lineToRelative(0.022f, 0.037f)
                arcToRelative(2f, 2f, 0f, false, true, -3.466f, 1.997f)
                close()
            }
        }.build()
        
        return _Cog6Tooth!!
    }

private var _Cog6Tooth: ImageVector? = null

