package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Border_color: ImageVector
    get() {
        if (_Border_color != null) return _Border_color!!
        
        _Border_color = ImageVector.Builder(
            name = "border_color",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 960f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(800f)
                verticalLineTo(960f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -320f)
                horizontalLineToRelative(56f)
                lineToRelative(312f, -311f)
                lineToRelative(-29f, -29f)
                lineToRelative(-28f, -28f)
                lineToRelative(-311f, 312f)
                verticalLineToRelative(56f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-170f)
                lineToRelative(448f, -447f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(30.5f, -6f)
                quadToRelative(16f, 0f, 31f, 6f)
                reflectiveQuadToRelative(27f, 18f)
                lineToRelative(55f, 56f)
                quadToRelative(12f, 11f, 17.5f, 26f)
                reflectiveQuadToRelative(5.5f, 31f)
                quadToRelative(0f, 15f, -5.5f, 29.5f)
                reflectiveQuadTo(777f, 273f)
                lineTo(330f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(560f, -504f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, 56f)
                close()
                moveTo(608f, 329f)
                lineToRelative(-29f, -29f)
                lineToRelative(-28f, -28f)
                lineToRelative(57f, 57f)
                close()
            }
        }.build()
        
        return _Border_color!!
    }

private var _Border_color: ImageVector? = null

