package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mouse_lock: ImageVector
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
                moveTo(600f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(40f)
                close()
                moveTo(480f, 440f)
                close()
                moveToRelative(0f, 440f)
                quadToRelative(-116f, 0f, -198f, -82f)
                reflectiveQuadToRelative(-82f, -198f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -116f, 82f, -198f)
                reflectiveQuadToRelative(198f, -82f)
                quadToRelative(116f, 0f, 198f, 82f)
                reflectiveQuadToRelative(82f, 198f)
                verticalLineToRelative(124f)
                quadToRelative(-20f, -4f, -40f, -4f)
                reflectiveQuadToRelative(-40f, 4f)
                verticalLineToRelative(-44f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(11f, 0f, 20.5f, -1f)
                reflectiveQuadToRelative(19.5f, -3f)
                verticalLineToRelative(81f)
                quadToRelative(-10f, 2f, -19.5f, 2.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(280f, 360f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-196f)
                quadToRelative(-69f, 14f, -114.5f, 69f)
                reflectiveQuadTo(280f, 360f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -72f, -45.5f, -127f)
                reflectiveQuadTo(520f, 164f)
                verticalLineToRelative(196f)
                close()
                moveToRelative(-40f, 80f)
                close()
                moveToRelative(40f, -80f)
                close()
                moveToRelative(-80f, 0f)
                close()
            }
        }.build()
        
        return _Mouse_lock!!
    }

private var _Mouse_lock: ImageVector? = null

