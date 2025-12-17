package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Clinical_notes: ImageVector
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
                moveTo(360f, 804f)
                verticalLineToRelative(36f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(200f)
                quadToRelative(-31f, -39f, -70f, -59.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 280f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineToRelative(240f)
                quadToRelative(-20f, 16f, -36f, 36f)
                reflectiveQuadToRelative(-27f, 44f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 520f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 21f, 4.5f, 41f)
                reflectiveQuadToRelative(12.5f, 39f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 680f)
                horizontalLineToRelative(98f)
                quadToRelative(-27f, 23f, -42.5f, 55.5f)
                reflectiveQuadTo(360f, 804f)
                close()
                moveTo(480f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 880f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -21f, 10f, -39.5f)
                reflectiveQuadToRelative(28f, -29.5f)
                quadToRelative(32f, -19f, 54f, -26.5f)
                reflectiveQuadToRelative(59f, -13.5f)
                quadToRelative(12f, -2f, 24f, 0.5f)
                reflectiveQuadToRelative(20f, 11.5f)
                lineToRelative(45f, 53f)
                lineToRelative(44f, -53f)
                quadToRelative(8f, -10f, 20f, -12f)
                reflectiveQuadToRelative(24f, 0f)
                quadToRelative(37f, 6f, 59f, 13.5f)
                reflectiveQuadToRelative(54f, 26.5f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(920f, 804f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 920f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Clinical_notes!!
    }

private var _Clinical_notes: ImageVector? = null

