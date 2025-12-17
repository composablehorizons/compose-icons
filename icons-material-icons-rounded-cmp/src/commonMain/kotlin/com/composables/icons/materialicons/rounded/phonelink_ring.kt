package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Phonelink_ring: ImageVector
    get() {
        if (_Phonelink_ring != null) return _Phonelink_ring!!
        
        _Phonelink_ring = ImageVector.Builder(
            name = "phonelink_ring",
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
                moveTo(14f, 1f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(6.63f, -11.74f)
                curveToRelative(-0.26f, -0.32f, -0.74f, -0.36f, -1.04f, -0.06f)
                lineToRelative(-0.03f, 0.03f)
                curveToRelative(-0.25f, 0.25f, -0.26f, 0.65f, -0.05f, 0.93f)
                curveToRelative(1.26f, 1.64f, 1.25f, 3.87f, -0.02f, 5.57f)
                curveToRelative(-0.21f, 0.28f, -0.19f, 0.67f, 0.05f, 0.92f)
                lineToRelative(0.05f, 0.05f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.26f, 1.03f, -0.05f)
                curveToRelative(1.8f, -2.13f, 1.8f, -5.19f, 0.01f, -7.39f)
                close()
                moveToRelative(-3.21f, 2.11f)
                lineToRelative(-0.06f, 0.06f)
                curveToRelative(-0.2f, 0.2f, -0.26f, 0.5f, -0.15f, 0.76f)
                curveToRelative(0.21f, 0.49f, 0.21f, 1.03f, 0f, 1.52f)
                curveToRelative(-0.11f, 0.26f, -0.05f, 0.56f, 0.15f, 0.76f)
                lineToRelative(0.08f, 0.08f)
                curveToRelative(0.32f, 0.32f, 0.87f, 0.25f, 1.09f, -0.15f)
                curveToRelative(0.49f, -0.89f, 0.49f, -1.94f, -0.01f, -2.86f)
                curveToRelative(-0.22f, -0.42f, -0.77f, -0.5f, -1.1f, -0.17f)
                close()
            }
        }.build()
        
        return _Phonelink_ring!!
    }

private var _Phonelink_ring: ImageVector? = null

