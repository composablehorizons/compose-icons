package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Money_bag: ImageVector
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
                moveTo(480f, 640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveTo(295f, 280f)
                horizontalLineToRelative(370f)
                lineToRelative(80f, -160f)
                horizontalLineTo(215f)
                lineToRelative(80f, 160f)
                close()
                moveToRelative(41f, 560f)
                horizontalLineToRelative(288f)
                quadToRelative(90f, 0f, 153f, -62.5f)
                reflectiveQuadTo(840f, 624f)
                quadToRelative(0f, -38f, -13f, -74f)
                reflectiveQuadToRelative(-37f, -65f)
                lineTo(686f, 360f)
                horizontalLineTo(274f)
                lineTo(170f, 485f)
                quadToRelative(-24f, 29f, -37f, 65f)
                reflectiveQuadToRelative(-13f, 74f)
                quadToRelative(0f, 91f, 62.5f, 153.5f)
                reflectiveQuadTo(336f, 840f)
                close()
            }
        }.build()
        
        return _Money_bag!!
    }

private var _Money_bag: ImageVector? = null

