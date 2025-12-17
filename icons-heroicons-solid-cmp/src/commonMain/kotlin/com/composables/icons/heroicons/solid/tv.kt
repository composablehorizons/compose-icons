package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Tv: ImageVector
    get() {
        if (_Tv != null) return _Tv!!
        
        _Tv = ImageVector.Builder(
            name = "tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 6f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(15f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.375f, 3f)
                curveTo(2.339f, 3f, 1.5f, 3.84f, 1.5f, 4.875f)
                verticalLineToRelative(11.25f)
                curveTo(1.5f, 17.16f, 2.34f, 18f, 3.375f, 18f)
                horizontalLineTo(9.75f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(6f)
                arcTo(0.75f, 0.75f, 0f, false, false, 6f, 21f)
                horizontalLineToRelative(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-3.75f)
                verticalLineTo(18f)
                horizontalLineToRelative(6.375f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineTo(4.875f)
                curveTo(22.5f, 3.839f, 21.66f, 3f, 20.625f, 3f)
                horizontalLineTo(3.375f)
                close()
                moveToRelative(0f, 13.5f)
                horizontalLineToRelative(17.25f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, 0.375f, -0.375f)
                verticalLineTo(4.875f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, -0.375f)
                horizontalLineTo(3.375f)
                arcTo(0.375f, 0.375f, 0f, false, false, 3f, 4.875f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                close()
            }
        }.build()
        
        return _Tv!!
    }

private var _Tv: ImageVector? = null

