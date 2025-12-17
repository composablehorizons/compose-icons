package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wb_cloudy: ImageVector
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
                moveTo(12.01f, 6f)
                curveToRelative(2.61f, 0f, 4.89f, 1.86f, 5.4f, 4.43f)
                lineToRelative(0.3f, 1.5f)
                lineToRelative(1.52f, 0.11f)
                curveToRelative(1.56f, 0.11f, 2.78f, 1.41f, 2.78f, 2.96f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-13f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f)
                lineToRelative(1.07f, -0.11f)
                lineToRelative(0.5f, -0.95f)
                curveTo(8.08f, 7.14f, 9.95f, 6f, 12.01f, 6f)
                moveToRelative(0f, -2f)
                curveTo(9.12f, 4f, 6.6f, 5.64f, 5.35f, 8.04f)
                curveTo(2.35f, 8.36f, 0.01f, 10.91f, 0.01f, 14f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.64f, -2.05f, -4.78f, -4.64f, -4.96f)
                curveTo(18.68f, 6.59f, 15.65f, 4f, 12.01f, 4f)
                close()
            }
        }.build()
        
        return _Wb_cloudy!!
    }

private var _Wb_cloudy: ImageVector? = null

