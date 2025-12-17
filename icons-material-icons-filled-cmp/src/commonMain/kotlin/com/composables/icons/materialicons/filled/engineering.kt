package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Engineering: ImageVector
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
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.1f, 6.84f)
                        curveToRelative(0.01f, -0.11f, 0.02f, -0.22f, 0.02f, -0.34f)
                        curveToRelative(0f, -0.12f, -0.01f, -0.23f, -0.03f, -0.34f)
                        lineToRelative(0.74f, -0.58f)
                        curveToRelative(0.07f, -0.05f, 0.08f, -0.15f, 0.04f, -0.22f)
                        lineToRelative(-0.7f, -1.21f)
                        curveToRelative(-0.04f, -0.08f, -0.14f, -0.1f, -0.21f, -0.08f)
                        lineTo(21.1f, 4.42f)
                        curveToRelative(-0.18f, -0.14f, -0.38f, -0.25f, -0.59f, -0.34f)
                        lineToRelative(-0.13f, -0.93f)
                        curveTo(20.36f, 3.06f, 20.29f, 3f, 20.2f, 3f)
                        horizontalLineToRelative(-1.4f)
                        curveToRelative(-0.09f, 0f, -0.16f, 0.06f, -0.17f, 0.15f)
                        lineTo(18.5f, 4.08f)
                        curveToRelative(-0.21f, 0.09f, -0.41f, 0.21f, -0.59f, 0.34f)
                        lineToRelative(-0.87f, -0.35f)
                        curveToRelative(-0.08f, -0.03f, -0.17f, 0f, -0.21f, 0.08f)
                        lineToRelative(-0.7f, 1.21f)
                        curveToRelative(-0.04f, 0.08f, -0.03f, 0.17f, 0.04f, 0.22f)
                        lineToRelative(0.74f, 0.58f)
                        curveToRelative(-0.02f, 0.11f, -0.03f, 0.23f, -0.03f, 0.34f)
                        curveToRelative(0f, 0.11f, 0.01f, 0.23f, 0.03f, 0.34f)
                        lineToRelative(-0.74f, 0.58f)
                        curveToRelative(-0.07f, 0.05f, -0.08f, 0.15f, -0.04f, 0.22f)
                        lineToRelative(0.7f, 1.21f)
                        curveToRelative(0.04f, 0.08f, 0.14f, 0.1f, 0.21f, 0.08f)
                        lineToRelative(0.87f, -0.35f)
                        curveToRelative(0.18f, 0.14f, 0.38f, 0.25f, 0.59f, 0.34f)
                        lineToRelative(0.13f, 0.93f)
                        curveTo(18.64f, 9.94f, 18.71f, 10f, 18.8f, 10f)
                        horizontalLineToRelative(1.4f)
                        curveToRelative(0.09f, 0f, 0.16f, -0.06f, 0.17f, -0.15f)
                        lineToRelative(0.13f, -0.93f)
                        curveToRelative(0.21f, -0.09f, 0.41f, -0.21f, 0.59f, -0.34f)
                        lineToRelative(0.87f, 0.35f)
                        curveToRelative(0.08f, 0.03f, 0.17f, 0f, 0.21f, -0.08f)
                        lineToRelative(0.7f, -1.21f)
                        curveToRelative(0.04f, -0.08f, 0.03f, -0.17f, -0.04f, -0.22f)
                        lineTo(22.1f, 6.84f)
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
                        moveTo(19.92f, 11.68f)
                        lineToRelative(-0.5f, -0.87f)
                        curveToRelative(-0.03f, -0.06f, -0.1f, -0.08f, -0.15f, -0.06f)
                        lineToRelative(-0.62f, 0.25f)
                        curveToRelative(-0.13f, -0.1f, -0.27f, -0.18f, -0.42f, -0.24f)
                        lineToRelative(-0.09f, -0.66f)
                        curveTo(18.12f, 10.04f, 18.06f, 10f, 18f, 10f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.06f, 0f, -0.11f, 0.04f, -0.12f, 0.11f)
                        lineToRelative(-0.09f, 0.66f)
                        curveToRelative(-0.15f, 0.06f, -0.29f, 0.15f, -0.42f, 0.24f)
                        lineToRelative(-0.62f, -0.25f)
                        curveToRelative(-0.06f, -0.02f, -0.12f, 0f, -0.15f, 0.06f)
                        lineToRelative(-0.5f, 0.87f)
                        curveToRelative(-0.03f, 0.06f, -0.02f, 0.12f, 0.03f, 0.16f)
                        lineToRelative(0.53f, 0.41f)
                        curveToRelative(-0.01f, 0.08f, -0.02f, 0.16f, -0.02f, 0.24f)
                        curveToRelative(0f, 0.08f, 0.01f, 0.17f, 0.02f, 0.24f)
                        lineToRelative(-0.53f, 0.41f)
                        curveToRelative(-0.05f, 0.04f, -0.06f, 0.11f, -0.03f, 0.16f)
                        lineToRelative(0.5f, 0.87f)
                        curveToRelative(0.03f, 0.06f, 0.1f, 0.08f, 0.15f, 0.06f)
                        lineToRelative(0.62f, -0.25f)
                        curveToRelative(0.13f, 0.1f, 0.27f, 0.18f, 0.42f, 0.24f)
                        lineToRelative(0.09f, 0.66f)
                        curveTo(16.89f, 14.96f, 16.94f, 15f, 17f, 15f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.06f, 0f, 0.12f, -0.04f, 0.12f, -0.11f)
                        lineToRelative(0.09f, -0.66f)
                        curveToRelative(0.15f, -0.06f, 0.29f, -0.15f, 0.42f, -0.24f)
                        lineToRelative(0.62f, 0.25f)
                        curveToRelative(0.06f, 0.02f, 0.12f, 0f, 0.15f, -0.06f)
                        lineToRelative(0.5f, -0.87f)
                        curveToRelative(0.03f, -0.06f, 0.02f, -0.12f, -0.03f, -0.16f)
                        lineToRelative(-0.52f, -0.41f)
                        curveToRelative(0.01f, -0.08f, 0.02f, -0.16f, 0.02f, -0.24f)
                        curveToRelative(0f, -0.08f, -0.01f, -0.17f, -0.02f, -0.24f)
                        lineToRelative(0.53f, -0.41f)
                        curveTo(19.93f, 11.81f, 19.94f, 11.74f, 19.92f, 11.68f)
                        close()
                        moveTo(17.5f, 13.33f)
                        curveToRelative(-0.46f, 0f, -0.83f, -0.38f, -0.83f, -0.83f)
                        curveToRelative(0f, -0.46f, 0.38f, -0.83f, 0.83f, -0.83f)
                        reflectiveCurveToRelative(0.83f, 0.38f, 0.83f, 0.83f)
                        curveTo(18.33f, 12.96f, 17.96f, 13.33f, 17.5f, 13.33f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4.74f, 9f)
                        horizontalLineToRelative(8.53f)
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
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 13f)
                        curveToRelative(1.86f, 0f, 3.41f, -1.28f, 3.86f, -3f)
                        horizontalLineTo(5.14f)
                        curveTo(5.59f, 11.72f, 7.14f, 13f, 9f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Engineering!!
    }

private var _Engineering: ImageVector? = null

