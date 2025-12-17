package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Browser_updated: ImageVector
    get() {
        if (_Browser_updated != null) return _Browser_updated!!
        
        _Browser_updated = ImageVector.Builder(
            name = "browser_updated",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 200f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(680f)
                lineToRelative(28f, 28f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 840f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 800f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(28f, -28f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, -273f)
                verticalLineToRelative(-287f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(287f)
                lineToRelative(76f, -75f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(772f, 372f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(600f, 600f)
                lineTo(428f, 428f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(428f, 372f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(76f, 75f)
                close()
            }
        }.build()
        
        return _Browser_updated!!
    }

private var _Browser_updated: ImageVector? = null

