package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Heart_minus: ImageVector
    get() {
        if (_Heart_minus != null) return _Heart_minus!!
        
        _Heart_minus = ImageVector.Builder(
            name = "heart_minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 459f)
                close()
                moveToRelative(0f, 381f)
                lineTo(313f, 726f)
                quadToRelative(-72f, -65f, -123.5f, -116f)
                reflectiveQuadToRelative(-85f, -96f)
                quadToRelative(-33.5f, -45f, -49f, -87f)
                reflectiveQuadTo(40f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(260f, 120f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(84f, 0f, 153f, 59f)
                reflectiveQuadToRelative(69f, 160f)
                quadToRelative(0f, 14f, -2f, 29.5f)
                reflectiveQuadToRelative(-6f, 31.5f)
                horizontalLineToRelative(-85f)
                quadToRelative(5f, -18f, 8f, -34f)
                reflectiveQuadToRelative(3f, -30f)
                quadToRelative(0f, -75f, -50f, -105.5f)
                reflectiveQuadTo(620f, 200f)
                quadToRelative(-51f, 0f, -88f, 27.5f)
                reflectiveQuadTo(463f, 300f)
                horizontalLineToRelative(-46f)
                quadToRelative(-31f, -45f, -70.5f, -72.5f)
                reflectiveQuadTo(260f, 200f)
                quadToRelative(-57f, 0f, -98.5f, 39.5f)
                reflectiveQuadTo(120f, 339f)
                quadToRelative(0f, 33f, 14f, 67f)
                reflectiveQuadToRelative(50f, 78.5f)
                quadToRelative(36f, 44.5f, 98f, 104f)
                reflectiveQuadTo(440f, 732f)
                quadToRelative(26f, -23f, 61f, -53f)
                reflectiveQuadToRelative(56f, -50f)
                lineToRelative(9f, 9f)
                lineToRelative(19.5f, 19.5f)
                lineTo(605f, 677f)
                lineToRelative(9f, 9f)
                quadToRelative(-22f, 20f, -56f, 49.5f)
                reflectiveQuadTo(498f, 788f)
                lineToRelative(-58f, 52f)
                close()
                moveToRelative(160f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Heart_minus!!
    }

private var _Heart_minus: ImageVector? = null

