package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_drink: ImageVector
    get() {
        if (_Local_drink != null) return _Local_drink!!
        
        _Local_drink = ImageVector.Builder(
            name = "local_drink",
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
                moveTo(5.23f, 2f)
                curveTo(4.04f, 2f, 3.11f, 3.04f, 3.24f, 4.22f)
                lineToRelative(1.77f, 16.01f)
                curveTo(5.13f, 21.23f, 5.97f, 22f, 7f, 22f)
                horizontalLineToRelative(10f)
                curveToRelative(1.03f, 0f, 1.87f, -0.77f, 1.99f, -1.77f)
                lineToRelative(1.77f, -16.01f)
                curveToRelative(0.13f, -1.18f, -0.8f, -2.22f, -1.99f, -2.22f)
                horizontalLineTo(5.23f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -1.55f, 1.81f, -3.95f, 2.62f, -4.94f)
                curveToRelative(0.2f, -0.25f, 0.57f, -0.25f, 0.77f, 0f)
                curveToRelative(0.81f, 1f, 2.62f, 3.39f, 2.62f, 4.94f)
                curveToRelative(-0.01f, 1.66f, -1.35f, 3f, -3.01f, 3f)
                close()
                moveToRelative(6.33f, -11f)
                horizontalLineTo(5.67f)
                lineToRelative(-0.32f, -2.89f)
                curveToRelative(-0.06f, -0.59f, 0.4f, -1.11f, 1f, -1.11f)
                horizontalLineToRelative(11.3f)
                curveToRelative(0.59f, 0f, 1.06f, 0.52f, 0.99f, 1.11f)
                lineTo(18.33f, 8f)
                close()
            }
        }.build()
        
        return _Local_drink!!
    }

private var _Local_drink: ImageVector? = null

