package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Google_plus_reshare: ImageVector
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
                moveTo(3f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                quadToRelative(0f, -1.25f, 0.875f, -2.125f)
                reflectiveQuadTo(8f, 12f)
                horizontalLineToRelative(9.2f)
                lineToRelative(-3.6f, 3.6f)
                lineTo(15f, 17f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(3.6f, 3.6f)
                horizontalLineTo(8f)
                quadToRelative(-2.075f, 0f, -3.537f, 1.462f)
                quadTo(3f, 12.925f, 3f, 15f)
                close()
            }
        }.build()
        
        return _Google_plus_reshare!!
    }

private var _Google_plus_reshare: ImageVector? = null

