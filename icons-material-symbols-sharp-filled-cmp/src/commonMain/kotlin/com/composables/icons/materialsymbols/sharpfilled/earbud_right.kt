package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Earbud_right: ImageVector
    get() {
        if (_Earbud_right != null) return _Earbud_right!!
        
        _Earbud_right = ImageVector.Builder(
            name = "earbud_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(320f)
                horizontalLineTo(720f)
                verticalLineToRelative(400f)
                horizontalLineTo(480f)
                close()
                moveTo(360f, 560f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Earbud_right!!
    }

private var _Earbud_right: ImageVector? = null

