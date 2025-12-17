package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.File_download_off: ImageVector
    get() {
        if (_File_download_off != null) return _File_download_off!!
        
        _File_download_off = ImageVector.Builder(
            name = "file_download_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 15.17f)
                verticalLineTo(15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.17f)
                lineTo(18f, 15.17f)
                close()
                moveTo(15.41f, 12.59f)
                lineTo(17f, 11f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(14f, 11.17f)
                lineTo(15.41f, 12.59f)
                close()
                moveTo(13f, 10.17f)
                verticalLineTo(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.17f)
                lineTo(13f, 10.17f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-1.78f, -1.78f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(6.19f, 6.19f)
                lineTo(7f, 11f)
                lineToRelative(5f, 5f)
                lineToRelative(0.59f, -0.59f)
                lineTo(15.17f, 18f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3f)
                horizontalLineTo(4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(11.17f)
                lineToRelative(2.61f, 2.61f)
                lineTo(21.19f, 21.19f)
                close()
            }
        }.build()
        
        return _File_download_off!!
    }

private var _File_download_off: ImageVector? = null

