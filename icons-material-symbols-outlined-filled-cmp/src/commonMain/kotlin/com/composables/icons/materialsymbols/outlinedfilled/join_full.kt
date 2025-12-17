package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Join_full: ImageVector
    get() {
        if (_Join_full != null) return _Join_full!!
        
        _Join_full = ImageVector.Builder(
            name = "join_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 19f)
                quadToRelative(-0.55f, 0f, -1.087f, -0.087f)
                quadToRelative(-0.538f, -0.088f, -1.088f, -0.288f)
                quadTo(15.1f, 17.6f, 15.8f, 15.875f)
                quadToRelative(0.7f, -1.725f, 0.7f, -3.875f)
                reflectiveQuadToRelative(-0.7f, -3.875f)
                quadToRelative(-0.7f, -1.725f, -1.975f, -2.75f)
                quadToRelative(0.55f, -0.2f, 1.088f, -0.287f)
                quadTo(15.45f, 5f, 16f, 5f)
                quadToRelative(2.925f, 0f, 4.962f, 2.037f)
                quadTo(23f, 9.075f, 23f, 12f)
                quadToRelative(0f, 2.925f, -2.038f, 4.962f)
                quadTo(18.925f, 19f, 16f, 19f)
                close()
                moveToRelative(-4f, -1.25f)
                quadToRelative(-1.25f, 0f, -2.125f, -1.675f)
                reflectiveQuadTo(9f, 12f)
                quadToRelative(0f, -2.4f, 0.875f, -4.075f)
                quadTo(10.75f, 6.25f, 12f, 6.25f)
                reflectiveQuadToRelative(2.125f, 1.675f)
                quadTo(15f, 9.6f, 15f, 12f)
                quadToRelative(0f, 2.4f, -0.875f, 4.075f)
                quadTo(13.25f, 17.75f, 12f, 17.75f)
                close()
                moveTo(8f, 19f)
                quadToRelative(-2.925f, 0f, -4.962f, -2.038f)
                quadTo(1f, 14.925f, 1f, 12f)
                reflectiveQuadToRelative(2.038f, -4.963f)
                quadTo(5.075f, 5f, 8f, 5f)
                quadToRelative(0.55f, 0f, 1.088f, 0.088f)
                quadToRelative(0.537f, 0.087f, 1.087f, 0.287f)
                quadTo(8.9f, 6.4f, 8.2f, 8.125f)
                quadTo(7.5f, 9.85f, 7.5f, 12f)
                reflectiveQuadToRelative(0.7f, 3.875f)
                quadToRelative(0.7f, 1.725f, 1.975f, 2.75f)
                quadToRelative(-0.55f, 0.2f, -1.087f, 0.288f)
                quadTo(8.55f, 19f, 8f, 19f)
                close()
            }
        }.build()
        
        return _Join_full!!
    }

private var _Join_full: ImageVector? = null

