package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Visibility_lock: ImageVector
    get() {
        if (_Visibility_lock != null) return _Visibility_lock!!
        
        _Visibility_lock = ImageVector.Builder(
            name = "visibility_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(680f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-240f, -72f)
                quadToRelative(-45f, 0f, -76.5f, -31.5f)
                reflectiveQuadTo(372f, 460f)
                quadToRelative(0f, -45f, 31.5f, -76.5f)
                reflectiveQuadTo(480f, 352f)
                quadToRelative(45f, 0f, 76.5f, 31.5f)
                reflectiveQuadTo(588f, 460f)
                quadToRelative(0f, 45f, -31.5f, 76.5f)
                reflectiveQuadTo(480f, 568f)
                close()
                moveToRelative(0f, 192f)
                quadToRelative(-134f, 0f, -250.5f, -72f)
                reflectiveQuadTo(56f, 494f)
                quadToRelative(-4f, -8f, -6f, -16.5f)
                reflectiveQuadTo(48f, 460f)
                quadToRelative(0f, -9f, 2f, -17.5f)
                reflectiveQuadToRelative(6f, -16.5f)
                quadToRelative(57f, -122f, 173.5f, -194f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(71f, 0f, 135.5f, 19.5f)
                reflectiveQuadTo(737f, 236f)
                quadToRelative(43f, 28f, 79.5f, 64.5f)
                reflectiveQuadTo(881f, 382f)
                quadToRelative(12f, 19f, 0.5f, 38.5f)
                reflectiveQuadTo(847f, 440f)
                horizontalLineToRelative(-87f)
                quadToRelative(-28f, 0f, -53f, 7f)
                reflectiveQuadToRelative(-47f, 20f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(22f, 0f, 42.5f, -5f)
                reflectiveQuadToRelative(38.5f, -14f)
                quadToRelative(-1f, 5f, -1f, 9.5f)
                verticalLineToRelative(85.5f)
                quadToRelative(0f, 16f, -10f, 28f)
                reflectiveQuadToRelative(-26f, 14f)
                quadToRelative(-11f, 1f, -22f, 1.5f)
                reflectiveQuadToRelative(-22f, 0.5f)
                close()
            }
        }.build()
        
        return _Visibility_lock!!
    }

private var _Visibility_lock: ImageVector? = null

