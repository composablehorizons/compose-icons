package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Videocam_off: ImageVector
    get() {
        if (_Videocam_off != null) return _Videocam_off!!
        
        _Videocam_off = ImageVector.Builder(
            name = "videocam_off",
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
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 6.5f)
                lineToRelative(-4f, 4f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(9.82f)
                lineTo(21f, 17.18f)
                verticalLineTo(6.5f)
                close()
                moveTo(3.27f, 2f)
                lineTo(2f, 3.27f)
                lineTo(4.73f, 6f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.21f, 0f, 0.39f, -0.08f, 0.54f, -0.18f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineTo(3.27f, 2f)
                close()
            }
        }.build()
        
        return _Videocam_off!!
    }

private var _Videocam_off: ImageVector? = null

