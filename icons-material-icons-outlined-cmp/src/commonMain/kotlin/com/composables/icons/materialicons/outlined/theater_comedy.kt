package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Theater_comedy: ImageVector
    get() {
        if (_Theater_comedy != null) return _Theater_comedy!!
        
        _Theater_comedy = ImageVector.Builder(
            name = "theater_comedy",
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
                        moveTo(20f, 6.5f)
                        arcTo(1f, 1f, 0f, false, true, 19f, 7.5f)
                        arcTo(1f, 1f, 0f, false, true, 18f, 6.5f)
                        arcTo(1f, 1f, 0f, false, true, 20f, 6.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 6.5f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 7.5f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 6.5f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 6.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.99f, 9f)
                        curveToRelative(-1.38f, 0f, -2.5f, 0.84f, -2.5f, 1.88f)
                        horizontalLineToRelative(5f)
                        curveTo(19.49f, 9.84f, 18.37f, 9f, 16.99f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 16f)
                        curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                        reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                        verticalLineTo(9f)
                        horizontalLineTo(1f)
                        verticalLineTo(16f)
                        close()
                        moveTo(3f, 11f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                        reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 2f)
                        verticalLineToRelative(5.5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                        curveToRelative(-0.95f, 0f, -1.81f, -0.35f, -2.5f, -0.9f)
                        verticalLineToRelative(2.35f)
                        curveTo(15.26f, 14.8f, 16.11f, 15f, 17f, 15f)
                        curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                        verticalLineTo(2f)
                        horizontalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 13.5f)
                        arcTo(1f, 1f, 0f, false, true, 5f, 14.5f)
                        arcTo(1f, 1f, 0f, false, true, 4f, 13.5f)
                        arcTo(1f, 1f, 0f, false, true, 6f, 13.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 13.5f)
                        arcTo(1f, 1f, 0f, false, true, 9f, 14.5f)
                        arcTo(1f, 1f, 0f, false, true, 8f, 13.5f)
                        arcTo(1f, 1f, 0f, false, true, 10f, 13.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 17.88f)
                        curveToRelative(1.38f, 0f, 2.5f, -0.84f, 2.5f, -1.88f)
                        horizontalLineToRelative(-5f)
                        curveTo(4.5f, 17.04f, 5.62f, 17.88f, 7f, 17.88f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Theater_comedy!!
    }

private var _Theater_comedy: ImageVector? = null

