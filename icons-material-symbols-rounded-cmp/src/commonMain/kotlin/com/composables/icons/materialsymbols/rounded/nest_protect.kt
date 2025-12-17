package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nest_protect: ImageVector
    get() {
        if (_Nest_protect != null) return _Nest_protect!!
        
        _Nest_protect = ImageVector.Builder(
            name = "nest_protect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                quadToRelative(-84f, 0f, -142f, -58f)
                reflectiveQuadToRelative(-58f, -142f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -84f, 58f, -142f)
                reflectiveQuadToRelative(142f, -58f)
                horizontalLineToRelative(320f)
                quadToRelative(84f, 0f, 142f, 58f)
                reflectiveQuadToRelative(58f, 142f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 84f, -58f, 142f)
                reflectiveQuadToRelative(-142f, 58f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                quadToRelative(51f, 0f, 85.5f, -34.5f)
                reflectiveQuadTo(760f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -51f, -34.5f, -85.5f)
                reflectiveQuadTo(640f, 200f)
                horizontalLineTo(320f)
                quadToRelative(-51f, 0f, -85.5f, 34.5f)
                reflectiveQuadTo(200f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 51f, 34.5f, 85.5f)
                reflectiveQuadTo(320f, 760f)
                close()
                moveToRelative(160f, -80f)
                quadToRelative(-84f, 0f, -142f, -58f)
                reflectiveQuadToRelative(-58f, -142f)
                quadToRelative(0f, -84f, 58f, -142f)
                reflectiveQuadToRelative(142f, -58f)
                quadToRelative(84f, 0f, 142f, 58f)
                reflectiveQuadToRelative(58f, 142f)
                quadToRelative(0f, 84f, -58f, 142f)
                reflectiveQuadToRelative(-142f, 58f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(51f, 0f, 85.5f, -34.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -51f, -34.5f, -85.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-51f, 0f, -85.5f, 34.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 51f, 34.5f, 85.5f)
                reflectiveQuadTo(480f, 600f)
                close()
            }
        }.build()
        
        return _Nest_protect!!
    }

private var _Nest_protect: ImageVector? = null

