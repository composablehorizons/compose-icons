package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Blood_pressure: ImageVector
    get() {
        if (_Blood_pressure != null) return _Blood_pressure!!
        
        _Blood_pressure = ImageVector.Builder(
            name = "blood_pressure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 320f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 460f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 420f)
                verticalLineToRelative(-180f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 320f)
                close()
                moveToRelative(200f, 360f)
                quadToRelative(-11f, 0f, -21f, -5.5f)
                reflectiveQuadTo(244f, 658f)
                lineToRelative(-68f, -138f)
                horizontalLineToRelative(-55f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(81f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(121f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(11f, 0f, 20.5f, 6f)
                reflectiveQuadToRelative(14.5f, 16f)
                lineToRelative(44f, 88f)
                lineToRelative(124f, -248f)
                quadToRelative(5f, -10f, 15f, -15f)
                reflectiveQuadToRelative(21f, -5f)
                quadToRelative(11f, 0f, 21f, 5f)
                reflectiveQuadToRelative(15f, 15f)
                lineToRelative(67f, 134f)
                quadToRelative(-18f, 11f, -34.5f, 23f)
                reflectiveQuadTo(478f, 486f)
                lineToRelative(-38f, -76f)
                lineToRelative(-124f, 248f)
                quadToRelative(-5f, 11f, -15f, 16.5f)
                reflectiveQuadToRelative(-21f, 5.5f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(215f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(415f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(375f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -320f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(85f, -257f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-63f, 62f)
                quadToRelative(-6f, 6f, -6f, 14.5f)
                reflectiveQuadToRelative(6f, 14.5f)
                quadToRelative(6f, 6f, 14.5f, 6f)
                reflectiveQuadToRelative(14.5f, -6f)
                lineToRelative(62f, -63f)
                close()
            }
        }.build()
        
        return _Blood_pressure!!
    }

private var _Blood_pressure: ImageVector? = null

