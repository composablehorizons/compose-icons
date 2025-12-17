package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Saved_search: ImageVector
    get() {
        if (_Saved_search != null) return _Saved_search!!
        
        _Saved_search = ImageVector.Builder(
            name = "saved_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(784f, 840f)
                lineTo(532f, 588f)
                quadToRelative(-30f, 24f, -69f, 38f)
                reflectiveQuadToRelative(-83f, 14f)
                quadToRelative(-109f, 0f, -184.5f, -75.5f)
                reflectiveQuadTo(120f, 380f)
                quadToRelative(0f, -109f, 75.5f, -184.5f)
                reflectiveQuadTo(380f, 120f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(640f, 380f)
                quadToRelative(0f, 44f, -14f, 83f)
                reflectiveQuadToRelative(-38f, 69f)
                lineToRelative(252f, 252f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(380f, 560f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(560f, 380f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(380f, 200f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(200f, 380f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(380f, 560f)
                close()
                moveToRelative(-80f, -60f)
                lineToRelative(30f, -98f)
                lineToRelative(-80f, -64f)
                horizontalLineToRelative(98f)
                lineToRelative(32f, -98f)
                lineToRelative(32f, 98f)
                horizontalLineToRelative(98f)
                lineToRelative(-80f, 64f)
                lineToRelative(30f, 98f)
                lineToRelative(-80f, -62f)
                lineToRelative(-80f, 62f)
                close()
            }
        }.build()
        
        return _Saved_search!!
    }

private var _Saved_search: ImageVector? = null

