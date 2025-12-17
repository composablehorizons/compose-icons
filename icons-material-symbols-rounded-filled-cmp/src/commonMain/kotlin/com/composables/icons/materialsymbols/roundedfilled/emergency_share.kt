package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Emergency_share: ImageVector
    get() {
        if (_Emergency_share != null) return _Emergency_share!!
        
        _Emergency_share = ImageVector.Builder(
            name = "emergency_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 360f)
                quadToRelative(101f, 0f, 170.5f, 72f)
                reflectiveQuadTo(720f, 606f)
                quadToRelative(0f, 34f, -13f, 71f)
                reflectiveQuadToRelative(-38.5f, 77.5f)
                quadTo(643f, 795f, 606f, 837.5f)
                reflectiveQuadTo(520f, 925f)
                quadToRelative(-8f, 8f, -18.5f, 11.5f)
                reflectiveQuadTo(480f, 940f)
                quadToRelative(-11f, 0f, -21.5f, -3.5f)
                reflectiveQuadTo(440f, 925f)
                quadToRelative(-49f, -45f, -86f, -87.5f)
                reflectiveQuadToRelative(-62.5f, -83f)
                quadTo(266f, 714f, 253f, 677f)
                reflectiveQuadToRelative(-13f, -71f)
                quadToRelative(0f, -102f, 69.5f, -174f)
                reflectiveQuadTo(480f, 360f)
                close()
                moveToRelative(0f, 300f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 600f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 540f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 600f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 660f)
                close()
                moveToRelative(0f, -420f)
                quadToRelative(-30f, 0f, -58f, 8f)
                reflectiveQuadToRelative(-53f, 25f)
                quadToRelative(-14f, 9f, -31f, 8.5f)
                reflectiveQuadTo(310f, 270f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(13.5f, -26f)
                quadToRelative(36f, -27f, 79f, -41.5f)
                reflectiveQuadToRelative(89f, -14.5f)
                quadToRelative(46f, 0f, 89f, 14.5f)
                reflectiveQuadToRelative(79f, 41.5f)
                quadToRelative(13f, 10f, 13.5f, 26f)
                reflectiveQuadTo(650f, 270f)
                quadToRelative(-11f, 11f, -28f, 11.5f)
                reflectiveQuadToRelative(-31f, -8.5f)
                quadToRelative(-25f, -17f, -53f, -25f)
                reflectiveQuadToRelative(-58f, -8f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-62f, 0f, -119f, 20f)
                reflectiveQuadToRelative(-105f, 58f)
                quadToRelative(-13f, 11f, -30f, 10.5f)
                reflectiveQuadTo(197f, 157f)
                quadToRelative(-12f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(14f, -27.5f)
                quadToRelative(59f, -49f, 130.5f, -75f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(78f, 0f, 149.5f, 26f)
                reflectiveQuadTo(760f, 101f)
                quadToRelative(13f, 11f, 14f, 28f)
                reflectiveQuadToRelative(-11f, 29f)
                quadToRelative(-11f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-30f, -11f)
                quadToRelative(-48f, -38f, -105.5f, -58.5f)
                reflectiveQuadTo(480f, 80f)
                close()
            }
        }.build()
        
        return _Emergency_share!!
    }

private var _Emergency_share: ImageVector? = null

