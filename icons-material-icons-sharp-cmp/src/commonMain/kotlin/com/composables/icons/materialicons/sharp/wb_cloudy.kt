package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wb_cloudy: ImageVector
    get() {
        if (_Wb_cloudy != null) return _Wb_cloudy!!
        
        _Wb_cloudy = ImageVector.Builder(
            name = "wb_cloudy",
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
                moveTo(19.37f, 10.04f)
                curveTo(18.68f, 6.59f, 15.65f, 4f, 12.01f, 4f)
                curveToRelative(-2.89f, 0f, -5.4f, 1.64f, -6.65f, 4.04f)
                curveTo(2.35f, 8.36f, 0.01f, 10.91f, 0.01f, 14f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.64f, -2.05f, -4.78f, -4.64f, -4.96f)
                close()
            }
        }.build()
        
        return _Wb_cloudy!!
    }

private var _Wb_cloudy: ImageVector? = null

