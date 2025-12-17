package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Contactless: ImageVector
    get() {
        if (_Contactless != null) return _Contactless!!
        
        _Contactless = ImageVector.Builder(
            name = "contactless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 586f)
                quadToRelative(9f, -24f, 14.5f, -50.5f)
                reflectiveQuadTo(356f, 480f)
                quadToRelative(0f, -29f, -5.5f, -55.5f)
                reflectiveQuadTo(336f, 374f)
                lineToRelative(-74f, 30f)
                quadToRelative(6f, 18f, 10f, 37f)
                reflectiveQuadToRelative(4f, 39f)
                quadToRelative(0f, 20f, -4f, 39f)
                reflectiveQuadToRelative(-10f, 37f)
                lineToRelative(74f, 30f)
                close()
                moveToRelative(128f, 54f)
                quadToRelative(17f, -38f, 24.5f, -78f)
                reflectiveQuadToRelative(7.5f, -82f)
                quadToRelative(0f, -42f, -7.5f, -82f)
                reflectiveQuadTo(464f, 320f)
                lineToRelative(-74f, 30f)
                quadToRelative(14f, 30f, 20f, 62.5f)
                reflectiveQuadToRelative(6f, 67.5f)
                quadToRelative(0f, 35f, -6f, 67.5f)
                reflectiveQuadTo(390f, 610f)
                lineToRelative(74f, 30f)
                close()
                moveToRelative(130f, 54f)
                quadToRelative(21f, -50f, 31.5f, -103.5f)
                reflectiveQuadTo(636f, 480f)
                quadToRelative(0f, -57f, -10.5f, -110.5f)
                reflectiveQuadTo(594f, 266f)
                lineToRelative(-74f, 32f)
                quadToRelative(18f, 42f, 27f, 88f)
                reflectiveQuadToRelative(9f, 94f)
                quadToRelative(0f, 48f, -9f, 94f)
                reflectiveQuadToRelative(-27f, 88f)
                lineToRelative(74f, 32f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Contactless!!
    }

private var _Contactless: ImageVector? = null

