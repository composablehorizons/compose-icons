package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Trackpad_input: ImageVector
    get() {
        if (_Trackpad_input != null) return _Trackpad_input!!
        
        _Trackpad_input = ImageVector.Builder(
            name = "trackpad_input",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(593f, 880f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineTo(304f, 640f)
                lineToRelative(64f, -66f)
                lineToRelative(112f, 33f)
                verticalLineToRelative(-327f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(433f)
                lineToRelative(-98f, -28f)
                lineToRelative(103f, 103f)
                quadToRelative(6f, 6f, 13f, 9f)
                reflectiveQuadToRelative(15f, 3f)
                horizontalLineToRelative(167f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(593f)
                close()
                moveToRelative(7f, -280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 200f)
                horizontalLineTo(565f)
                horizontalLineToRelative(195f)
                close()
                moveTo(80f, 760f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(760f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(72f)
                lineToRelative(79f, 80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Trackpad_input!!
    }

private var _Trackpad_input: ImageVector? = null

