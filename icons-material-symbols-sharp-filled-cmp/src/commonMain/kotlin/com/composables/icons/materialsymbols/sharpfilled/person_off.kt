package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Person_off: ImageVector
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
                moveTo(791f, 905f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(45f, -23f, 91.5f, -37f)
                reflectiveQuadToRelative(94.5f, -21f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-55f, -323f)
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

