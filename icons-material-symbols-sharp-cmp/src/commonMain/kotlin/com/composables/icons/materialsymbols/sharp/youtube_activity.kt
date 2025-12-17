package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Youtube_activity: ImageVector
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
                moveTo(616f, 718f)
                quadToRelative(-27f, 1f, -51.5f, 1.5f)
                reflectiveQuadToRelative(-43.5f, 0.5f)
                horizontalLineToRelative(-41f)
                quadToRelative(-71f, 0f, -133f, -2f)
                quadToRelative(-53f, -2f, -104.5f, -5.5f)
                reflectiveQuadTo(168f, 703f)
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
                quadToRelative(6f, 23f, 9.5f, 56f)
                reflectiveQuadToRelative(5.5f, 63f)
                quadToRelative(2f, 36f, 2f, 73f)
                verticalLineToRelative(17f)
                quadToRelative(-19f, -8f, -39f, -12.5f)
                reflectiveQuadToRelative(-41f, -4.5f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(600f, 640f)
                quadToRelative(0f, 21f, 4f, 40.5f)
                reflectiveQuadToRelative(12f, 37.5f)
                close()
                moveTo(400f, 560f)
                lineToRelative(208f, -120f)
                lineToRelative(-208f, -120f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(360f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Youtube_activity!!
    }

private var _Youtube_activity: ImageVector? = null

