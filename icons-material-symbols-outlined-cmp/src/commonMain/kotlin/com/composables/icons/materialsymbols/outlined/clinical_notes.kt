package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Clinical_notes: ImageVector
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
                moveToRelative(-518f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(200f)
                quadToRelative(-16f, -20f, -35f, -38f)
                reflectiveQuadToRelative(-45f, -24f)
                verticalLineToRelative(-138f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(166f)
                quadToRelative(-3f, 11f, -4.5f, 22f)
                reflectiveQuadToRelative(-1.5f, 22f)
                verticalLineToRelative(36f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -480f)
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
                horizontalLineToRelative(138f)
                quadToRelative(11f, -9f, 23.5f, -16f)
                reflectiveQuadToRelative(25.5f, -13f)
                verticalLineToRelative(-51f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(137f)
                verticalLineToRelative(-17f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(480f, -240f)
                close()
            }
        }.build()
        
        return _Clinical_notes!!
    }

private var _Clinical_notes: ImageVector? = null

