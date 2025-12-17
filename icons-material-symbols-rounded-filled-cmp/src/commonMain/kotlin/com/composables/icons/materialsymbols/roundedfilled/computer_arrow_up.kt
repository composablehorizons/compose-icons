package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Computer_arrow_up: ImageVector
    get() {
        if (_Computer_arrow_up != null) return _Computer_arrow_up!!
        
        _Computer_arrow_up = ImageVector.Builder(
            name = "computer_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 413f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 580f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 540f)
                verticalLineToRelative(-127f)
                lineToRelative(35f, 35f)
                quadToRelative(12f, 11f, 28.5f, 11.5f)
                reflectiveQuadTo(612f, 448f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineTo(480f, 260f)
                lineTo(348f, 392f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                lineToRelative(35f, -35f)
                close()
                moveTo(80f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 760f)
                horizontalLineToRelative(800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Computer_arrow_up!!
    }

private var _Computer_arrow_up: ImageVector? = null

