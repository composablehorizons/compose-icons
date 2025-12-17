package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stop_screen_share: ImageVector
    get() {
        if (_Stop_screen_share != null) return _Stop_screen_share!!
        
        _Stop_screen_share = ImageVector.Builder(
            name = "stop_screen_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(728f, 840f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 760f)
                horizontalLineToRelative(567f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-446f)
                lineToRelative(-25f, -26f)
                quadToRelative(-11f, -12f, -11f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-64f, -64f)
                close()
                moveTo(400f, 514f)
                lineToRelative(-73f, -74f)
                quadToRelative(-5f, 9f, -6f, 19f)
                reflectiveQuadToRelative(-1f, 21f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 520f)
                verticalLineToRelative(-6f)
                close()
                moveToRelative(428f, 200f)
                lineTo(577f, 463f)
                lineToRelative(49f, -49f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-89f, -89f)
                quadToRelative(-5f, -5f, -11f, -2.5f)
                reflectiveQuadToRelative(-6f, 9.5f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(-46f)
                lineTo(234f, 120f)
                horizontalLineToRelative(566f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 26f, -14.5f, 45.5f)
                reflectiveQuadTo(828f, 714f)
                close()
            }
        }.build()
        
        return _Stop_screen_share!!
    }

private var _Stop_screen_share: ImageVector? = null

