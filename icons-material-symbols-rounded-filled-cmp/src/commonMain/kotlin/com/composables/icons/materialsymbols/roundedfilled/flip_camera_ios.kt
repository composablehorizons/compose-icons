package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flip_camera_ios: ImageVector
    get() {
        if (_Flip_camera_ios != null) return _Flip_camera_ios!!
        
        _Flip_camera_ios = ImageVector.Builder(
            name = "flip_camera_ios",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(126f)
                lineToRelative(50f, -54f)
                quadToRelative(11f, -12f, 26.5f, -19f)
                reflectiveQuadToRelative(32.5f, -7f)
                horizontalLineToRelative(170f)
                quadToRelative(17f, 0f, 32.5f, 7f)
                reflectiveQuadToRelative(26.5f, 19f)
                lineToRelative(50f, 54f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(458f, -304f)
                quadToRelative(-6f, 53f, -45f, 88.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(-8f, 0f, -16f, -1f)
                reflectiveQuadToRelative(-16f, -3f)
                quadToRelative(-8f, -2f, -17f, 0f)
                reflectiveQuadToRelative(-15f, 8f)
                quadToRelative(-11f, 11f, -8f, 26.5f)
                reflectiveQuadToRelative(17f, 20.5f)
                quadToRelative(14f, 5f, 27.5f, 7f)
                reflectiveQuadToRelative(27.5f, 2f)
                quadToRelative(79f, 0f, 136f, -53.5f)
                reflectiveQuadTo(678f, 534f)
                lineToRelative(9f, 8f)
                quadToRelative(9f, 8f, 21f, 8f)
                reflectiveQuadToRelative(20f, -8f)
                quadToRelative(9f, -9f, 9.5f, -21.5f)
                reflectiveQuadTo(729f, 499f)
                lineToRelative(-51f, -51f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-51f, 51f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                lineToRelative(5f, -5f)
                close()
                moveToRelative(-336f, -30f)
                lineToRelative(-9f, -8f)
                quadToRelative(-9f, -8f, -21f, -8f)
                reflectiveQuadToRelative(-20f, 8f)
                quadToRelative(-9f, 9f, -9.5f, 21.5f)
                reflectiveQuadTo(231f, 541f)
                lineToRelative(51f, 51f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(51f, -51f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(-9f, -9f, -21f, -9f)
                reflectiveQuadToRelative(-21f, 9f)
                lineToRelative(-5f, 5f)
                quadToRelative(6f, -53f, 45f, -88.5f)
                reflectiveQuadToRelative(93f, -35.5f)
                quadToRelative(8f, 0f, 16f, 1f)
                reflectiveQuadToRelative(16f, 3f)
                quadToRelative(8f, 2f, 17f, 0f)
                reflectiveQuadToRelative(15f, -8f)
                quadToRelative(11f, -11f, 8f, -26.5f)
                reflectiveQuadTo(535f, 329f)
                quadToRelative(-14f, -5f, -27.5f, -7f)
                reflectiveQuadToRelative(-27.5f, -2f)
                quadToRelative(-79f, 0f, -136f, 53.5f)
                reflectiveQuadTo(282f, 506f)
                close()
            }
        }.build()
        
        return _Flip_camera_ios!!
    }

private var _Flip_camera_ios: ImageVector? = null

