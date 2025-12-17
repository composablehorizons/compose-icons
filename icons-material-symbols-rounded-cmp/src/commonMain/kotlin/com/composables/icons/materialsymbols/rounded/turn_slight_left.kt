package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Turn_slight_left: ImageVector
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
                moveTo(560f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 760f)
                verticalLineToRelative(-264f)
                lineTo(320f, 296f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 386f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 346f)
                verticalLineToRelative(-146f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 160f)
                horizontalLineToRelative(146f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(466f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(426f, 240f)
                horizontalLineToRelative(-50f)
                lineToRelative(201f, 201f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(263f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 800f)
                close()
            }
        }.build()
        
        return _Turn_slight_left!!
    }

private var _Turn_slight_left: ImageVector? = null

