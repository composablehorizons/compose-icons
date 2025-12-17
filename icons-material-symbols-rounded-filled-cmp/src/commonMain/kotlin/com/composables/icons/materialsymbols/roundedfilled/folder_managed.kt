package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Folder_managed: ImageVector
    get() {
        if (_Folder_managed != null) return _Folder_managed!!
        
        _Folder_managed = ImageVector.Builder(
            name = "folder_managed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 760f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 760f)
                close()
                moveToRelative(-8f, 120f)
                quadToRelative(-14f, 0f, -24.5f, -9f)
                reflectiveQuadTo(674f, 848f)
                lineToRelative(-6f, -28f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(624f, 796f)
                lineToRelative(-29f, 9f)
                quadToRelative(-13f, 4f, -25.5f, -1f)
                reflectiveQuadTo(550f, 788f)
                lineToRelative(-8f, -14f)
                quadToRelative(-7f, -12f, -5f, -26f)
                reflectiveQuadToRelative(13f, -23f)
                lineToRelative(22f, -19f)
                quadToRelative(-2f, -12f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-22f, -19f)
                quadToRelative(-11f, -9f, -13f, -22.5f)
                reflectiveQuadToRelative(5f, -25.5f)
                lineToRelative(9f, -15f)
                quadToRelative(7f, -11f, 19f, -16f)
                reflectiveQuadToRelative(25f, -1f)
                lineToRelative(29f, 9f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(668f, 540f)
                lineToRelative(6f, -29f)
                quadToRelative(3f, -14f, 13.5f, -22.5f)
                reflectiveQuadTo(712f, 480f)
                horizontalLineToRelative(16f)
                quadToRelative(14f, 0f, 24.5f, 9f)
                reflectiveQuadToRelative(13.5f, 23f)
                lineToRelative(6f, 28f)
                quadToRelative(12f, 5f, 22.5f, 10.5f)
                reflectiveQuadTo(816f, 564f)
                lineToRelative(29f, -9f)
                quadToRelative(13f, -4f, 25.5f, 1f)
                reflectiveQuadToRelative(19.5f, 16f)
                lineToRelative(8f, 14f)
                quadToRelative(7f, 12f, 5f, 26f)
                reflectiveQuadToRelative(-13f, 23f)
                lineToRelative(-22f, 19f)
                quadToRelative(2f, 12f, 2f, 26f)
                reflectiveQuadToRelative(-2f, 26f)
                lineToRelative(22f, 19f)
                quadToRelative(11f, 9f, 13f, 22.5f)
                reflectiveQuadToRelative(-5f, 25.5f)
                lineToRelative(-9f, 15f)
                quadToRelative(-7f, 11f, -19f, 16f)
                reflectiveQuadToRelative(-25f, 1f)
                lineToRelative(-29f, -9f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(772f, 820f)
                lineToRelative(-6f, 29f)
                quadToRelative(-3f, 14f, -13.5f, 22.5f)
                reflectiveQuadTo(728f, 880f)
                horizontalLineToRelative(-16f)
                close()
                moveToRelative(-552f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(207f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(57f, 57f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 18f, -15.5f, 27f)
                reflectiveQuadToRelative(-32.5f, 1f)
                quadToRelative(-26f, -12f, -55f, -18f)
                reflectiveQuadToRelative(-58f, -6f)
                quadToRelative(-118f, 0f, -198.5f, 82.5f)
                reflectiveQuadTo(440f, 679f)
                quadToRelative(0f, 19f, 2.5f, 37.5f)
                reflectiveQuadTo(450f, 753f)
                quadToRelative(5f, 18f, -5f, 32.5f)
                reflectiveQuadTo(418f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Folder_managed!!
    }

private var _Folder_managed: ImageVector? = null

