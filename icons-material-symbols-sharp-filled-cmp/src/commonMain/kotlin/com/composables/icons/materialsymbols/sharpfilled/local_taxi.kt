package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Local_taxi: ImageVector
    get() {
        if (_Local_taxi != null) return _Local_taxi!!
        
        _Local_taxi = ImageVector.Builder(
            name = "local_taxi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-360f)
                lineToRelative(98f, -280f)
                horizontalLineToRelative(142f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(142f)
                lineToRelative(98f, 280f)
                verticalLineToRelative(360f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-8f, -360f)
                horizontalLineToRelative(496f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(274f)
                lineToRelative(-42f, 120f)
                close()
                moveToRelative(68f, 240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(360f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 640f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 640f)
                close()
            }
        }.build()
        
        return _Local_taxi!!
    }

private var _Local_taxi: ImageVector? = null

