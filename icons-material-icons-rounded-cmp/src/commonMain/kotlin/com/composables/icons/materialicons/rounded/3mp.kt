package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`3mp`: ImageVector
    get() {
        if (_3mp != null) return _3mp!!
        
        _3mp = ImageVector.Builder(
            name = "3mp",
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
                        moveTo(12.5f, 17.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        reflectiveCurveTo(11f, 18.16f, 11f, 17.75f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(2.25f)
                        curveTo(10f, 16.66f, 9.66f, 17f, 9.25f, 17f)
                        reflectiveCurveTo(8.5f, 16.66f, 8.5f, 16.25f)
                        verticalLineTo(14f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(3.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        reflectiveCurveTo(6f, 18.16f, 6f, 17.75f)
                        verticalLineTo(13.5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4.5f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(17.75f)
                        close()
                        moveTo(10.75f, 10f)
                        horizontalLineTo(13f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-1.5f)
                        curveTo(11.22f, 9f, 11f, 8.78f, 11f, 8.5f)
                        verticalLineToRelative(0f)
                        curveTo(11f, 8.22f, 11.22f, 8f, 11.5f, 8f)
                        horizontalLineTo(13f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(-2.25f)
                        curveTo(10.34f, 7f, 10f, 6.66f, 10f, 6.25f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                        horizontalLineToRelative(2.75f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-2.75f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineToRelative(0f)
                        curveTo(10f, 10.34f, 10.34f, 10f, 10.75f, 10f)
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
                }
            }
        }.build()
        
        return _3mp!!
    }

private var _3mp: ImageVector? = null

