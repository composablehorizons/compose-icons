package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Podium: ImageVector
    get() {
        if (_Podium != null) return _Podium!!
        
        _Podium = ImageVector.Builder(
            name = "podium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 600f)
                lineToRelative(-40f, -280f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, -49f, 27f, -89f)
                reflectiveQuadToRelative(73f, -59f)
                quadToRelative(3f, -31f, 26f, -51.5f)
                reflectiveQuadToRelative(54f, -20.5f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(500f, 180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(420f, 260f)
                quadToRelative(-13f, 0f, -24f, -3.5f)
                reflectiveQuadTo(374f, 245f)
                quadToRelative(-24f, 8f, -38.5f, 29f)
                reflectiveQuadTo(321f, 320f)
                horizontalLineToRelative(519f)
                lineToRelative(-40f, 280f)
                horizontalLineTo(693f)
                lineToRelative(7f, -69f)
                quadToRelative(5f, -49f, -27.5f, -85f)
                reflectiveQuadTo(591f, 410f)
                horizontalLineTo(369f)
                quadToRelative(-49f, 0f, -81.5f, 36f)
                reflectiveQuadTo(260f, 531f)
                lineToRelative(7f, 69f)
                horizontalLineTo(160f)
                close()
                moveToRelative(187f, 210f)
                lineToRelative(-27f, -285f)
                quadToRelative(-2f, -22f, 12f, -38.5f)
                reflectiveQuadToRelative(37f, -16.5f)
                horizontalLineToRelative(222f)
                quadToRelative(23f, 0f, 37f, 16.5f)
                reflectiveQuadToRelative(12f, 38.5f)
                lineToRelative(-27f, 285f)
                horizontalLineTo(347f)
                close()
            }
        }.build()
        
        return _Podium!!
    }

private var _Podium: ImageVector? = null

