package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Key_vertical: ImageVector
    get() {
        if (_Key_vertical != null) return _Key_vertical!!
        
        _Key_vertical = ImageVector.Builder(
            name = "key_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(500f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(580f, 280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(500f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(420f, 280f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 67f, -33f, 121.5f)
                reflectiveQuadTo(620f, 488f)
                verticalLineToRelative(335f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-9f, 13.5f)
                lineToRelative(-80f, 80f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadTo(500f, 943f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadTo(472f, 932f)
                lineTo(345f, 805f)
                quadToRelative(-5f, -5f, -8f, -12f)
                reflectiveQuadToRelative(-4f, -14f)
                quadToRelative(-1f, -7f, 1f, -14f)
                reflectiveQuadToRelative(7f, -13f)
                lineToRelative(39f, -52f)
                lineToRelative(-43f, -57f)
                quadToRelative(-4f, -5f, -6f, -11f)
                reflectiveQuadToRelative(-2f, -12f)
                quadToRelative(0f, -6f, 2f, -12.5f)
                reflectiveQuadToRelative(6f, -11.5f)
                lineToRelative(43f, -61f)
                verticalLineToRelative(-47f)
                quadToRelative(-54f, -32f, -87f, -86.5f)
                reflectiveQuadTo(260f, 280f)
                close()
                moveToRelative(80f, 0f)
                quadToRelative(0f, 56f, 34f, 98.5f)
                reflectiveQuadToRelative(86f, 56.5f)
                verticalLineToRelative(125f)
                lineToRelative(-41f, 58f)
                horizontalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                lineToRelative(61f, 82f)
                lineToRelative(-55f, 71f)
                lineToRelative(75f, 75f)
                verticalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-371f)
                quadToRelative(52f, -14f, 86f, -56.5f)
                reflectiveQuadToRelative(34f, -98.5f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                close()
            }
        }.build()
        
        return _Key_vertical!!
    }

private var _Key_vertical: ImageVector? = null

