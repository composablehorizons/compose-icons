package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Turn_slight_left: ImageVector
    get() {
        if (_Turn_slight_left != null) return _Turn_slight_left!!
        
        _Turn_slight_left = ImageVector.Builder(
            name = "turn_slight_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 800f)
                verticalLineToRelative(-304f)
                lineTo(320f, 296f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-226f)
                horizontalLineToRelative(226f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-90f)
                lineToRelative(224f, 224f)
                verticalLineToRelative(336f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Turn_slight_left!!
    }

private var _Turn_slight_left: ImageVector? = null

