package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Money_bag: ImageVector
    get() {
        if (_Money_bag != null) return _Money_bag!!
        
        _Money_bag = ImageVector.Builder(
            name = "money_bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 840f)
                quadToRelative(-91f, 0f, -153.5f, -62.5f)
                reflectiveQuadTo(120f, 624f)
                quadToRelative(0f, -38f, 13f, -74f)
                reflectiveQuadToRelative(37f, -65f)
                lineToRelative(142f, -171f)
                lineToRelative(-68f, -136f)
                quadToRelative(-10f, -20f, 1.5f, -39f)
                reflectiveQuadToRelative(34.5f, -19f)
                horizontalLineToRelative(400f)
                quadToRelative(23f, 0f, 34.5f, 19f)
                reflectiveQuadToRelative(1.5f, 39f)
                lineToRelative(-68f, 136f)
                lineToRelative(142f, 171f)
                quadToRelative(24f, 29f, 37f, 65f)
                reflectiveQuadToRelative(13f, 74f)
                quadToRelative(0f, 91f, -63f, 153.5f)
                reflectiveQuadTo(624f, 840f)
                horizontalLineTo(336f)
                close()
                moveToRelative(144f, -200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(-95f, -360f)
                horizontalLineToRelative(190f)
                lineToRelative(40f, -80f)
                horizontalLineTo(345f)
                lineToRelative(40f, 80f)
                close()
                moveToRelative(-49f, 480f)
                horizontalLineToRelative(288f)
                quadToRelative(57f, 0f, 96.5f, -39.5f)
                reflectiveQuadTo(760f, 624f)
                quadToRelative(0f, -24f, -8.5f, -46.5f)
                reflectiveQuadTo(728f, 537f)
                lineTo(581f, 360f)
                horizontalLineTo(380f)
                lineTo(232f, 536f)
                quadToRelative(-15f, 18f, -23.5f, 41f)
                reflectiveQuadToRelative(-8.5f, 47f)
                quadToRelative(0f, 57f, 39.5f, 96.5f)
                reflectiveQuadTo(336f, 760f)
                close()
            }
        }.build()
        
        return _Money_bag!!
    }

private var _Money_bag: ImageVector? = null

