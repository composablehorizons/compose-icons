package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mystery: ImageVector
    get() {
        if (_Mystery != null) return _Mystery!!
        
        _Mystery = ImageVector.Builder(
            name = "mystery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 720f)
                quadToRelative(116f, 0f, 198f, -81.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-117f, 0f, -198.5f, 82f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(440f, 720f)
                close()
                moveToRelative(0f, -280f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(-83f, 0f, -147.5f, -44.5f)
                reflectiveQuadTo(200f, 440f)
                quadToRelative(28f, -70f, 92.5f, -115f)
                reflectiveQuadTo(440f, 280f)
                quadToRelative(82f, 0f, 146.5f, 45f)
                reflectiveQuadTo(680f, 440f)
                quadToRelative(-29f, 71f, -93.5f, 115.5f)
                reflectiveQuadTo(440f, 600f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(55f, 0f, 101f, -26.5f)
                reflectiveQuadToRelative(72f, -73.5f)
                quadToRelative(-26f, -46f, -72f, -73f)
                reflectiveQuadToRelative(-101f, -27f)
                quadToRelative(-56f, 0f, -102f, 27f)
                reflectiveQuadToRelative(-72f, 73f)
                quadToRelative(26f, 47f, 72f, 73.5f)
                reflectiveQuadTo(440f, 540f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(25f, 0f, 42.5f, -17f)
                reflectiveQuadToRelative(17.5f, -43f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(440f, 380f)
                quadToRelative(-26f, 0f, -43f, 17.5f)
                reflectiveQuadTo(380f, 440f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(0f, 300f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadToRelative(77f, -114.5f)
                quadToRelative(48.5f, -49f, 114f, -77.5f)
                reflectiveQuadTo(440f, 80f)
                quadToRelative(74f, 0f, 139.5f, 28.5f)
                reflectiveQuadTo(694f, 186f)
                quadToRelative(49f, 49f, 77.5f, 114.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(0f, 64f, -21f, 121f)
                reflectiveQuadToRelative(-58f, 104f)
                lineToRelative(159f, 159f)
                lineToRelative(-57f, 56f)
                lineToRelative(-159f, -158f)
                quadToRelative(-47f, 37f, -104f, 57.5f)
                reflectiveQuadTo(440f, 800f)
                close()
            }
        }.build()
        
        return _Mystery!!
    }

private var _Mystery: ImageVector? = null

