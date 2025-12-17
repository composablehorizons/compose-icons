package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Trackpad_input_3: ImageVector
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
                moveTo(543f, 880f)
                lineTo(304f, 640f)
                lineToRelative(64f, -66f)
                lineToRelative(112f, 33f)
                verticalLineToRelative(-327f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(543f)
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

