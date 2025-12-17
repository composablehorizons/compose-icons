package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Move_location: ImageVector
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
                moveTo(770f, 840f)
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
                moveTo(400f, 600f)
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
                moveToRelative(0f, 67f)
                close()
                moveToRelative(0f, 413f)
                quadTo(239f, 743f, 159.5f, 625.5f)
                reflectiveQuadTo(80f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(720f, 408f)
                quadToRelative(0f, 9f, -0.5f, 18.5f)
                reflectiveQuadTo(717f, 446f)
                horizontalLineToRelative(-81f)
                quadToRelative(2f, -10f, 3f, -19.5f)
                reflectiveQuadToRelative(1f, -18.5f)
                quadToRelative(0f, -109f, -69.5f, -178.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(-101f, 0f, -170.5f, 69.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(400f, 774f)
                quadToRelative(23f, -20f, 42.5f, -40f)
                reflectiveQuadToRelative(37.5f, -39f)
                lineToRelative(9f, 9f)
                lineToRelative(19.5f, 19.5f)
                quadToRelative(10.5f, 10.5f, 19f, 19.5f)
                lineToRelative(8.5f, 9f)
                quadToRelative(-29f, 31f, -63f, 63f)
                reflectiveQuadToRelative(-73f, 65f)
                close()
            }
        }.build()
        
        return _Move_location!!
    }

private var _Move_location: ImageVector? = null

