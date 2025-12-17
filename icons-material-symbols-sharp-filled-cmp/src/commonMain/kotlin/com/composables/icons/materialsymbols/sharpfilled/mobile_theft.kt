package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_theft: ImageVector
    get() {
        if (_Mobile_theft != null) return _Mobile_theft!!
        
        _Mobile_theft = ImageVector.Builder(
            name = "mobile_theft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(618f, 675f)
                lineToRelative(-57f, -56f)
                lineToRelative(124f, -124f)
                lineToRelative(-29f, -28f)
                lineToRelative(-179f, 179f)
                lineToRelative(-56f, -57f)
                lineToRelative(178f, -179f)
                lineToRelative(-28f, -28f)
                lineToRelative(-208f, 207f)
                lineToRelative(-57f, -55f)
                lineToRelative(209f, -209f)
                lineToRelative(-29f, -28f)
                lineToRelative(-150f, 152f)
                lineToRelative(-57f, -57f)
                lineToRelative(203f, -203f)
                lineToRelative(-102f, -57f)
                verticalLineToRelative(-92f)
                horizontalLineToRelative(339f)
                lineToRelative(154f, 154f)
                quadToRelative(23f, 23f, 34.5f, 52.5f)
                reflectiveQuadTo(919f, 307f)
                quadToRelative(1f, 31f, -11f, 60.5f)
                reflectiveQuadTo(873f, 420f)
                lineTo(618f, 675f)
                close()
                moveTo(543f, 932f)
                lineTo(28f, 855f)
                lineToRelative(113f, -762f)
                lineToRelative(210f, 114f)
                lineToRelative(-185f, 185f)
                lineToRelative(84f, 85f)
                lineToRelative(-58f, 58f)
                lineToRelative(172f, 166f)
                lineToRelative(27f, -27f)
                lineToRelative(166f, 169f)
                lineToRelative(-14f, 89f)
                close()
                moveToRelative(159f, -12f)
                lineToRelative(-42f, -42f)
                lineToRelative(117f, -118f)
                horizontalLineToRelative(-97f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-97f)
                lineTo(702f, 920f)
                close()
            }
        }.build()
        
        return _Mobile_theft!!
    }

private var _Mobile_theft: ImageVector? = null

