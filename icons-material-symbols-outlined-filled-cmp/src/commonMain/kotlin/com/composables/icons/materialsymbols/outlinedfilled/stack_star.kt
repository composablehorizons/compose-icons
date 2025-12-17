package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Stack_star: ImageVector
    get() {
        if (_Stack_star != null) return _Stack_star!!
        
        _Stack_star = ImageVector.Builder(
            name = "stack_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(509f, 740f)
                lineToRelative(91f, -55f)
                lineToRelative(91f, 55f)
                lineToRelative(-24f, -104f)
                lineToRelative(80f, -69f)
                lineToRelative(-105f, -9f)
                lineToRelative(-42f, -98f)
                lineToRelative(-42f, 98f)
                lineToRelative(-105f, 9f)
                lineToRelative(80f, 69f)
                lineToRelative(-24f, 104f)
                close()
                moveTo(240f, 560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 560f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 320f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Stack_star!!
    }

private var _Stack_star: ImageVector? = null

