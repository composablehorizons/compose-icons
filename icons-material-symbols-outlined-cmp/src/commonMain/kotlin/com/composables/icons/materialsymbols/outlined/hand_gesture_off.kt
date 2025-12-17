package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hand_gesture_off: ImageVector
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
                verticalLineToRelative(-446f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(526f)
                close()
                moveTo(360f, 246f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-6f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 160f)
                verticalLineToRelative(86f)
                close()
                moveToRelative(160f, 160f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-246f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(326f)
                close()
                moveToRelative(160f, 75f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-361f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(361f)
                close()
                moveToRelative(37f, 349f)
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
                lineToRelative(54f, -43f)
                quadToRelative(18f, -14f, 41f, -16.5f)
                reflectiveQuadToRelative(44f, 8.5f)
                lineToRelative(102f, 50f)
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
                moveToRelative(187f, -439f)
                close()
                moveToRelative(280f, -280f)
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
            }
        }.build()
        
        return _Hand_gesture_off!!
    }

private var _Hand_gesture_off: ImageVector? = null

