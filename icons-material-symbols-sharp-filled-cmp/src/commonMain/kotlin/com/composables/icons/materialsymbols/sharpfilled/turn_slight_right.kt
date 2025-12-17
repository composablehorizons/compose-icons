package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Turn_slight_right: ImageVector
    get() {
        if (_Turn_slight_right != null) return _Turn_slight_right!!
        
        _Turn_slight_right = ImageVector.Builder(
            name = "turn_slight_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                verticalLineToRelative(-336f)
                lineToRelative(224f, -224f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(226f)
                verticalLineToRelative(226f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-90f)
                lineTo(440f, 496f)
                verticalLineToRelative(304f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Turn_slight_right!!
    }

private var _Turn_slight_right: ImageVector? = null

