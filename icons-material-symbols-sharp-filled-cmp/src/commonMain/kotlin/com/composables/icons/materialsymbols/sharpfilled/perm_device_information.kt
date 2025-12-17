package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Perm_device_information: ImageVector
    get() {
        if (_Perm_device_information != null) return _Perm_device_information!!
        
        _Perm_device_information = ImageVector.Builder(
            name = "perm_device_information",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 660f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(220f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -300f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 360f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Perm_device_information!!
    }

private var _Perm_device_information: ImageVector? = null

