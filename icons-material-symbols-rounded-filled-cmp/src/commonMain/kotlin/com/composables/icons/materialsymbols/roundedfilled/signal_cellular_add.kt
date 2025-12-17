package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Signal_cellular_add: ImageVector
    get() {
        if (_Signal_cellular_add != null) return _Signal_cellular_add!!
        
        _Signal_cellular_add = ImageVector.Builder(
            name = "signal_cellular_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 600f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 760f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                close()
                moveToRelative(-583f, 0f)
                quadToRelative(-18f, 0f, -29.5f, -12f)
                reflectiveQuadTo(136f, 840f)
                quadToRelative(0f, -8f, 3f, -15f)
                reflectiveQuadToRelative(9f, -13f)
                lineToRelative(663f, -663f)
                quadToRelative(6f, -6f, 13f, -9f)
                reflectiveQuadToRelative(15f, -3f)
                quadToRelative(16f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(12f, 29.5f)
                verticalLineToRelative(276f)
                quadToRelative(0f, 18f, -15.5f, 27.5f)
                reflectiveQuadTo(831f, 485f)
                quadToRelative(-17f, -5f, -35f, -7.5f)
                reflectiveQuadToRelative(-36f, -2.5f)
                quadToRelative(-102f, 0f, -173.5f, 71.5f)
                reflectiveQuadTo(515f, 720f)
                quadToRelative(0f, 31f, 6.5f, 58.5f)
                reflectiveQuadTo(542f, 832f)
                quadToRelative(9f, 17f, 0.5f, 32.5f)
                reflectiveQuadTo(517f, 880f)
                horizontalLineTo(177f)
                close()
            }
        }.build()
        
        return _Signal_cellular_add!!
    }

private var _Signal_cellular_add: ImageVector? = null

