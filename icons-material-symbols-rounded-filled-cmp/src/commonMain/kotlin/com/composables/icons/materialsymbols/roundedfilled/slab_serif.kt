package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Slab_serif: ImageVector
    get() {
        if (_Slab_serif != null) return _Slab_serif!!
        
        _Slab_serif = ImageVector.Builder(
            name = "slab_serif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(349f, 650f)
                lineToRelative(31f, -80f)
                horizontalLineToRelative(194f)
                lineToRelative(30f, 80f)
                horizontalLineToRelative(-50f)
                quadToRelative(-14f, 0f, -24.5f, 10.5f)
                reflectiveQuadTo(519f, 685f)
                quadToRelative(0f, 14f, 10.5f, 24.5f)
                reflectiveQuadTo(554f, 720f)
                horizontalLineToRelative(141f)
                quadToRelative(14f, 0f, 24.5f, -10.5f)
                reflectiveQuadTo(730f, 685f)
                quadToRelative(0f, -14f, -10.5f, -24.5f)
                reflectiveQuadTo(695f, 650f)
                horizontalLineToRelative(-5f)
                lineTo(539f, 268f)
                quadToRelative(-5f, -13f, -16f, -20.5f)
                reflectiveQuadToRelative(-25f, -7.5f)
                horizontalLineToRelative(-35f)
                quadToRelative(-14f, 0f, -25f, 7.5f)
                reflectiveQuadTo(422f, 268f)
                lineTo(270f, 650f)
                horizontalLineToRelative(-5f)
                quadToRelative(-14f, 0f, -24.5f, 10.5f)
                reflectiveQuadTo(230f, 685f)
                quadToRelative(0f, 14f, 10.5f, 24.5f)
                reflectiveQuadTo(265f, 720f)
                horizontalLineToRelative(136f)
                quadToRelative(14f, 0f, 24.5f, -10.5f)
                reflectiveQuadTo(436f, 685f)
                quadToRelative(0f, -14f, -11f, -24.5f)
                reflectiveQuadTo(400f, 650f)
                horizontalLineToRelative(-51f)
                close()
                moveToRelative(56f, -145f)
                lineToRelative(68f, -177f)
                horizontalLineToRelative(7f)
                lineToRelative(68f, 177f)
                horizontalLineTo(405f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Slab_serif!!
    }

private var _Slab_serif: ImageVector? = null

