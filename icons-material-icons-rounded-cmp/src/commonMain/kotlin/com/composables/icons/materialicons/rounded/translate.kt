package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Translate: ImageVector
    get() {
        if (_Translate != null) return _Translate!!
        
        _Translate = ImageVector.Builder(
            name = "translate",
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
                moveTo(12.65f, 15.67f)
                curveToRelative(0.14f, -0.36f, 0.05f, -0.77f, -0.23f, -1.05f)
                lineToRelative(-2.09f, -2.06f)
                lineToRelative(0.03f, -0.03f)
                curveToRelative(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f)
                horizontalLineToRelative(1.94f)
                curveToRelative(0.54f, 0f, 0.99f, -0.45f, 0.99f, -0.99f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(1.99f)
                curveToRelative(-0.54f, 0f, -0.99f, 0.45f, -0.99f, 0.99f)
                curveToRelative(0f, 0.55f, 0.45f, 0.99f, 0.99f, 0.99f)
                horizontalLineToRelative(10.18f)
                curveTo(11.5f, 7.92f, 10.44f, 9.75f, 9f, 11.35f)
                curveToRelative(-0.81f, -0.89f, -1.49f, -1.86f, -2.06f, -2.88f)
                curveToRelative(-0.16f, -0.29f, -0.45f, -0.47f, -0.78f, -0.47f)
                curveToRelative(-0.69f, 0f, -1.13f, 0.75f, -0.79f, 1.35f)
                curveToRelative(0.63f, 1.13f, 1.4f, 2.21f, 2.3f, 3.21f)
                lineTo(3.3f, 16.87f)
                curveToRelative(-0.4f, 0.39f, -0.4f, 1.03f, 0f, 1.42f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0f)
                lineTo(9f, 14f)
                lineToRelative(2.02f, 2.02f)
                curveToRelative(0.51f, 0.51f, 1.38f, 0.32f, 1.63f, -0.35f)
                close()
                moveTo(17.5f, 10f)
                curveToRelative(-0.6f, 0f, -1.14f, 0.37f, -1.35f, 0.94f)
                lineToRelative(-3.67f, 9.8f)
                curveToRelative(-0.24f, 0.61f, 0.22f, 1.26f, 0.87f, 1.26f)
                curveToRelative(0.39f, 0f, 0.74f, -0.24f, 0.88f, -0.61f)
                lineToRelative(0.89f, -2.39f)
                horizontalLineToRelative(4.75f)
                lineToRelative(0.9f, 2.39f)
                curveToRelative(0.14f, 0.36f, 0.49f, 0.61f, 0.88f, 0.61f)
                curveToRelative(0.65f, 0f, 1.11f, -0.65f, 0.88f, -1.26f)
                lineToRelative(-3.67f, -9.8f)
                curveToRelative(-0.22f, -0.57f, -0.76f, -0.94f, -1.36f, -0.94f)
                close()
                moveToRelative(-1.62f, 7f)
                lineToRelative(1.62f, -4.33f)
                lineTo(19.12f, 17f)
                horizontalLineToRelative(-3.24f)
                close()
            }
        }.build()
        
        return _Translate!!
    }

private var _Translate: ImageVector? = null

