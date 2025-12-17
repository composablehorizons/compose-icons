package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Trackpad_input_3: ImageVector
    get() {
        if (_Trackpad_input_3 != null) return _Trackpad_input_3!!
        
        _Trackpad_input_3 = ImageVector.Builder(
            name = "trackpad_input_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 880f)
                horizontalLineTo(543f)
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
                close()
                moveTo(600f, 600f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 200f)
                horizontalLineTo(565f)
                horizontalLineToRelative(195f)
                close()
                moveTo(80f, 760f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(760f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(72f)
                lineToRelative(79f, 80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Trackpad_input_3!!
    }

private var _Trackpad_input_3: ImageVector? = null

