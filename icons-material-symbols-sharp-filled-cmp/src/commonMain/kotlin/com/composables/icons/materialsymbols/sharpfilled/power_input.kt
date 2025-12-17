package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Power_input: ImageVector
    get() {
        if (_Power_input != null) return _Power_input!!
        
        _Power_input = ImageVector.Builder(
            name = "power_input",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(760f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Power_input!!
    }

private var _Power_input: ImageVector? = null

