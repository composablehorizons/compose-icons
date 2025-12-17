package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Theater_comedy: ImageVector
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
                        moveTo(2f, 16.5f)
                        curveTo(2f, 19.54f, 4.46f, 22f, 7.5f, 22f)
                        reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
                        verticalLineTo(10f)
                        horizontalLineTo(2f)
                        verticalLineTo(16.5f)
                        close()
                        moveTo(7.5f, 18.5f)
                        curveTo(6.12f, 18.5f, 5f, 17.83f, 5f, 17f)
                        horizontalLineToRelative(5f)
                        curveTo(10f, 17.83f, 8.88f, 18.5f, 7.5f, 18.5f)
                        close()
                        moveTo(10f, 13f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        curveTo(9f, 13.45f, 9.45f, 13f, 10f, 13f)
                        close()
                        moveTo(5f, 13f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        curveTo(4f, 13.45f, 4.45f, 13f, 5f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 3f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2.5f)
                        curveToRelative(0f, -0.83f, 1.12f, -1.5f, 2.5f, -1.5f)
                        curveToRelative(1.38f, 0f, 2.5f, 0.67f, 2.5f, 1.5f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(14f)
                        verticalLineToRelative(0.39f)
                        curveToRelative(0.75f, 0.38f, 1.6f, 0.61f, 2.5f, 0.61f)
                        curveToRelative(3.04f, 0f, 5.5f, -2.46f, 5.5f, -5.5f)
                        verticalLineTo(3f)
                        horizontalLineTo(11f)
                        close()
                        moveTo(14f, 8.08f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(15f, 7.64f, 14.55f, 8.08f, 14f, 8.08f)
                        close()
                        moveTo(19f, 8.08f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(20f, 7.64f, 19.55f, 8.08f, 19f, 8.08f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Theater_comedy!!
    }

private var _Theater_comedy: ImageVector? = null

