package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.View_in_ar_new: ImageVector
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
                moveTo(2f, 6f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.287f)
                quadTo(1f, 5.425f, 1f, 5f)
                verticalLineTo(4f)
                quadToRelative(0f, -1.25f, 0.875f, -2.125f)
                reflectiveQuadTo(4f, 1f)
                horizontalLineToRelative(1f)
                quadToRelative(0.425f, 0f, 0.713f, 0.287f)
                quadTo(6f, 1.575f, 6f, 2f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(5.425f, 3f, 5f, 3f)
                horizontalLineTo(4f)
                quadToRelative(-0.425f, 0f, -0.712f, 0.287f)
                quadTo(3f, 3.575f, 3f, 4f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 0.425f, -0.287f, 0.713f)
                quadTo(2.425f, 6f, 2f, 6f)
                close()
                moveToRelative(2f, 17f)
                quadToRelative(-1.25f, 0f, -2.125f, -0.875f)
                reflectiveQuadTo(1f, 20f)
                verticalLineToRelative(-1f)
                quadToRelative(0f, -0.425f, 0.288f, -0.712f)
                quadTo(1.575f, 18f, 2f, 18f)
                reflectiveQuadToRelative(0.713f, 0.288f)
                quadTo(3f, 18.575f, 3f, 19f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 0.425f, 0.288f, 0.712f)
                quadTo(3.575f, 21f, 4f, 21f)
                horizontalLineToRelative(1f)
                quadToRelative(0.425f, 0f, 0.713f, 0.288f)
                quadTo(6f, 21.575f, 6f, 22f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(5.425f, 23f, 5f, 23f)
                close()
                moveToRelative(15f, 0f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(18f, 22.425f, 18f, 22f)
                reflectiveQuadToRelative(0.288f, -0.712f)
                quadTo(18.575f, 21f, 19f, 21f)
                horizontalLineToRelative(1f)
                quadToRelative(0.425f, 0f, 0.712f, -0.288f)
                quadTo(21f, 20.425f, 21f, 20f)
                verticalLineToRelative(-1f)
                quadToRelative(0f, -0.425f, 0.288f, -0.712f)
                quadTo(21.575f, 18f, 22f, 18f)
                reflectiveQuadToRelative(0.712f, 0.288f)
                quadTo(23f, 18.575f, 23f, 19f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 1.25f, -0.875f, 2.125f)
                reflectiveQuadTo(20f, 23f)
                close()
                moveToRelative(3f, -17f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.287f)
                quadTo(21f, 5.425f, 21f, 5f)
                verticalLineTo(4f)
                quadToRelative(0f, -0.425f, -0.288f, -0.713f)
                quadTo(20.425f, 3f, 20f, 3f)
                horizontalLineToRelative(-1f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(18f, 2.425f, 18f, 2f)
                reflectiveQuadToRelative(0.288f, -0.713f)
                quadTo(18.575f, 1f, 19f, 1f)
                horizontalLineToRelative(1f)
                quadToRelative(1.25f, 0f, 2.125f, 0.875f)
                reflectiveQuadTo(23f, 4f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 0.425f, -0.288f, 0.713f)
                quadTo(22.425f, 6f, 22f, 6f)
                close()
                moveTo(11f, 19.55f)
                lineToRelative(-5f, -2.875f)
                quadToRelative(-0.475f, -0.275f, -0.737f, -0.737f)
                quadTo(5f, 15.475f, 5f, 14.925f)
                verticalLineTo(9.2f)
                quadToRelative(0f, -0.55f, 0.263f, -1.013f)
                quadToRelative(0.262f, -0.462f, 0.737f, -0.737f)
                lineToRelative(5f, -2.875f)
                quadToRelative(0.475f, -0.275f, 1f, -0.275f)
                reflectiveQuadToRelative(1f, 0.275f)
                lineToRelative(5f, 2.875f)
                quadToRelative(0.475f, 0.275f, 0.738f, 0.737f)
                quadTo(19f, 8.65f, 19f, 9.2f)
                verticalLineToRelative(5.725f)
                quadToRelative(0f, 0.55f, -0.262f, 1.013f)
                quadToRelative(-0.263f, 0.462f, -0.738f, 0.737f)
                lineToRelative(-5f, 2.875f)
                quadToRelative(-0.475f, 0.275f, -1f, 0.275f)
                reflectiveQuadToRelative(-1f, -0.275f)
                close()
                moveToRelative(0f, -2.3f)
                verticalLineToRelative(-4.6f)
                lineToRelative(-4f, -2.3f)
                verticalLineToRelative(4.6f)
                close()
                moveToRelative(2f, 0f)
                lineToRelative(4f, -2.3f)
                verticalLineToRelative(-4.6f)
                lineToRelative(-4f, 2.3f)
                close()
                moveToRelative(-1f, -6.35f)
                lineToRelative(4f, -2.3f)
                lineToRelative(-4f, -2.3f)
                lineToRelative(-4f, 2.3f)
                close()
                moveToRelative(0f, 1.75f)
                close()
                moveToRelative(0f, -1.75f)
                close()
                moveToRelative(1f, 1.75f)
                close()
                moveToRelative(-2f, 0f)
                close()
            }
        }.build()
        
        return _View_in_ar_new!!
    }

private var _View_in_ar_new: ImageVector? = null

