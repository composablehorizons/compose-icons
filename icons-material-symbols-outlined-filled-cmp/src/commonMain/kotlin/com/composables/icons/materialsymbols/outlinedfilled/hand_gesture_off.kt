package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hand_gesture_off: ImageVector
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
                moveTo(413f, 920f)
                quadToRelative(-29f, 0f, -54f, -15.5f)
                reflectiveQuadTo(313f, 868f)
                lineTo(39f, 596f)
                lineToRelative(55f, -43f)
                quadToRelative(18f, -14f, 41f, -17f)
                reflectiveQuadToRelative(44f, 8f)
                lineToRelative(101f, 51f)
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
                moveToRelative(467f, -719f)
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
                moveToRelative(600f, -194f)
                lineTo(600f, 487f)
                verticalLineToRelative(-367f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(367f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-287f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(526f)
                close()
            }
        }.build()
        
        return _Hand_gesture_off!!
    }

private var _Hand_gesture_off: ImageVector? = null

