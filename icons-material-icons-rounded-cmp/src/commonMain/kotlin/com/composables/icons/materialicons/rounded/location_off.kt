package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Location_off: ImageVector
    get() {
        if (_Location_off != null) return _Location_off!!
        
        _Location_off = ImageVector.Builder(
            name = "location_off",
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
                moveTo(2.71f, 3.56f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.47f, 2.47f)
                curveTo(5.07f, 7.95f, 5f, 8.47f, 5f, 9f)
                curveToRelative(0f, 4.17f, 4.42f, 9.92f, 6.23f, 12.11f)
                curveToRelative(0.4f, 0.48f, 1.13f, 0.48f, 1.53f, 0f)
                curveToRelative(0.65f, -0.78f, 1.62f, -2.01f, 2.61f, -3.46f)
                lineToRelative(2.65f, 2.65f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(4.12f, 3.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-1.84f, 0f, -3.5f, 0.71f, -4.75f, 1.86f)
                lineToRelative(3.19f, 3.19f)
                curveToRelative(0.43f, -0.34f, 0.97f, -0.55f, 1.56f, -0.55f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.59f, -0.21f, 1.13f, -0.56f, 1.56f)
                lineToRelative(3.55f, 3.55f)
                curveTo(18.37f, 12.36f, 19f, 10.57f, 19f, 9f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                close()
            }
        }.build()
        
        return _Location_off!!
    }

private var _Location_off: ImageVector? = null

