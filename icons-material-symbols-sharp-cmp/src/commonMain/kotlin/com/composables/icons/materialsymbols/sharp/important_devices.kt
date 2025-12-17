package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Important_devices: ImageVector
    get() {
        if (_Important_devices != null) return _Important_devices!!
        
        _Important_devices = ImageVector.Builder(
            name = "important_devices",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 840f)
                verticalLineToRelative(-398f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(398f)
                horizontalLineTo(640f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-238f)
                horizontalLineTo(680f)
                verticalLineToRelative(238f)
                close()
                moveToRelative(-360f, 80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(242f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-162f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(28f, -290f)
                lineToRelative(92f, -70f)
                lineToRelative(92f, 70f)
                lineToRelative(-34f, -114f)
                lineToRelative(92f, -74f)
                horizontalLineTo(476f)
                lineToRelative(-36f, -112f)
                lineToRelative(-36f, 112f)
                horizontalLineTo(290f)
                lineToRelative(92f, 74f)
                lineToRelative(-34f, 114f)
                close()
                moveToRelative(92f, -150f)
                close()
            }
        }.build()
        
        return _Important_devices!!
    }

private var _Important_devices: ImageVector? = null

