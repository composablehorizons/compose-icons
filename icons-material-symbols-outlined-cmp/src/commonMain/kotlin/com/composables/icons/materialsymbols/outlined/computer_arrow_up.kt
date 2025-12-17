package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Computer_arrow_up: ImageVector
    get() {
        if (_Computer_arrow_up != null) return _Computer_arrow_up!!
        
        _Computer_arrow_up = ImageVector.Builder(
            name = "computer_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-440f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(280f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-167f)
                lineToRelative(64f, 63f)
                lineToRelative(56f, -56f)
                lineToRelative(-160f, -160f)
                lineToRelative(-160f, 160f)
                lineToRelative(56f, 57f)
                lineToRelative(64f, -64f)
                verticalLineToRelative(167f)
                close()
            }
        }.build()
        
        return _Computer_arrow_up!!
    }

private var _Computer_arrow_up: ImageVector? = null

