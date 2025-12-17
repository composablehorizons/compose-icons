package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stylus_note: ImageVector
    get() {
        if (_Stylus_note != null) return _Stylus_note!!
        
        _Stylus_note = ImageVector.Builder(
            name = "stylus_note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(499f, 673f)
                lineToRelative(335f, -335f)
                lineToRelative(-52f, -52f)
                lineToRelative(-335f, 335f)
                lineToRelative(52f, 52f)
                close()
                moveToRelative(-379f, -62f)
                quadToRelative(0f, 29f, 20f, 45f)
                reflectiveQuadToRelative(66f, 21f)
                quadToRelative(16f, 2f, 25.5f, 14.5f)
                reflectiveQuadTo(240f, 720f)
                quadToRelative(-1f, 17f, -12f, 28f)
                reflectiveQuadToRelative(-27f, 9f)
                quadToRelative(-81f, -10f, -121f, -46.5f)
                reflectiveQuadTo(40f, 611f)
                quadToRelative(0f, -65f, 53.5f, -105.5f)
                reflectiveQuadTo(242f, 457f)
                quadToRelative(39f, -3f, 58.5f, -12.5f)
                reflectiveQuadTo(320f, 418f)
                quadToRelative(0f, -22f, -21f, -34.5f)
                reflectiveQuadTo(230f, 364f)
                quadToRelative(-16f, -2f, -25.5f, -15f)
                reflectiveQuadToRelative(-7.5f, -29f)
                quadToRelative(2f, -17f, 14f, -27.5f)
                reflectiveQuadToRelative(28f, -8.5f)
                quadToRelative(83f, 12f, 122f, 44.5f)
                reflectiveQuadToRelative(39f, 89.5f)
                quadToRelative(0f, 53f, -38.5f, 83f)
                reflectiveQuadTo(248f, 537f)
                quadToRelative(-64f, 5f, -96f, 23.5f)
                reflectiveQuadTo(120f, 611f)
                close()
                moveToRelative(398f, 156f)
                lineTo(353f, 602f)
                lineToRelative(382f, -382f)
                quadToRelative(20f, -20f, 47.5f, -20f)
                reflectiveQuadToRelative(47.5f, 20f)
                lineToRelative(70f, 70f)
                quadToRelative(20f, 20f, 20f, 47.5f)
                reflectiveQuadTo(900f, 385f)
                lineTo(518f, 767f)
                close()
                moveToRelative(-159f, 33f)
                quadToRelative(-17f, 4f, -30f, -9f)
                reflectiveQuadToRelative(-9f, -30f)
                lineToRelative(33f, -159f)
                lineToRelative(165f, 165f)
                lineToRelative(-159f, 33f)
                close()
            }
        }.build()
        
        return _Stylus_note!!
    }

private var _Stylus_note: ImageVector? = null

