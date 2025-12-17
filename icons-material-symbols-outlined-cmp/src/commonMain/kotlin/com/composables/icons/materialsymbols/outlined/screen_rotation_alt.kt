package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Screen_rotation_alt: ImageVector
    get() {
        if (_Screen_rotation_alt != null) return _Screen_rotation_alt!!
        
        _Screen_rotation_alt = ImageVector.Builder(
            name = "screen_rotation_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(487f, 856f)
                lineTo(150f, 520f)
                horizontalLineToRelative(114f)
                lineToRelative(280f, 280f)
                lineToRelative(200f, -200f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                lineTo(600f, 856f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(487f, 856f)
                close()
                moveTo(80f, 440f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(104f)
                lineToRelative(200f, -200f)
                quadToRelative(23f, -23f, 56.5f, -23f)
                reflectiveQuadToRelative(56.5f, 23f)
                lineToRelative(337f, 336f)
                horizontalLineTo(696f)
                lineTo(416f, 160f)
                lineTo(216f, 360f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Screen_rotation_alt!!
    }

private var _Screen_rotation_alt: ImageVector? = null

