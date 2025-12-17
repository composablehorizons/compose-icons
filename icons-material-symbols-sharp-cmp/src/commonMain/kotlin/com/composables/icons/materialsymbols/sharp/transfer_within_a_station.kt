package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Transfer_within_a_station: ImageVector
    get() {
        if (_Transfer_within_a_station != null) return _Transfer_within_a_station!!
        
        _Transfer_within_a_station = ImageVector.Builder(
            name = "transfer_within_a_station",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                lineToRelative(112f, -564f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(136f)
                horizontalLineTo(80f)
                verticalLineToRelative(-188f)
                lineToRelative(202f, -86f)
                quadToRelative(29f, -12f, 59f, -2.5f)
                reflectiveQuadToRelative(47f, 36.5f)
                lineToRelative(40f, 64f)
                quadToRelative(27f, 43f, 71.5f, 69.5f)
                reflectiveQuadTo(600f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-66f, 0f, -123.5f, -27.5f)
                reflectiveQuadTo(380f, 420f)
                lineToRelative(-24f, 120f)
                lineToRelative(84f, 80f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                lineToRelative(-84f, -80f)
                lineToRelative(-72f, 320f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(260f, -700f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(300f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(380f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(380f, 220f)
                close()
                moveTo(780f, 920f)
                lineToRelative(-42f, -42f)
                lineToRelative(28f, -28f)
                horizontalLineTo(560f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(206f)
                lineToRelative(-28f, -28f)
                lineToRelative(42f, -42f)
                lineToRelative(100f, 100f)
                lineTo(780f, 920f)
                close()
                moveTo(660f, 750f)
                lineTo(560f, 650f)
                lineToRelative(100f, -100f)
                lineToRelative(42f, 42f)
                lineToRelative(-28f, 28f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(60f)
                horizontalLineTo(674f)
                lineToRelative(28f, 28f)
                lineToRelative(-42f, 42f)
                close()
            }
        }.build()
        
        return _Transfer_within_a_station!!
    }

private var _Transfer_within_a_station: ImageVector? = null

