package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Process_chart: ImageVector
    get() {
        if (_Process_chart != null) return _Process_chart!!
        
        _Process_chart = ImageVector.Builder(
            name = "process_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 720f)
                quadToRelative(-15f, -8f, -20.5f, -23.5f)
                reflectiveQuadTo(78f, 666f)
                lineToRelative(204f, -408f)
                quadToRelative(8f, -15f, 23.5f, -20.5f)
                reflectiveQuadTo(336f, 240f)
                quadToRelative(15f, 8f, 20.5f, 23.5f)
                reflectiveQuadTo(354f, 294f)
                lineTo(150f, 702f)
                quadToRelative(-8f, 15f, -23.5f, 20.5f)
                reflectiveQuadTo(96f, 720f)
                close()
                moveToRelative(264f, 0f)
                quadToRelative(-15f, -8f, -20.5f, -23.5f)
                reflectiveQuadTo(342f, 666f)
                lineToRelative(204f, -408f)
                quadToRelative(8f, -15f, 23.5f, -20.5f)
                reflectiveQuadTo(600f, 240f)
                quadToRelative(15f, 8f, 20.5f, 23.5f)
                reflectiveQuadTo(618f, 294f)
                lineTo(414f, 702f)
                quadToRelative(-8f, 15f, -23.5f, 20.5f)
                reflectiveQuadTo(360f, 720f)
                close()
                moveToRelative(264f, 0f)
                quadToRelative(-15f, -8f, -20.5f, -23.5f)
                reflectiveQuadTo(606f, 666f)
                lineToRelative(204f, -408f)
                quadToRelative(8f, -15f, 23.5f, -20.5f)
                reflectiveQuadTo(864f, 240f)
                quadToRelative(15f, 8f, 20.5f, 23.5f)
                reflectiveQuadTo(882f, 294f)
                lineTo(678f, 702f)
                quadToRelative(-8f, 15f, -23.5f, 20.5f)
                reflectiveQuadTo(624f, 720f)
                close()
            }
        }.build()
        
        return _Process_chart!!
    }

private var _Process_chart: ImageVector? = null

