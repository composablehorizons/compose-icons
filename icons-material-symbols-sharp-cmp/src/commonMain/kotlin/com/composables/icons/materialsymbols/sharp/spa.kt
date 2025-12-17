package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Spa: ImageVector
    get() {
        if (_Spa != null) return _Spa!!
        
        _Spa = ImageVector.Builder(
            name = "spa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-73f, -9f, -145f, -39.5f)
                reflectiveQuadTo(206.5f, 753f)
                quadTo(150f, 696f, 115f, 609f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(51f, 0f, 105f, 13f)
                reflectiveQuadToRelative(101f, 39f)
                quadToRelative(12f, -86f, 54.5f, -176.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(57f, 65f, 99.5f, 155.5f)
                reflectiveQuadTo(634f, 412f)
                quadToRelative(47f, -26f, 101f, -39f)
                reflectiveQuadToRelative(105f, -13f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 122f, -35f, 209f)
                reflectiveQuadToRelative(-91.5f, 144f)
                quadToRelative(-56.5f, 57f, -128f, 87.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-2f, -82f)
                quadToRelative(-11f, -166f, -98.5f, -251f)
                reflectiveQuadTo(162f, 442f)
                quadToRelative(11f, 171f, 101.5f, 255f)
                reflectiveQuadTo(478f, 798f)
                close()
                moveToRelative(2f, -254f)
                quadToRelative(15f, -22f, 36.5f, -45.5f)
                reflectiveQuadTo(558f, 458f)
                quadToRelative(-2f, -57f, -22.5f, -119f)
                reflectiveQuadTo(480f, 218f)
                quadToRelative(-35f, 59f, -55.5f, 121f)
                reflectiveQuadTo(402f, 458f)
                quadToRelative(20f, 17f, 42f, 40.5f)
                reflectiveQuadToRelative(36f, 45.5f)
                close()
                moveToRelative(78f, 236f)
                quadToRelative(37f, -12f, 77f, -35f)
                reflectiveQuadToRelative(74.5f, -62.5f)
                quadToRelative(34.5f, -39.5f, 59f, -98.5f)
                reflectiveQuadTo(798f, 442f)
                quadToRelative(-94f, 14f, -165f, 62.5f)
                reflectiveQuadTo(524f, 628f)
                quadToRelative(12f, 32f, 20.5f, 70f)
                reflectiveQuadToRelative(13.5f, 82f)
                close()
                moveToRelative(-78f, -236f)
                close()
                moveToRelative(78f, 236f)
                close()
                moveToRelative(-80f, 18f)
                close()
                moveToRelative(46f, -170f)
                close()
                moveTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Spa!!
    }

private var _Spa: ImageVector? = null

