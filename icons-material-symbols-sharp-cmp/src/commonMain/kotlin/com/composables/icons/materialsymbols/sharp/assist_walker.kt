package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Assist_walker: ImageVector
    get() {
        if (_Assist_walker != null) return _Assist_walker!!
        
        _Assist_walker = ImageVector.Builder(
            name = "assist_walker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                lineToRelative(34f, -331f)
                quadToRelative(-57f, -15f, -86f, -39.5f)
                reflectiveQuadTo(410f, 416f)
                lineToRelative(-95f, 94f)
                lineToRelative(85f, 85f)
                verticalLineToRelative(245f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-210f)
                lineToRelative(-31f, -28f)
                lineToRelative(7f, 54f)
                lineToRelative(-147f, 189f)
                lineToRelative(-63f, -49f)
                lineToRelative(126f, -162f)
                lineToRelative(-83f, -164f)
                lineToRelative(168f, -166f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(24f, 0f, 38f, 9f)
                reflectiveQuadToRelative(19f, 14f)
                lineToRelative(80f, 79f)
                quadToRelative(27f, 27f, 66f, 42.5f)
                reflectiveQuadToRelative(84f, 15.5f)
                horizontalLineToRelative(119f)
                lineToRelative(32f, 308f)
                quadToRelative(13f, 8f, 21f, 21.5f)
                reflectiveQuadToRelative(8f, 30.5f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(760f, 860f)
                quadToRelative(-25f, 0f, -43f, -17.5f)
                reflectiveQuadTo(699f, 800f)
                quadToRelative(0f, -17f, 8f, -30.5f)
                reflectiveQuadToRelative(22f, -21.5f)
                lineToRelative(-5f, -48f)
                horizontalLineTo(594f)
                lineToRelative(-14f, 140f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-20f, -540f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(420f, 220f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(500f, 140f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(580f, 220f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(500f, 300f)
                close()
                moveToRelative(100f, 340f)
                horizontalLineToRelative(118f)
                lineToRelative(-14f, -140f)
                horizontalLineToRelative(-89f)
                lineToRelative(-15f, 140f)
                close()
            }
        }.build()
        
        return _Assist_walker!!
    }

private var _Assist_walker: ImageVector? = null

