package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`5mp`: ImageVector
    get() {
        if (_5mp != null) return _5mp!!
        
        _5mp = ImageVector.Builder(
            name = "5mp",
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
                        moveTo(15f, 14f)
                        horizontalLineTo(16.5f)
                        verticalLineTo(15.5f)
                        horizontalLineTo(15f)
                        verticalLineTo(14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(11f, 9f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(6.5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(2.75f)
                        curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                        reflectiveCurveTo(14.16f, 7f, 13.75f, 7f)
                        horizontalLineTo(11.5f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(1.5f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-2.75f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        reflectiveCurveTo(10.34f, 10f, 10.75f, 10f)
                        horizontalLineTo(13f)
                        verticalLineTo(9f)
                        horizontalLineTo(11f)
                        close()
                        moveTo(12.5f, 17.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        reflectiveCurveTo(11f, 18.17f, 11f, 17.75f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(2.25f)
                        curveTo(10f, 16.67f, 9.66f, 17f, 9.25f, 17f)
                        reflectiveCurveTo(8.5f, 16.67f, 8.5f, 16.25f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(3.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        reflectiveCurveTo(6f, 18.17f, 6f, 17.75f)
                        verticalLineTo(13.5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4.5f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(17.75f)
                        close()
                        moveTo(18f, 16f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(0.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(13.5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineTo(17f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _5mp!!
    }

private var _5mp: ImageVector? = null

