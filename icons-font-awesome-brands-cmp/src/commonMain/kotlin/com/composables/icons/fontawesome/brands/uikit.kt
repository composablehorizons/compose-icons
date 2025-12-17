package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Uikit: ImageVector
    get() {
        if (_Uikit != null) return _Uikit!!
        
        _Uikit = ImageVector.Builder(
            name = "uikit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(443.9f, 128f)
                verticalLineToRelative(256f)
                lineTo(218f, 512f)
                lineTo(0f, 384f)
                verticalLineTo(169.7f)
                lineToRelative(87.6f, 45.1f)
                verticalLineToRelative(117f)
                lineToRelative(133.5f, 75.5f)
                lineToRelative(135.8f, -75.5f)
                verticalLineToRelative(-151f)
                lineToRelative(-101.1f, -57.6f)
                lineToRelative(87.6f, -53.1f)
                lineTo(443.9f, 128f)
                close()
                moveTo(308.6f, 49.1f)
                lineTo(223.8f, 0f)
                lineToRelative(-88.6f, 54.8f)
                lineToRelative(86f, 47.3f)
                lineToRelative(87.4f, -53f)
                close()
            }
        }.build()
        
        return _Uikit!!
    }

private var _Uikit: ImageVector? = null

