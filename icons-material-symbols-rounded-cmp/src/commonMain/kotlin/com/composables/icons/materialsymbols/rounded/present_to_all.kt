package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Present_to_all: ImageVector
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
                moveTo(440f, 473f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 600f)
                verticalLineToRelative(-126f)
                lineToRelative(36f, 35f)
                quadToRelative(12f, 11f, 28f, 11.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(612f, 452f)
                lineTo(508f, 348f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineTo(348f, 452f)
                quadToRelative(-12f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(12.5f, 28f)
                quadToRelative(12f, 11f, 28f, 11.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                lineToRelative(35f, -35f)
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Present_to_all!!
    }

private var _Present_to_all: ImageVector? = null

