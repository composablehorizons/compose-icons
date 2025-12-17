package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Output_circle: ImageVector
    get() {
        if (_Output_circle != null) return _Output_circle!!
        
        _Output_circle = ImageVector.Builder(
            name = "output_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(280f, 680f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 103f)
                verticalLineToRelative(-407f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(407f)
                lineToRelative(104f, -103f)
                lineToRelative(56f, 56f)
                lineTo(480f, 880f)
                close()
                moveTo(146f, 700f)
                quadToRelative(-32f, -49f, -49f, -105f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 59f, -17f, 115f)
                reflectiveQuadToRelative(-49f, 105f)
                lineToRelative(-58f, -58f)
                quadToRelative(22f, -37f, 33f, -78f)
                reflectiveQuadToRelative(11f, -84f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 43f, 11f, 84f)
                reflectiveQuadToRelative(33f, 78f)
                lineToRelative(-58f, 58f)
                close()
            }
        }.build()
        
        return _Output_circle!!
    }

private var _Output_circle: ImageVector? = null

