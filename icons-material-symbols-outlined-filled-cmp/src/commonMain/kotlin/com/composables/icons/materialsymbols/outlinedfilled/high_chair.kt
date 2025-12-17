package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.High_chair: ImageVector
    get() {
        if (_High_chair != null) return _High_chair!!
        
        _High_chair = ImageVector.Builder(
            name = "high_chair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                lineToRelative(40f, -438f)
                lineToRelative(-32f, -189f)
                quadToRelative(-5f, -26f, 12.5f, -59.5f)
                reflectiveQuadTo(338f, 120f)
                quadToRelative(59f, 0f, 103.5f, 38f)
                reflectiveQuadToRelative(54.5f, 96f)
                lineToRelative(18f, 106f)
                horizontalLineToRelative(166f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 440f)
                horizontalLineToRelative(-36f)
                lineToRelative(36f, 400f)
                horizontalLineToRelative(-80f)
                lineToRelative(-7f, -80f)
                horizontalLineTo(327f)
                lineToRelative(-7f, 80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(94f, -160f)
                horizontalLineToRelative(251f)
                lineToRelative(-7f, -80f)
                horizontalLineTo(342f)
                lineToRelative(-8f, 80f)
                close()
                moveToRelative(15f, -160f)
                horizontalLineToRelative(222f)
                lineToRelative(-8f, -80f)
                horizontalLineTo(356f)
                lineToRelative(-7f, 80f)
                close()
            }
        }.build()
        
        return _High_chair!!
    }

private var _High_chair: ImageVector? = null

