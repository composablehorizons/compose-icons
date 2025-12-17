package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Person_shield: ImageVector
    get() {
        if (_Person_shield != null) return _Person_shield!!
        
        _Person_shield = ImageVector.Builder(
            name = "person_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 880f)
                quadToRelative(-73f, -18f, -116.5f, -80f)
                reflectiveQuadTo(560f, 662f)
                verticalLineToRelative(-102f)
                lineToRelative(160f, -80f)
                lineToRelative(160f, 80f)
                verticalLineToRelative(102f)
                quadToRelative(0f, 76f, -43.5f, 138f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(-560f, -80f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 520f)
                verticalLineToRelative(142f)
                quadToRelative(0f, 36f, 7.5f, 71f)
                reflectiveQuadToRelative(23.5f, 67f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Person_shield!!
    }

private var _Person_shield: ImageVector? = null

