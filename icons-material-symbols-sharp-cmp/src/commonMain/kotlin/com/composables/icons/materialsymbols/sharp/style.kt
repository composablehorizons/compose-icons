package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Style: ImageVector
    get() {
        if (_Style != null) return _Style!!
        
        _Style = ImageVector.Builder(
            name = "style",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(159f, 792f)
                lineTo(51f, 748f)
                lineToRelative(108f, -234f)
                verticalLineToRelative(278f)
                close()
                moveToRelative(80f, -232f)
                lineTo(354f, 880f)
                horizontalLineTo(239f)
                verticalLineToRelative(-320f)
                close()
                moveTo(449f, 904f)
                lineTo(215f, 262f)
                lineToRelative(454f, -166f)
                lineToRelative(234f, 642f)
                lineTo(449f, 904f)
                close()
                moveToRelative(-10f, -504f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(479f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(439f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(399f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(439f, 400f)
                close()
                moveToRelative(58f, 400f)
                lineToRelative(302f, -110f)
                lineToRelative(-178f, -490f)
                lineToRelative(-302f, 110f)
                lineToRelative(178f, 490f)
                close()
                moveTo(319f, 310f)
                lineToRelative(302f, -110f)
                lineToRelative(-302f, 110f)
                close()
            }
        }.build()
        
        return _Style!!
    }

private var _Style: ImageVector? = null

