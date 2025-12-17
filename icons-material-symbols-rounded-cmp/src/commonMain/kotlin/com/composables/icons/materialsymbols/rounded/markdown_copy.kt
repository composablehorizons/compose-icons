package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Markdown_copy: ImageVector
    get() {
        if (_Markdown_copy != null) return _Markdown_copy!!
        
        _Markdown_copy = ImageVector.Builder(
            name = "markdown_copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 720f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-480f)
                horizontalLineTo(360f)
                verticalLineToRelative(480f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 280f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(270f, -540f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(540f, 460f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(570f, 430f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(670f, 490f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(630f, 280f)
                horizontalLineTo(450f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(410f, 320f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(470f, 490f)
                verticalLineToRelative(-150f)
                close()
                moveTo(360f, 640f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Markdown_copy!!
    }

private var _Markdown_copy: ImageVector? = null

