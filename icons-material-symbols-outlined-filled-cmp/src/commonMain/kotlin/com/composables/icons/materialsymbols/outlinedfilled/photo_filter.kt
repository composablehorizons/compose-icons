package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Photo_filter: ImageVector
    get() {
        if (_Photo_filter != null) return _Photo_filter!!
        
        _Photo_filter = ImageVector.Builder(
            name = "photo_filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 21f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 19.825f, 3f, 19f)
                verticalLineTo(5f)
                quadToRelative(0f, -0.825f, 0.587f, -1.413f)
                quadTo(4.175f, 3f, 5f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(19.825f, 21f, 19f, 21f)
                close()
                moveToRelative(7f, -5f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(8f, 12f)
                lineToRelative(2.75f, -1.25f)
                lineTo(12f, 8f)
                lineToRelative(1.25f, 2.75f)
                lineTo(16f, 12f)
                lineToRelative(-2.75f, 1.25f)
                close()
                moveToRelative(5f, -6f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(14f, 7f)
                lineToRelative(2.05f, -0.95f)
                lineTo(17f, 4f)
                lineToRelative(0.95f, 2.05f)
                lineTo(20f, 7f)
                lineToRelative(-2.05f, 0.95f)
                close()
            }
        }.build()
        
        return _Photo_filter!!
    }

private var _Photo_filter: ImageVector? = null

