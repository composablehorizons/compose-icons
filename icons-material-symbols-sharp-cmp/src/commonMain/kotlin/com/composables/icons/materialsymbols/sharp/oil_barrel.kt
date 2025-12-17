package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Oil_barrel: ImageVector
    get() {
        if (_Oil_barrel != null) return _Oil_barrel!!
        
        _Oil_barrel = ImageVector.Builder(
            name = "oil_barrel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(200f, -120f)
                quadToRelative(50f, 0f, 85f, -34.5f)
                reflectiveQuadToRelative(35f, -83.5f)
                quadToRelative(0f, -39f, -22.5f, -67f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(-75f, 86f, -97.5f, 114.5f)
                reflectiveQuadTo(360f, 522f)
                quadToRelative(0f, 49f, 35f, 83.5f)
                reflectiveQuadToRelative(85f, 34.5f)
                close()
                moveTo(280f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Oil_barrel!!
    }

private var _Oil_barrel: ImageVector? = null

