package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Thumb_down: ImageVector
    get() {
        if (_Thumb_down != null) return _Thumb_down!!
        
        _Thumb_down = ImageVector.Builder(
            name = "thumb_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 640f)
                quadToRelative(-32f, 0f, -56f, -24f)
                reflectiveQuadToRelative(-24f, -56f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -7f, 1.5f, -15f)
                reflectiveQuadToRelative(4.5f, -15f)
                lineToRelative(120f, -282f)
                quadToRelative(9f, -20f, 30f, -34f)
                reflectiveQuadToRelative(44f, -14f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 200f)
                verticalLineToRelative(407f)
                quadToRelative(0f, 16f, -6.5f, 30.5f)
                reflectiveQuadTo(616f, 663f)
                lineTo(399f, 879f)
                quadToRelative(-15f, 14f, -35.5f, 17f)
                reflectiveQuadTo(324f, 889f)
                quadToRelative(-19f, -10f, -27.5f, -28f)
                reflectiveQuadToRelative(-3.5f, -37f)
                lineToRelative(45f, -184f)
                horizontalLineTo(120f)
                close()
                moveToRelative(680f, -520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(720f, 560f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(800f, 120f)
                close()
            }
        }.build()
        
        return _Thumb_down!!
    }

private var _Thumb_down: ImageVector? = null

