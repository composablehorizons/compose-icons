package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.No_stroller: ImageVector
    get() {
        if (_No_stroller != null) return _No_stroller!!
        
        _No_stroller = ImageVector.Builder(
            name = "no_stroller",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 880f)
                close()
                moveToRelative(440f, -313f)
                lineTo(479f, 366f)
                lineToRelative(169f, -199f)
                quadToRelative(19f, -22f, 44f, -34.5f)
                reflectiveQuadToRelative(54f, -12.5f)
                quadToRelative(56f, 0f, 95f, 39f)
                reflectiveQuadToRelative(39f, 95f)
                verticalLineToRelative(26f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-26f)
                quadToRelative(0f, -23f, -15.5f, -38.5f)
                reflectiveQuadTo(746f, 200f)
                quadToRelative(-10f, 0f, -19f, 4f)
                reflectiveQuadToRelative(-16f, 12f)
                lineToRelative(-31f, 35f)
                verticalLineToRelative(316f)
                close()
                moveToRelative(-80f, 33f)
                lineToRelative(79f, 80f)
                horizontalLineTo(211f)
                lineToRelative(164f, -193f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                lineToRelative(-304f, -304f)
                horizontalLineToRelative(113f)
                close()
                moveToRelative(40f, 280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 880f)
                close()
                moveTo(436f, 323f)
                lineTo(261f, 148f)
                quadToRelative(33f, -14f, 68f, -21f)
                reflectiveQuadToRelative(71f, -7f)
                quadToRelative(45f, 0f, 88.5f, 11f)
                reflectiveQuadToRelative(83.5f, 33f)
                lineTo(436f, 323f)
                close()
            }
        }.build()
        
        return _No_stroller!!
    }

private var _No_stroller: ImageVector? = null

