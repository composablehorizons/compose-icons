package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Key: ImageVector
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
                horizontalLineToRelative(352f)
                lineToRelative(120f, 120f)
                lineToRelative(-180f, 180f)
                lineToRelative(-80f, -60f)
                lineToRelative(-80f, 60f)
                lineToRelative(-85f, -60f)
                horizontalLineToRelative(-47f)
                quadToRelative(-32f, 54f, -86.5f, 87f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(56f, 0f, 98.5f, -34f)
                reflectiveQuadToRelative(56.5f, -86f)
                horizontalLineToRelative(125f)
                lineToRelative(58f, 41f)
                lineToRelative(82f, -61f)
                lineToRelative(71f, 55f)
                lineToRelative(75f, -75f)
                lineToRelative(-40f, -40f)
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

