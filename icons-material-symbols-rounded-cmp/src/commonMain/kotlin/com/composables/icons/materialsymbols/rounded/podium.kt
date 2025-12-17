package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Podium: ImageVector
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
                horizontalLineToRelative(473f)
                quadToRelative(18f, 0f, 29.5f, 14f)
                reflectiveQuadToRelative(9.5f, 32f)
                lineToRelative(-28f, 200f)
                quadToRelative(-2f, 15f, -13.5f, 24.5f)
                reflectiveQuadTo(765f, 600f)
                horizontalLineTo(604f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(127f)
                quadToRelative(5f, -30f, 8.5f, -60f)
                reflectiveQuadToRelative(8.5f, -60f)
                horizontalLineTo(212f)
                quadToRelative(5f, 30f, 8.5f, 60f)
                reflectiveQuadToRelative(8.5f, 60f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(80f)
                horizontalLineTo(195f)
                quadToRelative(-15f, 0f, -26.5f, -9.5f)
                reflectiveQuadTo(155f, 566f)
                lineToRelative(-28f, -200f)
                quadToRelative(-2f, -18f, 9.5f, -32f)
                reflectiveQuadToRelative(29.5f, -14f)
                horizontalLineToRelative(74f)
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
                moveToRelative(213f, 80f)
                horizontalLineTo(356f)
                quadToRelative(-16f, 0f, -26.5f, -10f)
                reflectiveQuadTo(317f, 804f)
                lineToRelative(-27f, -276f)
                quadToRelative(-4f, -35f, 20f, -61.5f)
                reflectiveQuadToRelative(59f, -26.5f)
                horizontalLineToRelative(222f)
                quadToRelative(35f, 0f, 59f, 26.5f)
                reflectiveQuadToRelative(20f, 61.5f)
                lineToRelative(-27f, 276f)
                quadToRelative(-2f, 16f, -12.5f, 26f)
                reflectiveQuadTo(604f, 840f)
                close()
            }
        }.build()
        
        return _Podium!!
    }

private var _Podium: ImageVector? = null

