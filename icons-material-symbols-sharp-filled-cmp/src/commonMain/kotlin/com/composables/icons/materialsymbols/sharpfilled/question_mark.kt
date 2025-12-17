package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Question_mark: ImageVector
    get() {
        if (_Question_mark != null) return _Question_mark!!
        
        _Question_mark = ImageVector.Builder(
            name = "question_mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(424f, 640f)
                quadToRelative(0f, -81f, 14.5f, -116.5f)
                reflectiveQuadTo(500f, 446f)
                quadToRelative(41f, -36f, 62.5f, -62.5f)
                reflectiveQuadTo(584f, 323f)
                quadToRelative(0f, -41f, -27.5f, -68f)
                reflectiveQuadTo(480f, 228f)
                quadToRelative(-51f, 0f, -77.5f, 31f)
                reflectiveQuadTo(365f, 322f)
                lineToRelative(-103f, -44f)
                quadToRelative(21f, -64f, 77f, -111f)
                reflectiveQuadToRelative(141f, -47f)
                quadToRelative(105f, 0f, 161.5f, 58.5f)
                reflectiveQuadTo(698f, 319f)
                quadToRelative(0f, 50f, -21.5f, 85.5f)
                reflectiveQuadTo(609f, 485f)
                quadToRelative(-49f, 47f, -59.5f, 71.5f)
                reflectiveQuadTo(539f, 640f)
                horizontalLineTo(424f)
                close()
                moveToRelative(56f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Question_mark!!
    }

private var _Question_mark: ImageVector? = null

