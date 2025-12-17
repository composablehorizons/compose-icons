package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sports_hockey: ImageVector
    get() {
        if (_Sports_hockey != null) return _Sports_hockey!!
        
        _Sports_hockey = ImageVector.Builder(
            name = "sports_hockey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 640f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                lineToRelative(34f, -78f)
                lineToRelative(64f, 140f)
                lineToRelative(-34f, 76f)
                quadToRelative(-5f, 11f, -15f, 16.5f)
                reflectiveQuadToRelative(-21f, 5.5f)
                horizontalLineTo(200f)
                close()
                moveToRelative(600f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-40f, 0f)
                horizontalLineTo(572f)
                quadToRelative(-11f, 0f, -21f, -5.5f)
                reflectiveQuadTo(536f, 778f)
                lineTo(254f, 160f)
                horizontalLineToRelative(134f)
                lineToRelative(92f, 208f)
                lineToRelative(92f, -208f)
                horizontalLineToRelative(134f)
                lineTo(544f, 514f)
                lineToRelative(56f, 126f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Sports_hockey!!
    }

private var _Sports_hockey: ImageVector? = null

