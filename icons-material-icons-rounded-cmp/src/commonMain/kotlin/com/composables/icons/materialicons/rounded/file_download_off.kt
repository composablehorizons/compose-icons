package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.File_download_off: ImageVector
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
                moveTo(9f, 6.17f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.89f, 0f, 1.33f, 1.08f, 0.7f, 1.71f)
                lineToRelative(-1.88f, 1.88f)
                lineTo(9f, 6.17f)
                close()
                moveTo(20.49f, 20.49f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(-0.26f, 0.37f, -0.28f, 0.91f, 0.1f, 1.28f)
                lineToRelative(4.59f, 4.59f)
                curveToRelative(0.35f, 0.35f, 0.88f, 0.37f, 1.27f, 0.09f)
                lineTo(15.17f, 18f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.17f)
                lineToRelative(1.9f, 1.9f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                close()
            }
        }.build()
        
        return _File_download_off!!
    }

private var _File_download_off: ImageVector? = null

