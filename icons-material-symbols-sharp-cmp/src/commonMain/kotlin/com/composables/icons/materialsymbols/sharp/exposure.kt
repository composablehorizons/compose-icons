package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Exposure: ImageVector
    get() {
        if (_Exposure != null) return _Exposure!!
        
        _Exposure = ImageVector.Builder(
            name = "exposure",
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
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                lineTo(200f, 760f)
                close()
                moveToRelative(380f, -40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(240f, 340f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Exposure!!
    }

private var _Exposure: ImageVector? = null

