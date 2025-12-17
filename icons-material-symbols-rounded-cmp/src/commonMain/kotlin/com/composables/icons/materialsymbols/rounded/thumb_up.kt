package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Thumb_up: ImageVector
    get() {
        if (_Thumb_up != null) return _Thumb_up!!
        
        _Thumb_up = ImageVector.Builder(
            name = "thumb_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 320f)
                quadToRelative(32f, 0f, 56f, 24f)
                reflectiveQuadToRelative(24f, 56f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 7f, -2f, 15f)
                reflectiveQuadToRelative(-4f, 15f)
                lineTo(794f, 792f)
                quadToRelative(-9f, 20f, -30f, 34f)
                reflectiveQuadToRelative(-44f, 14f)
                horizontalLineTo(280f)
                verticalLineToRelative(-520f)
                lineToRelative(240f, -238f)
                quadToRelative(15f, -15f, 35.5f, -17.5f)
                reflectiveQuadTo(595f, 72f)
                quadToRelative(19f, 10f, 28f, 28f)
                reflectiveQuadToRelative(4f, 37f)
                lineToRelative(-45f, 183f)
                horizontalLineToRelative(258f)
                close()
                moveToRelative(-480f, 34f)
                verticalLineToRelative(406f)
                horizontalLineToRelative(360f)
                lineToRelative(120f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                lineToRelative(54f, -220f)
                lineToRelative(-174f, 174f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, -80f)
                verticalLineToRelative(-406f)
                verticalLineToRelative(406f)
                close()
            }
        }.build()
        
        return _Thumb_up!!
    }

private var _Thumb_up: ImageVector? = null

