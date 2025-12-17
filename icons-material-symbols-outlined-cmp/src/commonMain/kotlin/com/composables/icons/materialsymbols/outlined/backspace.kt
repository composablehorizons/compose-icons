package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                quadToRelative(-20f, 0f, -37.5f, -9f)
                reflectiveQuadTo(294f, 726f)
                lineTo(120f, 480f)
                lineToRelative(174f, -246f)
                quadToRelative(11f, -16f, 28.5f, -25f)
                reflectiveQuadToRelative(37.5f, -9f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(360f)
                close()
                moveToRelative(400f, -80f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(-400f, 0f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(360f)
                lineTo(218f, 480f)
                lineToRelative(142f, 200f)
                close()
                moveToRelative(96f, -40f)
                lineToRelative(104f, -104f)
                lineToRelative(104f, 104f)
                lineToRelative(56f, -56f)
                lineToRelative(-104f, -104f)
                lineToRelative(104f, -104f)
                lineToRelative(-56f, -56f)
                lineToRelative(-104f, 104f)
                lineToRelative(-104f, -104f)
                lineToRelative(-56f, 56f)
                lineToRelative(104f, 104f)
                lineToRelative(-104f, 104f)
                lineToRelative(56f, 56f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

