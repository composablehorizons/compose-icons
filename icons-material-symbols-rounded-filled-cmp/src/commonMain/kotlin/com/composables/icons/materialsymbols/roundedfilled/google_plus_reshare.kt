package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Google_plus_reshare: ImageVector
    get() {
        if (_Google_plus_reshare != null) return _Google_plus_reshare!!
        
        _Google_plus_reshare = ImageVector.Builder(
            name = "google_plus_reshare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 19f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(3f, 18.425f, 3f, 18f)
                verticalLineToRelative(-3f)
                quadToRelative(0f, -2.075f, 1.463f, -3.538f)
                quadTo(5.925f, 10f, 8f, 10f)
                horizontalLineToRelative(9.2f)
                lineToRelative(-2.925f, -2.925f)
                quadTo(14f, 6.8f, 14f, 6.4f)
                reflectiveQuadToRelative(0.3f, -0.7f)
                quadToRelative(0.275f, -0.275f, 0.7f, -0.275f)
                quadToRelative(0.425f, 0f, 0.7f, 0.275f)
                lineToRelative(4.6f, 4.6f)
                quadToRelative(0.15f, 0.15f, 0.213f, 0.325f)
                quadToRelative(0.062f, 0.175f, 0.062f, 0.375f)
                reflectiveQuadToRelative(-0.062f, 0.375f)
                quadToRelative(-0.063f, 0.175f, -0.213f, 0.325f)
                lineToRelative(-4.625f, 4.625f)
                quadTo(15.4f, 16.6f, 15f, 16.6f)
                reflectiveQuadToRelative(-0.7f, -0.3f)
                quadToRelative(-0.275f, -0.275f, -0.275f, -0.7f)
                quadToRelative(0f, -0.425f, 0.275f, -0.7f)
                lineToRelative(2.9f, -2.9f)
                horizontalLineTo(8f)
                quadToRelative(-1.25f, 0f, -2.125f, 0.875f)
                reflectiveQuadTo(5f, 15f)
                verticalLineToRelative(3f)
                quadToRelative(0f, 0.425f, -0.287f, 0.712f)
                quadTo(4.425f, 19f, 4f, 19f)
                close()
            }
        }.build()
        
        return _Google_plus_reshare!!
    }

private var _Google_plus_reshare: ImageVector? = null

