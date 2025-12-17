package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Forum: ImageVector
    get() {
        if (_Forum != null) return _Forum!!
        
        _Forum = ImageVector.Builder(
            name = "forum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(503f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(812f, 812f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-40f, -200f)
                lineToRelative(-92f, 92f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(80f, 583f)
                verticalLineToRelative(-463f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 80f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 520f)
                horizontalLineTo(240f)
                close()
                moveToRelative(360f, -80f)
                verticalLineToRelative(-280f)
                horizontalLineTo(160f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(440f)
                close()
                moveToRelative(-440f, 0f)
                verticalLineToRelative(-280f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Forum!!
    }

private var _Forum: ImageVector? = null

