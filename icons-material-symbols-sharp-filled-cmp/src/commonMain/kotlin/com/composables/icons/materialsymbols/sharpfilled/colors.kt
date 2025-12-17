package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Colors: ImageVector
    get() {
        if (_Colors != null) return _Colors!!
        
        _Colors = ImageVector.Builder(
            name = "colors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(393f, 867f)
                lineTo(53f, 527f)
                lineToRelative(277f, -276f)
                lineToRelative(-106f, -106f)
                lineToRelative(62f, -65f)
                lineToRelative(447f, 447f)
                lineTo(393f, 867f)
                close()
                moveToRelative(0f, -553f)
                lineTo(179f, 528f)
                horizontalLineToRelative(428f)
                lineTo(393f, 314f)
                close()
                moveToRelative(399f, 526f)
                quadToRelative(-36f, 0f, -61f, -25.5f)
                reflectiveQuadTo(706f, 752f)
                quadToRelative(0f, -27f, 13.5f, -51f)
                reflectiveQuadToRelative(30.5f, -47f)
                lineToRelative(42f, -54f)
                lineToRelative(44f, 54f)
                quadToRelative(16f, 23f, 30f, 47f)
                reflectiveQuadToRelative(14f, 51f)
                quadToRelative(0f, 37f, -26f, 62.5f)
                reflectiveQuadTo(792f, 840f)
                close()
            }
        }.build()
        
        return _Colors!!
    }

private var _Colors: ImageVector? = null

