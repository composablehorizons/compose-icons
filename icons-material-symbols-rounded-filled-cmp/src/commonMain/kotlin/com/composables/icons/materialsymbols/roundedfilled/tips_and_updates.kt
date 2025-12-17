package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tips_and_updates: ImageVector
    get() {
        if (_Tips_and_updates != null) return _Tips_and_updates!!
        
        _Tips_and_updates = ImageVector.Builder(
            name = "tips_and_updates",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.375f, 8.625f)
                lineTo(20f, 8f)
                lineToRelative(1.375f, -0.625f)
                lineTo(22f, 6f)
                lineToRelative(0.625f, 1.375f)
                lineTo(24f, 8f)
                lineToRelative(-1.375f, 0.625f)
                lineTo(22f, 10f)
                close()
                moveTo(18.05f, 3.95f)
                lineTo(16f, 3f)
                lineToRelative(2.05f, -0.95f)
                lineTo(19f, 0f)
                lineToRelative(0.95f, 2.05f)
                lineTo(22f, 3f)
                lineToRelative(-2.05f, 0.95f)
                lineTo(19f, 6f)
                close()
                moveTo(9f, 22f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(7f, 20.825f, 7f, 20f)
                horizontalLineToRelative(4f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(9.825f, 22f, 9f, 22f)
                close()
                moveToRelative(-3f, -3f)
                quadToRelative(-0.425f, 0f, -0.713f, -0.288f)
                quadTo(5f, 18.425f, 5f, 18f)
                reflectiveQuadToRelative(0.287f, -0.712f)
                quadTo(5.575f, 17f, 6f, 17f)
                horizontalLineToRelative(6f)
                quadToRelative(0.425f, 0f, 0.713f, 0.288f)
                quadToRelative(0.287f, 0.287f, 0.287f, 0.712f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(12.425f, 19f, 12f, 19f)
                close()
                moveToRelative(-0.75f, -3f)
                quadToRelative(-1.725f, -1.025f, -2.737f, -2.75f)
                quadTo(1.5f, 11.525f, 1.5f, 9.5f)
                quadToRelative(0f, -3.125f, 2.188f, -5.312f)
                quadTo(5.875f, 2f, 9f, 2f)
                quadToRelative(3.125f, 0f, 5.312f, 2.188f)
                quadTo(16.5f, 6.375f, 16.5f, 9.5f)
                quadToRelative(0f, 2.025f, -1.012f, 3.75f)
                quadToRelative(-1.013f, 1.725f, -2.738f, 2.75f)
                close()
            }
        }.build()
        
        return _Tips_and_updates!!
    }

private var _Tips_and_updates: ImageVector? = null

