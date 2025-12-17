package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Trackpad_input: ImageVector
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
                moveTo(760f, 880f)
                horizontalLineTo(593f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineTo(304f, 640f)
                lineToRelative(64f, -66f)
                lineToRelative(112f, 33f)
                verticalLineToRelative(-327f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 880f)
                close()
            }
        }.build()
        
        return _Trackpad_input!!
    }

private var _Trackpad_input: ImageVector? = null

