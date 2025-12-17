package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wb_auto: ImageVector
    get() {
        if (_Wb_auto != null) return _Wb_auto!!
        
        _Wb_auto = ImageVector.Builder(
            name = "wb_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(193f, 600f)
                horizontalLineToRelative(48f)
                lineToRelative(26f, -72f)
                horizontalLineToRelative(112f)
                lineToRelative(26f, 72f)
                horizontalLineToRelative(48f)
                lineTo(349f, 320f)
                horizontalLineToRelative(-52f)
                lineTo(193f, 600f)
                close()
                moveToRelative(88f, -112f)
                lineToRelative(40f, -116f)
                horizontalLineToRelative(4f)
                lineToRelative(40f, 116f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(42f, 272f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(43f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(323f, 200f)
                quadToRelative(75f, 0f, 138.5f, 37f)
                reflectiveQuadTo(563f, 338f)
                lineToRelative(-4f, -18f)
                horizontalLineToRelative(48f)
                lineToRelative(48f, 204f)
                horizontalLineToRelative(2f)
                lineToRelative(58f, -204f)
                horizontalLineToRelative(44f)
                lineToRelative(58f, 204f)
                horizontalLineToRelative(4f)
                lineToRelative(48f, -204f)
                horizontalLineToRelative(48f)
                lineToRelative(-74f, 280f)
                horizontalLineToRelative(-46f)
                lineToRelative(-60f, -210f)
                horizontalLineToRelative(-2f)
                lineToRelative(-58f, 210f)
                horizontalLineToRelative(-46f)
                lineToRelative(-28f, -116f)
                quadToRelative(0f, 115f, -82f, 195.5f)
                reflectiveQuadTo(323f, 760f)
                close()
            }
        }.build()
        
        return _Wb_auto!!
    }

private var _Wb_auto: ImageVector? = null

