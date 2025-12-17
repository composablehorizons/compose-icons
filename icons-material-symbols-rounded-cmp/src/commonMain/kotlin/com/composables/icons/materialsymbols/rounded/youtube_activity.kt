package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Youtube_activity: ImageVector
    get() {
        if (_Youtube_activity != null) return _Youtube_activity!!
        
        _Youtube_activity = ImageVector.Builder(
            name = "youtube_activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(168f, 703f)
                quadToRelative(-26f, -7f, -45f, -26f)
                reflectiveQuadToRelative(-26f, -45f)
                quadToRelative(-6f, -23f, -9.5f, -56f)
                reflectiveQuadTo(82f, 513f)
                quadToRelative(-2f, -36f, -2f, -73f)
                reflectiveQuadToRelative(2f, -73f)
                quadToRelative(2f, -30f, 5.5f, -63f)
                reflectiveQuadToRelative(9.5f, -56f)
                quadToRelative(7f, -26f, 26f, -45f)
                reflectiveQuadToRelative(45f, -26f)
                quadToRelative(23f, -6f, 74.5f, -9.5f)
                reflectiveQuadTo(347f, 162f)
                quadToRelative(62f, -2f, 133f, -2f)
                reflectiveQuadToRelative(133f, 2f)
                quadToRelative(53f, 2f, 104.5f, 5.5f)
                reflectiveQuadTo(792f, 177f)
                quadToRelative(26f, 7f, 45f, 26f)
                reflectiveQuadToRelative(26f, 45f)
                quadToRelative(9f, 34f, 12.5f, 74.5f)
                reflectiveQuadTo(880f, 403f)
                quadToRelative(0f, 20f, -16f, 32f)
                reflectiveQuadToRelative(-36f, 7f)
                quadToRelative(-7f, -1f, -13.5f, -1.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(600f, 640f)
                quadToRelative(0f, 8f, 0.5f, 15.5f)
                reflectiveQuadTo(603f, 671f)
                quadToRelative(3f, 18f, -8f, 33f)
                reflectiveQuadToRelative(-28f, 15f)
                quadToRelative(-18f, 0f, -34f, 0.5f)
                reflectiveQuadToRelative(-28f, 0.5f)
                horizontalLineToRelative(-25f)
                quadToRelative(-71f, 0f, -133f, -2f)
                quadToRelative(-53f, -2f, -104.5f, -5.5f)
                reflectiveQuadTo(168f, 703f)
                close()
                moveToRelative(262f, -160f)
                lineToRelative(148f, -86f)
                quadToRelative(10f, -6f, 10f, -17f)
                reflectiveQuadToRelative(-10f, -17f)
                lineToRelative(-148f, -86f)
                quadToRelative(-10f, -6f, -20f, 0.5f)
                reflectiveQuadTo(400f, 355f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 11f, 10f, 17.5f)
                reflectiveQuadToRelative(20f, 0.5f)
                close()
                moveToRelative(330f, 137f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 560f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 680f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 720f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Youtube_activity!!
    }

private var _Youtube_activity: ImageVector? = null

