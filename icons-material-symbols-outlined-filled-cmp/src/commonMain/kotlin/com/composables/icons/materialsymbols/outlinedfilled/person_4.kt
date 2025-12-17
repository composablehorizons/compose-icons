package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Person_4: ImageVector
    get() {
        if (_Person_4 != null) return _Person_4!!
        
        _Person_4 = ImageVector.Builder(
            name = "person_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 160f)
                quadToRelative(15f, 0f, 28.5f, 7f)
                reflectiveQuadToRelative(21.5f, 20f)
                quadToRelative(8f, -13f, 21.5f, -20f)
                reflectiveQuadToRelative(28.5f, -7f)
                quadToRelative(15f, 0f, 28.5f, 7f)
                reflectiveQuadToRelative(21.5f, 20f)
                quadToRelative(8f, -13f, 21.5f, -20f)
                reflectiveQuadToRelative(28.5f, -7f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(640f, 220f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 622f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(736f, 622f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(800f, 728f)
                verticalLineToRelative(112f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Person_4!!
    }

private var _Person_4: ImageVector? = null

