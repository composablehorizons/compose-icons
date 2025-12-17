package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Footprint: ImageVector
    get() {
        if (_Footprint != null) return _Footprint!!
        
        _Footprint = ImageVector.Builder(
            name = "footprint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(315f, 720f)
                quadToRelative(-77f, 0f, -117f, -57f)
                reflectiveQuadToRelative(-38f, -128f)
                lineToRelative(-18f, -27f)
                quadToRelative(-11f, -17f, -36.5f, -77f)
                reflectiveQuadTo(80f, 280f)
                quadToRelative(0f, -103f, 51f, -171.5f)
                reflectiveQuadTo(260f, 40f)
                quadToRelative(85f, 0f, 132.5f, 75.5f)
                reflectiveQuadTo(440f, 280f)
                quadToRelative(0f, 58f, -16f, 107f)
                reflectiveQuadToRelative(-28f, 79f)
                lineToRelative(8f, 13f)
                quadToRelative(8f, 14f, 22f, 44.5f)
                reflectiveQuadToRelative(14f, 63.5f)
                quadToRelative(0f, 57f, -35.5f, 95f)
                reflectiveQuadTo(315f, 720f)
                close()
                moveTo(210f, 464f)
                lineToRelative(110f, -22f)
                quadToRelative(13f, -32f, 26.5f, -73f)
                reflectiveQuadToRelative(13.5f, -89f)
                quadToRelative(0f, -60f, -27.5f, -110f)
                reflectiveQuadTo(260f, 120f)
                quadToRelative(-45f, 0f, -72.5f, 50f)
                reflectiveQuadTo(160f, 280f)
                quadToRelative(0f, 63f, 17.5f, 111.5f)
                reflectiveQuadTo(210f, 464f)
                close()
                moveToRelative(105f, 176f)
                quadToRelative(19f, 0f, 32f, -14f)
                reflectiveQuadToRelative(13f, -39f)
                quadToRelative(0f, -17f, -8f, -35f)
                reflectiveQuadToRelative(-16f, -32f)
                lineToRelative(-96f, 20f)
                quadToRelative(0f, 40f, 17.5f, 70f)
                reflectiveQuadToRelative(57.5f, 30f)
                close()
                moveTo(645f, 920f)
                quadToRelative(-54f, 0f, -89.5f, -38f)
                reflectiveQuadTo(520f, 787f)
                quadToRelative(0f, -33f, 14f, -63.5f)
                reflectiveQuadToRelative(22f, -44.5f)
                lineToRelative(8f, -13f)
                quadToRelative(-12f, -30f, -28f, -79f)
                reflectiveQuadToRelative(-16f, -107f)
                quadToRelative(0f, -89f, 47.5f, -164.5f)
                reflectiveQuadTo(700f, 240f)
                quadToRelative(78f, 0f, 129f, 68.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 91f, -25.5f, 150.5f)
                reflectiveQuadTo(818f, 707f)
                lineToRelative(-18f, 28f)
                quadToRelative(1f, 71f, -38.5f, 128f)
                reflectiveQuadTo(645f, 920f)
                close()
                moveToRelative(105f, -256f)
                quadToRelative(15f, -24f, 32.5f, -72f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -60f, -27.5f, -110f)
                reflectiveQuadTo(700f, 320f)
                quadToRelative(-45f, 0f, -72.5f, 50f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, 48f, 13.5f, 88.5f)
                reflectiveQuadTo(640f, 642f)
                lineToRelative(110f, 22f)
                close()
                moveTo(645f, 840f)
                quadToRelative(40f, 0f, 57.5f, -30f)
                reflectiveQuadToRelative(17.5f, -70f)
                lineToRelative(-96f, -20f)
                quadToRelative(-8f, 14f, -16f, 32f)
                reflectiveQuadToRelative(-8f, 35f)
                quadToRelative(0f, 20f, 12.5f, 36.5f)
                reflectiveQuadTo(645f, 840f)
                close()
            }
        }.build()
        
        return _Footprint!!
    }

private var _Footprint: ImageVector? = null

