package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Thumbtack: ImageVector
    get() {
        if (_Thumbtack != null) return _Thumbtack!!
        
        _Thumbtack = ImageVector.Builder(
            name = "thumbtack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(298.028f, 214.267f)
                lineTo(285.793f, 96f)
                horizontalLineTo(328f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(56f)
                curveTo(42.745f, 0f, 32f, 10.745f, 32f, 24f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(42.207f)
                lineTo(85.972f, 214.267f)
                curveTo(37.465f, 236.82f, 0f, 277.261f, 0f, 328f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(136f)
                verticalLineToRelative(104.007f)
                curveToRelative(0f, 1.242f, 0.289f, 2.467f, 0.845f, 3.578f)
                lineToRelative(24f, 48f)
                curveToRelative(2.941f, 5.882f, 11.364f, 5.893f, 14.311f, 0f)
                lineToRelative(24f, -48f)
                arcToRelative(8.008f, 8.008f, 0f, false, false, 0.845f, -3.578f)
                verticalLineTo(352f)
                horizontalLineToRelative(136f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                curveToRelative(-0.001f, -51.183f, -37.983f, -91.42f, -85.973f, -113.733f)
                close()
            }
        }.build()
        
        return _Thumbtack!!
    }

private var _Thumbtack: ImageVector? = null

