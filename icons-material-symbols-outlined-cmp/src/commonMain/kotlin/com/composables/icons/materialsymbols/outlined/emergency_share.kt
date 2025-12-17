package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Emergency_share: ImageVector
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
                moveTo(480f, 853f)
                quadToRelative(75f, -71f, 117.5f, -136.5f)
                reflectiveQuadTo(640f, 606f)
                quadToRelative(0f, -69f, -46.5f, -117.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-67f, 0f, -113.5f, 48.5f)
                reflectiveQuadTo(320f, 606f)
                quadToRelative(0f, 45f, 42.5f, 110.5f)
                reflectiveQuadTo(480f, 853f)
                close()
                moveToRelative(0f, 107f)
                quadTo(359f, 857f, 299.5f, 769f)
                reflectiveQuadTo(240f, 606f)
                quadToRelative(0f, -102f, 69.5f, -174f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(101f, 0f, 170.5f, 72f)
                reflectiveQuadTo(720f, 606f)
                quadToRelative(0f, 75f, -59.5f, 163f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(0f, -300f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 600f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 540f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 600f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 660f)
                close()
                moveTo(338f, 298f)
                lineToRelative(-56f, -56f)
                quadToRelative(40f, -40f, 91f, -61f)
                reflectiveQuadToRelative(107f, -21f)
                quadToRelative(56f, 0f, 107f, 21f)
                reflectiveQuadToRelative(91f, 61f)
                lineToRelative(-56f, 56f)
                quadToRelative(-29f, -29f, -65.5f, -43.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-40f, 0f, -76.5f, 14.5f)
                reflectiveQuadTo(338f, 298f)
                close()
                moveTo(226f, 185f)
                lineToRelative(-57f, -56f)
                quadToRelative(63f, -63f, 143f, -96f)
                reflectiveQuadToRelative(168f, -33f)
                quadToRelative(88f, 0f, 168f, 33f)
                reflectiveQuadToRelative(143f, 96f)
                lineToRelative(-56f, 57f)
                quadToRelative(-51f, -51f, -117f, -78.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(-72f, 0f, -137.5f, 27f)
                reflectiveQuadTo(226f, 185f)
                close()
                moveToRelative(254f, 415f)
                close()
            }
        }.build()
        
        return _Emergency_share!!
    }

private var _Emergency_share: ImageVector? = null

