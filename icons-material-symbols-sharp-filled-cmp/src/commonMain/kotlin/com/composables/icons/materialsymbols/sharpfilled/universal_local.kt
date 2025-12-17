package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Universal_local: ImageVector
    get() {
        if (_Universal_local != null) return _Universal_local!!
        
        _Universal_local = ImageVector.Builder(
            name = "universal_local",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(81f, -69f, 120.5f, -127.5f)
                reflectiveQuadTo(640f, 444f)
                quadToRelative(0f, -75f, -48.5f, -119.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-63f, 0f, -111.5f, 44.5f)
                reflectiveQuadTo(320f, 444f)
                quadToRelative(0f, 50f, 39.5f, 108.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Universal_local!!
    }

private var _Universal_local: ImageVector? = null

