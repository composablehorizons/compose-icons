package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_in_ar_new: ImageVector
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
                moveTo(12f, 20.175f)
                lineToRelative(-7f, -4.05f)
                verticalLineToRelative(-8.1f)
                lineToRelative(7f, -4.05f)
                lineToRelative(7f, 4.05f)
                verticalLineToRelative(8.1f)
                close()
                moveTo(1f, 6f)
                verticalLineTo(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(5f, 17f)
                horizontalLineTo(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(12f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(3f, -17f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(-9f, 11.825f)
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
                verticalLineToRelative(4.6f)
                close()
            }
        }.build()
        
        return _View_in_ar_new!!
    }

private var _View_in_ar_new: ImageVector? = null

