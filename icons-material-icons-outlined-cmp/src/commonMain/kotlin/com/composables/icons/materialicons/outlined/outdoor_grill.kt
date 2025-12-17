package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Outdoor_grill: ImageVector
    get() {
        if (_Outdoor_grill != null) return _Outdoor_grill!!
        
        _Outdoor_grill = ImageVector.Builder(
            name = "outdoor_grill",
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
                        moveTo(17f, 22f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                        curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                        horizontalLineTo(9.14f)
                        lineToRelative(1.99f, -3.06f)
                        curveTo(11.42f, 14.98f, 11.71f, 15f, 12f, 15f)
                        reflectiveCurveToRelative(0.58f, -0.02f, 0.87f, -0.06f)
                        lineToRelative(1.02f, 1.57f)
                        curveToRelative(0.42f, -0.53f, 0.96f, -0.95f, 1.6f, -1.21f)
                        lineToRelative(-0.6f, -0.93f)
                        curveTo(17.31f, 13.27f, 19f, 10.84f, 19f, 8f)
                        horizontalLineTo(5f)
                        curveToRelative(0f, 2.84f, 1.69f, 5.27f, 4.12f, 6.37f)
                        lineToRelative(-3.95f, 6.08f)
                        curveToRelative(-0.3f, 0.46f, -0.17f, 1.08f, 0.29f, 1.38f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.46f, 0.3f, 1.08f, 0.17f, 1.38f, -0.29f)
                        lineToRelative(1f, -1.55f)
                        horizontalLineToRelative(6.34f)
                        curveTo(14.6f, 21.16f, 15.7f, 22f, 17f, 22f)
                        close()
                        moveTo(17f, 18f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        curveTo(16f, 18.45f, 16.45f, 18f, 17f, 18f)
                        close()
                        moveTo(7.42f, 10f)
                        horizontalLineToRelative(9.16f)
                        curveToRelative(-0.77f, 1.76f, -2.54f, 3f, -4.58f, 3f)
                        reflectiveCurveTo(8.19f, 11.76f, 7.42f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.41f, 7f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.15f, -1.15f, 0.23f, -1.64f, -0.89f, -2.96f)
                        curveTo(9.1f, 3.54f, 8.84f, 3.27f, 9.06f, 2f)
                        horizontalLineTo(8.07f)
                        curveTo(7.86f, 3.11f, 8.1f, 4.05f, 8.96f, 4.96f)
                        curveTo(9.18f, 5.2f, 9.75f, 5.63f, 9.41f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.89f, 7f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.15f, -1.15f, 0.23f, -1.64f, -0.89f, -2.96f)
                        curveToRelative(-0.42f, -0.5f, -0.68f, -0.78f, -0.46f, -2.04f)
                        horizontalLineToRelative(-0.99f)
                        curveToRelative(-0.21f, 1.11f, 0.03f, 2.05f, 0.89f, 2.96f)
                        curveTo(11.67f, 5.2f, 12.24f, 5.63f, 11.89f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.41f, 7f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.15f, -1.15f, 0.23f, -1.64f, -0.89f, -2.96f)
                        curveTo(14.1f, 3.54f, 13.84f, 3.27f, 14.06f, 2f)
                        horizontalLineToRelative(-0.99f)
                        curveToRelative(-0.21f, 1.11f, 0.03f, 2.05f, 0.89f, 2.96f)
                        curveTo(14.18f, 5.2f, 14.75f, 5.63f, 14.41f, 7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Outdoor_grill!!
    }

private var _Outdoor_grill: ImageVector? = null

