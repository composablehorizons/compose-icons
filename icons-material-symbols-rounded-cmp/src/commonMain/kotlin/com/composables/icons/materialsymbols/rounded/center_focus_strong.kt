package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Center_focus_strong: ImageVector
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
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 640f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(560f, 0f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 760f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 640f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                close()
                moveTo(120f, 320f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 200f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 320f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 120f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 320f)
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
                moveToRelative(0f, -80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -120f)
                close()
            }
        }.build()
        
        return _Center_focus_strong!!
    }

private var _Center_focus_strong: ImageVector? = null

