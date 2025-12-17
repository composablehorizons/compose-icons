package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Auto_label: ImageVector
    get() {
        if (_Auto_label != null) return _Auto_label!!
        
        _Auto_label = ImageVector.Builder(
            name = "auto_label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 856f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 776f)
                verticalLineTo(376f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 296f)
                horizontalLineToRelative(400f)
                quadToRelative(20f, 0f, 37.5f, 9f)
                reflectiveQuadToRelative(28.5f, 25f)
                lineToRelative(141f, 200f)
                quadToRelative(15f, 21f, 15f, 46f)
                reflectiveQuadToRelative(-15f, 46f)
                lineTo(666f, 822f)
                quadToRelative(-11f, 16f, -28.5f, 25f)
                reflectiveQuadToRelative(-37.5f, 9f)
                horizontalLineTo(200f)
                close()
                moveToRelative(171f, -230f)
                lineToRelative(32f, 70f)
                quadToRelative(5f, 12f, 18f, 12f)
                reflectiveQuadToRelative(18f, -12f)
                lineToRelative(32f, -70f)
                lineToRelative(70f, -32f)
                quadToRelative(12f, -5f, 12f, -18f)
                reflectiveQuadToRelative(-12f, -18f)
                lineToRelative(-70f, -32f)
                lineToRelative(-32f, -70f)
                quadToRelative(-5f, -12f, -18f, -12f)
                reflectiveQuadToRelative(-18f, 12f)
                lineToRelative(-32f, 70f)
                lineToRelative(-70f, 32f)
                quadToRelative(-12f, 5f, -12f, 18f)
                reflectiveQuadToRelative(12f, 18f)
                lineToRelative(70f, 32f)
                close()
            }
        }.build()
        
        return _Auto_label!!
    }

private var _Auto_label: ImageVector? = null

