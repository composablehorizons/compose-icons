package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Earbud_left: ImageVector
    get() {
        if (_Earbud_left != null) return _Earbud_left!!
        
        _Earbud_left = ImageVector.Builder(
            name = "earbud_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                verticalLineToRelative(-400f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(720f)
                horizontalLineTo(240f)
                close()
                moveToRelative(320f, -320f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(40f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Earbud_left!!
    }

private var _Earbud_left: ImageVector? = null

