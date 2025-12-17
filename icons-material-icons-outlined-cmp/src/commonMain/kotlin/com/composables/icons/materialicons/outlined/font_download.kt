package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Font_download: ImageVector
    get() {
        if (_Font_download != null) return _Font_download!!
        
        _Font_download = ImageVector.Builder(
            name = "font_download",
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
                moveTo(9.17f, 15.5f)
                horizontalLineToRelative(5.64f)
                lineToRelative(1.14f, 3f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-5.11f, -13f)
                horizontalLineToRelative(-1.86f)
                lineToRelative(-5.11f, 13f)
                horizontalLineToRelative(2.09f)
                lineToRelative(1.12f, -3f)
                close()
                moveTo(12f, 7.98f)
                lineToRelative(2.07f, 5.52f)
                horizontalLineTo(9.93f)
                lineTo(12f, 7.98f)
                close()
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Font_download!!
    }

private var _Font_download: ImageVector? = null

