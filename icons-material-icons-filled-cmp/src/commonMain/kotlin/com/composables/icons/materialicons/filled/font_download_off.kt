package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Font_download_off: ImageVector
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
                moveTo(12.58f, 9.75f)
                lineToRelative(-0.87f, -0.87f)
                lineToRelative(0.23f, -0.66f)
                horizontalLineToRelative(0.1f)
                lineTo(12.58f, 9.75f)
                close()
                moveTo(10.35f, 7.52f)
                lineTo(10.92f, 6f)
                horizontalLineToRelative(2.14f)
                lineToRelative(2.55f, 6.79f)
                lineTo(22f, 19.17f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4.83f)
                lineTo(10.35f, 7.52f)
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
                moveTo(12.1f, 14.93f)
                lineToRelative(-3.3f, -3.3f)
                lineTo(6.41f, 18f)
                horizontalLineToRelative(2.08f)
                lineToRelative(1.09f, -3.07f)
                horizontalLineTo(12.1f)
                close()
            }
        }.build()
        
        return _Font_download_off!!
    }

private var _Font_download_off: ImageVector? = null

