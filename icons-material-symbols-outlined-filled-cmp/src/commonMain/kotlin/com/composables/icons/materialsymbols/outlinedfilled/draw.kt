package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Draw: ImageVector
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
                moveTo(160f, 840f)
                verticalLineToRelative(-170f)
                lineToRelative(527f, -526f)
                quadToRelative(12f, -12f, 27f, -18f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 18f)
                lineToRelative(56f, 56f)
                quadToRelative(12f, 11f, 18f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineTo(330f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(586f, -529f)
                lineToRelative(54f, -54f)
                lineToRelative(-57f, -57f)
                lineToRelative(-54f, 54f)
                lineToRelative(57f, 57f)
                close()
                moveTo(560f, 840f)
                quadToRelative(74f, 0f, 137f, -37f)
                reflectiveQuadToRelative(63f, -103f)
                quadToRelative(0f, -36f, -19f, -62f)
                reflectiveQuadToRelative(-51f, -45f)
                lineToRelative(-59f, 59f)
                quadToRelative(23f, 10f, 36f, 22f)
                reflectiveQuadToRelative(13f, 26f)
                quadToRelative(0f, 23f, -36.5f, 41.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 800f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                close()
                moveTo(183f, 534f)
                lineToRelative(60f, -60f)
                quadToRelative(-20f, -8f, -31.5f, -16.5f)
                reflectiveQuadTo(200f, 440f)
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
                quadToRelative(0f, 14f, -17.5f, 25.5f)
                reflectiveQuadTo(262f, 306f)
                quadToRelative(-80f, 35f, -111f, 63.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, 32f, 17f, 54.5f)
                reflectiveQuadToRelative(46f, 39.5f)
                close()
            }
        }.build()
        
        return _Draw!!
    }

private var _Draw: ImageVector? = null

