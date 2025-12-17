package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Simulation: ImageVector
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
                moveTo(320f, 680f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -44f, 44f, -70.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(72f, 0f, 116f, 26.5f)
                reflectiveQuadToRelative(44f, 70.5f)
                verticalLineToRelative(23f)
                horizontalLineTo(320f)
                close()
                moveToRelative(160f, -160f)
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
                moveTo(280f, 806f)
                quadToRelative(-115f, -14f, -177.5f, -47f)
                reflectiveQuadTo(40f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -57f, 113.5f, -88f)
                reflectiveQuadTo(480f, 161f)
                quadToRelative(213f, 0f, 326.5f, 31f)
                reflectiveQuadTo(920f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 46f, -62.5f, 79f)
                reflectiveQuadTo(680f, 806f)
                verticalLineToRelative(-480f)
                quadToRelative(51f, -8f, 90.5f, -19.5f)
                reflectiveQuadTo(827f, 284f)
                quadToRelative(-43f, -17f, -147f, -30.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-96f, 0f, -200f, 13.5f)
                reflectiveQuadTo(133f, 284f)
                quadToRelative(17f, 12f, 56.5f, 23f)
                reflectiveQuadToRelative(90.5f, 19f)
                verticalLineToRelative(480f)
                close()
                moveTo(120f, 368f)
                verticalLineToRelative(343f)
                verticalLineToRelative(-343f)
                close()
                moveToRelative(720f, -1f)
                verticalLineToRelative(344f)
                verticalLineToRelative(-344f)
                close()
            }
        }.build()
        
        return _Simulation!!
    }

private var _Simulation: ImageVector? = null

