package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flash_on: ImageVector
    get() {
        if (_Flash_on != null) return _Flash_on!!
        
        _Flash_on = ImageVector.Builder(
            name = "flash_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 624f)
                lineToRelative(128f, -184f)
                horizontalLineTo(494f)
                lineToRelative(80f, -280f)
                horizontalLineTo(360f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(144f)
                close()
                moveToRelative(215f, -170f)
                lineTo(455f, 801f)
                quadToRelative(-6f, 9f, -15.5f, 12f)
                reflectiveQuadToRelative(-18.5f, 0f)
                quadToRelative(-9f, -3f, -15f, -10.5f)
                reflectiveQuadToRelative(-6f, -18.5f)
                verticalLineToRelative(-224f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 480f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(234f)
                quadToRelative(32f, 0f, 51.5f, 25f)
                reflectiveQuadToRelative(11.5f, 55f)
                lineToRelative(-57f, 200f)
                horizontalLineToRelative(45f)
                quadToRelative(36f, 0f, 53.5f, 32f)
                reflectiveQuadToRelative(-3.5f, 62f)
                close()
                moveToRelative(-215f, 26f)
                horizontalLineTo(360f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Flash_on!!
    }

private var _Flash_on: ImageVector? = null

