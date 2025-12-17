package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Remove_moderator: ImageVector
    get() {
        if (_Remove_moderator != null) return _Remove_moderator!!
        
        _Remove_moderator = ImageVector.Builder(
            name = "remove_moderator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 255f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 35f, -5.5f, 69.5f)
                reflectiveQuadTo(778f, 582f)
                quadToRelative(-7f, 21f, -22f, 27.5f)
                reflectiveQuadToRelative(-29f, 1.5f)
                quadToRelative(-14f, -5f, -23.5f, -17.5f)
                reflectiveQuadTo(700f, 563f)
                quadToRelative(10f, -28f, 15f, -58.5f)
                reflectiveQuadToRelative(5f, -60.5f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-122f, 46f)
                quadToRelative(-11f, 4f, -22.5f, 1.5f)
                reflectiveQuadTo(316f, 202f)
                quadToRelative(-16f, -16f, -11f, -37f)
                reflectiveQuadToRelative(25f, -29f)
                lineToRelative(122f, -45f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                close()
                moveTo(480f, 876f)
                quadToRelative(-4f, 0f, -25f, -4f)
                quadToRelative(-135f, -45f, -215f, -166.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-172f)
                lineToRelative(-76f, -76f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(662f, 774f)
                quadToRelative(-33f, 35f, -72.5f, 59f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                close()
                moveToRelative(-57f, -341f)
                close()
                moveToRelative(91f, -135f)
                close()
                moveToRelative(-34f, 396f)
                quadToRelative(35f, -11f, 67f, -31f)
                reflectiveQuadToRelative(59f, -47f)
                lineTo(240f, 352f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
            }
        }.build()
        
        return _Remove_moderator!!
    }

private var _Remove_moderator: ImageVector? = null

