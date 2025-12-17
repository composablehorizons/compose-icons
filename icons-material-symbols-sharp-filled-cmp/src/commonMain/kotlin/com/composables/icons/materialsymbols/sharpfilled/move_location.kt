package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Move_location: ImageVector
    get() {
        if (_Move_location != null) return _Move_location!!
        
        _Move_location = ImageVector.Builder(
            name = "move_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                quadTo(239f, 743f, 159.5f, 625.5f)
                reflectiveQuadTo(80f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(720f, 408f)
                verticalLineToRelative(17f)
                quadToRelative(0f, 9f, -2f, 18f)
                quadToRelative(-54f, 11f, -94.5f, 41.5f)
                reflectiveQuadTo(558f, 558f)
                quadToRelative(-25f, 43f, -31.5f, 93f)
                reflectiveQuadToRelative(9.5f, 101f)
                quadToRelative(-29f, 31f, -63f, 63f)
                reflectiveQuadToRelative(-73f, 65f)
                close()
                moveToRelative(0f, -280f)
                quadToRelative(56f, 0f, 101f, -27.5f)
                reflectiveQuadToRelative(71f, -72.5f)
                quadToRelative(-35f, -29f, -79f, -44.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(-49f, 0f, -93f, 15.5f)
                reflectiveQuadTo(228f, 500f)
                quadToRelative(26f, 45f, 71f, 72.5f)
                reflectiveQuadTo(400f, 600f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(320f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 400f)
                close()
                moveToRelative(370f, 440f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(610f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Move_location!!
    }

private var _Move_location: ImageVector? = null

