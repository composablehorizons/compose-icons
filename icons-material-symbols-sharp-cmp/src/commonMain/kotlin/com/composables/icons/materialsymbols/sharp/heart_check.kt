package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Heart_check: ImageVector
    get() {
        if (_Heart_check != null) return _Heart_check!!
        
        _Heart_check = ImageVector.Builder(
            name = "heart_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(718f, 647f)
                lineTo(604f, 534f)
                lineToRelative(57f, -56f)
                lineToRelative(57f, 56f)
                lineToRelative(141f, -141f)
                lineToRelative(57f, 56f)
                lineToRelative(-198f, 198f)
                close()
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
                quadToRelative(81f, 0f, 136f, 45.5f)
                reflectiveQuadTo(831f, 280f)
                horizontalLineToRelative(-85f)
                quadToRelative(-18f, -40f, -53f, -60f)
                reflectiveQuadToRelative(-73f, -20f)
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
            }
        }.build()
        
        return _Heart_check!!
    }

private var _Heart_check: ImageVector? = null

