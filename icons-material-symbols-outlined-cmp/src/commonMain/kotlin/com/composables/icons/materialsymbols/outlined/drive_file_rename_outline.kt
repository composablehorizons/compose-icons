package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Drive_file_rename_outline: ImageVector
    get() {
        if (_Drive_file_rename_outline != null) return _Drive_file_rename_outline!!
        
        _Drive_file_rename_outline = ImageVector.Builder(
            name = "drive_file_rename_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 21f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(-6f, -2f)
                horizontalLineToRelative(1.4f)
                lineToRelative(8.625f, -8.625f)
                lineToRelative(-1.4f, -1.4f)
                lineTo(4f, 17.6f)
                close()
                moveTo(18.3f, 8.925f)
                lineToRelative(-4.25f, -4.2f)
                lineToRelative(1.4f, -1.4f)
                quadToRelative(0.575f, -0.575f, 1.413f, -0.575f)
                quadToRelative(0.837f, 0f, 1.412f, 0.575f)
                lineToRelative(1.4f, 1.4f)
                quadToRelative(0.575f, 0.575f, 0.6f, 1.388f)
                quadToRelative(0.025f, 0.812f, -0.55f, 1.387f)
                close()
                moveTo(16.85f, 10.4f)
                lineTo(6.25f, 21f)
                horizontalLineTo(2f)
                verticalLineToRelative(-4.25f)
                lineToRelative(10.6f, -10.6f)
                close()
                moveToRelative(-3.525f, -0.725f)
                lineToRelative(-0.7f, -0.7f)
                lineToRelative(1.4f, 1.4f)
                close()
            }
        }.build()
        
        return _Drive_file_rename_outline!!
    }

private var _Drive_file_rename_outline: ImageVector? = null

