package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Engineering: ImageVector
    get() {
        if (_Engineering != null) return _Engineering!!
        
        _Engineering = ImageVector.Builder(
            name = "engineering",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 15f)
                        curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2f)
                        curveTo(17f, 16.34f, 11.67f, 15f, 9f, 15f)
                        close()
                        moveTo(3f, 19f)
                        curveToRelative(0.22f, -0.72f, 3.31f, -2f, 6f, -2f)
                        curveToRelative(2.7f, 0f, 5.8f, 1.29f, 6f, 2f)
                        horizontalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4.74f, 9f)
                        horizontalLineTo(5f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        horizontalLineToRelative(0.26f)
                        curveToRelative(0.27f, 0f, 0.49f, -0.22f, 0.49f, -0.49f)
                        verticalLineTo(8.49f)
                        curveToRelative(0f, -0.27f, -0.22f, -0.49f, -0.49f, -0.49f)
                        horizontalLineTo(13f)
                        curveToRelative(0f, -1.48f, -0.81f, -2.75f, -2f, -3.45f)
                        verticalLineTo(5.5f)
                        curveTo(11f, 5.78f, 10.78f, 6f, 10.5f, 6f)
                        reflectiveCurveTo(10f, 5.78f, 10f, 5.5f)
                        verticalLineTo(4.14f)
                        curveTo(9.68f, 4.06f, 9.35f, 4f, 9f, 4f)
                        reflectiveCurveTo(8.32f, 4.06f, 8f, 4.14f)
                        verticalLineTo(5.5f)
                        curveTo(8f, 5.78f, 7.78f, 6f, 7.5f, 6f)
                        reflectiveCurveTo(7f, 5.78f, 7f, 5.5f)
                        verticalLineTo(4.55f)
                        curveTo(5.81f, 5.25f, 5f, 6.52f, 5f, 8f)
                        horizontalLineTo(4.74f)
                        curveTo(4.47f, 8f, 4.25f, 8.22f, 4.25f, 8.49f)
                        verticalLineToRelative(0.03f)
                        curveTo(4.25f, 8.78f, 4.47f, 9f, 4.74f, 9f)
                        close()
                        moveTo(11f, 9f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        horizontalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.98f, 6.23f)
                        lineToRelative(0.93f, -0.83f)
                        lineToRelative(-0.75f, -1.3f)
                        lineToRelative(-1.19f, 0.39f)
                        curveToRelative(-0.14f, -0.11f, -0.3f, -0.2f, -0.47f, -0.27f)
                        lineTo(20.25f, 3f)
                        horizontalLineToRelative(-1.5f)
                        lineTo(18.5f, 4.22f)
                        curveToRelative(-0.17f, 0.07f, -0.33f, 0.16f, -0.48f, 0.27f)
                        lineTo(16.84f, 4.1f)
                        lineToRelative(-0.75f, 1.3f)
                        lineToRelative(0.93f, 0.83f)
                        curveTo(17f, 6.4f, 17f, 6.58f, 17.02f, 6.75f)
                        lineTo(16.09f, 7.6f)
                        lineToRelative(0.75f, 1.3f)
                        lineToRelative(1.2f, -0.38f)
                        curveToRelative(0.13f, 0.1f, 0.28f, 0.18f, 0.43f, 0.25f)
                        lineTo(18.75f, 10f)
                        horizontalLineToRelative(1.5f)
                        lineToRelative(0.27f, -1.22f)
                        curveToRelative(0.16f, -0.07f, 0.3f, -0.15f, 0.44f, -0.25f)
                        lineToRelative(1.19f, 0.38f)
                        lineToRelative(0.75f, -1.3f)
                        lineToRelative(-0.93f, -0.85f)
                        curveTo(22f, 6.57f, 21.99f, 6.4f, 21.98f, 6.23f)
                        close()
                        moveTo(19.5f, 7.75f)
                        curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                        reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                        reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                        reflectiveCurveTo(20.19f, 7.75f, 19.5f, 7.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.4f, 10.79f)
                        lineToRelative(-0.85f, 0.28f)
                        curveToRelative(-0.1f, -0.08f, -0.21f, -0.14f, -0.33f, -0.19f)
                        lineTo(18.04f, 10f)
                        horizontalLineToRelative(-1.07f)
                        lineToRelative(-0.18f, 0.87f)
                        curveToRelative(-0.12f, 0.05f, -0.24f, 0.12f, -0.34f, 0.19f)
                        lineToRelative(-0.84f, -0.28f)
                        lineToRelative(-0.54f, 0.93f)
                        lineToRelative(0.66f, 0.59f)
                        curveToRelative(-0.01f, 0.13f, -0.01f, 0.25f, 0f, 0.37f)
                        lineToRelative(-0.66f, 0.61f)
                        lineToRelative(0.54f, 0.93f)
                        lineToRelative(0.86f, -0.27f)
                        curveToRelative(0.1f, 0.07f, 0.2f, 0.13f, 0.31f, 0.18f)
                        lineTo(16.96f, 15f)
                        horizontalLineToRelative(1.07f)
                        lineToRelative(0.19f, -0.87f)
                        curveToRelative(0.11f, -0.05f, 0.22f, -0.11f, 0.32f, -0.18f)
                        lineToRelative(0.85f, 0.27f)
                        lineToRelative(0.54f, -0.93f)
                        lineToRelative(-0.66f, -0.61f)
                        curveToRelative(0.01f, -0.13f, 0.01f, -0.25f, 0f, -0.37f)
                        lineToRelative(0.66f, -0.59f)
                        lineTo(19.4f, 10.79f)
                        close()
                        moveTo(17.5f, 13.39f)
                        curveToRelative(-0.49f, 0f, -0.89f, -0.4f, -0.89f, -0.89f)
                        curveToRelative(0f, -0.49f, 0.4f, -0.89f, 0.89f, -0.89f)
                        reflectiveCurveToRelative(0.89f, 0.4f, 0.89f, 0.89f)
                        curveTo(18.39f, 12.99f, 17.99f, 13.39f, 17.5f, 13.39f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Engineering!!
    }

private var _Engineering: ImageVector? = null

