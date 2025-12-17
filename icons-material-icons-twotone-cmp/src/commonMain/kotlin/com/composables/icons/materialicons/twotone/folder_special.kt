package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Folder_special: ImageVector
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
                moveTo(11.17f, 8f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                horizontalLineToRelative(-8.83f)
                close()
                moveTo(15f, 9f)
                lineToRelative(1.19f, 2.79f)
                lineToRelative(3.03f, 0.26f)
                lineToRelative(-2.3f, 1.99f)
                lineToRelative(0.69f, 2.96f)
                lineTo(15f, 15.47f)
                lineTo(12.39f, 17f)
                lineToRelative(0.69f, -2.96f)
                lineToRelative(-2.3f, -1.99f)
                lineToRelative(3.03f, -0.26f)
                lineTo(15f, 9f)
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
                moveToRelative(0f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(5.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(20f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(-6.92f, -3.96f)
                lineTo(12.39f, 17f)
                lineTo(15f, 15.47f)
                lineTo(17.61f, 17f)
                lineToRelative(-0.69f, -2.96f)
                lineToRelative(2.3f, -1.99f)
                lineToRelative(-3.03f, -0.26f)
                lineTo(15f, 9f)
                lineToRelative(-1.19f, 2.79f)
                lineToRelative(-3.03f, 0.26f)
                close()
            }
        }.build()
        
        return _Folder_special!!
    }

private var _Folder_special: ImageVector? = null

