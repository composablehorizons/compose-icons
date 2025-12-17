package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Devices_off: ImageVector
    get() {
        if (_Devices_off != null) return _Devices_off!!
        
        _Devices_off = ImageVector.Builder(
            name = "devices_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(354f, 240f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(566f)
                verticalLineToRelative(80f)
                horizontalLineTo(354f)
                close()
                moveToRelative(526f, 520f)
                lineTo(560f, 446f)
                verticalLineToRelative(-86f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 320f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(400f)
                close()
                moveTo(792f, 904f)
                lineTo(688f, 800f)
                horizontalLineToRelative(-88f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 760f)
                verticalLineToRelative(-88f)
                lineTo(240f, 352f)
                verticalLineToRelative(328f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-408f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Devices_off!!
    }

private var _Devices_off: ImageVector? = null

