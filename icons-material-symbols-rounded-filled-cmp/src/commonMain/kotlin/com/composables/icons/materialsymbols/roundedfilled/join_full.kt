package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Join_full: ImageVector
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
                moveTo(12f, 17.45f)
                quadToRelative(-0.2f, 0f, -0.362f, -0.063f)
                quadToRelative(-0.163f, -0.062f, -0.313f, -0.187f)
                quadToRelative(-1.075f, -0.95f, -1.7f, -2.363f)
                quadTo(9f, 13.425f, 9f, 12f)
                quadToRelative(0f, -1.425f, 0.625f, -2.838f)
                quadTo(10.25f, 7.75f, 11.3f, 6.8f)
                quadToRelative(0.15f, -0.125f, 0.325f, -0.2f)
                quadToRelative(0.175f, -0.075f, 0.375f, -0.075f)
                reflectiveQuadToRelative(0.363f, 0.075f)
                quadToRelative(0.162f, 0.075f, 0.312f, 0.2f)
                quadToRelative(1.075f, 0.95f, 1.7f, 2.362f)
                quadTo(15f, 10.575f, 15f, 12f)
                reflectiveQuadToRelative(-0.625f, 2.837f)
                quadTo(13.75f, 16.25f, 12.7f, 17.2f)
                quadToRelative(-0.125f, 0.125f, -0.312f, 0.187f)
                quadToRelative(-0.188f, 0.063f, -0.388f, 0.063f)
                close()
                moveTo(16f, 19f)
                quadToRelative(-0.675f, 0f, -1.312f, -0.125f)
                quadToRelative(-0.638f, -0.125f, -1.238f, -0.375f)
                quadToRelative(1.4f, -0.925f, 2.225f, -2.9f)
                quadToRelative(0.825f, -1.975f, 0.825f, -3.6f)
                reflectiveQuadToRelative(-0.825f, -3.6f)
                quadToRelative(-0.825f, -1.975f, -2.225f, -2.9f)
                quadToRelative(0.6f, -0.25f, 1.238f, -0.375f)
                quadTo(15.325f, 5f, 16f, 5f)
                quadToRelative(2.925f, 0f, 4.962f, 2.037f)
                quadTo(23f, 9.075f, 23f, 12f)
                quadToRelative(0f, 2.925f, -2.038f, 4.962f)
                quadTo(18.925f, 19f, 16f, 19f)
                close()
                moveToRelative(-8f, 0f)
                quadToRelative(-2.925f, 0f, -4.962f, -2.038f)
                quadTo(1f, 14.925f, 1f, 12f)
                reflectiveQuadToRelative(2.038f, -4.963f)
                quadTo(5.075f, 5f, 8f, 5f)
                quadToRelative(0.675f, 0f, 1.312f, 0.125f)
                quadToRelative(0.638f, 0.125f, 1.238f, 0.375f)
                quadToRelative(-1.4f, 0.925f, -2.225f, 2.9f)
                quadTo(7.5f, 10.375f, 7.5f, 12f)
                reflectiveQuadToRelative(0.825f, 3.6f)
                quadToRelative(0.825f, 1.975f, 2.225f, 2.9f)
                quadToRelative(-0.6f, 0.25f, -1.238f, 0.375f)
                quadTo(8.675f, 19f, 8f, 19f)
                close()
            }
        }.build()
        
        return _Join_full!!
    }

private var _Join_full: ImageVector? = null

