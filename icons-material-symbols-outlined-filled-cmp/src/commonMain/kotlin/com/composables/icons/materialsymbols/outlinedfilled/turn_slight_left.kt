package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Turn_slight_left: ImageVector
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
                lineToRelative(201f, 201f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(303f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Turn_slight_left!!
    }

private var _Turn_slight_left: ImageVector? = null

