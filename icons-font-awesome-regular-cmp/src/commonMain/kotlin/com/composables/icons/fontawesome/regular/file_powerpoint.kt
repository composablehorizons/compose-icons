package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FilePowerpoint: ImageVector
    get() {
        if (_FilePowerpoint != null) return _FilePowerpoint!!
        
        _FilePowerpoint = ImageVector.Builder(
            name = "file-powerpoint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(369.9f, 97.9f)
                lineTo(286f, 14f)
                curveTo(277f, 5f, 264.8f, -0.1f, 252.1f, -0.1f)
                horizontalLineTo(48f)
                curveTo(21.5f, 0f, 0f, 21.5f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(131.9f)
                curveToRelative(0f, -12.7f, -5.1f, -25f, -14.1f, -34f)
                close()
                moveTo(332.1f, 128f)
                horizontalLineTo(256f)
                verticalLineTo(51.9f)
                lineToRelative(76.1f, 76.1f)
                close()
                moveTo(48f, 464f)
                verticalLineTo(48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(288f)
                horizontalLineTo(48f)
                close()
                moveToRelative(72f, -60f)
                verticalLineTo(236f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(69.2f)
                curveToRelative(36.7f, 0f, 62.8f, 27f, 62.8f, 66.3f)
                curveToRelative(0f, 74.3f, -68.7f, 66.5f, -95.5f, 66.5f)
                verticalLineTo(404f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(132f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                close()
                moveToRelative(48.5f, -87.4f)
                horizontalLineToRelative(23f)
                curveToRelative(7.9f, 0f, 13.9f, -2.4f, 18.1f, -7.2f)
                curveToRelative(8.5f, -9.8f, 8.4f, -28.5f, 0.1f, -37.8f)
                curveToRelative(-4.1f, -4.6f, -9.9f, -7f, -17.4f, -7f)
                horizontalLineToRelative(-23.9f)
                verticalLineToRelative(52f)
                close()
            }
        }.build()
        
        return _FilePowerpoint!!
    }

private var _FilePowerpoint: ImageVector? = null

