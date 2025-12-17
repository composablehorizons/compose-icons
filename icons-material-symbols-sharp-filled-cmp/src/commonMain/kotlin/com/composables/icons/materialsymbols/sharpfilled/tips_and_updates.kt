package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tips_and_updates: ImageVector
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
                moveTo(22f, 10f)
                lineToRelative(-0.625f, -1.375f)
                lineTo(20f, 8f)
                lineToRelative(1.375f, -0.625f)
                lineTo(22f, 6f)
                lineToRelative(0.625f, 1.375f)
                lineTo(24f, 8f)
                lineToRelative(-1.375f, 0.625f)
                close()
                moveToRelative(-3f, -4f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(16f, 3f)
                lineToRelative(2.05f, -0.95f)
                lineTo(19f, 0f)
                lineToRelative(0.95f, 2.05f)
                lineTo(22f, 3f)
                lineToRelative(-2.05f, 0.95f)
                close()
                moveTo(9f, 22f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(7f, 20.825f, 7f, 20f)
                horizontalLineToRelative(4f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(9.825f, 22f, 9f, 22f)
                close()
                moveToRelative(-4f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0.25f, -3f)
                quadToRelative(-1.725f, -1.025f, -2.737f, -2.75f)
                quadTo(1.5f, 11.525f, 1.5f, 9.5f)
                quadToRelative(0f, -3.125f, 2.188f, -5.312f)
                quadTo(5.875f, 2f, 9f, 2f)
                quadToRelative(3.125f, 0f, 5.312f, 2.188f)
                quadTo(16.5f, 6.375f, 16.5f, 9.5f)
                quadToRelative(0f, 2.025f, -1.012f, 3.75f)
                quadToRelative(-1.013f, 1.725f, -2.738f, 2.75f)
                close()
                moveToRelative(0.6f, -2f)
                horizontalLineToRelative(6.3f)
                quadToRelative(1.125f, -0.8f, 1.737f, -1.975f)
                quadToRelative(0.613f, -1.175f, 0.613f, -2.525f)
                quadToRelative(0f, -2.3f, -1.6f, -3.9f)
                reflectiveQuadTo(9f, 4f)
                quadTo(6.7f, 4f, 5.1f, 5.6f)
                reflectiveQuadTo(3.5f, 9.5f)
                quadToRelative(0f, 1.35f, 0.613f, 2.525f)
                quadTo(4.725f, 13.2f, 5.85f, 14f)
                close()
                moveToRelative(0f, 0f)
                quadToRelative(-1.125f, -0.8f, -1.737f, -1.975f)
                quadTo(3.5f, 10.85f, 3.5f, 9.5f)
                quadToRelative(0f, -2.3f, 1.6f, -3.9f)
                reflectiveQuadTo(9f, 4f)
                quadToRelative(2.3f, 0f, 3.9f, 1.6f)
                reflectiveQuadToRelative(1.6f, 3.9f)
                quadToRelative(0f, 1.35f, -0.613f, 2.525f)
                quadTo(13.275f, 13.2f, 12.15f, 14f)
                close()
            }
        }.build()
        
        return _Tips_and_updates!!
    }

private var _Tips_and_updates: ImageVector? = null

