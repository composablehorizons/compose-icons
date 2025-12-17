package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Edgesensor_low: ImageVector
    get() {
        if (_Edgesensor_low != null) return _Edgesensor_low!!
        
        _Edgesensor_low = ImageVector.Builder(
            name = "edgesensor_low",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 560f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, 120f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(800f)
                horizontalLineTo(240f)
                close()
                moveToRelative(400f, -120f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                close()
                moveTo(320f, 200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 560f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-400f)
                horizontalLineTo(320f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Edgesensor_low!!
    }

private var _Edgesensor_low: ImageVector? = null

