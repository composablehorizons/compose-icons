package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Colorize: ImageVector
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
                moveTo(120f, 840f)
                verticalLineToRelative(-190f)
                lineToRelative(358f, -358f)
                lineToRelative(-58f, -56f)
                lineToRelative(58f, -56f)
                lineToRelative(76f, 76f)
                lineToRelative(152f, -152f)
                lineToRelative(150f, 150f)
                lineToRelative(-151f, 151f)
                lineToRelative(76f, 78f)
                lineToRelative(-57f, 57f)
                lineToRelative(-56f, -58f)
                lineToRelative(-358f, 358f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
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

