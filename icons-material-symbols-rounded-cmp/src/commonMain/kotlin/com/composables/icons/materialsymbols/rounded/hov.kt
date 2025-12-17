package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hov: ImageVector
    get() {
        if (_Hov != null) return _Hov!!
        
        _Hov = ImageVector.Builder(
            name = "hov",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 842f)
                quadToRelative(-10f, 0f, -19f, -4.5f)
                reflectiveQuadTo(446f, 823f)
                lineTo(265f, 521f)
                quadToRelative(-6f, -10f, -9f, -20f)
                reflectiveQuadToRelative(-3f, -21f)
                quadToRelative(0f, -11f, 3f, -21f)
                reflectiveQuadToRelative(9f, -20f)
                lineToRelative(181f, -302f)
                quadToRelative(6f, -10f, 15f, -14.5f)
                reflectiveQuadToRelative(19f, -4.5f)
                quadToRelative(10f, 0f, 19f, 4.5f)
                reflectiveQuadToRelative(15f, 14.5f)
                lineToRelative(181f, 302f)
                quadToRelative(6f, 10f, 9f, 20f)
                reflectiveQuadToRelative(3f, 21f)
                quadToRelative(0f, 11f, -3f, 21f)
                reflectiveQuadToRelative(-9f, 20f)
                lineTo(514f, 823f)
                quadToRelative(-6f, 10f, -15f, 14.5f)
                reflectiveQuadToRelative(-19f, 4.5f)
                close()
                moveToRelative(0f, -118f)
                lineToRelative(147f, -244f)
                lineToRelative(-147f, -244f)
                lineToRelative(-147f, 244f)
                lineToRelative(147f, 244f)
                close()
                moveToRelative(0f, -244f)
                close()
            }
        }.build()
        
        return _Hov!!
    }

private var _Hov: ImageVector? = null

