package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cleaning_services: ImageVector
    get() {
        if (_Cleaning_services != null) return _Cleaning_services!!
        
        _Cleaning_services = ImageVector.Builder(
            name = "cleaning_services",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(480f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(320f, -400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Cleaning_services!!
    }

private var _Cleaning_services: ImageVector? = null

