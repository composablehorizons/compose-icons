package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Branding_watermark: ImageVector
    get() {
        if (_Branding_watermark != null) return _Branding_watermark!!
        
        _Branding_watermark = ImageVector.Builder(
            name = "branding_watermark",
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
                moveTo(23f, 3f)
                horizontalLineTo(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(22f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Branding_watermark!!
    }

private var _Branding_watermark: ImageVector? = null

