package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Scuba_diving: ImageVector
    get() {
        if (_Scuba_diving != null) return _Scuba_diving!!
        
        _Scuba_diving = ImageVector.Builder(
            name = "scuba_diving",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(210f, 720f)
                lineToRelative(31f, -178f)
                quadToRelative(3f, -24f, 19f, -42.5f)
                reflectiveQuadToRelative(41f, -24.5f)
                lineToRelative(379f, -115f)
                lineToRelative(77f, -154f)
                quadToRelative(1f, -2f, 8f, -11f)
                lineToRelative(95f, -95f)
                quadToRelative(8f, -8f, 19.5f, -8.5f)
                reflectiveQuadTo(901f, 101f)
                quadToRelative(8f, 8f, 9f, 19.5f)
                reflectiveQuadToRelative(-7f, 19.5f)
                lineToRelative(-83f, 96f)
                lineToRelative(-56f, 171f)
                quadToRelative(-2f, 6f, -6f, 11.5f)
                reflectiveQuadToRelative(-9f, 9.5f)
                lineTo(560f, 560f)
                lineToRelative(-234f, 74f)
                lineToRelative(-44f, 120f)
                quadToRelative(-1f, 3f, -2.5f, 6f)
                reflectiveQuadToRelative(-3.5f, 5f)
                lineTo(184f, 888f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                quadToRelative(-14f, -10f, -16f, -26f)
                reflectiveQuadToRelative(8f, -30f)
                lineToRelative(90f, -120f)
                close()
                moveToRelative(-90f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 520f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(120f, 600f)
                close()
                moveToRelative(236f, -196f)
                quadToRelative(-24f, 7f, -45.5f, -5.5f)
                reflectiveQuadTo(282f, 362f)
                quadToRelative(-7f, -24f, 5.5f, -46f)
                reflectiveQuadToRelative(36.5f, -28f)
                lineToRelative(143f, -38f)
                quadToRelative(16f, -5f, 30f, 4f)
                reflectiveQuadToRelative(19f, 25f)
                lineToRelative(11f, 38f)
                quadToRelative(5f, 16f, -4f, 30f)
                reflectiveQuadToRelative(-25f, 19f)
                lineToRelative(-142f, 38f)
                close()
            }
        }.build()
        
        return _Scuba_diving!!
    }

private var _Scuba_diving: ImageVector? = null

