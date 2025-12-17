package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Manga: ImageVector
    get() {
        if (_Manga != null) return _Manga!!
        
        _Manga = ImageVector.Builder(
            name = "manga",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(263f, -80f)
                horizontalLineToRelative(377f)
                verticalLineToRelative(-309f)
                lineToRelative(-27f, -37f)
                lineToRelative(-93f, 30f)
                lineToRelative(-92f, -30f)
                lineToRelative(-58f, 79f)
                lineToRelative(-93f, 30f)
                verticalLineToRelative(98f)
                lineToRelative(-57f, 79f)
                lineToRelative(43f, 60f)
                close()
                moveToRelative(-99f, 0f)
                lineToRelative(-43f, -60f)
                lineToRelative(76f, -105f)
                verticalLineToRelative(-130f)
                lineToRelative(123f, -40f)
                lineToRelative(77f, -105f)
                lineToRelative(123f, 40f)
                lineToRelative(120f, -39f)
                verticalLineToRelative(-41f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(164f)
                close()
                moveToRelative(113f, -237f)
                close()
            }
        }.build()
        
        return _Manga!!
    }

private var _Manga: ImageVector? = null

