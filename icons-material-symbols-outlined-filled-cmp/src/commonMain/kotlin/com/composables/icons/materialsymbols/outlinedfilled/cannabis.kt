package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cannabis: ImageVector
    get() {
        if (_Cannabis != null) return _Cannabis!!
        
        _Cannabis = ImageVector.Builder(
            name = "cannabis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-167f)
                quadToRelative(-42f, 27f, -86.5f, 47f)
                reflectiveQuadTo(260f, 780f)
                quadToRelative(-63f, 0f, -118.5f, -28.5f)
                reflectiveQuadTo(40f, 680f)
                quadToRelative(37f, -34f, 79.5f, -59.5f)
                reflectiveQuadTo(211f, 585f)
                quadToRelative(-68f, -55f, -100f, -136f)
                reflectiveQuadTo(79f, 280f)
                quadToRelative(72f, 1f, 139f, 23f)
                reflectiveQuadToRelative(122f, 65f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -91f, 40.5f, -171f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(58f, 69f, 99f, 149f)
                reflectiveQuadToRelative(41f, 171f)
                quadToRelative(0f, 2f, -0.5f, 4f)
                reflectiveQuadToRelative(-0.5f, 4f)
                quadToRelative(56f, -43f, 123f, -64.5f)
                reflectiveQuadTo(881f, 280f)
                quadToRelative(0f, 88f, -32.5f, 169f)
                reflectiveQuadTo(748f, 585f)
                quadToRelative(49f, 10f, 91.5f, 35.5f)
                reflectiveQuadTo(919f, 680f)
                quadToRelative(-46f, 43f, -101f, 71.5f)
                reflectiveQuadTo(700f, 780f)
                quadToRelative(-50f, 0f, -94.5f, -20f)
                reflectiveQuadTo(520f, 713f)
                verticalLineToRelative(167f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Cannabis!!
    }

private var _Cannabis: ImageVector? = null

