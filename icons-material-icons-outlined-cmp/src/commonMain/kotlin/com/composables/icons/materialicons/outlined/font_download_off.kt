package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Font_download_off: ImageVector
    get() {
        if (_Font_download_off != null) return _Font_download_off!!
        
        _Font_download_off = ImageVector.Builder(
            name = "font_download_off",
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
                moveTo(4.83f, 2f)
                horizontalLineTo(20f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(15.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(4f)
                horizontalLineTo(6.83f)
                lineTo(4.83f, 2f)
                close()
                moveTo(10.92f, 6f)
                lineToRelative(-0.57f, 1.52f)
                lineToRelative(1.36f, 1.36f)
                lineToRelative(0.23f, -0.66f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.54f, 1.52f)
                lineToRelative(3.04f, 3.04f)
                lineTo(13.07f, 6f)
                horizontalLineTo(10.92f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(19.17f, 22f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(4.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(17.17f, 20f)
                lineToRelative(-5.07f, -5.07f)
                horizontalLineTo(9.58f)
                lineTo(8.49f, 18f)
                horizontalLineTo(6.41f)
                lineToRelative(2.39f, -6.37f)
                lineTo(4f, 6.83f)
                verticalLineTo(20f)
                horizontalLineTo(17.17f)
                close()
            }
        }.build()
        
        return _Font_download_off!!
    }

private var _Font_download_off: ImageVector? = null

