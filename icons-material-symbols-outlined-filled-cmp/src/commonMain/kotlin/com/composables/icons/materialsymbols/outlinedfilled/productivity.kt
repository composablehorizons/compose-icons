package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Productivity: ImageVector
    get() {
        if (_Productivity != null) return _Productivity!!
        
        _Productivity = ImageVector.Builder(
            name = "productivity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-11f, 0f, -28f, -2.5f)
                reflectiveQuadToRelative(-28f, -5.5f)
                quadToRelative(27f, -32f, 41.5f, -71f)
                reflectiveQuadToRelative(14.5f, -81f)
                quadToRelative(0f, -42f, -14.5f, -81f)
                reflectiveQuadTo(584f, 8f)
                quadToRelative(14f, -5f, 28f, -6.5f)
                reflectiveQuadToRelative(28f, -1.5f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(120f, 480f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(0f, -84f, 58.5f, -142f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(84f, 0f, 142f, 58f)
                reflectiveQuadToRelative(58f, 142f)
                quadToRelative(0f, 83f, -58f, 141.5f)
                reflectiveQuadTo(760f, 800f)
                close()
                moveToRelative(-28f, -110f)
                lineToRelative(141f, -142f)
                lineToRelative(-28f, -28f)
                lineToRelative(-113f, 113f)
                lineToRelative(-57f, -57f)
                lineToRelative(-28f, 29f)
                lineToRelative(85f, 85f)
                close()
                moveTo(80f, 640f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(144f, 422f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(45f, 0f, 89f, 7f)
                reflectiveQuadToRelative(88f, 22f)
                quadToRelative(-54f, 47f, -78f, 113.5f)
                reflectiveQuadTo(483f, 640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Productivity!!
    }

private var _Productivity: ImageVector? = null

