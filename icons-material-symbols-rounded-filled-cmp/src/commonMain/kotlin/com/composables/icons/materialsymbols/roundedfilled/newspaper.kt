package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) return _Newspaper!!
        
        _Newspaper = ImageVector.Builder(
            name = "newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-616f)
                quadToRelative(0f, -7f, 6f, -9.5f)
                reflectiveQuadToRelative(11f, 2.5f)
                lineToRelative(50f, 50f)
                lineToRelative(52f, -53f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(53f, 53f)
                lineToRelative(53f, -53f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(52f, 53f)
                lineToRelative(53f, -53f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(53f, 53f)
                lineToRelative(52f, -53f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(53f, 53f)
                lineToRelative(53f, -53f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(52f, 53f)
                lineToRelative(50f, -50f)
                quadToRelative(5f, -5f, 11f, -2.5f)
                reflectiveQuadToRelative(6f, 9.5f)
                verticalLineToRelative(616f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(360f, 0f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 440f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Newspaper!!
    }

private var _Newspaper: ImageVector? = null

