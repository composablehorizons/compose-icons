package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Deployed_code_history: ImageVector
    get() {
        if (_Deployed_code_history != null) return _Deployed_code_history!!
        
        _Deployed_code_history = ImageVector.Builder(
            name = "deployed_code_history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(740f, 752f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 86f)
                lineToRelative(28f, -28f)
                lineToRelative(-74f, -74f)
                close()
                moveTo(480f, 434f)
                lineToRelative(237f, -137f)
                lineToRelative(-237f, -137f)
                lineToRelative(-237f, 137f)
                lineToRelative(237f, 137f)
                close()
                moveTo(120f, 685f)
                verticalLineToRelative(-410f)
                lineToRelative(360f, -207f)
                lineToRelative(360f, 207f)
                verticalLineToRelative(205f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-116f)
                lineTo(479f, 526f)
                lineTo(200f, 364f)
                verticalLineToRelative(274f)
                lineToRelative(241f, 139f)
                verticalLineToRelative(92f)
                lineTo(120f, 685f)
                close()
                moveTo(720f, 960f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 760f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 760f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 960f)
                close()
                moveTo(441f, 469f)
                close()
            }
        }.build()
        
        return _Deployed_code_history!!
    }

private var _Deployed_code_history: ImageVector? = null

