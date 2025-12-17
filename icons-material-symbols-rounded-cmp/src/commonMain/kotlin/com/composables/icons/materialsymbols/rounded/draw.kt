package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Draw: ImageVector
    get() {
        if (_Draw != null) return _Draw!!
        
        _Draw = ImageVector.Builder(
            name = "draw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-97f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(504f, -503f)
                quadToRelative(12f, -12f, 27f, -18f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 18f)
                lineToRelative(56f, 56f)
                quadToRelative(12f, 11f, 18f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineTo(353f, 817f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineToRelative(-97f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(56f)
                lineToRelative(393f, -392f)
                lineToRelative(-28f, -29f)
                lineToRelative(-29f, -28f)
                lineToRelative(-392f, 393f)
                verticalLineToRelative(56f)
                close()
                moveToRelative(560f, -503f)
                lineToRelative(-57f, -57f)
                lineToRelative(57f, 57f)
                close()
                moveToRelative(-139f, 82f)
                lineToRelative(-29f, -28f)
                lineToRelative(57f, 57f)
                lineToRelative(-28f, -29f)
                close()
                moveTo(560f, 840f)
                quadToRelative(74f, 0f, 137f, -37f)
                reflectiveQuadToRelative(63f, -103f)
                quadToRelative(0f, -32f, -16f, -55.5f)
                reflectiveQuadTo(702f, 601f)
                quadToRelative(-14f, -10f, -30f, -10f)
                reflectiveQuadToRelative(-27f, 12f)
                quadToRelative(-11f, 12f, -11f, 29.5f)
                reflectiveQuadToRelative(14f, 27.5f)
                quadToRelative(14f, 11f, 23f, 20f)
                reflectiveQuadToRelative(9f, 20f)
                quadToRelative(0f, 23f, -36.5f, 41.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 800f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                close()
                moveTo(360f, 240f)
                quadToRelative(0f, 14f, -17.5f, 25.5f)
                reflectiveQuadTo(262f, 306f)
                quadToRelative(-80f, 35f, -111f, 63.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, 26f, 12f, 46f)
                reflectiveQuadToRelative(31f, 35f)
                quadToRelative(13f, 11f, 29f, 9.5f)
                reflectiveQuadToRelative(27f, -14.5f)
                quadToRelative(11f, -13f, 10f, -29f)
                reflectiveQuadToRelative(-14f, -27f)
                quadToRelative(-7f, -5f, -11f, -10f)
                reflectiveQuadToRelative(-4f, -10f)
                quadToRelative(0f, -12f, 18f, -24f)
                reflectiveQuadToRelative(76f, -37f)
                quadToRelative(88f, -38f, 117f, -69f)
                reflectiveQuadToRelative(29f, -70f)
                quadToRelative(0f, -55f, -44f, -87.5f)
                reflectiveQuadTo(280f, 120f)
                quadToRelative(-45f, 0f, -80.5f, 16f)
                reflectiveQuadTo(145f, 175f)
                quadToRelative(-11f, 13f, -9f, 29f)
                reflectiveQuadToRelative(15f, 26f)
                quadToRelative(13f, 11f, 29f, 9f)
                reflectiveQuadToRelative(27f, -13f)
                quadToRelative(14f, -14f, 31f, -20f)
                reflectiveQuadToRelative(42f, -6f)
                quadToRelative(41f, 0f, 60.5f, 12f)
                reflectiveQuadToRelative(19.5f, 28f)
                close()
            }
        }.build()
        
        return _Draw!!
    }

private var _Draw: ImageVector? = null

