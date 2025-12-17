package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Tungsten: ImageVector
    get() {
        if (_Tungsten != null) return _Tungsten!!
        
        _Tungsten = ImageVector.Builder(
            name = "tungsten",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(12f, 19f)
                        lineTo(12f, 19f)
                        curveToRelative(-0.56f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineTo(21f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineTo(12f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(20f)
                        curveTo(13f, 19.45f, 12.55f, 19f, 12f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.99f, 17.09f)
                        lineTo(5.28f, 17.8f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0.71f, -0.71f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        curveTo(7.02f, 16.71f, 6.38f, 16.71f, 5.99f, 17.09f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 12f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(3f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineTo(12f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineTo(4f)
                        curveTo(4.55f, 13f, 5f, 12.55f, 5f, 12f)
                        lineTo(5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 11f)
                        horizontalLineTo(20f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineTo(12f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineTo(21f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(12f)
                        curveTo(22f, 11.45f, 21.55f, 11f, 21f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.01f, 17.09f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0.71f, 0.71f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(18.01f, 17.09f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 8.02f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-2f)
                        curveTo(9.9f, 3f, 9f, 3.9f, 9f, 5f)
                        verticalLineToRelative(3.02f)
                        curveToRelative(-1.43f, 1.08f, -2.28f, 2.9f, -1.91f, 4.91f)
                        curveToRelative(0.36f, 1.95f, 1.9f, 3.55f, 3.84f, 3.95f)
                        curveTo(14.16f, 17.56f, 17f, 15.11f, 17f, 12f)
                        curveTo(17f, 10.37f, 16.21f, 8.94f, 15f, 8.02f)
                        close()
                        moveTo(13f, 7.1f)
                        curveTo(12.68f, 7.04f, 12.34f, 7f, 12f, 7f)
                        reflectiveCurveToRelative(-0.68f, 0.04f, -1f, 0.1f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(7.1f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Tungsten!!
    }

private var _Tungsten: ImageVector? = null

