package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Signal_cellular_connected_no_internet_4_bar: ImageVector
    get() {
        if (_Signal_cellular_connected_no_internet_4_bar != null) return _Signal_cellular_connected_no_internet_4_bar!!
        
        _Signal_cellular_connected_no_internet_4_bar = ImageVector.Builder(
            name = "signal_cellular_connected_no_internet_4_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(148f, 812f)
                lineToRelative(663f, -663f)
                quadToRelative(20f, -20f, 44.5f, -9.5f)
                reflectiveQuadTo(880f, 177f)
                verticalLineToRelative(143f)
                horizontalLineToRelative(-40f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(440f)
                horizontalLineTo(176f)
                quadToRelative(-26f, 0f, -36.5f, -24.5f)
                reflectiveQuadTo(148f, 812f)
                close()
                moveToRelative(692f, 68f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                close()
                moveToRelative(-40f, -200f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(241f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 680f)
                close()
            }
        }.build()
        
        return _Signal_cellular_connected_no_internet_4_bar!!
    }

private var _Signal_cellular_connected_no_internet_4_bar: ImageVector? = null

