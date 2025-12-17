package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Input_circle: ImageVector
    get() {
        if (_Input_circle != null) return _Input_circle!!
        
        _Input_circle = ImageVector.Builder(
            name = "input_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 473f)
                verticalLineToRelative(367f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-367f)
                lineToRelative(76f, 75f)
                quadToRelative(11f, 11f, 27.5f, 11.5f)
                reflectiveQuadTo(652f, 548f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                lineTo(508f, 348f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineTo(308f, 492f)
                quadToRelative(-11f, 11f, -11.5f, 27.5f)
                reflectiveQuadTo(308f, 548f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(76f, -75f)
                close()
                moveToRelative(40f, -313f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 33f, 6.5f, 65f)
                reflectiveQuadToRelative(19.5f, 62f)
                quadToRelative(7f, 17f, 4.5f, 34f)
                reflectiveQuadTo(175f, 671f)
                quadToRelative(-12f, 12f, -29.5f, 5.5f)
                reflectiveQuadTo(119f, 651f)
                quadToRelative(-19f, -41f, -29f, -83.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 45f, -9.5f, 88.5f)
                reflectiveQuadTo(841f, 653f)
                quadToRelative(-9f, 18f, -26.5f, 24f)
                reflectiveQuadToRelative(-29.5f, -6f)
                quadToRelative(-12f, -12f, -15.5f, -29f)
                reflectiveQuadToRelative(3.5f, -33f)
                quadToRelative(14f, -31f, 20.5f, -63.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                close()
            }
        }.build()
        
        return _Input_circle!!
    }

private var _Input_circle: ImageVector? = null

