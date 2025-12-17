package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hand_gesture_off: ImageVector
    get() {
        if (_Hand_gesture_off != null) return _Hand_gesture_off!!
        
        _Hand_gesture_off = ImageVector.Builder(
            name = "hand_gesture_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 726f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-486f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(566f)
                close()
                moveTo(520f, 406f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-286f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(366f)
                close()
                moveToRelative(160f, 81f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-407f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(407f)
                close()
                moveToRelative(37f, 343f)
                lineTo(360f, 473f)
                verticalLineToRelative(252f)
                lineToRelative(-158f, -79f)
                lineToRelative(177f, 176f)
                quadToRelative(8f, 7f, 16f, 12.5f)
                reflectiveQuadToRelative(18f, 5.5f)
                horizontalLineToRelative(267f)
                quadToRelative(10f, 0f, 19.5f, -2.5f)
                reflectiveQuadTo(717f, 830f)
                close()
                moveTo(413f, 920f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineTo(39f, 596f)
                lineToRelative(94f, -74f)
                lineToRelative(147f, 73f)
                verticalLineToRelative(-202f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-44f, -44f)
                quadToRelative(-20f, 15f, -44f, 23.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(413f)
                close()
                moveToRelative(187f, -433f)
                close()
                moveToRelative(280f, -286f)
                quadToRelative(0f, -51f, -35f, -86f)
                reflectiveQuadToRelative(-86f, -35f)
                verticalLineToRelative(-60f)
                quadToRelative(75f, 0f, 128f, 53f)
                reflectiveQuadToRelative(53f, 128f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(240f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 720f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(304f, -264f)
                close()
                moveTo(360f, 246f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(126f)
                close()
            }
        }.build()
        
        return _Hand_gesture_off!!
    }

private var _Hand_gesture_off: ImageVector? = null

