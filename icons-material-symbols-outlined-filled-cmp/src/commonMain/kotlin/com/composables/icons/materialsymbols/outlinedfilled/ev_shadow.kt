package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ev_shadow: ImageVector
    get() {
        if (_Ev_shadow != null) return _Ev_shadow!!
        
        _Ev_shadow = ImageVector.Builder(
            name = "ev_shadow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(68f, -88f)
                quadToRelative(75f, -19f, 130f, -74f)
                reflectiveQuadToRelative(74f, -130f)
                lineTo(548f, 752f)
                close()
                moveToRelative(-67f, -18f)
                lineToRelative(278f, -278f)
                quadToRelative(-2f, -14f, -4f, -28.5f)
                reflectiveQuadToRelative(-7f, -28.5f)
                lineTo(444f, 703f)
                quadToRelative(8f, 9f, 17.5f, 16.5f)
                reflectiveQuadTo(481f, 734f)
                close()
                moveToRelative(-74f, -79f)
                lineToRelative(315f, -315f)
                quadToRelative(-6f, -10f, -12f, -19.5f)
                reflectiveQuadTo(696f, 302f)
                lineTo(385f, 612f)
                quadToRelative(5f, 11f, 10.5f, 21.5f)
                reflectiveQuadTo(407f, 655f)
                close()
                moveToRelative(-40f, -108f)
                lineToRelative(286f, -287f)
                quadToRelative(-10f, -8f, -19.5f, -14.5f)
                reflectiveQuadTo(613f, 233f)
                lineTo(360f, 486f)
                quadToRelative(1f, 16f, 2.5f, 31f)
                reflectiveQuadToRelative(4.5f, 30f)
                close()
                moveToRelative(0f, -152f)
                lineToRelative(185f, -186f)
                quadToRelative(-15f, -4f, -30f, -6f)
                reflectiveQuadToRelative(-30f, -3f)
                quadToRelative(-49f, 29f, -81f, 79f)
                reflectiveQuadToRelative(-44f, 116f)
                close()
            }
        }.build()
        
        return _Ev_shadow!!
    }

private var _Ev_shadow: ImageVector? = null

