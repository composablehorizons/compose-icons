package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Heart_plus: ImageVector
    get() {
        if (_Heart_plus != null) return _Heart_plus!!
        
        _Heart_plus = ImageVector.Builder(
            name = "heart_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(434f, 466f)
                close()
                moveTo(40f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(260f, 120f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(71f, 0f, 122f, 35.5f)
                reflectiveQuadToRelative(77f, 91.5f)
                quadToRelative(7f, 15f, 1f, 30.5f)
                reflectiveQuadTo(799f, 300f)
                quadToRelative(-15f, 7f, -30.5f, 1f)
                reflectiveQuadTo(746f, 280f)
                quadToRelative(-18f, -40f, -53f, -60f)
                reflectiveQuadToRelative(-73f, -20f)
                quadToRelative(-46f, 0f, -84f, 26f)
                reflectiveQuadToRelative(-66f, 64f)
                quadToRelative(-5f, 8f, -13f, 11.5f)
                reflectiveQuadToRelative(-17f, 3.5f)
                quadToRelative(-9f, 0f, -17f, -4f)
                reflectiveQuadToRelative(-13f, -11f)
                quadToRelative(-28f, -38f, -66f, -64f)
                reflectiveQuadToRelative(-84f, -26f)
                quadToRelative(-57f, 0f, -98.5f, 39.5f)
                reflectiveQuadTo(120f, 339f)
                quadToRelative(0f, 33f, 14f, 67f)
                reflectiveQuadToRelative(50f, 78.5f)
                quadToRelative(36f, 44.5f, 98f, 104f)
                reflectiveQuadTo(440f, 732f)
                lineToRelative(89f, -78f)
                quadToRelative(12f, -11f, 28f, -10f)
                reflectiveQuadToRelative(27f, 12f)
                quadToRelative(12f, 12f, 11.5f, 29.5f)
                reflectiveQuadTo(582f, 714f)
                lineToRelative(-89f, 79f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -16f)
                quadToRelative(-45f, -40f, -104.5f, -91f)
                reflectiveQuadTo(169f, 591.5f)
                quadTo(115f, 533f, 77.5f, 469f)
                reflectiveQuadTo(40f, 339f)
                close()
                moveToRelative(680f, 221f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 640f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Heart_plus!!
    }

private var _Heart_plus: ImageVector? = null

