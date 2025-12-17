package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.New_label: ImageVector
    get() {
        if (_New_label != null) return _New_label!!
        
        _New_label = ImageVector.Builder(
            name = "new_label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(280f, -40f)
                verticalLineToRelative(-240f)
                horizontalLineTo(360f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(400f)
                quadToRelative(20f, 0f, 37.5f, 9f)
                reflectiveQuadToRelative(28.5f, 25f)
                lineToRelative(174f, 246f)
                lineToRelative(-174f, 246f)
                quadToRelative(-11f, 16f, -28.5f, 25f)
                reflectiveQuadToRelative(-37.5f, 9f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _New_label!!
    }

private var _New_label: ImageVector? = null

