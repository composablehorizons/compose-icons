package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(67f, 0f, 121.5f, 33f)
                reflectiveQuadToRelative(86.5f, 87f)
                horizontalLineToRelative(335f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(13.5f, 9f)
                lineToRelative(80f, 80f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(805f, 635f)
                quadToRelative(-5f, 5f, -12f, 8f)
                reflectiveQuadToRelative(-14f, 4f)
                quadToRelative(-7f, 1f, -14f, -1f)
                reflectiveQuadToRelative(-13f, -7f)
                lineToRelative(-52f, -39f)
                lineToRelative(-57f, 43f)
                quadToRelative(-5f, 4f, -11f, 6f)
                reflectiveQuadToRelative(-12f, 2f)
                quadToRelative(-6f, 0f, -12.5f, -2f)
                reflectiveQuadToRelative(-11.5f, -6f)
                lineToRelative(-61f, -43f)
                horizontalLineToRelative(-47f)
                quadToRelative(-32f, 54f, -86.5f, 87f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(56f, 0f, 98.5f, -34f)
                reflectiveQuadToRelative(56.5f, -86f)
                horizontalLineToRelative(125f)
                lineToRelative(58f, 41f)
                verticalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                lineToRelative(82f, -61f)
                lineToRelative(71f, 55f)
                lineToRelative(75f, -75f)
                horizontalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(435f)
                quadToRelative(-14f, -52f, -56.5f, -86f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

