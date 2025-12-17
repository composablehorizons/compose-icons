package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Frame_inspect: ImageVector
    get() {
        if (_Frame_inspect != null) return _Frame_inspect!!
        
        _Frame_inspect = ImageVector.Builder(
            name = "frame_inspect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(450f, 540f)
                quadToRelative(38f, 0f, 64f, -26f)
                reflectiveQuadToRelative(26f, -64f)
                quadToRelative(0f, -38f, -26f, -64f)
                reflectiveQuadToRelative(-64f, -26f)
                quadToRelative(-38f, 0f, -64f, 26f)
                reflectiveQuadToRelative(-26f, 64f)
                quadToRelative(0f, 38f, 26f, 64f)
                reflectiveQuadToRelative(64f, 26f)
                close()
                moveToRelative(193f, 160f)
                lineTo(538f, 595f)
                quadToRelative(-20f, 13f, -42.5f, 19f)
                reflectiveQuadToRelative(-45.5f, 6f)
                quadToRelative(-71f, 0f, -120.5f, -49.5f)
                reflectiveQuadTo(280f, 450f)
                quadToRelative(0f, -71f, 49.5f, -120.5f)
                reflectiveQuadTo(450f, 280f)
                quadToRelative(71f, 0f, 120.5f, 49.5f)
                reflectiveQuadTo(620f, 450f)
                quadToRelative(0f, 23f, -6.5f, 45.5f)
                reflectiveQuadTo(594f, 538f)
                lineToRelative(106f, 106f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                close()
                moveTo(120f, 360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Frame_inspect!!
    }

private var _Frame_inspect: ImageVector? = null

