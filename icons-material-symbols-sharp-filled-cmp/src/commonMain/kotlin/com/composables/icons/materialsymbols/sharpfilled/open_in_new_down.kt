package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Open_in_new_down: ImageVector
    get() {
        if (_Open_in_new_down != null) return _Open_in_new_down!!
        
        _Open_in_new_down = ImageVector.Builder(
            name = "open_in_new_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-280f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(144f)
                lineTo(332f, 388f)
                lineToRelative(56f, -56f)
                lineToRelative(372f, 371f)
                verticalLineToRelative(-143f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Open_in_new_down!!
    }

private var _Open_in_new_down: ImageVector? = null

