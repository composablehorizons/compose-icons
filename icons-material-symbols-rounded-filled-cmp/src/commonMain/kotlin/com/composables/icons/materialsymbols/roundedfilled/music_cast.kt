package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Music_cast: ImageVector
    get() {
        if (_Music_cast != null) return _Music_cast!!
        
        _Music_cast = ImageVector.Builder(
            name = "music_cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 800f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(23f, 0f, 42.5f, 5.5f)
                reflectiveQuadTo(640f, 502f)
                verticalLineToRelative(-302f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 160f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 280f)
                horizontalLineTo(720f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(278f, 357f)
                quadToRelative(-48f, 48f, -78f, 109.5f)
                reflectiveQuadTo(162f, 598f)
                quadToRelative(-2f, 17f, -13.5f, 29.5f)
                reflectiveQuadTo(120f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -13f)
                reflectiveQuadTo(82f, 597f)
                quadToRelative(8f, -87f, 44.5f, -162.5f)
                reflectiveQuadTo(221f, 301f)
                quadToRelative(58f, -58f, 133.5f, -94.5f)
                reflectiveQuadTo(517f, 162f)
                quadToRelative(17f, -2f, 30f, 9.5f)
                reflectiveQuadToRelative(13f, 28.5f)
                quadToRelative(0f, 17f, -12.5f, 28.5f)
                reflectiveQuadTo(518f, 242f)
                quadToRelative(-70f, 8f, -131f, 37.5f)
                reflectiveQuadTo(278f, 357f)
                close()
                moveToRelative(113f, 113f)
                quadToRelative(-26f, 26f, -44f, 59.5f)
                reflectiveQuadTo(323f, 601f)
                quadToRelative(-3f, 17f, -14.5f, 28f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(-17f, 0f, -28f, -12.5f)
                reflectiveQuadToRelative(-9f, -29.5f)
                quadToRelative(7f, -54f, 30.5f, -100.5f)
                reflectiveQuadTo(334f, 414f)
                quadToRelative(37f, -37f, 83.5f, -60.5f)
                reflectiveQuadTo(518f, 323f)
                quadToRelative(17f, -2f, 29.5f, 9f)
                reflectiveQuadToRelative(12.5f, 28f)
                quadToRelative(0f, 17f, -11f, 28.5f)
                reflectiveQuadTo(521f, 403f)
                quadToRelative(-38f, 6f, -71f, 23.5f)
                reflectiveQuadTo(391f, 470f)
                close()
            }
        }.build()
        
        return _Music_cast!!
    }

private var _Music_cast: ImageVector? = null

