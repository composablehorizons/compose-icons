package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Person_filled: ImageVector
    get() {
        if (_Person_filled != null) return _Person_filled!!
        
        _Person_filled = ImageVector.Builder(
            name = "person_filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                quadToRelative(-1.65f, 0f, -2.825f, -1.175f)
                quadTo(8f, 9.65f, 8f, 8f)
                quadToRelative(0f, -1.65f, 1.175f, -2.825f)
                quadTo(10.35f, 4f, 12f, 4f)
                quadToRelative(1.65f, 0f, 2.825f, 1.175f)
                quadTo(16f, 6.35f, 16f, 8f)
                quadToRelative(0f, 1.65f, -1.175f, 2.825f)
                quadTo(13.65f, 12f, 12f, 12f)
                close()
                moveToRelative(-8f, 8f)
                verticalLineToRelative(-2.8f)
                quadToRelative(0f, -0.85f, 0.438f, -1.563f)
                quadToRelative(0.437f, -0.712f, 1.162f, -1.087f)
                quadToRelative(1.55f, -0.775f, 3.15f, -1.163f)
                quadTo(10.35f, 13f, 12f, 13f)
                reflectiveQuadToRelative(3.25f, 0.387f)
                quadToRelative(1.6f, 0.388f, 3.15f, 1.163f)
                quadToRelative(0.725f, 0.375f, 1.162f, 1.087f)
                quadTo(20f, 16.35f, 20f, 17.2f)
                verticalLineTo(20f)
                close()
            }
        }.build()
        
        return _Person_filled!!
    }

private var _Person_filled: ImageVector? = null

