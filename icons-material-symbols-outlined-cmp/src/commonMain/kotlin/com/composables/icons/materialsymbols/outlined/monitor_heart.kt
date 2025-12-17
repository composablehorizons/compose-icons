package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Monitor_heart: ImageVector
    get() {
        if (_Monitor_heart != null) return _Monitor_heart!!
        
        _Monitor_heart = ImageVector.Builder(
            name = "monitor_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 360f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, 440f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -120f)
                quadToRelative(11f, 0f, 21f, -5.5f)
                reflectiveQuadToRelative(15f, -16.5f)
                lineToRelative(124f, -248f)
                lineToRelative(44f, 88f)
                quadToRelative(5f, 11f, 15f, 16.5f)
                reflectiveQuadToRelative(21f, 5.5f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(665f)
                lineToRelative(-69f, -138f)
                quadToRelative(-5f, -11f, -15f, -15.5f)
                reflectiveQuadToRelative(-21f, -4.5f)
                quadToRelative(-11f, 0f, -21f, 4.5f)
                reflectiveQuadTo(524f, 302f)
                lineTo(400f, 550f)
                lineToRelative(-44f, -88f)
                quadToRelative(-5f, -11f, -15f, -16.5f)
                reflectiveQuadToRelative(-21f, -5.5f)
                horizontalLineTo(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(215f)
                lineToRelative(69f, 138f)
                quadToRelative(5f, 11f, 15f, 16.5f)
                reflectiveQuadToRelative(21f, 5.5f)
                close()
                moveToRelative(80f, -200f)
                close()
            }
        }.build()
        
        return _Monitor_heart!!
    }

private var _Monitor_heart: ImageVector? = null

