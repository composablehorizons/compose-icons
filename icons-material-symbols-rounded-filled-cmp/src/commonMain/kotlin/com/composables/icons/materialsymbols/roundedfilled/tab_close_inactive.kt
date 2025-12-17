package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tab_close_inactive: ImageVector
    get() {
        if (_Tab_close_inactive != null) return _Tab_close_inactive!!
        
        _Tab_close_inactive = ImageVector.Builder(
            name = "tab_close_inactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 800f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                close()
                moveToRelative(-240f, 0f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveTo(120f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 240f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 480f)
                close()
                moveToRelative(40f, 400f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 880f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(320f)
                close()
                moveToRelative(184f, -208f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, -56f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-56f, 56f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 56f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                close()
            }
        }.build()
        
        return _Tab_close_inactive!!
    }

private var _Tab_close_inactive: ImageVector? = null

