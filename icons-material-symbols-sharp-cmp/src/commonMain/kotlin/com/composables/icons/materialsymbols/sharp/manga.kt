package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Manga: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(244f, -80f)
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
                moveToRelative(-14f, 237f)
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
            }
        }.build()
        
        return _Manga!!
    }

private var _Manga: ImageVector? = null

