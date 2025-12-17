package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Prescriptions: ImageVector
    get() {
        if (_Prescriptions != null) return _Prescriptions!!
        
        _Prescriptions = ImageVector.Builder(
            name = "prescriptions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(678f, 826f)
                lineToRelative(46f, -46f)
                lineToRelative(-64f, -64f)
                lineToRelative(-46f, 46f)
                quadToRelative(-14f, 14f, -14f, 32f)
                reflectiveQuadToRelative(14f, 32f)
                quadToRelative(14f, 14f, 32f, 14f)
                reflectiveQuadToRelative(32f, -14f)
                close()
                moveToRelative(102f, -102f)
                lineToRelative(46f, -46f)
                quadToRelative(14f, -14f, 14f, -32f)
                reflectiveQuadToRelative(-14f, -32f)
                quadToRelative(-14f, -14f, -32f, -14f)
                reflectiveQuadToRelative(-32f, 14f)
                lineToRelative(-46f, 46f)
                lineToRelative(64f, 64f)
                close()
                moveTo(735f, 883f)
                quadToRelative(-37f, 37f, -89f, 37f)
                reflectiveQuadToRelative(-89f, -37f)
                quadToRelative(-37f, -37f, -37f, -89f)
                reflectiveQuadToRelative(37f, -89f)
                lineToRelative(148f, -148f)
                quadToRelative(37f, -37f, 89f, -37f)
                reflectiveQuadToRelative(89f, 37f)
                quadToRelative(37f, 37f, 37f, 89f)
                reflectiveQuadToRelative(-37f, 89f)
                lineTo(735f, 883f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(168f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                quadToRelative(38f, 0f, 68.5f, 22f)
                reflectiveQuadToRelative(43.5f, 58f)
                horizontalLineToRelative(168f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(245f)
                quadToRelative(-20f, -5f, -40f, -5f)
                reflectiveQuadToRelative(-40f, 3f)
                verticalLineToRelative(-243f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(243f)
                quadToRelative(-3f, 20f, -3f, 40f)
                reflectiveQuadToRelative(5f, 40f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -670f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 140f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 110f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 140f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 170f)
                close()
                moveTo(280f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(34f)
                quadToRelative(-8f, 5f, -15.5f, 11.5f)
                reflectiveQuadTo(649f, 500f)
                lineToRelative(-20f, 20f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(269f)
                lineToRelative(-49f, 49f)
                quadToRelative(-8f, 8f, -14.5f, 15.5f)
                reflectiveQuadTo(474f, 680f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Prescriptions!!
    }

private var _Prescriptions: ImageVector? = null

