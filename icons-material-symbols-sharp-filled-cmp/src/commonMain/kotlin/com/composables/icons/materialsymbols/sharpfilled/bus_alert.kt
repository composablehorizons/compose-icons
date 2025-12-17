package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bus_alert: ImageVector
    get() {
        if (_Bus_alert != null) return _Bus_alert!!
        
        _Bus_alert = ImageVector.Builder(
            name = "bus_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 480f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(0f, -82f, 58f, -141f)
                reflectiveQuadToRelative(142f, -59f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveToRelative(-20f, -160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(20f, 80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveTo(260f, 680f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 680f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(600f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(540f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(540f, 680f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-122f)
                quadToRelative(-20f, -21f, -30f, -46.5f)
                reflectiveQuadTo(80f, 660f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -89f, 82.5f, -124.5f)
                reflectiveQuadTo(451f, 120f)
                quadToRelative(-24f, 34f, -37.5f, 74.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(0f, 11f, 0.5f, 20.5f)
                reflectiveQuadTo(403f, 320f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(291f)
                quadToRelative(38f, 54f, 97.5f, 87f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(11f, 0f, 20.5f, -0.5f)
                reflectiveQuadTo(720f, 557f)
                verticalLineToRelative(103f)
                quadToRelative(0f, 26f, -10f, 51.5f)
                reflectiveQuadTo(680f, 758f)
                verticalLineToRelative(122f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Bus_alert!!
    }

private var _Bus_alert: ImageVector? = null

