package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.View_in_ar_new: ImageVector
    get() {
        if (_View_in_ar_new != null) return _View_in_ar_new!!
        
        _View_in_ar_new = ImageVector.Builder(
            name = "view_in_ar_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 23f)
                quadToRelative(-1.25f, 0f, -2.125f, -0.875f)
                reflectiveQuadTo(1f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                quadToRelative(0f, 0.425f, 0.288f, 0.712f)
                quadTo(3.575f, 21f, 4f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(14f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                quadToRelative(0.425f, 0f, 0.712f, -0.288f)
                quadTo(21f, 20.425f, 21f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                quadToRelative(0f, 1.25f, -0.875f, 2.125f)
                reflectiveQuadTo(20f, 23f)
                close()
                moveToRelative(-7f, -5.75f)
                lineToRelative(1f, 0.575f)
                lineToRelative(1f, -0.575f)
                verticalLineToRelative(-4.6f)
                lineToRelative(4f, -2.3f)
                verticalLineTo(9.175f)
                lineTo(16f, 8.6f)
                lineToRelative(-4f, 2.3f)
                lineToRelative(-4f, -2.3f)
                lineToRelative(-1f, 0.575f)
                verticalLineToRelative(1.175f)
                lineToRelative(4f, 2.3f)
                close()
                moveTo(1f, 6f)
                verticalLineTo(4f)
                quadToRelative(0f, -1.25f, 0.875f, -2.125f)
                reflectiveQuadTo(4f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                quadToRelative(-0.425f, 0f, -0.712f, 0.287f)
                quadTo(3f, 3.575f, 3f, 4f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(20f, 0f)
                verticalLineTo(4f)
                quadToRelative(0f, -0.425f, -0.288f, -0.713f)
                quadTo(20.425f, 3f, 20f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                quadToRelative(1.25f, 0f, 2.125f, 0.875f)
                reflectiveQuadTo(23f, 4f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 19.6f)
                lineToRelative(-5f, -2.9f)
                quadToRelative(-0.475f, -0.275f, -0.737f, -0.737f)
                quadTo(5f, 15.5f, 5f, 14.975f)
                verticalLineToRelative(-5.8f)
                quadToRelative(0f, -0.525f, 0.263f, -0.988f)
                quadToRelative(0.262f, -0.462f, 0.737f, -0.737f)
                lineToRelative(5f, -2.9f)
                quadToRelative(0.475f, -0.275f, 1f, -0.275f)
                reflectiveQuadToRelative(1f, 0.275f)
                lineToRelative(5f, 2.9f)
                quadToRelative(0.475f, 0.275f, 0.738f, 0.737f)
                quadToRelative(0.262f, 0.463f, 0.262f, 0.988f)
                verticalLineToRelative(5.8f)
                quadToRelative(0f, 0.525f, -0.262f, 0.988f)
                quadToRelative(-0.263f, 0.462f, -0.738f, 0.737f)
                lineToRelative(-5f, 2.9f)
                quadToRelative(-0.475f, 0.275f, -1f, 0.275f)
                reflectiveQuadToRelative(-1f, -0.275f)
                close()
            }
        }.build()
        
        return _View_in_ar_new!!
    }

private var _View_in_ar_new: ImageVector? = null

