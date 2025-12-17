package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Simulation: ImageVector
    get() {
        if (_Simulation != null) return _Simulation!!
        
        _Simulation = ImageVector.Builder(
            name = "simulation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveTo(120f, 368f)
                verticalLineToRelative(306f)
                quadToRelative(14f, 13f, 34f, 22.5f)
                reflectiveQuadToRelative(46f, 14.5f)
                verticalLineToRelative(-317f)
                quadToRelative(-22f, -5f, -42.5f, -11.5f)
                reflectiveQuadTo(120f, 368f)
                close()
                moveToRelative(720f, -1f)
                quadToRelative(-17f, 8f, -37f, 14.5f)
                reflectiveQuadTo(760f, 393f)
                verticalLineToRelative(318f)
                quadToRelative(26f, -5f, 46f, -14.5f)
                reflectiveQuadToRelative(34f, -22.5f)
                verticalLineToRelative(-307f)
                close()
                moveTo(40f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -57f, 113.5f, -88f)
                reflectiveQuadTo(480f, 161f)
                quadToRelative(213f, 0f, 326.5f, 31f)
                reflectiveQuadTo(920f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 39f, -45f, 69f)
                reflectiveQuadToRelative(-129f, 47f)
                quadToRelative(-26f, 5f, -46f, -12.5f)
                reflectiveQuadTo(680f, 740f)
                verticalLineToRelative(-354f)
                quadToRelative(0f, -26f, 17f, -46.5f)
                reflectiveQuadToRelative(43f, -25.5f)
                quadToRelative(31f, -7f, 53.5f, -14.5f)
                reflectiveQuadTo(827f, 284f)
                quadToRelative(-43f, -17f, -147f, -30.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-96f, 0f, -200f, 13.5f)
                reflectiveQuadTo(133f, 284f)
                quadToRelative(11f, 8f, 33.5f, 16f)
                reflectiveQuadToRelative(53.5f, 15f)
                quadToRelative(26f, 6f, 43f, 25.5f)
                reflectiveQuadToRelative(17f, 45.5f)
                verticalLineToRelative(354f)
                quadToRelative(0f, 26f, -20f, 43.5f)
                reflectiveQuadTo(214f, 796f)
                quadToRelative(-84f, -17f, -129f, -47f)
                reflectiveQuadToRelative(-45f, -69f)
                close()
                moveToRelative(80f, -312f)
                verticalLineToRelative(343f)
                verticalLineToRelative(-343f)
                close()
                moveToRelative(720f, -1f)
                verticalLineToRelative(344f)
                verticalLineToRelative(-344f)
                close()
                moveTo(480f, 560f)
                quadToRelative(72f, 0f, 116f, 26.5f)
                reflectiveQuadToRelative(44f, 70.5f)
                quadToRelative(0f, 10f, -6.5f, 16.5f)
                reflectiveQuadTo(617f, 680f)
                horizontalLineTo(343f)
                quadToRelative(-10f, 0f, -16.5f, -6.5f)
                reflectiveQuadTo(320f, 657f)
                quadToRelative(0f, -44f, 44f, -70.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Simulation!!
    }

private var _Simulation: ImageVector? = null

