package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Villa: ImageVector
    get() {
        if (_Villa != null) return _Villa!!
        
        _Villa = ImageVector.Builder(
            name = "villa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-520f)
                lineToRelative(520f, -200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 480f)
                verticalLineToRelative(360f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-244f)
                lineTo(200f, 375f)
                verticalLineToRelative(385f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-200f)
                horizontalLineTo(440f)
                verticalLineToRelative(200f)
                close()
                moveTo(280f, 400f)
                close()
                moveToRelative(320f, 360f)
                close()
                moveToRelative(0f, -20f)
                close()
            }
        }.build()
        
        return _Villa!!
    }

private var _Villa: ImageVector? = null

