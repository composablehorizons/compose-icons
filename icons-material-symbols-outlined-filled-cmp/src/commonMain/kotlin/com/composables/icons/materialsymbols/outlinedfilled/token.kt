package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Token: ImageVector
    get() {
        if (_Token != null) return _Token!!
        
        _Token = ImageVector.Builder(
            name = "token",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(364f, 370f)
                lineTo(162f, 257f)
                lineToRelative(318f, -177f)
                lineToRelative(318f, 177f)
                lineToRelative(-202f, 113f)
                quadToRelative(-23f, -24f, -53f, -37f)
                reflectiveQuadToRelative(-63f, -13f)
                quadToRelative(-33f, 0f, -63f, 13f)
                reflectiveQuadToRelative(-53f, 37f)
                close()
                moveToRelative(76f, 488f)
                lineTo(120f, 680f)
                verticalLineToRelative(-355f)
                lineToRelative(205f, 115f)
                quadToRelative(-3f, 10f, -4f, 19.5f)
                reflectiveQuadToRelative(-1f, 20.5f)
                quadToRelative(0f, 55f, 33f, 98f)
                reflectiveQuadToRelative(87f, 57f)
                verticalLineToRelative(223f)
                close()
                moveToRelative(40f, -298f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(40f, 298f)
                verticalLineToRelative(-223f)
                quadToRelative(54f, -14f, 87f, -57f)
                reflectiveQuadToRelative(33f, -98f)
                quadToRelative(0f, -11f, -1f, -20.5f)
                reflectiveQuadToRelative(-4f, -19.5f)
                lineToRelative(205f, -115f)
                verticalLineToRelative(355f)
                lineTo(520f, 858f)
                close()
            }
        }.build()
        
        return _Token!!
    }

private var _Token: ImageVector? = null

