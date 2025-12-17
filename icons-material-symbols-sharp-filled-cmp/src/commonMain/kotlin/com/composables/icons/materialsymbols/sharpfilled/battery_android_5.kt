package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_android_5: ImageVector
    get() {
        if (_Battery_android_5 != null) return _Battery_android_5!!
        
        _Battery_android_5 = ImageVector.Builder(
            name = "battery_android_5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 670f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-380f)
                horizontalLineTo(560f)
                verticalLineToRelative(380f)
                close()
                moveTo(80f, 750f)
                verticalLineToRelative(-540f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(170f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Battery_android_5!!
    }

private var _Battery_android_5: ImageVector? = null

