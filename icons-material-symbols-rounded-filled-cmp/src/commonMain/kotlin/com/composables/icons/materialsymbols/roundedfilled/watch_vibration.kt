package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Watch_vibration: ImageVector
    get() {
        if (_Watch_vibration != null) return _Watch_vibration!!
        
        _Watch_vibration = ImageVector.Builder(
            name = "watch_vibration",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 480f)
                quadToRelative(0f, -50f, 10f, -96f)
                reflectiveQuadToRelative(30f, -88f)
                quadToRelative(7f, -15f, 23f, -19.5f)
                reflectiveQuadToRelative(30f, 3.5f)
                quadToRelative(14f, 8f, 19f, 24f)
                reflectiveQuadToRelative(-2f, 32f)
                quadToRelative(-14f, 33f, -22f, 69.5f)
                reflectiveQuadToRelative(-8f, 74.5f)
                quadToRelative(0f, 38f, 8f, 74.5f)
                reflectiveQuadToRelative(22f, 69.5f)
                quadToRelative(7f, 16f, 2f, 32f)
                reflectiveQuadToRelative(-19f, 24f)
                quadToRelative(-14f, 8f, -30f, 3.5f)
                reflectiveQuadTo(80f, 664f)
                quadToRelative(-20f, -42f, -30f, -88f)
                reflectiveQuadToRelative(-10f, -96f)
                close()
                moveToRelative(880f, 0f)
                quadToRelative(0f, 50f, -10f, 96f)
                reflectiveQuadToRelative(-30f, 88f)
                quadToRelative(-7f, 15f, -23f, 19.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                quadToRelative(-14f, -8f, -19f, -24f)
                reflectiveQuadToRelative(2f, -32f)
                quadToRelative(14f, -33f, 22f, -69.5f)
                reflectiveQuadToRelative(8f, -74.5f)
                quadToRelative(0f, -38f, -8f, -74.5f)
                reflectiveQuadTo(810f, 336f)
                quadToRelative(-7f, -16f, -2f, -32f)
                reflectiveQuadToRelative(19f, -24f)
                quadToRelative(14f, -8f, 30f, -3.5f)
                reflectiveQuadToRelative(23f, 19.5f)
                quadToRelative(20f, 42f, 30f, 88f)
                reflectiveQuadToRelative(10f, 96f)
                close()
                moveTo(420f, 880f)
                quadToRelative(-26f, 0f, -47.5f, -15.5f)
                reflectiveQuadTo(343f, 823f)
                lineToRelative(-23f, -77f)
                quadToRelative(-6f, -20f, -18.5f, -40.5f)
                reflectiveQuadTo(269f, 663f)
                quadToRelative(-34f, -37f, -51.5f, -84f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -51f, 17.5f, -98f)
                reflectiveQuadToRelative(51.5f, -85f)
                quadToRelative(20f, -23f, 32.5f, -43f)
                reflectiveQuadToRelative(18.5f, -40f)
                lineToRelative(23f, -77f)
                quadToRelative(8f, -26f, 29.5f, -41.5f)
                reflectiveQuadTo(420f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(26f, 0f, 47.5f, 15.5f)
                reflectiveQuadTo(617f, 137f)
                lineToRelative(23f, 77f)
                quadToRelative(6f, 20f, 18.5f, 40.5f)
                reflectiveQuadTo(691f, 297f)
                quadToRelative(34f, 37f, 51.5f, 84f)
                reflectiveQuadToRelative(17.5f, 99f)
                quadToRelative(0f, 51f, -17.5f, 98f)
                reflectiveQuadTo(691f, 663f)
                quadToRelative(-20f, 23f, -32.5f, 43f)
                reflectiveQuadTo(640f, 746f)
                lineToRelative(-23f, 77f)
                quadToRelative(-8f, 26f, -29.5f, 41.5f)
                reflectiveQuadTo(540f, 880f)
                horizontalLineTo(420f)
                close()
                moveToRelative(60f, -200f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Watch_vibration!!
    }

private var _Watch_vibration: ImageVector? = null

