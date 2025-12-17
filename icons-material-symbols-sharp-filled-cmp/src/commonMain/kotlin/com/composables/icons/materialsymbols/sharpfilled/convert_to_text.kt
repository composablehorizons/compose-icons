package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Convert_to_text: ImageVector
    get() {
        if (_Convert_to_text != null) return _Convert_to_text!!
        
        _Convert_to_text = ImageVector.Builder(
            name = "convert_to_text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(102f)
                quadToRelative(-48f, -23f, -77.5f, -68f)
                reflectiveQuadTo(75f, 630f)
                quadToRelative(0f, -79f, 55.5f, -134.5f)
                reflectiveQuadTo(265f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-45f, 0f, -77.5f, 32f)
                reflectiveQuadTo(155f, 630f)
                quadToRelative(0f, 39f, 24f, 69f)
                reflectiveQuadToRelative(61f, 38f)
                verticalLineToRelative(-97f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, -520f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(120f, 480f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Convert_to_text!!
    }

private var _Convert_to_text: ImageVector? = null

