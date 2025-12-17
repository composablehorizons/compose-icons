package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_share_stack: ImageVector
    get() {
        if (_Mobile_share_stack != null) return _Mobile_share_stack!!
        
        _Mobile_share_stack = ImageVector.Builder(
            name = "mobile_share_stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 840f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(560f, -800f)
                verticalLineToRelative(82f)
                quadToRelative(17f, 3f, 28.5f, 16.5f)
                reflectiveQuadTo(840f, 249f)
                verticalLineToRelative(62f)
                quadToRelative(0f, 17f, -11.5f, 30.5f)
                reflectiveQuadTo(800f, 358f)
                verticalLineToRelative(322f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 760f)
                horizontalLineTo(400f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 680f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 40f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 120f)
                close()
                moveTo(440f, 480f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(66f)
                lineToRelative(-28f, 28f)
                lineToRelative(42f, 42f)
                lineToRelative(100f, -100f)
                lineToRelative(-100f, -100f)
                lineToRelative(-42f, 42f)
                lineToRelative(28f, 28f)
                horizontalLineToRelative(-86f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 390f)
                verticalLineToRelative(90f)
                close()
            }
        }.build()
        
        return _Mobile_share_stack!!
    }

private var _Mobile_share_stack: ImageVector? = null

