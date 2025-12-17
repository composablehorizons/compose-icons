package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Colorize: ImageVector
    get() {
        if (_Colorize != null) return _Colorize!!
        
        _Colorize = ImageVector.Builder(
            name = "colorize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-117f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(335f, -335f)
                lineToRelative(-58f, -56f)
                lineToRelative(58f, -56f)
                lineToRelative(76f, 76f)
                lineToRelative(124f, -124f)
                quadToRelative(5f, -5f, 12.5f, -8f)
                reflectiveQuadToRelative(15.5f, -3f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 8f)
                lineToRelative(94f, 94f)
                quadToRelative(5f, 6f, 8f, 13f)
                reflectiveQuadToRelative(3f, 15f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-8f, 12.5f)
                lineTo(705f, 405f)
                lineToRelative(76f, 78f)
                lineToRelative(-57f, 57f)
                lineToRelative(-56f, -58f)
                lineToRelative(-335f, 335f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                close()
                moveToRelative(80f, -40f)
                horizontalLineToRelative(78f)
                lineToRelative(332f, -334f)
                lineToRelative(-76f, -76f)
                lineToRelative(-334f, 332f)
                verticalLineToRelative(78f)
                close()
                moveToRelative(447f, -410f)
                lineToRelative(96f, -96f)
                lineToRelative(-37f, -37f)
                lineToRelative(-96f, 96f)
                lineToRelative(37f, 37f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(-37f, -37f)
                lineToRelative(37f, 37f)
                close()
            }
        }.build()
        
        return _Colorize!!
    }

private var _Colorize: ImageVector? = null

