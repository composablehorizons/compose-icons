package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Thumbs_up_down: ImageVector
    get() {
        if (_Thumbs_up_down != null) return _Thumbs_up_down!!
        
        _Thumbs_up_down = ImageVector.Builder(
            name = "thumbs_up_down",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(5.82f)
                lineToRelative(0.66f, -3.18f)
                lineToRelative(0.02f, -0.23f)
                curveToRelative(0f, -0.31f, -0.13f, -0.59f, -0.33f, -0.8f)
                lineTo(5.38f, 0f)
                lineTo(0.44f, 4.94f)
                curveTo(0.17f, 5.21f, 0f, 5.59f, 0f, 6f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.75f)
                curveToRelative(0.62f, 0f, 1.15f, -0.38f, 1.38f, -0.91f)
                lineToRelative(2.26f, -5.29f)
                curveToRelative(0.07f, -0.17f, 0.11f, -0.36f, 0.11f, -0.55f)
                verticalLineTo(6f)
                close()
                moveToRelative(10.5f, 4f)
                horizontalLineToRelative(-6.75f)
                curveToRelative(-0.62f, 0f, -1.15f, 0.38f, -1.38f, 0.91f)
                lineToRelative(-2.26f, 5.29f)
                curveToRelative(-0.07f, 0.17f, -0.11f, 0.36f, -0.11f, 0.55f)
                verticalLineTo(18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.18f)
                lineToRelative(-0.66f, 3.18f)
                lineToRelative(-0.02f, 0.24f)
                curveToRelative(0f, 0.31f, 0.13f, 0.59f, 0.33f, 0.8f)
                lineToRelative(0.79f, 0.78f)
                lineToRelative(4.94f, -4.94f)
                curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.build()
        
        return _Thumbs_up_down!!
    }

private var _Thumbs_up_down: ImageVector? = null

