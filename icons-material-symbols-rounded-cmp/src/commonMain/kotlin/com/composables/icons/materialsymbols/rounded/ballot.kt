package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Ballot: ImageVector
    get() {
        if (_Ballot != null) return _Ballot!!
        
        _Ballot = ImageVector.Builder(
            name = "ballot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 320f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 400f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 560f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 640f)
                horizontalLineToRelative(120f)
                close()
                moveTo(360f, 440f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(440f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 440f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(440f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 680f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Ballot!!
    }

private var _Ballot: ImageVector? = null

