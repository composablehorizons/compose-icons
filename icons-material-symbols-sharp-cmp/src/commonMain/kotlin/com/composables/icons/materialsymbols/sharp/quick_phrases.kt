package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Quick_phrases: ImageVector
    get() {
        if (_Quick_phrases != null) return _Quick_phrases!!
        
        _Quick_phrases = ImageVector.Builder(
            name = "quick_phrases",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 900f)
                verticalLineToRelative(-221f)
                quadToRelative(-101f, -8f, -170.5f, -82f)
                reflectiveQuadTo(80f, 420f)
                quadToRelative(0f, -109f, 75.5f, -184.5f)
                reflectiveQuadTo(340f, 160f)
                horizontalLineToRelative(27f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineToRelative(-27f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(160f, 420f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(340f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(107f)
                lineToRelative(107f, -107f)
                horizontalLineToRelative(113f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(800f, 420f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(620f, 240f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(20f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(880f, 420f)
                quadToRelative(0f, 109f, -75.5f, 184.5f)
                reflectiveQuadTo(620f, 680f)
                horizontalLineToRelative(-80f)
                lineTo(320f, 900f)
                close()
            }
        }.build()
        
        return _Quick_phrases!!
    }

private var _Quick_phrases: ImageVector? = null

