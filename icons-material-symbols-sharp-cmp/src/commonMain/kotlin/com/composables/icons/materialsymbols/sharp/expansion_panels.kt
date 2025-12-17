package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Expansion_panels: ImageVector
    get() {
        if (_Expansion_panels != null) return _Expansion_panels!!
        
        _Expansion_panels = ImageVector.Builder(
            name = "expansion_panels",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(-57f, -57f)
                lineToRelative(-103f, 103f)
                lineToRelative(-103f, -103f)
                lineToRelative(-57f, 57f)
                lineToRelative(160f, 160f)
                close()
                moveTo(377f, 457f)
                lineToRelative(103f, -103f)
                lineToRelative(103f, 103f)
                lineToRelative(57f, -57f)
                lineToRelative(-160f, -160f)
                lineToRelative(-160f, 160f)
                lineToRelative(57f, 57f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Expansion_panels!!
    }

private var _Expansion_panels: ImageVector? = null

