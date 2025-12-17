package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Web_asset_off: ImageVector
    get() {
        if (_Web_asset_off != null) return _Web_asset_off!!
        
        _Web_asset_off = ImageVector.Builder(
            name = "web_asset_off",
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
                moveTo(6.83f, 4f)
                horizontalLineTo(20f)
                curveToRelative(1.11f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.34f, -0.09f, 0.66f, -0.23f, 0.94f)
                lineTo(20f, 17.17f)
                verticalLineTo(8f)
                horizontalLineToRelative(-9.17f)
                lineTo(6.83f, 4f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(17.17f, 20f)
                horizontalLineTo(4f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.34f, 0.08f, -0.66f, 0.23f, -0.94f)
                lineTo(1.39f, 4.22f)
                curveTo(1f, 3.83f, 1f, 3.2f, 1.39f, 2.81f)
                lineToRelative(0f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(18.38f, 18.38f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0f, 0f)
                curveTo(20.8f, 23f, 20.17f, 23f, 19.78f, 22.61f)
                close()
                moveTo(15.17f, 18f)
                lineToRelative(-10f, -10f)
                horizontalLineTo(4f)
                verticalLineToRelative(10f)
                horizontalLineTo(15.17f)
                close()
            }
        }.build()
        
        return _Web_asset_off!!
    }

private var _Web_asset_off: ImageVector? = null

