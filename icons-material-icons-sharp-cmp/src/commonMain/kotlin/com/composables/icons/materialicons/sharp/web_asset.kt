package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Web_asset: ImageVector
    get() {
        if (_Web_asset != null) return _Web_asset!!
        
        _Web_asset = ImageVector.Builder(
            name = "web_asset",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(18f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                close()
                moveToRelative(16f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Web_asset!!
    }

private var _Web_asset: ImageVector? = null

