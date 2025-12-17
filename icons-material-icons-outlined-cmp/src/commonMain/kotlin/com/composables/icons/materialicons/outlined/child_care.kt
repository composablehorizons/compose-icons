package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Child_care: ImageVector
    get() {
        if (_Child_care != null) return _Child_care!!
        
        _Child_care = ImageVector.Builder(
            name = "child_care",
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
                moveTo(15.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, false, true, 14.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, false, true, 13.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, false, true, 15.75f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.75f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, false, true, 9.5f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, false, true, 8.25f, 10.5f)
                arcTo(1.25f, 1.25f, 0f, false, true, 10.75f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.94f, 11.34f)
                curveToRelative(-0.25f, -1.51f, -1.36f, -2.74f, -2.81f, -3.17f)
                curveToRelative(-0.53f, -1.12f, -1.28f, -2.1f, -2.19f, -2.91f)
                curveTo(16.36f, 3.85f, 14.28f, 3f, 12f, 3f)
                reflectiveCurveToRelative(-4.36f, 0.85f, -5.94f, 2.26f)
                curveToRelative(-0.92f, 0.81f, -1.67f, 1.8f, -2.19f, 2.91f)
                curveToRelative(-1.45f, 0.43f, -2.56f, 1.65f, -2.81f, 3.17f)
                curveToRelative(-0.04f, 0.21f, -0.06f, 0.43f, -0.06f, 0.66f)
                curveToRelative(0f, 0.23f, 0.02f, 0.45f, 0.06f, 0.66f)
                curveToRelative(0.25f, 1.51f, 1.36f, 2.74f, 2.81f, 3.17f)
                curveToRelative(0.52f, 1.11f, 1.27f, 2.09f, 2.17f, 2.89f)
                curveTo(7.62f, 20.14f, 9.71f, 21f, 12f, 21f)
                reflectiveCurveToRelative(4.38f, -0.86f, 5.97f, -2.28f)
                curveToRelative(0.9f, -0.8f, 1.65f, -1.79f, 2.17f, -2.89f)
                curveToRelative(1.44f, -0.43f, 2.55f, -1.65f, 2.8f, -3.17f)
                curveToRelative(0.04f, -0.21f, 0.06f, -0.43f, 0.06f, -0.66f)
                curveToRelative(0f, -0.23f, -0.02f, -0.45f, -0.06f, -0.66f)
                close()
                moveTo(19f, 14f)
                curveToRelative(-0.1f, 0f, -0.19f, -0.02f, -0.29f, -0.03f)
                curveToRelative(-0.2f, 0.67f, -0.49f, 1.29f, -0.86f, 1.86f)
                curveTo(16.6f, 17.74f, 14.45f, 19f, 12f, 19f)
                reflectiveCurveToRelative(-4.6f, -1.26f, -5.85f, -3.17f)
                curveToRelative(-0.37f, -0.57f, -0.66f, -1.19f, -0.86f, -1.86f)
                curveToRelative(-0.1f, 0.01f, -0.19f, 0.03f, -0.29f, 0.03f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.1f, 0f, 0.19f, 0.02f, 0.29f, 0.03f)
                curveToRelative(0.2f, -0.67f, 0.49f, -1.29f, 0.86f, -1.86f)
                curveTo(7.4f, 6.26f, 9.55f, 5f, 12f, 5f)
                reflectiveCurveToRelative(4.6f, 1.26f, 5.85f, 3.17f)
                curveToRelative(0.37f, 0.57f, 0.66f, 1.19f, 0.86f, 1.86f)
                curveToRelative(0.1f, -0.01f, 0.19f, -0.03f, 0.29f, -0.03f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(-7f, 3f)
                curveToRelative(2.01f, 0f, 3.74f, -1.23f, 4.5f, -3f)
                horizontalLineToRelative(-9f)
                curveToRelative(0.76f, 1.77f, 2.49f, 3f, 4.5f, 3f)
                close()
            }
        }.build()
        
        return _Child_care!!
    }

private var _Child_care: ImageVector? = null

