package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Energy_program_time_used: ImageVector
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
                moveTo(720f, 480f)
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
                moveToRelative(-33f, -115f)
                lineToRelative(112f, -112f)
                lineToRelative(-57f, -56f)
                lineToRelative(-111f, 111f)
                lineToRelative(56f, 57f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(320f)
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
            }
        }.build()
        
        return _Energy_program_time_used!!
    }

private var _Energy_program_time_used: ImageVector? = null

