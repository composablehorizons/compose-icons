package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Charger: ImageVector
    get() {
        if (_Charger != null) return _Charger!!
        
        _Charger = ImageVector.Builder(
            name = "charger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(471f, 763f)
                lineToRelative(166f, -324f)
                quadToRelative(5f, -10f, -1f, -19.5f)
                reflectiveQuadToRelative(-17f, -9.5f)
                horizontalLineTo(512f)
                verticalLineToRelative(-209f)
                quadToRelative(0f, -8f, -7.5f, -9.5f)
                reflectiveQuadTo(493f, 197f)
                lineTo(327f, 521f)
                quadToRelative(-5f, 10f, 1f, 19.5f)
                reflectiveQuadToRelative(17f, 9.5f)
                horizontalLineToRelative(107f)
                verticalLineToRelative(209f)
                quadToRelative(0f, 8f, 7.5f, 9.5f)
                reflectiveQuadTo(471f, 763f)
                close()
                moveToRelative(9f, 117f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -400f)
                close()
                moveToRelative(0f, 320f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Charger!!
    }

private var _Charger: ImageVector? = null

