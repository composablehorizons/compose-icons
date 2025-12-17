package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Turn_slight_right: ImageVector
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
                moveTo(400f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 760f)
                verticalLineToRelative(-263f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(201f, -201f)
                horizontalLineToRelative(-50f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(494f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(534f, 160f)
                horizontalLineToRelative(146f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 200f)
                verticalLineToRelative(146f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 386f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 346f)
                verticalLineToRelative(-50f)
                lineTo(440f, 496f)
                verticalLineToRelative(264f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 800f)
                close()
            }
        }.build()
        
        return _Turn_slight_right!!
    }

private var _Turn_slight_right: ImageVector? = null

