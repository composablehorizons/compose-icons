package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Present_to_all: ImageVector
    get() {
        if (_Present_to_all != null) return _Present_to_all!!
        
        _Present_to_all = ImageVector.Builder(
            name = "present_to_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-166f)
                lineToRelative(64f, 63f)
                lineToRelative(57f, -57f)
                lineToRelative(-161f, -160f)
                lineToRelative(-160f, 160f)
                lineToRelative(57f, 56f)
                lineToRelative(63f, -63f)
                verticalLineToRelative(167f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Present_to_all!!
    }

private var _Present_to_all: ImageVector? = null

