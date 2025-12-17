package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Podium: ImageVector
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
                horizontalLineToRelative(-72f)
                lineToRelative(7f, -69f)
                quadToRelative(5f, -49f, -27.5f, -85f)
                reflectiveQuadTo(591f, 410f)
                horizontalLineTo(369f)
                quadToRelative(-49f, 0f, -81.5f, 36f)
                reflectiveQuadTo(260f, 531f)
                lineToRelative(7f, 69f)
                horizontalLineToRelative(-72f)
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
                moveTo(384f, 810f)
                horizontalLineToRelative(192f)
                quadToRelative(16f, 0f, 27f, -10f)
                reflectiveQuadToRelative(13f, -26f)
                lineToRelative(24f, -249f)
                quadToRelative(2f, -22f, -12f, -38.5f)
                reflectiveQuadTo(591f, 470f)
                horizontalLineTo(369f)
                quadToRelative(-23f, 0f, -37f, 16.5f)
                reflectiveQuadTo(320f, 525f)
                lineToRelative(24f, 249f)
                quadToRelative(2f, 16f, 13f, 26f)
                reflectiveQuadToRelative(27f, 10f)
                close()
            }
        }.build()
        
        return _Podium!!
    }

private var _Podium: ImageVector? = null

