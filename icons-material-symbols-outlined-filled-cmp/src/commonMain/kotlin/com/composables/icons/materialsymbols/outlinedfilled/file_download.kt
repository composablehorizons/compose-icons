package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.File_download: ImageVector
    get() {
        if (_File_download != null) return _File_download!!
        
        _File_download = ImageVector.Builder(
            name = "file_download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 20f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(4f, 18.825f, 4f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(18.825f, 20f, 18f, 20f)
                close()
                moveToRelative(6f, -4f)
                lineToRelative(-5f, -5f)
                lineToRelative(1.4f, -1.45f)
                lineToRelative(2.6f, 2.6f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.15f)
                lineToRelative(2.6f, -2.6f)
                lineTo(17f, 11f)
                close()
            }
        }.build()
        
        return _File_download!!
    }

private var _File_download: ImageVector? = null

