package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mouse_lock_off: ImageVector
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
                moveTo(600f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(40f)
                horizontalLineTo(600f)
                close()
                moveToRelative(219f, 52f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(-19f, -240f)
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
                moveTo(520f, 360f)
                verticalLineToRelative(-277f)
                quadToRelative(104f, 15f, 172f, 93.5f)
                reflectiveQuadTo(760f, 360f)
                horizontalLineTo(520f)
                close()
                moveToRelative(98f, 148f)
                lineToRelative(-67f, -68f)
                horizontalLineToRelative(209f)
                verticalLineToRelative(44f)
                quadToRelative(-10f, -2f, -19.5f, -3f)
                reflectiveQuadToRelative(-20.5f, -1f)
                quadToRelative(-28f, 0f, -53.5f, 7f)
                reflectiveQuadTo(618f, 508f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(240f)
                lineToRelative(120f, 120f)
                quadToRelative(-19f, 25f, -29.5f, 55.5f)
                reflectiveQuadTo(520f, 680f)
                verticalLineToRelative(197f)
                quadToRelative(-10f, 2f, -19.5f, 2.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-40f, -552f)
                lineTo(279f, 165f)
                quadToRelative(32f, -32f, 72.5f, -53.5f)
                reflectiveQuadTo(440f, 83f)
                verticalLineToRelative(245f)
                close()
                moveToRelative(-240f, 32f)
                quadToRelative(0f, -35f, 8f, -67.5f)
                reflectiveQuadToRelative(23f, -61.5f)
                lineToRelative(129f, 129f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Mouse_lock_off!!
    }

private var _Mouse_lock_off: ImageVector? = null

