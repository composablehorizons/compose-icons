package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Import_export: ImageVector
    get() {
        if (_Import_export != null) return _Import_export!!
        
        _Import_export = ImageVector.Builder(
            name = "import_export",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 3f)
                lineTo(5f, 6.99f)
                horizontalLineToRelative(3f)
                verticalLineTo(14f)
                horizontalLineToRelative(2f)
                verticalLineTo(6.99f)
                horizontalLineToRelative(3f)
                lineTo(9f, 3f)
                close()
                moveToRelative(7f, 14.01f)
                verticalLineTo(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.01f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 21f)
                lineToRelative(4f, -3.99f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Import_export!!
    }

private var _Import_export: ImageVector? = null

