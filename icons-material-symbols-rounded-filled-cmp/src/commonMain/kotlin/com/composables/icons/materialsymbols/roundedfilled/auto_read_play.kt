package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Auto_read_play: ImageVector
    get() {
        if (_Auto_read_play != null) return _Auto_read_play!!
        
        _Auto_read_play = ImageVector.Builder(
            name = "auto_read_play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(447f, 529f)
                lineToRelative(156f, -104f)
                quadToRelative(14f, -9f, 14f, -25f)
                reflectiveQuadToRelative(-14f, -25f)
                lineTo(447f, 271f)
                quadToRelative(-15f, -10f, -31f, -1.5f)
                reflectiveQuadTo(400f, 296f)
                verticalLineToRelative(208f)
                quadToRelative(0f, 18f, 16f, 26.5f)
                reflectiveQuadToRelative(31f, -1.5f)
                close()
                moveTo(240f, 720f)
                lineToRelative(-92f, 92f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(80f, 783f)
                verticalLineToRelative(-623f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Auto_read_play!!
    }

private var _Auto_read_play: ImageVector? = null

