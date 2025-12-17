package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Person_off: ImageVector
    get() {
        if (_Person_off != null) return _Person_off!!
        
        _Person_off = ImageVector.Builder(
            name = "person_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineToRelative(-77f, -76f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(45f, -23f, 91.5f, -37f)
                reflectiveQuadToRelative(94.5f, -21f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveToRelative(-27f, -294f)
                quadToRelative(29f, 14f, 46f, 42.5f)
                reflectiveQuadToRelative(18f, 61.5f)
                lineTo(666f, 552f)
                quadToRelative(18f, 7f, 35.5f, 14f)
                reflectiveQuadToRelative(34.5f, 16f)
                close()
                moveTo(568f, 454f)
                lineTo(346f, 232f)
                quadToRelative(23f, -34f, 58f, -53f)
                reflectiveQuadToRelative(76f, -19f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 41f, -19f, 76f)
                reflectiveQuadToRelative(-53f, 58f)
                close()
            }
        }.build()
        
        return _Person_off!!
    }

private var _Person_off: ImageVector? = null

