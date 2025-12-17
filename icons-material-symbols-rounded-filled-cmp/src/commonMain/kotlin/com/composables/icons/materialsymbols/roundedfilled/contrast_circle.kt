package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Contrast_circle: ImageVector
    get() {
        if (_Contrast_circle != null) return _Contrast_circle!!
        
        _Contrast_circle = ImageVector.Builder(
            name = "contrast_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -64f, -24.5f, -122.5f)
                reflectiveQuadTo(706f, 254f)
                lineTo(254f, 706f)
                quadToRelative(45f, 45f, 103.5f, 69.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(30f, -160f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(480f, 610f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(510f, 580f)
                horizontalLineToRelative(140f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(680f, 610f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(650f, 640f)
                horizontalLineTo(510f)
                close()
                moveTo(320f, 380f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(350f, 460f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(380f, 430f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(50f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(460f, 350f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(430f, 320f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(350f, 240f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(320f, 270f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(-50f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 350f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 380f)
                horizontalLineToRelative(50f)
                close()
            }
        }.build()
        
        return _Contrast_circle!!
    }

private var _Contrast_circle: ImageVector? = null

