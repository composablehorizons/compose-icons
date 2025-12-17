package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Amp_stories: ImageVector
    get() {
        if (_Amp_stories != null) return _Amp_stories!!
        
        _Amp_stories = ImageVector.Builder(
            name = "amp_stories",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 800f)
                horizontalLineTo(320f)
                close()
                moveTo(120f, 680f)
                verticalLineToRelative(-401f)
                quadToRelative(0f, -17f, 11.5f, -28f)
                reflectiveQuadToRelative(28.5f, -11f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 280f)
                verticalLineToRelative(401f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 680f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-401f)
                quadToRelative(0f, -17f, 11.5f, -28f)
                reflectiveQuadToRelative(28.5f, -11f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(401f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 680f)
                close()
            }
        }.build()
        
        return _Amp_stories!!
    }

private var _Amp_stories: ImageVector? = null

