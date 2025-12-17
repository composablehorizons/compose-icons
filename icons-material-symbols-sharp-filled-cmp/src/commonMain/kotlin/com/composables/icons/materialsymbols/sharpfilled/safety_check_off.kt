package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Safety_check_off: ImageVector
    get() {
        if (_Safety_check_off != null) return _Safety_check_off!!
        
        _Safety_check_off = ImageVector.Builder(
            name = "safety_check_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineToRelative(56f, -56f)
                lineToRelative(-736f, -736f)
                lineToRelative(-56f, 56f)
                lineToRelative(104f, 104f)
                verticalLineToRelative(172f)
                quadToRelative(0f, 152f, 90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(51f, -14f, 97.5f, -40.5f)
                reflectiveQuadTo(662f, 774f)
                lineTo(792f, 904f)
                close()
                moveTo(480f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -20f, 3.5f, -38.5f)
                reflectiveQuadTo(294f, 406f)
                lineToRelative(260f, 260f)
                quadToRelative(-17f, 7f, -35.5f, 10.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(274f, -38f)
                quadToRelative(23f, -47f, 34.5f, -97f)
                reflectiveQuadTo(800f, 444f)
                verticalLineToRelative(-244f)
                lineTo(480f, 80f)
                lineToRelative(-208f, 78f)
                lineToRelative(135f, 136f)
                quadToRelative(17f, -7f, 35f, -10.5f)
                reflectiveQuadToRelative(38f, -3.5f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 20f, -3.5f, 38.5f)
                reflectiveQuadTo(666f, 554f)
                lineToRelative(88f, 88f)
                close()
            }
        }.build()
        
        return _Safety_check_off!!
    }

private var _Safety_check_off: ImageVector? = null

