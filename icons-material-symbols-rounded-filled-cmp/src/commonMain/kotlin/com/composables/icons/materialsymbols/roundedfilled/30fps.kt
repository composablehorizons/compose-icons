package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`30fps`: ImageVector
    get() {
        if (_30fps != null) return _30fps!!
        
        _30fps = ImageVector.Builder(
            name = "30fps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 700f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 640f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-100f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 420f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-100f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 260f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 200f)
                horizontalLineToRelative(180f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 35f, -24.5f, 59.5f)
                reflectiveQuadTo(356f, 480f)
                quadToRelative(35f, 0f, 59.5f, 24.5f)
                reflectiveQuadTo(440f, 564f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(280f, -120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-320f)
                horizontalLineTo(600f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(160f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _30fps!!
    }

private var _30fps: ImageVector? = null

