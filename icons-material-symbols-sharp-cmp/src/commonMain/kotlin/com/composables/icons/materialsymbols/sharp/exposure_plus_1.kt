package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Exposure_plus_1: ImageVector
    get() {
        if (_Exposure_plus_1 != null) return _Exposure_plus_1!!
        
        _Exposure_plus_1 = ImageVector.Builder(
            name = "exposure_plus_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 680f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(390f, 80f)
                verticalLineToRelative(-438f)
                lineToRelative(-92f, 66f)
                lineToRelative(-46f, -70f)
                lineToRelative(164f, -118f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-90f)
                close()
            }
        }.build()
        
        return _Exposure_plus_1!!
    }

private var _Exposure_plus_1: ImageVector? = null

