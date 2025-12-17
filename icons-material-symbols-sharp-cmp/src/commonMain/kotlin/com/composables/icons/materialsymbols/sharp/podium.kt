package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Podium: ImageVector
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
                moveTo(500f, 180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(420f, 260f)
                quadToRelative(-13f, 0f, -24f, -3.5f)
                reflectiveQuadTo(374f, 245f)
                quadToRelative(-24f, 8f, -38.5f, 29f)
                reflectiveQuadTo(321f, 320f)
                horizontalLineToRelative(519f)
                lineToRelative(-40f, 280f)
                horizontalLineTo(604f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(127f)
                lineToRelative(17f, -120f)
                horizontalLineTo(212f)
                lineToRelative(17f, 120f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                lineToRelative(-40f, -280f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, -49f, 27f, -89f)
                reflectiveQuadToRelative(73f, -59f)
                quadToRelative(3f, -31f, 26f, -51.5f)
                reflectiveQuadToRelative(54f, -20.5f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(500f, 180f)
                close()
                moveTo(391f, 760f)
                horizontalLineToRelative(178f)
                lineToRelative(23f, -240f)
                horizontalLineTo(368f)
                lineToRelative(23f, 240f)
                close()
                moveToRelative(-71f, 80f)
                lineToRelative(-38f, -400f)
                horizontalLineToRelative(396f)
                lineToRelative(-38f, 400f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Podium!!
    }

private var _Podium: ImageVector? = null

