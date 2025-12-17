package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Folder_special: ImageVector
    get() {
        if (_Folder_special != null) return _Folder_special!!
        
        _Folder_special = ImageVector.Builder(
            name = "folder_special",
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
                moveTo(20f, 6f)
                horizontalLineToRelative(-8f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-2.06f, 11f)
                lineTo(15f, 15.28f)
                lineTo(12.06f, 17f)
                lineToRelative(0.78f, -3.33f)
                lineToRelative(-2.59f, -2.24f)
                lineToRelative(3.41f, -0.29f)
                lineTo(15f, 8f)
                lineToRelative(1.34f, 3.14f)
                lineToRelative(3.41f, 0.29f)
                lineToRelative(-2.59f, 2.24f)
                lineToRelative(0.78f, 3.33f)
                close()
            }
        }.build()
        
        return _Folder_special!!
    }

private var _Folder_special: ImageVector? = null

