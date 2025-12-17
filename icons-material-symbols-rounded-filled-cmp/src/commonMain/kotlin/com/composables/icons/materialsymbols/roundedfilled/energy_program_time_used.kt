package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Energy_program_time_used: ImageVector
    get() {
        if (_Energy_program_time_used != null) return _Energy_program_time_used!!
        
        _Energy_program_time_used = ImageVector.Builder(
            name = "energy_program_time_used",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 480f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 680f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 440f)
                close()
                moveToRelative(160f, -120f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 360f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 320f)
                close()
                moveToRelative(160f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 600f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 680f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 560f)
                close()
                moveToRelative(160f, -80f)
                quadToRelative(-30f, 0f, -59f, -9f)
                reflectiveQuadToRelative(-54f, -26f)
                lineToRelative(-15f, 14f)
                quadToRelative(-12f, 11f, -28.5f, 11f)
                reflectiveQuadTo(536f, 459f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(16f, -16f)
                quadToRelative(-16f, -24f, -24f, -51f)
                reflectiveQuadToRelative(-8f, -56f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 480f)
                close()
                moveToRelative(50f, -255f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-56f, 56f)
                quadToRelative(-12f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                quadToRelative(12f, 12f, 28f, 12.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                lineToRelative(56f, -56f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(770f, 225f)
                close()
                moveTo(120f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(520f, 560f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Energy_program_time_used!!
    }

private var _Energy_program_time_used: ImageVector? = null

