package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Energy_program_time_used: ImageVector
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
                moveTo(400f, 520f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(200f, -240f)
                quadToRelative(-30f, 0f, -59f, -9f)
                reflectiveQuadToRelative(-54f, -26f)
                lineToRelative(-44f, 41f)
                lineToRelative(-55f, -55f)
                lineToRelative(44f, -44f)
                quadToRelative(-16f, -24f, -24f, -51f)
                reflectiveQuadToRelative(-8f, -56f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 480f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                verticalLineToRelative(-120f)
                horizontalLineTo(720f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 13f, 2.5f, 25f)
                reflectiveQuadToRelative(7.5f, 24f)
                lineToRelative(132f, -132f)
                lineToRelative(57f, 56f)
                lineToRelative(-133f, 133f)
                quadToRelative(13f, 6f, 26.5f, 10f)
                reflectiveQuadToRelative(27.5f, 4f)
                close()
                moveToRelative(-5f, -119f)
                close()
            }
        }.build()
        
        return _Energy_program_time_used!!
    }

private var _Energy_program_time_used: ImageVector? = null

