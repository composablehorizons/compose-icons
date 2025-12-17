package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hand_gesture: ImageVector
    get() {
        if (_Hand_gesture != null) return _Hand_gesture!!
        
        _Hand_gesture = ImageVector.Builder(
            name = "hand_gesture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 720f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(162f, 0f)
                quadToRelative(-30f, 0f, -56f, -13.5f)
                reflectiveQuadTo(303f, 868f)
                lineTo(48f, 495f)
                lineToRelative(24f, -23f)
                quadToRelative(19f, -19f, 45f, -22f)
                reflectiveQuadToRelative(47f, 12f)
                lineToRelative(116f, 81f)
                verticalLineToRelative(-383f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(402f)
                close()
                moveToRelative(478f, -719f)
                quadToRelative(0f, -51f, -35f, -86f)
                reflectiveQuadToRelative(-86f, -35f)
                verticalLineToRelative(-60f)
                quadToRelative(75f, 0f, 128f, 53f)
                reflectiveQuadToRelative(53f, 128f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Hand_gesture!!
    }

private var _Hand_gesture: ImageVector? = null

