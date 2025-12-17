package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Watch_arrow: ImageVector
    get() {
        if (_Watch_arrow != null) return _Watch_arrow!!
        
        _Watch_arrow = ImageVector.Builder(
            name = "watch_arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(466f, 520f)
                horizontalLineToRelative(-86f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(380f, 440f)
                horizontalLineToRelative(86f)
                lineToRelative(-15f, -16f)
                quadToRelative(-11f, -12f, -11f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(84f, 84f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineToRelative(-84f, 84f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-29f, -12f)
                quadToRelative(-11f, -11f, -11f, -27f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(15f, -16f)
                close()
                moveToRelative(-46f, -360f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
                moveToRelative(0f, 640f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
                moveToRelative(0f, 80f)
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
                moveToRelative(-76f, -470f)
                quadToRelative(20f, -5f, 38.5f, -8f)
                reflectiveQuadToRelative(37.5f, -3f)
                quadToRelative(19f, 0f, 37.5f, 3f)
                reflectiveQuadToRelative(38.5f, 8f)
                lineToRelative(-16f, -50f)
                horizontalLineTo(420f)
                lineToRelative(-16f, 50f)
                close()
                moveToRelative(16f, 590f)
                horizontalLineToRelative(120f)
                lineToRelative(16f, -50f)
                quadToRelative(-20f, 5f, -38.5f, 7.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-19f, 0f, -37.5f, -2.5f)
                reflectiveQuadTo(404f, 750f)
                lineToRelative(16f, 50f)
                close()
            }
        }.build()
        
        return _Watch_arrow!!
    }

private var _Watch_arrow: ImageVector? = null

