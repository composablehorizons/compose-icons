package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Spa: ImageVector
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
                moveTo(448f, 875f)
                quadToRelative(-70f, -13f, -136f, -45f)
                reflectiveQuadToRelative(-117.5f, -89f)
                quadToRelative(-51.5f, -57f, -83f, -141f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -14f, 9f, -23f)
                reflectiveQuadToRelative(23f, -9f)
                horizontalLineToRelative(8f)
                quadToRelative(51f, 0f, 105f, 13f)
                reflectiveQuadToRelative(101f, 39f)
                quadToRelative(11f, -74f, 44f, -152f)
                reflectiveQuadToRelative(79f, -141f)
                quadToRelative(12f, -17f, 31f, -17f)
                reflectiveQuadToRelative(31f, 17f)
                quadToRelative(46f, 63f, 79f, 141f)
                reflectiveQuadToRelative(44f, 152f)
                quadToRelative(47f, -26f, 101f, -39f)
                reflectiveQuadToRelative(105f, -13f)
                horizontalLineToRelative(4f)
                quadToRelative(15f, 0f, 25.5f, 10.5f)
                reflectiveQuadTo(880f, 396f)
                verticalLineToRelative(4f)
                quadToRelative(0f, 116f, -31.5f, 200f)
                reflectiveQuadToRelative(-83f, 141f)
                quadTo(714f, 798f, 648f, 830f)
                reflectiveQuadTo(512f, 875f)
                quadToRelative(-13f, 2f, -32f, 2f)
                reflectiveQuadToRelative(-32f, -2f)
                close()
                moveToRelative(30f, -77f)
                quadToRelative(-11f, -165f, -99.5f, -250.5f)
                reflectiveQuadTo(162f, 442f)
                quadToRelative(-2f, 0f, 0f, 0f)
                quadToRelative(11f, 169f, 102.5f, 254f)
                reflectiveQuadTo(478f, 798f)
                quadToRelative(2f, 1f, 0f, 0.5f)
                reflectiveQuadToRelative(0f, -0.5f)
                close()
                moveToRelative(-76f, -340f)
                quadToRelative(20f, 17f, 42f, 40.5f)
                reflectiveQuadToRelative(36f, 45.5f)
                quadToRelative(15f, -22f, 36.5f, -45.5f)
                reflectiveQuadTo(558f, 458f)
                quadToRelative(-2f, -57f, -22.5f, -119f)
                reflectiveQuadTo(480f, 218f)
                verticalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                quadToRelative(-35f, 59f, -55.5f, 121f)
                reflectiveQuadTo(402f, 458f)
                close()
                moveToRelative(122f, 170f)
                quadToRelative(12f, 32f, 20.5f, 70f)
                reflectiveQuadToRelative(13.5f, 82f)
                quadToRelative(36f, -12f, 76f, -36f)
                reflectiveQuadToRelative(74f, -64f)
                quadToRelative(34f, -40f, 59f, -98.5f)
                reflectiveQuadTo(798f, 442f)
                quadToRelative(0f, -2f, 0f, 0f)
                quadToRelative(-94f, 14f, -165f, 62.5f)
                reflectiveQuadTo(524f, 628f)
                close()
            }
        }.build()
        
        return _Spa!!
    }

private var _Spa: ImageVector? = null

