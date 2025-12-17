package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_rotate_lock: ImageVector
    get() {
        if (_Mobile_rotate_lock != null) return _Mobile_rotate_lock!!
        
        _Mobile_rotate_lock = ImageVector.Builder(
            name = "mobile_rotate_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(800f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(40f)
                close()
                moveTo(550f, 832f)
                lineTo(128f, 410f)
                lineToRelative(282f, -282f)
                lineToRelative(422f, 422f)
                lineToRelative(-282f, 282f)
                close()
                moveToRelative(0f, -112f)
                lineToRelative(170f, -170f)
                lineToRelative(-310f, -310f)
                lineToRelative(-170f, 170f)
                lineToRelative(310f, 310f)
                close()
                moveTo(480f, 960f)
                quadToRelative(-99f, 0f, -186.5f, -37.5f)
                reflectiveQuadToRelative(-153f, -103f)
                quadTo(75f, 754f, 37.5f, 666.5f)
                reflectiveQuadTo(0f, 480f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 71f, 24f, 136f)
                reflectiveQuadToRelative(66.5f, 117f)
                quadTo(213f, 785f, 272f, 821.5f)
                reflectiveQuadTo(401f, 873f)
                lineTo(296f, 768f)
                lineToRelative(56f, -56f)
                lineTo(588f, 948f)
                quadToRelative(-26f, 6f, -53.5f, 9f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(0f, -480f)
                close()
                moveToRelative(-107f, -76f)
                quadToRelative(13f, 0f, 21.5f, -9f)
                reflectiveQuadToRelative(8.5f, -21f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(373f, 344f)
                quadToRelative(-12f, 0f, -21f, 8.5f)
                reflectiveQuadToRelative(-9f, 21.5f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                close()
            }
        }.build()
        
        return _Mobile_rotate_lock!!
    }

private var _Mobile_rotate_lock: ImageVector? = null

