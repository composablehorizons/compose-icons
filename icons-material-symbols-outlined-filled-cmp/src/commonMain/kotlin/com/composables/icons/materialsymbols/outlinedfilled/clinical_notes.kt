package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Clinical_notes: ImageVector
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
                moveTo(440f, 920f)
                verticalLineToRelative(-116f)
                quadToRelative(0f, -21f, 10f, -39.5f)
                reflectiveQuadToRelative(28f, -29.5f)
                quadToRelative(32f, -19f, 67.5f, -31.5f)
                reflectiveQuadTo(618f, 685f)
                lineToRelative(62f, 75f)
                lineToRelative(62f, -75f)
                quadToRelative(37f, 6f, 72f, 18.5f)
                reflectiveQuadToRelative(67f, 31.5f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(920f, 804f)
                verticalLineToRelative(116f)
                horizontalLineTo(440f)
                close()
                moveToRelative(-80f, -116f)
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
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                quadToRelative(-20f, 16f, -36f, 36f)
                reflectiveQuadToRelative(-27f, 44f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, 21f, 4.5f, 41f)
                reflectiveQuadToRelative(12.5f, 39f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(138f)
                quadToRelative(-27f, 23f, -42.5f, 55.5f)
                reflectiveQuadTo(360f, 804f)
                close()
            }
        }.build()
        
        return _Clinical_notes!!
    }

private var _Clinical_notes: ImageVector? = null

