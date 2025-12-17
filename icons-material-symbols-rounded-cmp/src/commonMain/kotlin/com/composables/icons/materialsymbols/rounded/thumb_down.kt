package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Thumb_down: ImageVector
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
                quadToRelative(0f, -7f, 2f, -15f)
                reflectiveQuadToRelative(4f, -15f)
                lineToRelative(120f, -282f)
                quadToRelative(9f, -20f, 30f, -34f)
                reflectiveQuadToRelative(44f, -14f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(520f)
                lineTo(440f, 878f)
                quadToRelative(-15f, 15f, -35.5f, 17.5f)
                reflectiveQuadTo(365f, 888f)
                quadToRelative(-19f, -10f, -28f, -28f)
                reflectiveQuadToRelative(-4f, -37f)
                lineToRelative(45f, -183f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, -34f)
                verticalLineToRelative(-406f)
                horizontalLineTo(240f)
                lineTo(120f, 480f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(360f)
                lineToRelative(-54f, 220f)
                lineToRelative(174f, -174f)
                close()
                moveToRelative(200f, -486f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 640f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-360f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(-200f, 80f)
                verticalLineToRelative(406f)
                verticalLineToRelative(-406f)
                close()
            }
        }.build()
        
        return _Thumb_down!!
    }

private var _Thumb_down: ImageVector? = null

