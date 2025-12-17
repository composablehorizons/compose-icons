package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mouse_lock: ImageVector
    get() {
        if (_Mouse_lock != null) return _Mouse_lock!!
        
        _Mouse_lock = ImageVector.Builder(
            name = "mouse_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(634f, 880f)
                quadToRelative(-14f, 0f, -24f, -10f)
                reflectiveQuadToRelative(-10f, -24f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -14f, 10f, -24f)
                reflectiveQuadToRelative(24f, -10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(6f)
                quadToRelative(14f, 0f, 24f, 10f)
                reflectiveQuadToRelative(10f, 24f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 14f, -10f, 24f)
                reflectiveQuadToRelative(-24f, 10f)
                horizontalLineTo(634f)
                close()
                moveToRelative(46f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(40f)
                close()
                moveTo(200f, 360f)
                quadToRelative(0f, -105f, 68f, -183.5f)
                reflectiveQuadTo(440f, 83f)
                verticalLineToRelative(277f)
                horizontalLineTo(200f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-277f)
                quadToRelative(104f, 15f, 172f, 93.5f)
                reflectiveQuadTo(760f, 360f)
                horizontalLineTo(520f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(44f)
                quadToRelative(-10f, -2f, -19.5f, -3f)
                reflectiveQuadToRelative(-20.5f, -1f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(520f, 680f)
                verticalLineToRelative(197f)
                quadToRelative(-10f, 2f, -19.5f, 2.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Mouse_lock!!
    }

private var _Mouse_lock: ImageVector? = null

