package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Femur: ImageVector
    get() {
        if (_Femur != null) return _Femur!!
        
        _Femur = ImageVector.Builder(
            name = "femur",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(396f, 883f)
                quadToRelative(-44f, 0f, -77f, -27.5f)
                reflectiveQuadTo(278f, 784f)
                quadToRelative(-3f, -18f, -13.5f, -29.5f)
                reflectiveQuadTo(234f, 743f)
                quadToRelative(-3f, 0f, -6f, 0.5f)
                reflectiveQuadToRelative(-5f, 0.5f)
                quadToRelative(-56f, 11f, -99.5f, -25.5f)
                reflectiveQuadTo(80f, 625f)
                quadToRelative(0f, -42f, 27.5f, -76f)
                reflectiveQuadToRelative(72.5f, -42f)
                lineToRelative(118f, -21f)
                lineToRelative(133f, -191f)
                quadToRelative(-14f, -14f, -22f, -33f)
                reflectiveQuadToRelative(-8f, -39f)
                quadToRelative(0f, -42f, 28f, -70.5f)
                reflectiveQuadToRelative(69f, -28.5f)
                quadToRelative(26f, 0f, 44f, 9.5f)
                reflectiveQuadToRelative(26f, 15.5f)
                quadToRelative(9f, 7f, 20.5f, 10f)
                reflectiveQuadToRelative(25.5f, 4f)
                quadToRelative(8f, -25f, 25.5f, -44f)
                reflectiveQuadToRelative(41.5f, -28f)
                quadToRelative(44f, -17f, 85f, 2.5f)
                reflectiveQuadToRelative(57f, 61.5f)
                lineToRelative(51f, 141f)
                quadToRelative(17f, 46f, -4f, 86.5f)
                reflectiveQuadTo(810f, 436f)
                quadToRelative(-36f, 12f, -69f, 2.5f)
                reflectiveQuadTo(686f, 404f)
                horizontalLineToRelative(-37f)
                lineTo(494f, 625f)
                lineToRelative(21f, 116f)
                quadToRelative(11f, 56f, -25.5f, 99f)
                reflectiveQuadTo(396f, 883f)
                close()
            }
        }.build()
        
        return _Femur!!
    }

private var _Femur: ImageVector? = null

