package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Smart_card_reader_off: ImageVector
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
                moveTo(760f, 28f)
                verticalLineToRelative(540f)
                horizontalLineToRelative(-28f)
                lineToRelative(-52f, -52f)
                verticalLineToRelative(-408f)
                horizontalLineTo(273f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(567f)
                close()
                moveTo(589f, 424f)
                lineTo(485f, 321f)
                quadToRelative(9f, -23f, 29f, -38f)
                reflectiveQuadToRelative(46f, -15f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 348f)
                quadToRelative(0f, 26f, -14f, 46.5f)
                reflectiveQuadTo(589f, 424f)
                close()
                moveToRelative(-269f, 86f)
                verticalLineToRelative(-242f)
                lineToRelative(118f, 118f)
                quadToRelative(-7f, 57f, -32f, 90.5f)
                reflectiveQuadTo(343f, 510f)
                horizontalLineToRelative(-23f)
                close()
                moveTo(160f, 748f)
                horizontalLineToRelative(527f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(160f)
                verticalLineToRelative(40f)
                close()
                moveTo(819f, 880f)
                lineToRelative(-52f, -52f)
                horizontalLineTo(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(487f)
                lineTo(280f, 340f)
                verticalLineToRelative(228f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-308f)
                lineTo(28f, 88f)
                lineToRelative(56f, -56f)
                lineToRelative(792f, 791f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(424f, 748f)
                close()
                moveToRelative(52f, -436f)
                close()
                moveToRelative(-82f, 142f)
                close()
            }
        }.build()
        
        return _Smart_card_reader_off!!
    }

private var _Smart_card_reader_off: ImageVector? = null

