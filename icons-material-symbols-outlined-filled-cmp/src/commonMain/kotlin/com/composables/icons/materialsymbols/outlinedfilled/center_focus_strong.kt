package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Center_focus_strong: ImageVector
    get() {
        if (_Center_focus_strong != null) return _Center_focus_strong!!
        
        _Center_focus_strong = ImageVector.Builder(
            name = "center_focus_strong",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(600f)
                close()
                moveTo(120f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Center_focus_strong!!
    }

private var _Center_focus_strong: ImageVector? = null

