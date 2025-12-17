package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Clinical_notes: ImageVector
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
                moveToRelative(-80f, -80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(280f)
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
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Clinical_notes!!
    }

private var _Clinical_notes: ImageVector? = null

