package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileImport: ImageVector
    get() {
        if (_FileImport != null) return _FileImport!!
        
        _FileImport = ImageVector.Builder(
            name = "file-import",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 288f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(112f)
                verticalLineToRelative(-64f)
                close()
                moveToRelative(489f, -183f)
                lineTo(407.1f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(384f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                close()
                moveToRelative(-153f, 31f)
                verticalLineTo(0f)
                horizontalLineTo(152f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(264f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-65.2f)
                curveToRelative(0f, -14.3f, 17.3f, -21.4f, 27.4f, -11.3f)
                lineTo(379f, 308f)
                curveToRelative(6.6f, 6.7f, 6.6f, 17.4f, 0f, 24f)
                lineToRelative(-95.7f, 96.4f)
                curveToRelative(-10.1f, 10.1f, -27.4f, 3f, -27.4f, -11.3f)
                verticalLineTo(352f)
                horizontalLineTo(128f)
                verticalLineToRelative(136f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(376f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
            }
        }.build()
        
        return _FileImport!!
    }

private var _FileImport: ImageVector? = null

