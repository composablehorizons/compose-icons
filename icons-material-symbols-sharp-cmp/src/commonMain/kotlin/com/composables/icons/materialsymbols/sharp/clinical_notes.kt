package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Clinical_notes: ImageVector
    get() {
        if (_Clinical_notes != null) return _Clinical_notes!!
        
        _Clinical_notes = ImageVector.Builder(
            name = "clinical_notes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 640f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 560f)
                close()
                moveTo(440f, 920f)
                verticalLineToRelative(-171f)
                quadToRelative(42f, -24f, 86f, -40f)
                reflectiveQuadToRelative(92f, -24f)
                lineToRelative(62f, 75f)
                lineToRelative(62f, -75f)
                quadToRelative(48f, 6f, 92f, 23f)
                reflectiveQuadToRelative(86f, 40f)
                verticalLineToRelative(172f)
                horizontalLineTo(440f)
                close()
                moveToRelative(79f, -80f)
                horizontalLineToRelative(123f)
                lineToRelative(-54f, -66f)
                quadToRelative(-18f, 5f, -35f, 13f)
                reflectiveQuadToRelative(-34f, 17f)
                verticalLineToRelative(36f)
                close()
                moveToRelative(199f, 0f)
                horizontalLineToRelative(122f)
                verticalLineToRelative(-36f)
                quadToRelative(-16f, -10f, -33f, -17.5f)
                reflectiveQuadTo(772f, 774f)
                lineToRelative(-54f, 66f)
                close()
                moveToRelative(-76f, 0f)
                close()
                moveToRelative(76f, 0f)
                close()
                moveToRelative(-358f, 0f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(280f)
                quadToRelative(-16f, -20f, -35f, -38f)
                reflectiveQuadToRelative(-45f, -24f)
                verticalLineToRelative(-138f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, -480f)
                horizontalLineToRelative(280f)
                quadToRelative(26f, -20f, 57f, -30f)
                reflectiveQuadToRelative(63f, -10f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, -21f, 4.5f, -41f)
                reflectiveQuadToRelative(12.5f, -39f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(126f)
                lineToRelative(61f, -27f)
                verticalLineToRelative(-53f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(80f, 80f)
                horizontalLineTo(200f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(137f)
                quadToRelative(-18f, -8f, -38.5f, -12.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(0f, 31f, 8.5f, 59.5f)
                reflectiveQuadTo(514f, 632f)
                lineToRelative(-154f, 69f)
                verticalLineToRelative(59f)
                close()
                moveToRelative(320f, -240f)
                close()
            }
        }.build()
        
        return _Clinical_notes!!
    }

private var _Clinical_notes: ImageVector? = null

