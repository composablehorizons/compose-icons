package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Smart_card_reader_off: ImageVector
    get() {
        if (_Smart_card_reader_off != null) return _Smart_card_reader_off!!
        
        _Smart_card_reader_off = ImageVector.Builder(
            name = "smart_card_reader_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 880f)
                lineToRelative(-52f, -52f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 628f)
                horizontalLineToRelative(407f)
                lineToRelative(-60f, -60f)
                horizontalLineTo(200f)
                verticalLineToRelative(-308f)
                lineTo(28f, 88f)
                lineToRelative(56f, -56f)
                lineToRelative(792f, 791f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(280f, 28f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 108f)
                verticalLineToRelative(460f)
                horizontalLineToRelative(-28f)
                lineTo(587f, 422f)
                quadToRelative(23f, -8f, 38f, -28.5f)
                reflectiveQuadToRelative(15f, -46.5f)
                quadToRelative(0f, -33f, -23.5f, -56f)
                reflectiveQuadTo(560f, 268f)
                quadToRelative(-26f, 0f, -46.5f, 15f)
                reflectiveQuadTo(485f, 321f)
                lineTo(220f, 55f)
                quadToRelative(11f, -13f, 26.5f, -20f)
                reflectiveQuadToRelative(33.5f, -7f)
                close()
                moveToRelative(40f, 482f)
                horizontalLineToRelative(23f)
                quadToRelative(20f, 0f, 37f, -10.5f)
                reflectiveQuadToRelative(30f, -29.5f)
                lineToRelative(-90f, -90f)
                verticalLineToRelative(130f)
                close()
            }
        }.build()
        
        return _Smart_card_reader_off!!
    }

private var _Smart_card_reader_off: ImageVector? = null

