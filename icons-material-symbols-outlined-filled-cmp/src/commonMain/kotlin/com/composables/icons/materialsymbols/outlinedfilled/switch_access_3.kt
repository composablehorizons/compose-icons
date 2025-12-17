package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Switch_access_3: ImageVector
    get() {
        if (_Switch_access_3 != null) return _Switch_access_3!!
        
        _Switch_access_3 = ImageVector.Builder(
            name = "switch_access_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                verticalLineToRelative(-47f)
                lineToRelative(273f, -273f)
                lineToRelative(-273f, -273f)
                verticalLineToRelative(-47f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(125f)
                quadToRelative(17f, 5f, 28.5f, 21f)
                reflectiveQuadToRelative(11.5f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 18f, -11.5f, 34f)
                reflectiveQuadTo(880f, 475f)
                verticalLineToRelative(325f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(480f)
                close()
                moveToRelative(-80f, -240f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(80f, 360f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Switch_access_3!!
    }

private var _Switch_access_3: ImageVector? = null

