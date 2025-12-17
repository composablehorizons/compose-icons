package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Disabled_visible: ImageVector
    get() {
        if (_Disabled_visible != null) return _Disabled_visible!!
        
        _Disabled_visible = ImageVector.Builder(
            name = "disabled_visible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(450f, 879f)
                quadToRelative(-78f, -6f, -145.5f, -39f)
                reflectiveQuadTo(187f, 753.5f)
                quadToRelative(-50f, -53.5f, -78.5f, -124f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(19f)
                quadToRelative(-17f, -11f, -39.5f, -21.5f)
                reflectiveQuadTo(799f, 460f)
                quadToRelative(-8f, -126f, -99.5f, -213f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-56f, 0f, -105.5f, 18f)
                reflectiveQuadTo(284f, 228f)
                lineToRelative(245f, 245f)
                quadToRelative(-19f, 8f, -36.5f, 18.5f)
                reflectiveQuadTo(458f, 514f)
                lineTo(228f, 284f)
                quadToRelative(-32f, 41f, -50f, 90.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 99f, 53.5f, 177.5f)
                reflectiveQuadTo(352f, 773f)
                quadToRelative(18f, 28f, 45f, 57f)
                reflectiveQuadToRelative(53f, 49f)
                close()
                moveToRelative(230f, -79f)
                quadToRelative(59f, 0f, 109.5f, -27f)
                reflectiveQuadToRelative(80.5f, -73f)
                quadToRelative(-30f, -46f, -80.5f, -73f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(-59f, 0f, -109.5f, 27f)
                reflectiveQuadTo(490f, 700f)
                quadToRelative(30f, 46f, 80.5f, 73f)
                reflectiveQuadTo(680f, 800f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-96f, 0f, -171.5f, -50.5f)
                reflectiveQuadTo(400f, 700f)
                quadToRelative(33f, -79f, 108.5f, -129.5f)
                reflectiveQuadTo(680f, 520f)
                quadToRelative(96f, 0f, 171.5f, 50.5f)
                reflectiveQuadTo(960f, 700f)
                quadToRelative(-33f, 79f, -108.5f, 129.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(620f, 700f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(740f, 700f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(680f, 760f)
                close()
            }
        }.build()
        
        return _Disabled_visible!!
    }

private var _Disabled_visible: ImageVector? = null

