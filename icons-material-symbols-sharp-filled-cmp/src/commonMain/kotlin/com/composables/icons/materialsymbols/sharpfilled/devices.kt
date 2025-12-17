package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Devices: ImageVector
    get() {
        if (_Devices != null) return _Devices!!
        
        _Devices = ImageVector.Builder(
            name = "devices",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(480f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Devices!!
    }

private var _Devices: ImageVector? = null

