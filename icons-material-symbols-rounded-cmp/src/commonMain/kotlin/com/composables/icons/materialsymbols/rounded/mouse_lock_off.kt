package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mouse_lock_off: ImageVector
    get() {
        if (_Mouse_lock_off != null) return _Mouse_lock_off!!
        
        _Mouse_lock_off = ImageVector.Builder(
            name = "mouse_lock_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 328f)
                close()
                moveToRelative(111f, 112f)
                close()
                moveToRelative(-131f, 93f)
                close()
                moveToRelative(20f, -93f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(80f, -80f)
                close()
                moveToRelative(-40f, -280f)
                quadToRelative(116f, 0f, 198f, 82f)
                reflectiveQuadToRelative(82f, 198f)
                verticalLineToRelative(124f)
                quadToRelative(-20f, -4f, -40f, -4f)
                reflectiveQuadToRelative(-40f, 4f)
                verticalLineToRelative(-44f)
                horizontalLineTo(551f)
                lineTo(440f, 328f)
                verticalLineToRelative(-164f)
                quadToRelative(-31f, 6f, -57.5f, 21f)
                reflectiveQuadTo(335f, 222f)
                lineToRelative(-56f, -57f)
                quadToRelative(38f, -39f, 90f, -62f)
                reflectiveQuadToRelative(111f, -23f)
                close()
                moveTo(231f, 232f)
                lineToRelative(209f, 208f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(11f, 0f, 20.5f, -1f)
                reflectiveQuadToRelative(19.5f, -3f)
                verticalLineToRelative(81f)
                quadToRelative(-10f, 2f, -19.5f, 2.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-116f, 0f, -198f, -82f)
                reflectiveQuadToRelative(-82f, -198f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -35f, 8f, -67f)
                reflectiveQuadToRelative(23f, -61f)
                close()
                moveToRelative(289f, 128f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -72f, -45.5f, -127f)
                reflectiveQuadTo(520f, 164f)
                verticalLineToRelative(196f)
                close()
                moveTo(791f, 904f)
                lineTo(56f, 169f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveTo(634f, 880f)
                quadToRelative(-14f, 0f, -24f, -10f)
                reflectiveQuadToRelative(-10f, -24f)
                verticalLineToRelative(-126f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 680f)
                horizontalLineToRelative(40f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 14f, -10f, 24f)
                reflectiveQuadToRelative(-24f, 10f)
                horizontalLineTo(634f)
                close()
                moveToRelative(166f, -188f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-12f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                horizontalLineToRelative(-5f)
                quadToRelative(-3f, 0f, -5f, 1f)
                lineToRelative(-30f, -30f)
                quadToRelative(9f, -5f, 19f, -8f)
                reflectiveQuadToRelative(21f, -3f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(52f)
                close()
            }
        }.build()
        
        return _Mouse_lock_off!!
    }

private var _Mouse_lock_off: ImageVector? = null

