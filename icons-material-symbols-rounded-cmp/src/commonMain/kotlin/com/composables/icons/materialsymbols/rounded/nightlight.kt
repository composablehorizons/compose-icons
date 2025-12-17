package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nightlight: ImageVector
    get() {
        if (_Nightlight != null) return _Nightlight!!
        
        _Nightlight = ImageVector.Builder(
            name = "nightlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(277f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(277f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(560f, 80f)
                quadToRelative(35f, 0f, 70f, 7f)
                reflectiveQuadToRelative(67f, 21f)
                quadToRelative(12f, 5f, 18f, 15.5f)
                reflectiveQuadToRelative(6f, 21.5f)
                quadToRelative(0f, 9f, -3.5f, 17f)
                reflectiveQuadTo(706f, 176f)
                quadToRelative(-70f, 55f, -108f, 135f)
                reflectiveQuadToRelative(-38f, 169f)
                quadToRelative(0f, 90f, 37f, 170f)
                reflectiveQuadToRelative(108f, 134f)
                quadToRelative(8f, 6f, 11.5f, 14.5f)
                reflectiveQuadTo(720f, 816f)
                quadToRelative(0f, 11f, -6f, 21.5f)
                reflectiveQuadTo(696f, 853f)
                quadToRelative(-32f, 14f, -66.5f, 20.5f)
                reflectiveQuadTo(560f, 880f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(21f)
                quadToRelative(10f, 0f, 19f, -2f)
                quadToRelative(-57f, -66f, -88.5f, -147.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, -89f, 31.5f, -170.5f)
                reflectiveQuadTo(600f, 162f)
                quadToRelative(-9f, -2f, -19f, -2f)
                horizontalLineToRelative(-21f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(560f, 800f)
                close()
                moveToRelative(-80f, -320f)
                close()
            }
        }.build()
        
        return _Nightlight!!
    }

private var _Nightlight: ImageVector? = null

