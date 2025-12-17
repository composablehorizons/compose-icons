package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cards_star: ImageVector
    get() {
        if (_Cards_star != null) return _Cards_star!!
        
        _Cards_star = ImageVector.Builder(
            name = "cards_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(489f, 500f)
                lineToRelative(91f, -55f)
                lineToRelative(91f, 55f)
                lineToRelative(-24f, -104f)
                lineToRelative(80f, -69f)
                lineToRelative(-105f, -9f)
                lineToRelative(-42f, -98f)
                lineToRelative(-42f, 98f)
                lineToRelative(-105f, 9f)
                lineToRelative(80f, 69f)
                lineToRelative(-24f, 104f)
                close()
                moveToRelative(24f, 260f)
                horizontalLineToRelative(217f)
                lineToRelative(7f, 53f)
                lineToRelative(-589f, 72f)
                lineToRelative(-74f, -597f)
                lineToRelative(126f, -14f)
                verticalLineToRelative(80f)
                lineToRelative(-36f, 5f)
                lineToRelative(54f, 437f)
                lineToRelative(295f, -36f)
                close()
                moveToRelative(-233f, -80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(600f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(360f)
                verticalLineToRelative(440f)
                close()
                moveTo(218f, 796f)
                close()
                moveToRelative(362f, -416f)
                close()
            }
        }.build()
        
        return _Cards_star!!
    }

private var _Cards_star: ImageVector? = null

