package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Web_asset_off: ImageVector
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
                moveTo(20.49f, 23.31f)
                lineTo(17.17f, 20f)
                horizontalLineTo(4f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.34f, 0.08f, -0.66f, 0.23f, -0.94f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
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

