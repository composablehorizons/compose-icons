package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Folder_special: ImageVector
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
                lineToRelative(-1.41f, -1.41f)
                curveTo(10.21f, 4.21f, 9.7f, 4f, 9.17f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-3.06f, 10.41f)
                lineTo(15f, 15.28f)
                lineToRelative(-1.94f, 1.13f)
                curveToRelative(-0.38f, 0.22f, -0.84f, -0.12f, -0.74f, -0.55f)
                lineToRelative(0.51f, -2.2f)
                lineToRelative(-1.69f, -1.46f)
                curveToRelative(-0.33f, -0.29f, -0.16f, -0.84f, 0.28f, -0.88f)
                lineToRelative(2.23f, -0.19f)
                lineToRelative(0.88f, -2.06f)
                curveToRelative(0.17f, -0.4f, 0.75f, -0.4f, 0.92f, 0f)
                lineToRelative(0.88f, 2.06f)
                lineToRelative(2.23f, 0.19f)
                curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f)
                lineToRelative(-1.69f, 1.46f)
                lineToRelative(0.51f, 2.2f)
                curveToRelative(0.11f, 0.43f, -0.35f, 0.77f, -0.72f, 0.55f)
                close()
            }
        }.build()
        
        return _Folder_special!!
    }

private var _Folder_special: ImageVector? = null

